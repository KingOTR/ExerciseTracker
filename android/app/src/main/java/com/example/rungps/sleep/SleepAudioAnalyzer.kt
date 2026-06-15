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
        if (rmsSeries.isEmpty()) return WindowFeatures(0f, 0f, 0f, 1f, 0f)
        val avgRms = rmsSeries.average().toFloat()
        val base = baselineRms.coerceAtLeast(50f)
        val normRms = (avgRms / base).coerceIn(0f, 4f)
        val quietThreshold = base * 1.15f
        val quietCount = rmsSeries.count { it <= quietThreshold }
        val quietFraction = quietCount.toFloat() / rmsSeries.size
        val smoothed = movingAverage(rmsSeries, 3)
        val breathing = estimateBreathing(smoothed)
        val loudCount = rmsSeries.count { it > base * 2.8f }
        val snoreLikelihood = (loudCount.toFloat() / rmsSeries.size).coerceIn(0f, 1f)
        return WindowFeatures(normRms, breathing.first, breathing.second, quietFraction, snoreLikelihood)
    }

    private fun estimateBreathing(smoothed: List<Float>): Pair<Float, Float> {
        if (smoothed.size < 8) return 0f to 0f
        val mean = smoothed.average().toFloat().coerceAtLeast(1f)
        val peaks = mutableListOf<Int>()
        for (i in 1 until smoothed.lastIndex) {
            val v = smoothed[i]
            if (v > mean * 1.08f && v >= smoothed[i - 1] && v >= smoothed[i + 1]) {
                if (peaks.isEmpty() || i - peaks.last() >= 3) peaks += i
            }
        }
        val bpm = (peaks.size * 6f).coerceIn(8f, 30f)
        val variance = smoothed.map { (it - mean) * (it - mean) }.average().toFloat()
        val regularity = (1f - kotlin.math.sqrt(variance) / mean).coerceIn(0f, 1f)
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
