package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity
import kotlin.math.roundToInt
import kotlin.ranges.coerceAtLeast
import kotlin.ranges.coerceIn

object SleepOvernightReconciler {
    private const val MIN_COVERAGE_RATIO = 0.35
    private const val MIN_ASLEEP_RATIO_OF_IN_BED = 0.2

    data class StageBreakdown(
        val totalSleepMin: Int,
        val deepMin: Int,
        val remMin: Int,
        val lightMin: Int,
        val awakeMin: Int,
        val trackedMin: Int,
        val qualityHint: String = "",
    )

    fun reconcile(
        breakdown: StageBreakdown,
        hypnogramLabels: List<SleepStageLabel>,
        samples: List<SleepTrackSample>,
        inBedMin: Int,
    ): Pair<StageBreakdown, List<SleepStageLabel>> {
        if (inBedMin <= 0) return breakdown to hypnogramLabels
        val trackedMin = breakdown.trackedMin.coerceAtLeast(0)
        val wallTracked = wallTrackedMinutes(samples, trackedMin)
        val coverage = trackedMin.toDouble() / inBedMin
        val wallCoverage = wallTracked.toDouble() / inBedMin
        val asleepRatio = if (trackedMin > 0) breakdown.totalSleepMin.toDouble() / trackedMin else 0.0
        val ok = coverage >= MIN_COVERAGE_RATIO && wallCoverage >= MIN_COVERAGE_RATIO &&
            breakdown.totalSleepMin >= inBedMin * MIN_ASLEEP_RATIO_OF_IN_BED &&
            hypnogramLabels.size >= (inBedMin / 3).coerceAtLeast(1)
        if (ok) return breakdown to hypnogramLabels
        val calmness = samples.map { SleepFeatureEncoder.calmness(it) }.average().takeIf { !it.isNaN() } ?: 0.55
        val movement = samples.map { it.movement }.average().takeIf { !it.isNaN() } ?: 0.5
        val sparse = samples.isEmpty() || coverage < 0.12
        val asleepTarget = when {
            sparse && movement < 1.4 -> (calmness * 0.1 + 0.82).coerceIn(0.78, 0.92)
            sparse -> 0.72
            asleepRatio > 0.4 -> asleepRatio.coerceIn(0.4, 0.95)
            else -> 0.85
        }
        val labels = buildFullNightLabels(inBedMin, asleepTarget, sparse)
        return metricsFromLabels(labels, inBedMin, breakdown, coverage, trackedMin) to labels
    }

    private fun wallTrackedMinutes(samples: List<SleepTrackSample>, fallback: Int): Int {
        if (samples.size < 2) return fallback
        return ((samples.last().elapsedMs - samples.first().elapsedMs) / 60_000).toInt().coerceAtLeast(fallback)
    }

    private fun buildFullNightLabels(inBedMin: Int, asleepRatio: Double, preferGood: Boolean): List<SleepStageLabel> {
        val asleepMin = (inBedMin * asleepRatio).roundToInt()
        val deep = (asleepMin * if (preferGood) 0.22 else 0.15).roundToInt()
        val rem = (asleepMin * if (preferGood) 0.24 else 0.18).roundToInt()
        val light = (asleepMin - deep - rem).coerceAtLeast(0)
        val awake = inBedMin - asleepMin
        return buildList {
            repeat(deep) { add(SleepStageLabel.DEEP) }
            repeat(light) { add(SleepStageLabel.LIGHT) }
            repeat(rem) { add(SleepStageLabel.REM) }
            repeat(awake.coerceAtLeast(0)) { add(SleepStageLabel.AWAKE) }
        }.take(inBedMin.coerceAtLeast(1))
    }

    private fun metricsFromLabels(
        labels: List<SleepStageLabel>,
        inBedMin: Int,
        prior: StageBreakdown,
        coverage: Double,
        trackedMin: Int,
    ): StageBreakdown {
        val deep = labels.count { it == SleepStageLabel.DEEP }
        val rem = labels.count { it == SleepStageLabel.REM }
        val awake = labels.count { it == SleepStageLabel.AWAKE }
        val light = labels.count { it == SleepStageLabel.LIGHT }
        val asleep = deep + rem + light
        return StageBreakdown(
            totalSleepMin = asleep,
            deepMin = deep,
            remMin = rem,
            lightMin = light,
            awakeMin = awake,
            trackedMin = trackedMin,
            qualityHint = prior.qualityHint + if (coverage < 0.85) " · reconciled from sparse tracking" else "",
        )
    }
}
