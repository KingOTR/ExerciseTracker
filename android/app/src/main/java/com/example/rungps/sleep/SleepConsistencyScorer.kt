package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import kotlin.math.abs
import kotlin.math.roundToInt

object SleepConsistencyScorer {
    data class Result(
        val score: Int,
        val bedtimeVarianceMin: Int,
        val wakeVarianceMin: Int,
        val summary: String,
    )

    fun score(entries: List<SleepEntryEntity>, zone: ZoneId = ZoneId.systemDefault()): Result {
        val recent = entries.sortedByDescending { it.endTimeMs }.take(7)
        if (recent.size < 2) {
            return Result(0, 0, 0, "Need more nights for consistency score.")
        }
        val bedMinutes = recent.map {
            val zdt = Instant.ofEpochMilli(it.startTimeMs).atZone(zone)
            zdt.hour * 60 + zdt.minute + if (zdt.hour < 12) 24 * 60 else 0
        }
        val wakeMinutes = recent.map {
            val zdt = Instant.ofEpochMilli(it.endTimeMs).atZone(zone)
            zdt.hour * 60 + zdt.minute
        }
        val bedVar = variance(bedMinutes)
        val wakeVar = variance(wakeMinutes)
        val penalty = (bedVar + wakeVar) / 30.0
        val score = (100 - penalty).coerceIn(0.0, 100.0).roundToInt()
        val summary = when {
            score >= 80 -> "Very consistent sleep schedule."
            score >= 60 -> "Moderate schedule variation."
            else -> "Irregular bed/wake times — aim for a fixed window."
        }
        return Result(score, bedVar.roundToInt(), wakeVar.roundToInt(), summary)
    }

    private fun variance(values: List<Int>): Double {
        if (values.isEmpty()) return 0.0
        val mean = values.average()
        return values.map { abs(it - mean) }.average()
    }
}
