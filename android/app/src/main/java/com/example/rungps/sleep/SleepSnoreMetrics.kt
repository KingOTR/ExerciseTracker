package com.example.rungps.sleep

object SleepSnoreMetrics {
    data class NightMetrics(
        val snoresPerHour: Float,
        val percentNightSnoring: Float,
        val lightMinutes: Int,
        val loudMinutes: Int,
        val epicMinutes: Int,
        val snoreScore: Int,
    )

    fun intensityFromLikelihood(likelihood: Float): Int = when {
        likelihood >= 0.75f -> 3
        likelihood >= 0.5f -> 2
        likelihood >= 0.25f -> 1
        else -> 0
    }

    fun intensityFromRmsNorm(norm: Float, baseline: Float): Int {
        val ratio = norm / baseline.coerceAtLeast(50f)
        return when {
            ratio >= 4.5f -> 3
            ratio >= 3.2f -> 2
            ratio >= 2.8f -> 1
            else -> 0
        }
    }

    fun analyze(samples: List<SleepTrackSample>, trackedMinutes: Int): NightMetrics {
        if (samples.isEmpty() || trackedMinutes <= 0) {
            return NightMetrics(0f, 0f, 0, 0, 0, 0)
        }
        var snoringBuckets = 0
        var epic = 0
        var loud = 0
        var light = 0
        for (s in samples) {
            val intensity = s.snoreIntensity ?: intensityFromLikelihood(s.snoreLikelihood)
            when {
                intensity >= 3 || s.snoreLikelihood >= 0.75f -> epic++
                intensity >= 2 || s.snoreLikelihood >= 0.5f -> loud++
                intensity >= 1 || s.snoreLikelihood >= 0.25f -> light++
            }
            if (s.snoreLikelihood >= 0.25f || s.eventTag == "snore" ||
                (s.snoreIntensity ?: 0) >= 1
            ) {
                snoringBuckets++
            }
        }
        val hours = (trackedMinutes / 60.0).coerceAtLeast(0.1)
        val pct = ((snoringBuckets * 10.0 / 60.0 * 100.0) / trackedMinutes.coerceAtLeast(1))
            .toFloat().coerceIn(0f, 100f)
        val perHour = (snoringBuckets / hours).toFloat()
        return NightMetrics(
            snoresPerHour = perHour,
            percentNightSnoring = pct,
            lightMinutes = (light * 10 / 60.0).toInt(),
            loudMinutes = (loud * 10 / 60.0).toInt(),
            epicMinutes = (epic * 10 / 60.0).toInt(),
            snoreScore = computeSnoreScore(perHour, pct, epic, loud),
        )
    }

    private fun computeSnoreScore(perHour: Float, pct: Float, epic: Int, loud: Int): Int =
        (perHour * 4f + pct * 0.35f + epic * 2.5f + loud * 1.2f).toInt().coerceIn(0, 100)
}
