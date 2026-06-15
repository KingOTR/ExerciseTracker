package com.example.rungps.sleep

import android.content.Context

object SleepStageInference {
    data class StageBreakdown(
        val totalSleepMin: Int,
        val deepSleepMin: Int,
        val lightSleepMin: Int,
        val remSleepMin: Int,
        val awakeSleepMin: Int,
        val snoreEvents: Int,
        val restlessnessIndex: Int,
        val timeToFallAsleepMin: Int,
        val efficiency: Int,
        val sleepCycles: Int,
        val qualityHint: String,
        val trackedMin: Int = 0,
    )

    private const val SNORE_AUDIO = 0.35f
    private const val CYCLE_BUCKETS = 54

    fun stageLabels(samples: List<SleepTrackSample>, context: Context? = null): List<SleepStageLabel> {
        if (samples.isEmpty()) return emptyList()
        context?.let { SleepMlClassifier.ensureLoaded(it) }
        val raw = samples.mapIndexed { index, s ->
            val asleep = s.asleepProb ?: (1f - s.movement.coerceIn(0f, 1f))
            when {
                asleep < 0.5f -> SleepStageLabel.AWAKE
                s.movement < 0.15f && s.quietFraction > 0.6f -> SleepStageLabel.DEEP
                (s.lightSleepProb ?: 0.5f) > 0.55f -> SleepStageLabel.LIGHT
                else -> SleepStageLabel.REM
            }
        }
        return SleepStageSmoother.smooth(raw)
    }

    fun analyze(samples: List<SleepTrackSample>, inBedMin: Int, context: Context? = null): StageBreakdown {
        if (samples.isEmpty()) return emptyBreakdown("No overnight samples recorded")
        val labels = stageLabels(samples, context)
        val bucketMs = SleepAudioConstants.BUCKET_MS
        val trackedMin = (samples.last().elapsedMs / 60_000L).toInt().coerceAtLeast(1)
        var deep = 0
        var light = 0
        var rem = 0
        var awake = 0
        var snoreEvents = 0
        var restlessSum = 0f
        var fallAsleepBuckets = 0
        var asleepStarted = false

        samples.forEachIndexed { i, s ->
            if (s.snoreLikelihood >= SNORE_AUDIO) snoreEvents++
            restlessSum += s.movement
            val label = labels.getOrElse(i) { SleepStageLabel.LIGHT }
            if (!asleepStarted && label != SleepStageLabel.AWAKE) {
                asleepStarted = true
                fallAsleepBuckets = (s.elapsedMs / bucketMs).toInt()
            }
            when (label) {
                SleepStageLabel.AWAKE -> awake++
                SleepStageLabel.DEEP -> deep++
                SleepStageLabel.LIGHT -> light++
                SleepStageLabel.REM -> rem++
            }
        }

        val totalBuckets = samples.size.coerceAtLeast(1)
        val totalSleepMin = ((totalBuckets - awake) * bucketMs / 60_000L).toInt().coerceAtLeast(0)
        val deepMin = (deep * bucketMs / 60_000L).toInt()
        val lightMin = (light * bucketMs / 60_000L).toInt()
        val remMin = (rem * bucketMs / 60_000L).toInt()
        val awakeMin = (awake * bucketMs / 60_000L).toInt()
        val restlessness = ((restlessSum / totalBuckets) * 100f).toInt().coerceIn(0, 100)
        val fallAsleepMin = (fallAsleepBuckets * bucketMs / 60_000L).toInt()
        val efficiency = if (inBedMin > 0) ((totalSleepMin * 100) / inBedMin).coerceIn(0, 100) else 85
        val cycles = estimateCycles(rem, totalBuckets)
        val avgBreath = samples.map { it.breathRateBpm }.filter { it > 0f }.average().takeIf { !it.isNaN() }?.toFloat() ?: 0f
        val hint = buildQualityHint(efficiency, deepMin, remMin, cycles, snoreEvents, restlessness, avgBreath)
        return StageBreakdown(
            totalSleepMin = totalSleepMin.coerceAtMost(inBedMin.coerceAtLeast(totalSleepMin)),
            deepSleepMin = deepMin,
            lightSleepMin = lightMin,
            remSleepMin = remMin,
            awakeSleepMin = awakeMin,
            snoreEvents = snoreEvents,
            restlessnessIndex = restlessness,
            timeToFallAsleepMin = fallAsleepMin,
            efficiency = efficiency,
            sleepCycles = cycles,
            qualityHint = hint,
            trackedMin = trackedMin,
        )
    }

    private fun estimateCycles(remBuckets: Int, total: Int): Int =
        if (total <= 0) 0 else (remBuckets / CYCLE_BUCKETS).coerceIn(0, 8)

    private fun buildQualityHint(
        efficiency: Int,
        deepMin: Int,
        remMin: Int,
        cycles: Int,
        snore: Int,
        restlessness: Int,
        avgBreath: Float,
    ): String = when {
        efficiency >= 85 && restlessness < 40 -> "Solid rest — movement and breathing looked calm"
        snore > 20 -> "Noisy night — consider mic placement farther from pillow edge"
        restlessness > 65 -> "Restless night — higher movement throughout"
        avgBreath > 0f && (avgBreath < 10f || avgBreath > 22f) -> "Breathing rate outside typical sleep range"
        deepMin < 30 -> "Light on deep sleep — try consistent bedtime"
        else -> "Tracked overnight — review stages in detail"
    }

    private fun emptyBreakdown(hint: String) = StageBreakdown(
        totalSleepMin = 0, deepSleepMin = 0, lightSleepMin = 0, remSleepMin = 0,
        awakeSleepMin = 0, snoreEvents = 0, restlessnessIndex = 0, timeToFallAsleepMin = 0,
        efficiency = 0, sleepCycles = 0, qualityHint = hint,
    )
}
