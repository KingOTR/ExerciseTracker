package com.example.rungps.ble

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothProfile
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import androidx.core.content.ContextCompat
import com.example.rungps.ble.moyoung.MoyoungConstants
import com.example.rungps.ble.moyoung.MoyoungHrParser
import com.example.rungps.ble.moyoung.MoyoungWorkout
import com.example.rungps.ble.moyoung.MoyoungWorkoutSync
import com.example.rungps.tracking.RecordingHrBridge
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.util.UUID

@SuppressLint("MissingPermission")
class BleClient private constructor(private val context: Context) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val mainHandler = Handler(Looper.getMainLooper())
    private val btManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    private val adapter: BluetoothAdapter? get() = btManager.adapter

    private val _status = MutableStateFlow(BleStatus())
    val status: StateFlow<BleStatus> = _status.asStateFlow()

    private var gatt: BluetoothGatt? = null
    private var hrChar: BluetoothGattCharacteristic? = null
    private var scanJob: Job? = null
    private var recordingHrPollJob: Job? = null
    private var hrTestJob: Job? = null
    private var workoutSync: MoyoungWorkoutSync? = null

    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val device = result.device ?: return
            val address = device.address ?: return
            val name = runCatching { device.name }.getOrNull()
            val entry = BleScanDevice(name, address, result.rssi)
            _status.update { st ->
                val devices = st.devices.toMutableList()
                val idx = devices.indexOfFirst { it.address == address }
                if (idx >= 0) devices[idx] = entry else devices += entry
                st.copy(devices = devices.sortedByDescending { it.rssi ?: Int.MIN_VALUE })
            }
        }

        override fun onScanFailed(errorCode: Int) {
            _status.update { it.copy(scanning = false, lastError = "Scan failed ($errorCode)") }
        }
    }

    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            when (newState) {
                BluetoothProfile.STATE_CONNECTED -> {
                    _status.update {
                        it.copy(
                            connectingTo = null,
                            connectedAddress = gatt.device.address,
                            lastError = null,
                        )
                    }
                    gatt.discoverServices()
                }
                BluetoothProfile.STATE_DISCONNECTED -> {
                    _status.update {
                        it.copy(
                            connectingTo = null,
                            connectedAddress = null,
                            services = emptyList(),
                            hasHeartRateService = false,
                            hasMoyoungService = false,
                        )
                    }
                    hrChar = null
                }
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) return
            val services = gatt.services.map { svc ->
                BleGattServiceInfo(
                    uuid = svc.uuid.toString(),
                    characteristics = svc.characteristics.map { it.uuid.toString() },
                )
            }
            val hasHr = gatt.getService(HR_SERVICE_UUID) != null
            val hasMoyoung = gatt.getService(MoyoungConstants.UUID_SERVICE) != null
            _status.update {
                it.copy(
                    services = services,
                    hasHeartRateService = hasHr,
                    hasMoyoungService = hasMoyoung,
                )
            }
            hrChar = gatt.getService(HR_SERVICE_UUID)?.getCharacteristic(HR_MEAS_UUID)
            hrChar?.let { char ->
                gatt.setCharacteristicNotification(char, true)
                char.getDescriptor(CCCD_UUID)?.let { desc ->
                    desc.value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                    gatt.writeDescriptor(desc)
                }
            }
            if (hasMoyoung) requestMoyoungHr()
        }

        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray,
        ) {
            when (characteristic.uuid) {
                HR_MEAS_UUID -> parseStandardHr(value)
                MoyoungConstants.UUID_CHARACTERISTIC_DATA_IN -> parseMoyoungPacket(value)
            }
        }

        @Deprecated("Deprecated in Java")
        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
            @Suppress("DEPRECATION")
            val value = characteristic.value ?: return
            onCharacteristicChanged(gatt, characteristic, value)
        }
    }

    fun refreshEnabled() {
        val enabled = adapter?.isEnabled == true && hasBlePermissions()
        _status.update { it.copy(enabled = enabled) }
    }

    fun startScan(durationMs: Long = 12_000L) {
        if (!hasBlePermissions()) {
            _status.update { it.copy(lastError = "BLE permissions required") }
            return
        }
        val scanner = adapter?.bluetoothLeScanner ?: return
        stopScan()
        _status.update { it.copy(scanning = true, lastError = null, devices = emptyList()) }
        scanner.startScan(scanCallback)
        scanJob = scope.launch {
            delay(durationMs)
            stopScan()
        }
    }

    fun stopScan() {
        scanJob?.cancel()
        scanJob = null
        runCatching { adapter?.bluetoothLeScanner?.stopScan(scanCallback) }
        _status.update { it.copy(scanning = false) }
    }

    fun connect(address: String) {
        if (!hasBlePermissions()) return
        disconnect()
        val device = adapter?.getRemoteDevice(address) ?: return
        _status.update { it.copy(connectingTo = address, lastError = null) }
        gatt = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            device.connectGatt(context, false, gattCallback, BluetoothDevice.TRANSPORT_LE)
        } else {
            @Suppress("DEPRECATION")
            device.connectGatt(context, false, gattCallback)
        }
    }

    suspend fun fetchMoyoungWorkouts(): List<MoyoungWorkout> {
        val g = gatt ?: throw IllegalStateException("Connect a Moyoung watch first")
        if (!_status.value.hasMoyoungService) throw IllegalStateException("No Moyoung service on connected device")
        val sync = workoutSync ?: MoyoungWorkoutSync(g).also { workoutSync = it }
        return sync.fetchWorkouts()
    }

    fun disconnect() {
        stopScan()
        recordingHrPollJob?.cancel()
        hrTestJob?.cancel()
        workoutSync = null
        gatt?.close()
        gatt = null
        hrChar = null
        _status.update {
            it.copy(
                connectingTo = null,
                connectedAddress = null,
                services = emptyList(),
                hrTestRunning = false,
            )
        }
    }

    fun setRecordingHrPoll(enabled: Boolean) {
        recordingHrPollJob?.cancel()
        if (!enabled) return
        recordingHrPollJob = scope.launch {
            while (isActive) {
                pollHrOnce()
                delay(2_000L)
            }
        }
    }

    fun testHeartRate(durationMs: Long = 15_000L) {
        hrTestJob?.cancel()
        _status.update { it.copy(hrTestRunning = true) }
        hrTestJob = scope.launch {
            val end = System.currentTimeMillis() + durationMs
            while (isActive && System.currentTimeMillis() < end) {
                pollHrOnce()
                delay(1_500L)
            }
            _status.update { it.copy(hrTestRunning = false) }
        }
    }

    private fun pollHrOnce() {
        val char = hrChar ?: return
        val g = gatt ?: return
        g.readCharacteristic(char)
    }

    private fun requestMoyoungHr() {
        val g = gatt ?: return
        val svc = g.getService(MoyoungConstants.UUID_SERVICE) ?: return
        val out = svc.getCharacteristic(MoyoungConstants.UUID_CHARACTERISTIC_DATA_OUT) ?: return
        out.value = byteArrayOf(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE)
        g.writeCharacteristic(out)
    }

    private fun parseStandardHr(value: ByteArray) {
        if (value.isEmpty()) return
        val flags = value[0].toInt() and 0xFF
        val bpm = if (flags and 0x01 != 0) {
            if (value.size < 3) return
            (value[1].toInt() and 0xFF) or ((value[2].toInt() and 0xFF) shl 8)
        } else {
            if (value.size < 2) return
            value[1].toInt() and 0xFF
        }
        publishHr(bpm)
    }

    private fun parseMoyoungPacket(value: ByteArray) {
        if (value.isEmpty()) return
        workoutSync?.onNotify(value)
        if (value[0] == MoyoungConstants.WORKOUT_HR_RESPONSE) {
            val points = MoyoungHrParser.parse(value)
            points.lastOrNull()?.let { publishHr(it.bpm) }
            return
        }
        if (value.size >= 2) {
            val bpm = value.last().toInt() and 0xFF
            if (bpm in 40..220) publishHr(bpm)
        }
    }

    private fun publishHr(bpm: Int) {
        if (bpm !in 40..220) return
        val now = System.currentTimeMillis()
        _status.update { it.copy(latestHrBpm = bpm, latestHrAtMs = now) }
        RecordingHrBridge.offerSample(bpm, now)
    }

    private fun hasBlePermissions(): Boolean {
        val perms = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            listOf(Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT)
        } else {
            listOf(Manifest.permission.ACCESS_FINE_LOCATION)
        }
        return perms.all {
            ContextCompat.checkSelfPermission(context, it) == PackageManager.PERMISSION_GRANTED
        }
    }

    companion object {
        private val HR_SERVICE_UUID: UUID = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb")
        private val HR_MEAS_UUID: UUID = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb")
        private val CCCD_UUID: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")

        @Volatile
        private var instance: BleClient? = null

        fun get(context: Context): BleClient =
            instance ?: synchronized(this) {
                instance ?: BleClient(context.applicationContext).also {
                    instance = it
                    it.refreshEnabled()
                }
            }
    }
}
