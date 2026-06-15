package com.example.rungps.sleep

object SleepFeatureEncoder {
    const val FEATURES_PER_BUCKET = 8
    const val CONTEXT_BUCKETS = 3
    const val INPUT_SIZE = 32

    fun encodeCurrent(s: SleepTrackSample): FloatArray {
        val out = FloatArray(FEATURES_PER_BUCKET)
        for (i in 0 until FEATURES_PER_BUCKET) {
            out[i] = when (i) {
                0 -> (s.movement / 2f).coerceIn(0f, 1f)
                1 -> (s.audioLevel / 3f).coerceIn(0f, 1f)
                2 -> s.breathRegularity.coerceIn(0f, 1f)
                3 -> (s.breathRateBpm / 24f).coerceIn(0f, 1f)
                4 -> s.quietFraction.coerceIn(0f, 1f)
                5 -> s.snoreLikelihood.coerceIn(0f, 1f)
                6 -> (s.movementVariance / 8f).coerceIn(0f, 1f)
                else -> calmness(s)
            }
        }
        return out
    }

    fun encode(samples: List<SleepTrackSample>, index: Int): FloatArray {
        val out = FloatArray(INPUT_SIZE)
        var offset = 0
        val start = (index - CONTEXT_BUCKETS).coerceAtLeast(0)
        for (i in start..index) {
            if (offset >= INPUT_SIZE) break
            val s = samples[i]
            out[offset++] = (s.movement / 2f).coerceIn(0f, 1f)
            out[offset++] = (s.audioLevel / 3f).coerceIn(0f, 1f)
            out[offset++] = s.breathRegularity.coerceIn(0f, 1f)
            out[offset++] = (s.breathRateBpm / 24f).coerceIn(0f, 1f)
            out[offset++] = s.quietFraction.coerceIn(0f, 1f)
            out[offset++] = s.snoreLikelihood.coerceIn(0f, 1f)
            out[offset++] = (s.movementVariance / 8f).coerceIn(0f, 1f)
            out[offset++] = calmness(s)
        }
        return out
    }

    fun calmness(s: SleepTrackSample): Float {
        val breath = s.breathRateBpm
        val breathComponent = when {
            breath in 10f..22f -> s.breathRegularity.coerceIn(0f, 1f) * 0.35f
            breath > 0f -> 0.1f
            else -> 0.15f
        }
        return (breathComponent +
            s.quietFraction.coerceIn(0f, 1f) * 0.35f +
            (1f - (s.movement / 2f).coerceIn(0f, 1f)) * 0.3f).coerceIn(0f, 1f)
    }
}
