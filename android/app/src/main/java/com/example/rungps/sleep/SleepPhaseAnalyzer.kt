package com.example.rungps.sleep

import android.content.Context

object SleepPhaseAnalyzer {
    fun analyze(samples: List<SleepTrackSample>, inBedMin: Int, context: Context? = null): OvernightAnalysis {
        val breakdown = SleepStageInference.analyze(samples, inBedMin, context)
        return OvernightAnalysis(
            totalSleepMin = breakdown.totalSleepMin,
            deepSleepMin = breakdown.deepSleepMin,
            lightSleepMin = breakdown.lightSleepMin,
            remSleepMin = breakdown.remSleepMin,
            awakeSleepMin = breakdown.awakeSleepMin,
            snoreEvents = breakdown.snoreEvents,
            restlessnessIndex = breakdown.restlessnessIndex,
            timeToFallAsleepMin = breakdown.timeToFallAsleepMin,
            efficiency = breakdown.efficiency,
            sleepCycles = breakdown.sleepCycles,
            qualityHint = breakdown.qualityHint,
        )
    }

    fun bestWakeIndex(
        samples: List<SleepTrackSample>,
        windowStartMs: Long,
        windowEndMs: Long,
        context: Context? = null,
    ): Int {
        if (samples.isEmpty()) return -1
        val startIdx = samples.indexOfFirst { it.elapsedMs >= windowStartMs }.coerceAtLeast(0)
        var endIdx = -1
        for (i in samples.indices.reversed()) {
            if (samples[i].elapsedMs <= windowEndMs) {
                endIdx = i
                break
            }
        }
        if (endIdx < startIdx) return endIdx.coerceAtLeast(0)
        var bestIdx = startIdx
        var bestScore = Float.MAX_VALUE
        for (i in startIdx..endIdx) {
            val s = samples[i]
            val score = s.movement * 0.35f +
                s.audioLevel * 0.25f +
                (1f - s.quietFraction) * 0.25f +
                (1f - s.breathRegularity) * 0.15f
            if (score < bestScore) {
                bestScore = score
                bestIdx = i
            }
        }
        return bestIdx
    }

    fun rmsFromPcm(buffer: ShortArray, read: Int): Float =
        SleepAudioAnalyzer.rmsFromPcm(buffer, read)
}
