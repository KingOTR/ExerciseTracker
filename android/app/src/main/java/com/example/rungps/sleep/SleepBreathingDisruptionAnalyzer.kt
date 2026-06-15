package com.example.rungps.sleep

object SleepBreathingDisruptionAnalyzer {
    data class NightMetrics(
        val disruptionsPerHour: Float,
        val clusterCount: Int,
        val longestPauseSec: Int,
        val recoveryBreaths: Int,
        val breathPauseMinutes: Int,
    )

    private data class PauseCluster(val bucketCount: Int, val hadRecoveryBreath: Boolean)

    fun isPauseBucket(s: SleepTrackSample): Boolean {
        if (s.breathPause == true) return true
        return s.quietFraction >= 0.82f &&
            s.snoreLikelihood < 0.12f &&
            s.breathRateBpm <= 0f &&
            s.eventTag != "snore" &&
            s.eventTag != "talk"
    }

    fun analyze(samples: List<SleepTrackSample>, trackedMinutes: Int): NightMetrics {
        if (samples.isEmpty() || trackedMinutes <= 0) {
            return NightMetrics(0f, 0, 0, 0, 0)
        }
        val clusters = findPauseClusters(samples)
        val totalPauseBuckets = clusters.sumOf { it.bucketCount }
        val longest = (clusters.maxOfOrNull { it.bucketCount } ?: 0) * 10
        val recovery = clusters.count { it.hadRecoveryBreath }
        val hours = (trackedMinutes / 60.0).coerceAtLeast(0.1)
        return NightMetrics(
            disruptionsPerHour = (clusters.size / hours).toFloat(),
            clusterCount = clusters.size,
            longestPauseSec = longest,
            recoveryBreaths = recovery,
            breathPauseMinutes = (totalPauseBuckets * 10 / 60.0).toInt(),
        )
    }

    fun detectPauseInWindow(rmsSeries: List<Float>, baselineRms: Float): Boolean {
        if (rmsSeries.size < 4) return false
        val threshold = baselineRms.coerceAtLeast(50f) * 1.08f
        var streak = 0
        var maxStreak = 0
        for (rms in rmsSeries) {
            if (rms <= threshold) {
                streak++
                maxStreak = maxOf(maxStreak, streak)
            } else {
                streak = 0
            }
        }
        return maxStreak >= maxOf((rmsSeries.size * 0.55f).toInt(), 4)
    }

    private fun findPauseClusters(samples: List<SleepTrackSample>): List<PauseCluster> {
        val out = mutableListOf<PauseCluster>()
        var run = 0
        for (i in samples.indices) {
            if (isPauseBucket(samples[i])) {
                run++
            } else {
                if (run >= 2) {
                    val recovery = i < samples.size &&
                        samples[i].breathRateBpm in 8f..28f &&
                        samples[i].breathRegularity >= 0.2f
                    out += PauseCluster(run, recovery)
                }
                run = 0
            }
        }
        if (run >= 2) out += PauseCluster(run, false)
        return out
    }
}
