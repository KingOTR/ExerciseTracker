package com.example.rungps.analytics

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

object ExerciseTrackerAnalytics {
    private var analytics: FirebaseAnalytics? = null

    fun init(context: Context) {
        analytics = FirebaseAnalytics.getInstance(context)
        analytics?.setUserProperty("isRebuiltPort", "true")
        analytics?.setUserProperty("versionCode", "107")
    }

    fun logRunCompleted(context: Context, distanceM: Double, durationMs: Long) {
        get(context).logEvent("run_completed", Bundle().apply {
            putDouble("distance_m", distanceM)
            putLong("duration_ms", durationMs)
        })
    }

    fun logSleepNightFinished(context: Context, totalSleepMin: Int, efficiency: Int?) {
        get(context).logEvent("sleep_night_finished", Bundle().apply {
            putInt("total_sleep_min", totalSleepMin)
            efficiency?.let { putInt("efficiency", it) }
        })
    }

    fun logGymSessionSaved(context: Context, sessionId: Long, setCount: Int) {
        get(context).logEvent("gym_session_saved", Bundle().apply {
            putLong("session_id", sessionId)
            putInt("set_count", setCount)
        })
    }

    fun logStravaUpload(context: Context, runId: Long, success: Boolean) {
        get(context).logEvent("strava_upload", Bundle().apply {
            putLong("run_id", runId)
            putString("result", if (success) "success" else "failure")
        })
    }

    private fun get(context: Context): FirebaseAnalytics {
        if (analytics == null) init(context)
        return analytics!!
    }
}
