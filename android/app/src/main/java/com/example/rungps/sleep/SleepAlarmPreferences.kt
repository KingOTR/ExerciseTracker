package com.example.rungps.sleep

import android.content.Context
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime

object SleepAlarmPreferences {
    private const val PREFS = "sleep_alarm"
    private const val KEY_WINDOW_MIN = "window_min"
    private const val KEY_SMART = "smart_enabled"
    private const val KEY_LAST_ALARM_MS = "last_alarm_target_ms"
    private const val KEY_ALARM_HOUR = "alarm_hour"
    private const val KEY_ALARM_MINUTE = "alarm_minute"
    private const val KEY_SOUND_MODE = "sound_mode"

    const val SOUND_SYSTEM = "system"
    const val SOUND_RINGTONE = "ringtone"
    const val SOUND_SPOTIFY = "spotify"

    fun snapAlarmMinute(minute: Int): Int = ((minute + 2) / 5 * 5).coerceIn(0, 55)

    fun alarmTime(context: Context): Pair<Int, Int> {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val hour = prefs.getInt(KEY_ALARM_HOUR, 7).coerceIn(0, 23)
        val minute = snapAlarmMinute(prefs.getInt(KEY_ALARM_MINUTE, 0))
        return hour to minute
    }

    fun setAlarmTime(context: Context, hour: Int, minute: Int) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .putInt(KEY_ALARM_HOUR, hour.coerceIn(0, 23))
            .putInt(KEY_ALARM_MINUTE, snapAlarmMinute(minute))
            .apply()
    }

    fun windowMin(context: Context): Int =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getInt(KEY_WINDOW_MIN, 30).coerceIn(10, 45)

    fun setWindowMin(context: Context, min: Int) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putInt(KEY_WINDOW_MIN, min.coerceIn(10, 45)).apply()
    }

    fun smartAlarmEnabled(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_SMART, true)

    fun setSmartAlarmEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_SMART, enabled).apply()
    }

    fun lastAlarmTargetMs(context: Context): Long =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getLong(KEY_LAST_ALARM_MS, 0L)

    fun setLastAlarmTargetMs(context: Context, ms: Long) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putLong(KEY_LAST_ALARM_MS, ms).apply()
    }

    fun soundMode(context: Context): String =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getString(KEY_SOUND_MODE, SOUND_SYSTEM) ?: SOUND_SYSTEM

    fun computeNextAlarmTargetMs(context: Context, zone: ZoneId = ZoneId.systemDefault()): Long {
        val (hour, minute) = alarmTime(context)
        val now = ZonedDateTime.now(zone)
        var target = now.with(LocalTime.of(hour, minute))
        if (!target.isAfter(now)) target = target.plusDays(1)
        return target.toInstant().toEpochMilli()
    }
}
