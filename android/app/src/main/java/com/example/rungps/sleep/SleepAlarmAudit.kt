package com.example.rungps.sleep

object SleepAlarmAudit {
    const val EXTRA_FIRE_PATH = "fire_path"

    enum class FirePath { SERVICE_SMART, BACKUP_DEADLINE, WINDOW_END, RECEIVER }

    fun clearForNewNight(context: android.content.Context) = Unit

    fun recordScheduled(context: android.content.Context, alarmTargetMs: Long, windowMin: Int, smart: Boolean) = Unit

    fun recordFired(context: android.content.Context, path: FirePath) = Unit
}

object SleepWakeRecap {
    fun recordSmartWake(context: android.content.Context, wakeAtMs: Long, smart: Boolean) = Unit
}

object SleepAlarmDismiss {
    fun dismissAll(context: android.content.Context) {
        SleepAlarmSoundService.requestStop(context)
    }
}
