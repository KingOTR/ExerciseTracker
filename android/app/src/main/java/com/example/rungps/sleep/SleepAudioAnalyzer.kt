package com.example.rungps.sleep

object SleepAudioAnalyzer {
    data class WindowFeatures(
        val rms: Float,
        val breathRateBpm: Float,
        val breathRegularity: Float,
        val quietFraction: Float,
        val snoreLikelihood: Float,
    )

    fun rmsFromPcm(buffer: ShortArray, read: Int): Float {
        if (read <= 0) return 0f
        var sum = 0.0
        for (i in 0 until read) {
            val v = buffer[i].toDouble()
            sum += v * v
        }
        return kotlin.math.sqrt(sum / read).toFloat()
    }

    fun analyzeWindow(rmsSeries: List<Float>, baselineRms: Float): WindowFeatures {
        if (rmsSeries.isEmpty()) {
            return WindowFeatures(0f, 0f, 0f, 1f, 0f)
        }
        val avgRms = rmsSeries.average().toFloat()
        val normRms = if (baselineRms > 0f) avgRms / baselineRms else avgRms / 200f
        val quietThreshold = baselineRms * 0.6f
        val quietCount = rmsSeries.count { it < quietThreshold }
        val quietFraction = quietCount.toFloat() / rmsSeries.size
        val smoothed = movingAverage(rmsSeries, 3)
        val breathing = estimateBreathing(smoothed)
        val snoreLikelihood = when {
            normRms > 2.5f && quietFraction < 0.3f -> 0.8f
            normRms > 1.8f && quietFraction < 0.5f -> 0.5f
            else -> 0.1f
        }
        return WindowFeatures(
            rms = normRms.coerceIn(0f, 5f),
            breathRateBpm = breathing.first,
            breathRegularity = breathing.second,
            quietFraction = quietFraction.coerceIn(0f, 1f),
            snoreLikelihood = snoreLikelihood.coerceIn(0f, 1f),
        )
    }

    private fun estimateBreathing(smoothed: List<Float>): Pair<Float, Float> {
        if (smoothed.size < 4) return 0f to 0f
        var peaks = 0
        for (i in 1 until smoothed.lastIndex) {
            if (smoothed[i] > smoothed[i - 1] && smoothed[i] >= smoothed[i + 1]) peaks++
        }
        val bpm = (peaks * 6f).coerceIn(8f, 30f)
        val mean = smoothed.average().toFloat()
        val variance = smoothed.map { (it - mean) * (it - mean) }.average().toFloat()
        val regularity = (1f - (kotlin.math.sqrt(variance) / (mean + 1f))).coerceIn(0f, 1f)
        return bpm to regularity
    }

    private fun movingAverage(values: List<Float>, window: Int): List<Float> {
        if (values.isEmpty()) return emptyList()
        return values.indices.map { i ->
            val start = (i - window / 2).coerceAtLeast(0)
            val end = (i + window / 2).coerceAtMost(values.lastIndex)
            values.subList(start, end + 1).average().toFloat()
        }
    }
}
