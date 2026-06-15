package com.example.rungps.sleep

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import java.time.LocalTime
import java.time.ZonedDateTime

object BedtimeReminderScheduler {
    const val ACTION_BEDTIME = "com.example.rungps.sleep.BEDTIME_REMINDER"
    private const val REQ_BEDTIME = 7201
    private const val PREFS = "sleep_bedtime"
    private const val KEY_ENABLED = "enabled"
    private const val KEY_HOUR = "hour"
    private const val KEY_MINUTE = "minute"

    fun isEnabled(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_ENABLED, false)

    fun setEnabled(context: Context, enabled: Boolean, hour: Int = 22, minute: Int = 30) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .putBoolean(KEY_ENABLED, enabled)
            .putInt(KEY_HOUR, hour)
            .putInt(KEY_MINUTE, minute)
            .apply()
        if (enabled) schedule(context) else cancel(context)
    }

    fun schedule(context: Context) {
        if (!isEnabled(context)) return
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val hour = prefs.getInt(KEY_HOUR, 22)
        val minute = prefs.getInt(KEY_MINUTE, 30)
        var target = ZonedDateTime.now().with(LocalTime.of(hour, minute))
        if (!target.isAfter(ZonedDateTime.now())) target = target.plusDays(1)
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        val pi = PendingIntent.getBroadcast(
            context,
            REQ_BEDTIME,
            Intent(context, BedtimeReminderReceiver::class.java).setAction(ACTION_BEDTIME),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val at = target.toInstant().toEpochMilli()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && !am.canScheduleExactAlarms()) {
            am.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, at, pi)
        } else {
            am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, at, pi)
        }
    }

    fun cancel(context: Context) {
        val am = context.getSystemService(AlarmManager::class.java) ?: return
        am.cancel(
            PendingIntent.getBroadcast(
                context,
                REQ_BEDTIME,
                Intent(context, BedtimeReminderReceiver::class.java).setAction(ACTION_BEDTIME),
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
            ),
        )
    }
}
