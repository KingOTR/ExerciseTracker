package com.example.rungps.sleep

import android.content.Context
import com.example.rungps.spotify.SpotifyController

object SleepAlarmSpotify {
    fun playWindDown(context: Context, query: String = "sleep sounds") {
        SpotifyController.playAlarmTrack(context, query)
    }
}

object SleepSpotifyPicker {
    data class Track(val title: String, val query: String)

    val presets = listOf(
        Track("Sleep sounds", "sleep sounds"),
        Track("Rain", "rain sounds sleep"),
        Track("Lo-fi", "lofi sleep"),
    )

    fun openPreset(context: Context, track: Track) {
        SpotifyController.playAlarmTrack(context, track.query)
    }
}

object WindDownAutomation {
    fun schedule(context: Context, minutesBeforeBed: Int) {
        context.getSharedPreferences("wind_down", Context.MODE_PRIVATE)
            .edit()
            .putInt("minutes_before_bed", minutesBeforeBed)
            .putLong("scheduled_at", System.currentTimeMillis())
            .apply()
    }

    fun shouldRun(context: Context): Boolean {
        val prefs = context.getSharedPreferences("wind_down", Context.MODE_PRIVATE)
        return prefs.contains("minutes_before_bed")
    }
}
