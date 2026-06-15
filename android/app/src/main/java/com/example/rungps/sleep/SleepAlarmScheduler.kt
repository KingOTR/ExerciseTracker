package com.example.rungps.sleep

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build

object SleepAlarmScheduler {
    const val ACTION_FIRE = "com.example.rungps.sleep.ALARM_FIRE"
    const val EXTRA_DEADLINE = "deadline"
    const val EXTRA_SILENT_WAKE = "silent_wake"
    const val EXTRA_WATCHDOG = "samples_watchdog"
    const val SAMPLES_WATCHDOG_DELAY_MS = 180_000L

    private const val REQ_WINDOW_END = 7104
    private const val REQ_ALARM_TARGET = 7105
    private const val REQ_WINDOW_START = 7106
    private const val REQ_KEEPALIVE_BASE = 7107
    private const val REQ_SAMPLES_WATCHDOG = 7113

    fun ensureScheduled(context: Context) {
        if (!SleepOvernightStore.isActive(context)) return
        val alarmTarget = SleepOvernightStore.alarmTargetMs(context)
        if (alarmTarget <= 0) return
        scheduleBackupAlarms(context, alarmTarget, SleepOvernightStore.windowMin(context))
    }

    fun scheduleBackupAlarms(context: Context, alarmTargetMs: Long, windowMin: Int) {
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        val smart = if (SleepOvernightStore.isActive(context)) {
            SleepOvernightStore.smartAlarm(context)
        } else {
            SleepAlarmPreferences.smartAlarmEnabled(context)
        }
        SleepAlarmAudit.recordScheduled(context, alarmTargetMs, windowMin, smart)
        cancelAll(context)
        val windowMs = windowMin * 60_000L
        val windowStart = alarmTargetMs - windowMs
        val windowEnd = alarmTargetMs + windowMs
        val now = System.currentTimeMillis()
        listOf(5L, 10L, 15L, 30L, 45L, 60L, 90L, 120L, 180L, 240L).forEachIndexed { i, min ->
            val at = now + min * 60_000L
            if (at in (now + 1) until alarmTargetMs) {
                scheduleAt(context, am, at, REQ_KEEPALIVE_BASE + i, deadline = false, silentWake = true)
            }
        }
        if (windowStart > now) {
            scheduleAt(context, am, windowStart, REQ_WINDOW_START, deadline = false, silentWake = true)
        }
        if (alarmTargetMs > now) {
            scheduleAt(context, am, alarmTargetMs, REQ_ALARM_TARGET, deadline = true, silentWake = false)
        }
        if (windowEnd > now) {
            scheduleAt(context, am, windowEnd, REQ_WINDOW_END, deadline = true, silentWake = false)
        }
        scheduleSamplesWatchdog(context, SAMPLES_WATCHDOG_DELAY_MS)
        SleepAlarmPreferences.setLastAlarmTargetMs(context, alarmTargetMs)
    }

    fun scheduleSamplesWatchdog(context: Context, delayMs: Long = SAMPLES_WATCHDOG_DELAY_MS) {
        if (!SleepOvernightStore.isActive(context)) return
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        val at = System.currentTimeMillis() + delayMs.coerceAtLeast(60_000L)
        val pi = PendingIntent.getBroadcast(
            context,
            REQ_SAMPLES_WATCHDOG,
            Intent(context, SleepAlarmReceiver::class.java).apply {
                action = ACTION_FIRE
                putExtra(EXTRA_DEADLINE, false)
                putExtra(EXTRA_SILENT_WAKE, false)
                putExtra(EXTRA_WATCHDOG, true)
            },
            pendingFlags(),
        )
        deliverAt(context, am, at, pi)
    }

    fun cancelSamplesWatchdog(context: Context) {
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        am.cancel(
            PendingIntent.getBroadcast(
                context,
                REQ_SAMPLES_WATCHDOG,
                Intent(context, SleepAlarmReceiver::class.java).setAction(ACTION_FIRE),
                pendingFlags(),
            ),
        )
    }

    fun cancelAll(context: Context) {
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        listOf(
            REQ_WINDOW_END,
            REQ_ALARM_TARGET,
            REQ_WINDOW_START,
            REQ_SAMPLES_WATCHDOG,
        ).forEach { req ->
            am.cancel(
                PendingIntent.getBroadcast(
                    context,
                    req,
                    Intent(context, SleepAlarmReceiver::class.java).setAction(ACTION_FIRE),
                    pendingFlags(),
                ),
            )
        }
        (0..5).forEach { i ->
            am.cancel(
                PendingIntent.getBroadcast(
                    context,
                    REQ_KEEPALIVE_BASE + i,
                    Intent(context, SleepAlarmReceiver::class.java).setAction(ACTION_FIRE),
                    pendingFlags(),
                ),
            )
        }
    }

    fun scheduleImmediate(context: Context) {
        scheduleImmediateKeepAlive(context, 0L)
    }

    fun scheduleImmediateKeepAlive(context: Context, delayMs: Long = 0L) {
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        val at = System.currentTimeMillis() + delayMs
        scheduleAt(context, am, at, REQ_KEEPALIVE_BASE, deadline = true, silentWake = false)
    }

    private fun scheduleAt(
        context: Context,
        am: AlarmManager,
        triggerAtMs: Long,
        requestCode: Int,
        deadline: Boolean,
        silentWake: Boolean,
    ) {
        val pi = PendingIntent.getBroadcast(
            context,
            requestCode,
            Intent(context, SleepAlarmReceiver::class.java).apply {
                action = ACTION_FIRE
                putExtra(EXTRA_DEADLINE, deadline)
                putExtra(EXTRA_SILENT_WAKE, silentWake)
            },
            pendingFlags(),
        )
        deliverAt(context, am, triggerAtMs, pi)
    }

    private fun deliverAt(context: Context, am: AlarmManager, triggerAtMs: Long, pi: PendingIntent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && !am.canScheduleExactAlarms()) {
            am.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMs, pi)
        } else {
            am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMs, pi)
        }
    }

    private fun pendingFlags(): Int =
        PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
}
