package com.example.rungps.sleep

data class SleepTrackSample(
    val elapsedMs: Long,
    val movement: Float,
    val audioLevel: Float,
    val breathRateBpm: Float = 0f,
    val breathRegularity: Float = 0f,
    val quietFraction: Float = 0f,
    val snoreLikelihood: Float = 0f,
    val movementVariance: Float = 0f,
    val melCompact: FloatArray? = null,
    val asleepProb: Float? = null,
    val stageConfidence: Float? = null,
    val lightSleepProb: Float? = null,
    val eventTag: String? = null,
    val snoreIntensity: Int? = null,
    val audioQualityOk: Boolean? = null,
    val noiseTag: String? = null,
    val breathPause: Boolean? = null,
    val sonarMotion: Float? = null,
)
