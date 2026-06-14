package com.example.rungps.sync

data class CloudSyncResult(
    val gymPulled: Int = 0,
    val runsPulled: Int = 0,
    val soccerPulled: Int = 0,
    val sleepPulled: Int = 0,
    val recoveryPulled: Int = 0,
    val errors: List<String> = emptyList(),
) {
    val totalPulled: Int get() = gymPulled + runsPulled + soccerPulled + sleepPulled + recoveryPulled
    val ok: Boolean get() = errors.isEmpty()
}
