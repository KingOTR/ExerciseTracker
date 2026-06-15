package com.example.rungps.ble

data class BleScanDevice(
    val name: String?,
    val address: String,
    val rssi: Int? = null,
)

data class BleGattServiceInfo(
    val uuid: String,
    val characteristics: List<String> = emptyList(),
)

data class MoyoungImportStats(
    val imported: Int,
    val skipped: Int,
    val failed: Int = 0,
)

data class BleStatus(
    val enabled: Boolean = false,
    val scanning: Boolean = false,
    val connectingTo: String? = null,
    val connectedAddress: String? = null,
    val lastError: String? = null,
    val devices: List<BleScanDevice> = emptyList(),
    val services: List<BleGattServiceInfo> = emptyList(),
    val hasHeartRateService: Boolean = false,
    val hasExerciseTrackerSoccerService: Boolean = false,
    val hasMoyoungService: Boolean = false,
    val watchSoccerState: Int? = null,
    val watchSoccerElapsedSec: Int? = null,
    val syncingSoccer: Boolean = false,
    val lastSoccerSyncImported: Int? = null,
    val lastMoyoungImport: MoyoungImportStats? = null,
    val latestHrBpm: Int? = null,
    val latestHrAtMs: Long? = null,
    val hrTestRunning: Boolean = false,
)
