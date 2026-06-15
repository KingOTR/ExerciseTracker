package com.example.rungps.sleep

import kotlin.math.roundToInt

object SleepMicCoverage {
    data class Snapshot(
        val coverageRatio: Float,
        val trackedMin: Int,
        val inBedMin: Int,
        val gapMs: Long,
        val gapCount: Int,
        val label: String,
    )

    fun fromSamples(
        samples: List<SleepTrackSample>,
        inBedMin: Int,
        gapMs: Long = 0L,
        gapCount: Int = 0,
    ): Snapshot {
        val trackedMin = if (samples.isEmpty()) 0 else {
            (samples.size * inferBucketMs(samples) / 60_000.0).roundToInt().coerceAtLeast(0)
        }
        val ratio = if (inBedMin > 0) trackedMin.toFloat() / inBedMin else 1f
        val label = when {
            ratio >= 0.85f && gapCount == 0 -> "Good mic coverage"
            ratio >= 0.55f -> "Partial coverage (${(ratio * 100).roundToInt()}%)"
            else -> "Low coverage (${(ratio * 100).roundToInt()}%) — stages are estimates"
        }
        return Snapshot(ratio.coerceIn(0f, 1.2f), trackedMin, inBedMin, gapMs, gapCount, label)
    }

    fun detectGaps(samples: List<SleepTrackSample>): Pair<Long, Int> {
        if (samples.size < 2) return 0L to 0
        val bucketMs = inferBucketMs(samples)
        var gapMs = 0L
        var gapCount = 0
        for (i in 1 until samples.size) {
            val delta = samples[i].elapsedMs - samples[i - 1].elapsedMs
            if (delta > bucketMs + 15_000) {
                gapMs += delta - bucketMs
                gapCount++
            }
        }
        return gapMs to gapCount
    }

    private fun inferBucketMs(samples: List<SleepTrackSample>): Long {
        if (samples.size < 2) return SleepAudioConstants.BUCKET_MS
        val deltas = (1 until samples.size).map { samples[it].elapsedMs - samples[it - 1].elapsedMs }
            .filter { it in 5_000..20_000 }
        return deltas.average().takeIf { !it.isNaN() && it > 0 }?.toLong()
            ?: SleepAudioConstants.BUCKET_MS
    }
}
