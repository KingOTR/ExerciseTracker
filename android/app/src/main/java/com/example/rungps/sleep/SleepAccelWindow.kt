package com.example.rungps.sleep

import java.util.ArrayDeque

class SleepAccelWindow(private val windowMs: Long = 12_000L) {
    data class AccelSnapshot(
        val activityIndex: Float,
        val variance: Float,
        val mean: Float,
    )

    private val readings = ArrayDeque<Pair<Long, Float>>(128)

    fun add(timeMs: Long, magnitude: Float) {
        readings.addLast(timeMs to magnitude)
        trim(timeMs)
    }

    fun snapshot(): AccelSnapshot {
        trim(System.currentTimeMillis())
        if (readings.size < 4) return AccelSnapshot(0f, 0f, 0f)
        val values = readings.map { it.second }
        val mean = values.average().toFloat()
        val variance = values.map { (it - mean) * (it - mean) }.average().toFloat()
        val activityIndex = (kotlin.math.sqrt(variance) / 4f).coerceIn(0f, 1f)
        return AccelSnapshot(activityIndex, variance, mean)
    }

    private fun trim(nowMs: Long) {
        while (readings.isNotEmpty() && nowMs - readings.first().first > windowMs) {
            readings.removeFirst()
        }
    }
}
