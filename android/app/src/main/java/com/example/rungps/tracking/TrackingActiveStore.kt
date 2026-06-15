package com.example.rungps.tracking

import android.content.Context

object TrackingActiveStore {
    private const val PREFS = "tracking_active"
    private const val KEY_ACTIVE = "active"
    private const val KEY_RUN_ID = "run_id"
    private const val KEY_STARTED_AT = "started_at_ms"
    private const val KEY_DISTANCE_M = "distance_m"
    private const val KEY_ACTIVITY_TYPE = "activity_type"
    private const val KEY_PAUSED = "paused"

    fun markActive(context: Context, runId: Long, startedAtMs: Long, activityType: String = "RUN") {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .putBoolean(KEY_ACTIVE, true)
            .putLong(KEY_RUN_ID, runId)
            .putLong(KEY_STARTED_AT, startedAtMs)
            .putFloat(KEY_DISTANCE_M, 0f)
            .putString(KEY_ACTIVITY_TYPE, activityType)
            .putBoolean(KEY_PAUSED, false)
            .commit()
    }

    fun updateLiveStats(context: Context, distanceM: Double, activityType: String, paused: Boolean) {
        if (!isActive(context)) return
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .putFloat(KEY_DISTANCE_M, distanceM.toFloat())
            .putString(KEY_ACTIVITY_TYPE, activityType)
            .putBoolean(KEY_PAUSED, paused)
            .apply()
    }

    fun clear(context: Context) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().clear().commit()
    }

    fun isActive(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_ACTIVE, false)

    fun runId(context: Context): Long? {
        val id = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getLong(KEY_RUN_ID, 0L)
        return id.takeIf { it > 0L }
    }

    fun startedAtMs(context: Context): Long =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getLong(KEY_STARTED_AT, 0L)

    fun liveDistanceM(context: Context): Double =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getFloat(KEY_DISTANCE_M, 0f).toDouble()

    fun liveActivityType(context: Context): String =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY_ACTIVITY_TYPE, "RUN") ?: "RUN"

    fun isPaused(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_PAUSED, false)
}
