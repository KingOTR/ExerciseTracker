package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity
import java.time.Instant
import java.time.LocalTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import kotlin.math.roundToInt

object SleepDebtTracker {
    const val DEFAULT_TARGET_HOURS = 8.0
    private const val LOOKBACK_NIGHTS = 7

    data class Snapshot(
        val targetHoursPerNight: Double,
        val avgHours7d: Double,
        val debtHours: Double,
        val nightsInWindow: Int,
        val suggestedBedtimeLabel: String?,
        val summary: String,
    )

    fun analyze(
        entries: List<SleepEntryEntity>,
        targetHoursPerNight: Double = DEFAULT_TARGET_HOURS,
        typicalWakeHour: Int = 7,
        typicalWakeMinute: Int = 0,
        zone: ZoneId = ZoneId.systemDefault(),
    ): Snapshot {
        val recent = entries.sortedByDescending { it.endTimeMs }.take(LOOKBACK_NIGHTS)
        if (recent.isEmpty()) {
            return Snapshot(
                targetHoursPerNight = targetHoursPerNight,
                avgHours7d = 0.0,
                debtHours = 0.0,
                nightsInWindow = 0,
                suggestedBedtimeLabel = null,
                summary = "No sleep data yet — track overnight to see debt.",
            )
        }
        val hours = recent.map { it.totalSleepMin / 60.0 }
        val avg = hours.average()
        val debt = ((targetHoursPerNight * recent.size) - hours.sum()).coerceAtLeast(0.0)
        val wake = LocalTime.of(typicalWakeHour, typicalWakeMinute)
        val bedMinutes = (wake.toSecondOfDay() / 60.0 - targetHoursPerNight * 60).coerceAtLeast(0.0)
        val bedHour = (bedMinutes / 60).toInt()
        val bedMin = (bedMinutes % 60).toInt()
        val bedLabel = LocalTime.of(bedHour.coerceIn(0, 23), bedMin.coerceIn(0, 59))
            .format(DateTimeFormatter.ofPattern("HH:mm"))
        val summary = when {
            debt > 3 -> "High sleep debt (${fmtH(debt)}h) — prioritize an earlier bedtime."
            debt > 1 -> "Moderate debt (${fmtH(debt)}h) over ${recent.size} nights."
            else -> "Sleep balance looks good — averaging ${fmtH(avg)}h/night."
        }
        return Snapshot(
            targetHoursPerNight = targetHoursPerNight,
            avgHours7d = avg,
            debtHours = debt,
            nightsInWindow = recent.size,
            suggestedBedtimeLabel = bedLabel,
            summary = summary,
        )
    }

    private fun fmtH(h: Double): String {
        val rounded = (h * 10).roundToInt() / 10.0
        return if (rounded == rounded.toLong().toDouble()) rounded.toLong().toString() else "%.1f".format(rounded)
    }
}
