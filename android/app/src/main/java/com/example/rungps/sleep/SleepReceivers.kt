package com.example.rungps.sleep

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.rungps.MainActivity

class SleepAlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        when (intent?.action) {
            ACTION_DISMISS -> {
                SleepAlarmDismiss.dismissAll(context)
                return
            }
            SleepAlarmScheduler.ACTION_FIRE -> {
                if (intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_SILENT_WAKE, false)) {
                    if (!SleepListenService.isRunningInProcess()) {
                        SleepListenService.resumeIfSessionActive(context)
                    }
                    return
                }
                if (intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_WATCHDOG, false)) {
                    handleSamplesWatchdog(context)
                    return
                }
                SleepListenService.resumeIfSessionActive(context)
                if (intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_DEADLINE, false)) {
                    fireWakeAlarm(context)
                }
            }
        }
    }

    private fun handleSamplesWatchdog(context: Context) {
        val active = SleepOvernightStore.isActive(context)
        val stopReason = SleepOvernightStore.lastStopReason(context).orEmpty()
        val userStopped = stopReason.startsWith("user_stop") || stopReason.contains("alarm_fired")
        if (!active && !userStopped && stopReason.isNotBlank()) {
            notifyIssue(context, "Sleep tracking stopped unexpectedly ($stopReason). Tap to reopen.")
            return
        }
        if (!active) return
        val elapsed = System.currentTimeMillis() - SleepOvernightStore.startedAtMs(context)
        val samples = SleepOvernightStore.sampleCount(context)
        if (elapsed >= SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS && samples == 0) {
            SleepOvernightStore.recordHealth(context, "watchdog_no_samples")
            notifyIssue(context, "Sleep recording isn't collecting data. Tap to fix.")
            SleepListenService.resumeIfSessionActive(context)
            SleepAlarmScheduler.scheduleSamplesWatchdog(context, 300_000L)
            return
        }
        if (!SleepListenService.isRunningInProcess() && SleepOvernightStore.isSessionValid(context)) {
            SleepOvernightStore.recordHealth(context, "watchdog_service_dead")
            notifyIssue(context, "Sleep tracking service stopped. Tap to restart.")
            SleepListenService.resumeIfSessionActive(context)
        }
        if (SleepOvernightStore.isActive(context)) {
            SleepAlarmScheduler.scheduleSamplesWatchdog(context)
        }
    }

    private fun fireWakeAlarm(context: Context) {
        if (SleepOvernightStore.alarmFired(context)) return
        SleepOvernightStore.recordAlarmFired(context)
        SleepAlarmAudit.recordFired(context, SleepAlarmAudit.FirePath.RECEIVER)
        context.startForegroundService(
            Intent(context, SleepAlarmSoundService::class.java).setAction(SleepAlarmSoundService.ACTION_START),
        )
        context.startActivity(
            Intent(context, SleepAlarmActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
        )
    }

    private fun notifyIssue(context: Context, message: String) {
        ensureChannel(context)
        val pi = PendingIntent.getActivity(
            context,
            44,
            Intent(context, MainActivity::class.java).putExtra("open_tab", "sleep"),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = NotificationCompat.Builder(context, SleepAlarmSoundService.CHANNEL_ALARM)
            .setSmallIcon(android.R.drawable.ic_dialog_alert)
            .setContentTitle("Exercise Tracker — sleep tracking issue")
            .setContentText(message)
            .setStyle(NotificationCompat.BigTextStyle().bigText(message))
            .setContentIntent(pi)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_ALARM)
            .setAutoCancel(true)
            .build()
        NotificationManagerCompat.from(context).notify(WATCHDOG_NOTIFICATION_ID, notification)
    }

    private fun ensureChannel(context: Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val nm = context.getSystemService(NotificationManager::class.java) ?: return
        nm.createNotificationChannel(
            NotificationChannel(
                SleepAlarmSoundService.CHANNEL_ALARM,
                "Sleep alarms",
                NotificationManager.IMPORTANCE_HIGH,
            ),
        )
    }

    companion object {
        const val ACTION_DISMISS = "com.example.rungps.sleep.ALARM_DISMISS"
        private const val WATCHDOG_NOTIFICATION_ID = 7103
    }
}

class SleepAlarmBootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_BOOT_COMPLETED,
            Intent.ACTION_MY_PACKAGE_REPLACED,
            Intent.ACTION_TIMEZONE_CHANGED,
            Intent.ACTION_TIME_CHANGED,
            -> {
                if (SleepOvernightStore.isActive(context)) {
                    SleepAlarmScheduler.ensureScheduled(context)
                    SleepListenService.resumeIfSessionActive(context)
                }
                BedtimeReminderScheduler.schedule(context)
            }
        }
    }
}

class BedtimeReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        if (intent?.action != BedtimeReminderScheduler.ACTION_BEDTIME) return
        ensureChannel(context)
        val pi = PendingIntent.getActivity(
            context,
            45,
            Intent(context, MainActivity::class.java).putExtra("open_tab", "sleep"),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = NotificationCompat.Builder(context, CHANNEL)
            .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
            .setContentTitle("Bedtime reminder")
            .setContentText("Wind down — start sleep tracking when ready")
            .setContentIntent(pi)
            .setAutoCancel(true)
            .build()
        NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, notification)
        BedtimeReminderScheduler.schedule(context)
    }

    private fun ensureChannel(context: Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        context.getSystemService(NotificationManager::class.java)?.createNotificationChannel(
            NotificationChannel(CHANNEL, "Bedtime reminders", NotificationManager.IMPORTANCE_DEFAULT),
        )
    }

    companion object {
        private const val CHANNEL = "bedtime_reminder"
        private const val NOTIFICATION_ID = 7201
    }
}
