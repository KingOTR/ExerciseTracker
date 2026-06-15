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

    fun analyze(samples: List<SleepTrackSample>, inBedMin: Int, context: Context? = null): StageBreakdown {
        if (samples.isEmpty()) {
            return emptyBreakdown("No overnight samples recorded")
        }
        val trackedMin = (samples.last().elapsedMs / 60_000L).toInt().coerceAtLeast(1)
        val bucketMs = SleepAudioConstants.BUCKET_MS
        var deep = 0
        var light = 0
        var rem = 0
        var awake = 0
        var snoreEvents = 0
        var restlessSum = 0f
        var fallAsleepBuckets = 0
        var asleepStarted = false

        samples.forEach { s ->
            if (s.snoreLikelihood >= SNORE_AUDIO) snoreEvents++
            restlessSum += s.movement
            val asleep = (s.asleepProb ?: (1f - s.movement.coerceIn(0f, 1f))) >= 0.5f
            if (!asleepStarted && asleep) {
                asleepStarted = true
                fallAsleepBuckets = (s.elapsedMs / bucketMs).toInt()
            }
            when {
                !asleep -> awake++
                s.movement < 0.15f && s.quietFraction > 0.6f -> deep++
                (s.lightSleepProb ?: 0.5f) > 0.55f -> light++
                else -> rem++
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
        val hint = buildQualityHint(efficiency, deepMin, remMin, cycles, snoreEvents, restlessness)
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
        if (total <= 0) 0 else (remBuckets / 54).coerceIn(0, 8)

    private fun buildQualityHint(
        efficiency: Int,
        deepMin: Int,
        remMin: Int,
        cycles: Int,
        snore: Int,
        restlessness: Int,
    ): String = when {
        efficiency >= 85 && restlessness < 40 -> "Solid rest — movement and breathing looked calm"
        snore > 20 -> "Noisy night — consider mic placement farther from pillow edge"
        restlessness > 65 -> "Restless night — higher movement throughout"
        deepMin < 30 -> "Light on deep sleep — try consistent bedtime"
        else -> "Tracked overnight — review stages in detail"
    }

    private fun emptyBreakdown(hint: String) = StageBreakdown(
        totalSleepMin = 0,
        deepSleepMin = 0,
        lightSleepMin = 0,
        remSleepMin = 0,
        awakeSleepMin = 0,
        snoreEvents = 0,
        restlessnessIndex = 0,
        timeToFallAsleepMin = 0,
        efficiency = 0,
        sleepCycles = 0,
        qualityHint = hint,
    )
}
