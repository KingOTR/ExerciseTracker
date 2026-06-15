package com.example.rungps.ble.moyoung

import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothProfile
import android.os.Build
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import java.util.UUID
import kotlin.math.max

class MoyoungWorkoutSync(
    private val gatt: BluetoothGatt,
    mtu: Int = 20,
) {
    private var mtu = mtu.coerceIn(20, 512)
    private val fetchMutex = Mutex()
    private val packetIn = MoyoungPacketIn()
    private val assembleLock = Any()
    private val inboxLock = Any()
    private val inbox = mutableListOf<Pair<Byte, ByteArray>>()

    fun setMtu(value: Int) {
        mtu = value.coerceIn(20, 512)
    }

    fun onNotify(fragment: ByteArray) {
        synchronized(assembleLock) {
            if (!packetIn.putFragment(fragment)) return
            val complete = packetIn.completePacket() ?: return
            packetIn.reset()
            val parsed = MoyoungPacketIn.parsePacket(complete) ?: return
            synchronized(inboxLock) { inbox += parsed }
            Log.d(TAG, "notify cmd=0x${parsed.first.toInt() and 0xFF} len=${parsed.second.size}")
        }
    }

    suspend fun fetchWorkouts(): List<MoyoungWorkout> = fetchMutex.withLock {
        withTimeout(90_000L) {
            prepareNotify()
            warmUpWatch()
            val v2 = fetchWorkoutsV2AllPages()
            val legacy = if (v2.isEmpty()) fetchWorkoutsLegacy() else emptyList()
            (v2 + legacy).distinctBy { it.dedupeId }
        }
    }

    private suspend fun fetchWorkoutsV2AllPages(): List<MoyoungWorkout> {
        val merged = linkedMapOf<Long, MoyoungWorkout>()
        for (page in 0 until 6) {
            val batch = fetchWorkoutsV2Page(page)
            if (batch.isEmpty() && page > 0) break
            batch.forEach { merged[it.dedupeId] = it }
        }
        return merged.values.toList()
    }

    private suspend fun fetchWorkoutsV2Page(page: Int): List<MoyoungWorkout> {
        clearInbox()
        writeCommand(MoyoungConstants.CMD_QUERY_V2_WORKOUT, byteArrayOf(page.toByte()))
        delay(500)
        val listPayload = findListPayloadInInbox()
            ?: awaitPacket(MoyoungConstants.WORKOUT_LIST_RESPONSE, 20_000L)?.second
            ?: return emptyList()
        val indices = parseWorkoutListIndices(listPayload)
        val workouts = mutableListOf<MoyoungWorkout>()
        for (id in indices) {
            fetchWorkoutDetail(id)?.let { workouts += it }
        }
        return workouts
    }

    private suspend fun fetchWorkoutDetail(id: Int): MoyoungWorkout? {
        writeCommand(
            MoyoungConstants.CMD_QUERY_V2_WORKOUT,
            byteArrayOf(MoyoungConstants.WORKOUT_DETAIL_REQUEST, id.toByte()),
        )
        delay(350)
        val detailPayload = awaitPacket(MoyoungConstants.WORKOUT_DETAIL_RESPONSE, 15_000L)?.second
            ?: return null
        val base = MoyoungTrainingParser.parseDetailPacket(detailPayload)?.firstOrNull() ?: return null

        writeCommand(
            MoyoungConstants.CMD_QUERY_V2_WORKOUT,
            byteArrayOf(MoyoungConstants.WORKOUT_HR_REQUEST, id.toByte()),
        )
        consumeInbox(MoyoungConstants.WORKOUT_HR_RESPONSE, 8_000L)
        val hrChunks = synchronized(inboxLock) {
            inbox.filter { it.first == MoyoungConstants.WORKOUT_HR_RESPONSE }.map { it.second }.also {
                inbox.removeAll { pair -> pair.first == MoyoungConstants.WORKOUT_HR_RESPONSE }
            }
        }
        val hrSeries = MoyoungHrParser.merge(hrChunks.map { MoyoungHrParser.parse(it) })
        return base.copy(hrSeries = hrSeries)
    }

    private suspend fun fetchWorkoutsLegacy(): List<MoyoungWorkout> {
        clearInbox()
        writeCommand(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, byteArrayOf())
        delay(500)
        val payload = awaitPacket(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, 20_000L)?.second
            ?: findTrainingPayloadInInbox()
            ?: return emptyList()
        Log.d(TAG, "legacy payload len=${payload.size}")
        return MoyoungTrainingParser.parseAll(payload)
    }

    private suspend fun prepareNotify() {
        withContext(Dispatchers.Main) { Companion.enableNotify(gatt) }
        delay(500)
    }

    private suspend fun warmUpWatch() {
        val epoch = MoyoungWatchTime.localNowToWatchEpochSec()
        val timeBytes = byteArrayOf(
            (epoch and 0xFF).toByte(),
            ((epoch shr 8) and 0xFF).toByte(),
            ((epoch shr 16) and 0xFF).toByte(),
            ((epoch shr 24) and 0xFF).toByte(),
        )
        writeCommand(MoyoungConstants.CMD_SYNC_TIME, timeBytes)
        delay(300)
        withContext(Dispatchers.Main) {
            val stepsChar = gatt.getService(MoyoungConstants.UUID_SERVICE)
                ?.getCharacteristic(MoyoungConstants.UUID_CHARACTERISTIC_STEPS)
            if (stepsChar != null) {
                runCatching {
                    if (Build.VERSION.SDK_INT >= 33) gatt.readCharacteristic(stepsChar)
                    else @Suppress("DEPRECATION") gatt.readCharacteristic(stepsChar)
                }
            }
        }
        delay(300)
        writeCommand(MoyoungConstants.CMD_QUERY_LAST_DYNAMIC_RATE, byteArrayOf())
        delay(300)
        writeCommand(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, byteArrayOf())
        delay(300)
    }

    private suspend fun consumeInbox(exceptCmd: Byte?, maxMs: Long) {
        val deadline = System.currentTimeMillis() + maxMs
        while (System.currentTimeMillis() < deadline) {
            val removed = synchronized(inboxLock) {
                val idx = if (exceptCmd != null) {
                    inbox.indexOfFirst { it.first == exceptCmd }
                } else if (inbox.isNotEmpty()) 0 else -1
                if (idx >= 0) inbox.removeAt(idx) else null
            }
            if (removed != null) delay(20) else delay(50)
        }
    }

    private fun findTrainingPayloadInInbox(): ByteArray? = synchronized(inboxLock) {
        for (i in inbox.indices.reversed()) {
            val (cmd, payload) = inbox[i]
            if (cmd == MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE &&
                MoyoungTrainingParser.parseAll(payload).isNotEmpty()
            ) {
                return inbox.removeAt(i).second
            }
            if (payload.size >= 24 && MoyoungTrainingParser.parseAll(payload).isNotEmpty()) {
                return inbox.removeAt(i).second
            }
        }
        null
    }

    private fun findListPayloadInInbox(): ByteArray? = synchronized(inboxLock) {
        val idx = inbox.indexOfFirst { it.second.isNotEmpty() && it.second[0] == MoyoungConstants.WORKOUT_LIST_RESPONSE }
        if (idx >= 0) return inbox.removeAt(idx).second
        null
    }

    private suspend fun awaitPacket(cmd: Byte, timeoutMs: Long): Pair<Byte, ByteArray>? {
        val deadline = System.currentTimeMillis() + timeoutMs
        while (System.currentTimeMillis() < deadline) {
            val hit = synchronized(inboxLock) {
                val idx = inbox.indexOfFirst { it.first == cmd }
                if (idx >= 0) inbox.removeAt(idx) else null
            }
            if (hit != null) return hit
            delay(50)
        }
        return null
    }

    private fun clearInbox() {
        synchronized(inboxLock) { inbox.clear() }
        synchronized(assembleLock) { packetIn.reset() }
    }

    private suspend fun writeCommand(cmd: Byte, payload: ByteArray) {
        val packet = MoyoungPacketOut.buildPacket(mtu, cmd, payload)
        val outChar = gatt.getService(MoyoungConstants.UUID_SERVICE)
            ?.getCharacteristic(MoyoungConstants.UUID_CHARACTERISTIC_DATA_OUT)
            ?: error("Moyoung DATA_OUT not found — reconnect watch on Home")
        for (chunk in MoyoungPacketOut.fragments(packet, mtu)) {
            writeChunk(outChar, chunk)
        }
    }

    private suspend fun writeChunk(char: BluetoothGattCharacteristic, data: ByteArray) {
        withContext(Dispatchers.Main) {
            if (Build.VERSION.SDK_INT >= 33) {
                gatt.writeCharacteristic(char, data, BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT)
            } else {
                @Suppress("DEPRECATION")
                char.value = data
                @Suppress("DEPRECATION")
                gatt.writeCharacteristic(char)
            }
        }
        delay(80)
    }

    companion object {
        private const val TAG = "MoyoungWorkoutSync"
        private val CCCD: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")

        fun parseWorkoutListIndices(payload: ByteArray): List<Int> {
            if (payload.isEmpty() || payload[0] != MoyoungConstants.WORKOUT_LIST_RESPONSE) return emptyList()
            var length = payload.size / 5
            if (length <= 0 && payload.size >= 2) {
                val hinted = payload[1].toInt() and 0xFF
                if (hinted in 1..64) length = hinted
            }
            if (length <= 0) return emptyList()
            return (0 until minOf(length, 64)).toList()
        }

        fun enableNotify(gatt: BluetoothGatt): Boolean {
            val characteristic = gatt.getService(MoyoungConstants.UUID_SERVICE)
                ?.getCharacteristic(MoyoungConstants.UUID_CHARACTERISTIC_DATA_IN)
                ?: return false
            if (!gatt.setCharacteristicNotification(characteristic, true)) return false
            val descriptor = characteristic.getDescriptor(CCCD) ?: return true
            return if (Build.VERSION.SDK_INT >= 33) {
                gatt.writeDescriptor(descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) ==
                    BluetoothProfile.STATE_CONNECTED
            } else {
                descriptor.value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                @Suppress("DEPRECATION")
                gatt.writeDescriptor(descriptor)
            }
        }
    }
}
