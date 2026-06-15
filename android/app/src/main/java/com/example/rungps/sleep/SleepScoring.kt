package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity
import kotlin.math.roundToInt

object SleepScoring {
    fun overallScore(entry: SleepEntryEntity): Int {
        val duration = (entry.totalSleepMin / 480.0).coerceIn(0.0, 1.0) * 35
        val efficiency = (entry.sleepEfficiency?.coerceIn(0, 100) ?: 80) / 100.0 * 30
        val deep = ((entry.deepSleepMin ?: 0) / 90.0).coerceIn(0.0, 1.0) * 20
        val rem = ((entry.remSleepMin ?: 0) / 90.0).coerceIn(0.0, 1.0) * 15
        return (duration + efficiency + deep + rem).roundToInt().coerceIn(0, 100)
    }
}

object SleepNightAnalytics {
    data class Report(
        val score: Int,
        val efficiencyLabel: String,
        val stageBalance: String,
        val flags: List<String>,
    )

    fun analyze(entry: SleepEntryEntity): Report {
        val score = SleepScoring.overallScore(entry)
        val eff = entry.sleepEfficiency ?: 0
        val flags = buildList {
            if ((entry.snoreEvents ?: 0) > 10) add("Elevated snoring")
            entry.osaRiskHint?.let { add(it) }
            if ((entry.sleepDebtHours ?: 0f) > 2f) add("Sleep debt accumulating")
        }
        return Report(
            score = score,
            efficiencyLabel = when {
                eff >= 85 -> "Excellent"
                eff >= 70 -> "Good"
                else -> "Below target"
            },
            stageBalance = "Deep ${entry.deepSleepMin ?: 0}m · REM ${entry.remSleepMin ?: 0}m",
            flags = flags,
        )
    }
}

object SleepTrendAnalysis {
    fun weekTrend(entries: List<SleepEntryEntity>): String {
        if (entries.isEmpty()) return "No trend data"
        val avg = entries.map { it.totalSleepMin }.average() / 60.0
        val scores = entries.map { SleepScoring.overallScore(it) }
        val delta = if (scores.size >= 2) scores.first() - scores.last() else 0
        return "Avg ${"%.1f".format(avg)}h/night · score trend ${if (delta >= 0) "+" else ""}$delta"
    }
}

object SleepScience {
    fun tipForStage(stage: SleepStageLabel): String = when (stage) {
        SleepStageLabel.DEEP -> "Deep sleep supports physical recovery and growth hormone release."
        SleepStageLabel.REM -> "REM sleep consolidates memory and learning."
        SleepStageLabel.LIGHT -> "Light sleep transitions the body between wake and deeper stages."
        SleepStageLabel.AWAKE -> "Brief awakenings are normal; frequent ones may affect rest quality."
    }
}
