package com.example.rungps.tracking

import java.util.Locale
import kotlin.math.abs

object RunVoiceAnnouncer {
    fun activityStarted(isBike: Boolean): String = if (isBike) "Ride started" else "Run started"

    fun activityStopped(isBike: Boolean): String = if (isBike) "Ride complete" else "Run complete"

    fun paused(): String = "Paused"

    fun resumed(): String = "Resumed"

    fun kilometerSplit(km: Int, splitDurationMs: Long, isBike: Boolean): String =
        "$km kilometer. Split ${formatDuration(splitDurationMs)}."

    fun elapsedTime(elapsedMs: Long, isBike: Boolean): String =
        "${formatDuration(elapsedMs)} ${if (isBike) "riding" else "running"}."

    fun formatDuration(ms: Long): String {
        val totalSec = (ms / 1000).coerceAtLeast(0)
        val hours = totalSec / 3600
        val minutes = (totalSec % 3600) / 60
        val seconds = totalSec % 60
        return when {
            hours > 0 -> String.format(Locale.US, "%d hours %d minutes", hours, minutes)
            minutes > 0 && seconds > 0 -> String.format(Locale.US, "%d minutes %d seconds", minutes, seconds)
            minutes > 0 -> String.format(Locale.US, "%d minutes", minutes)
            else -> String.format(Locale.US, "%d seconds", seconds)
        }
    }

    fun formatPace(secPerKm: Int): String {
        if (secPerKm <= 0) return ""
        return String.format(
            Locale.US,
            "Pace %d minutes %d seconds per kilometer",
            secPerKm / 60,
            abs(secPerKm % 60),
        )
    }
}
