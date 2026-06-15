package com.example.rungps.sleep

import android.content.Context

object SleepAudioFeaturePipeline {
    data class BucketFeatures(
        val window: SleepAudioAnalyzer.WindowFeatures,
        val melPartial: FloatArray,
        val eventTag: String?,
        val asleepProb: Float,
        val stageConfidence: Float,
        val lightSleepProb: Float,
        val snoreIntensity: Int = 0,
        val audioQualityOk: Boolean = true,
        val noiseTag: String? = null,
        val breathPause: Boolean = false,
        val sonarMotion: Float? = null,
        val stagingWeight: Float = 1f,
    )

    data class EpochFeatures(
        val melCompact: FloatArray,
        val asleepProb: Float,
        val stageConfidence: Float,
        val lightSleepProb: Float,
        val eventTag: String?,
    )

    fun analyzeBucket(
        context: Context,
        rmsSeries: List<Float>,
        baselineRms: Float,
        pcm16le: ByteArray,
        sampleRate: Int,
        movement: Float,
        recentSamples: List<SleepTrackSample>,
        bucketIndex: Int,
    ): BucketFeatures {
        SleepMlClassifier.ensureLoaded(context)
        val window = SleepAudioAnalyzer.analyzeWindow(rmsSeries, baselineRms)
        val melPartial = SleepMelFeatureExtractor.fromPcm16(pcm16le, sampleRate)
        val draft = SleepTrackSample(
            elapsedMs = 0L,
            movement = movement,
            audioLevel = window.rms,
            breathRateBpm = window.breathRateBpm,
            breathRegularity = window.breathRegularity,
            quietFraction = window.quietFraction,
            snoreLikelihood = window.snoreLikelihood,
        )
        val yamnetTag = SleepYamNetClassifier.classifyEvent(context, pcm16le, sampleRate, draft)
        val noiseTag = SleepYamNetClassifier.environmentalNoiseTag(context, pcm16le, sampleRate, draft)
        val eventTag = yamnetTag ?: heuristicEventTag(window, movement)
        val quality = SleepAudioQualityClassifier.assessBucket(
            pcm16le, window.rms * baselineRms.coerceAtLeast(50f), baselineRms, eventTag, noiseTag,
        )
        val breathPause = SleepBreathingDisruptionAnalyzer.detectPauseInWindow(rmsSeries, baselineRms) ||
            SleepBreathingDisruptionAnalyzer.isPauseBucket(draft.copy(breathPause = false, eventTag = eventTag))
        val snoreIntensity = SleepSnoreMetrics.intensityFromLikelihood(
            SleepYamNetClassifier.snoreScore(context, pcm16le, sampleRate, draft)
                .coerceAtLeast(window.snoreLikelihood),
        )
        val allSamples = recentSamples + draft
        val idx = allSamples.lastIndex.coerceAtLeast(0)
        val staging = SleepStagingV2Classifier.predictBucket(context, allSamples, idx)
        val ruleStage = ruleStageFromSample(draft, movement)
        val features = SleepMlClassifier.featuresFor(allSamples, idx)
        val mlStage = SleepMlClassifier.blendedStage(draft, features, ruleStage, context)
        val asleepProb = staging.asleepProb.coerceIn(0f, 1f)
        val lightProb = staging.lightSleepProb.coerceIn(0f, 1f)
        val confidence = staging.confidence.coerceIn(0f, 1f)
        val stagingWeight = if (quality.passesGate) 1f else 0.55f
        return BucketFeatures(
            window = window,
            melPartial = melPartial,
            eventTag = eventTag,
            asleepProb = asleepProb,
            stageConfidence = confidence,
            lightSleepProb = lightProb,
            snoreIntensity = snoreIntensity,
            audioQualityOk = quality.passesGate,
            noiseTag = noiseTag ?: quality.noiseTag,
            breathPause = breathPause,
            sonarMotion = null,
            stagingWeight = stagingWeight,
        )
    }

    fun buildEpoch(
        context: Context,
        partialMels: List<FloatArray>,
        samples: List<SleepTrackSample>,
        epochEndIndex: Int,
    ): EpochFeatures {
        val melCompact = SleepMelFeatureExtractor.combineEpoch(partialMels)
        val sample = samples.getOrNull(epochEndIndex)
        val movement = sample?.movement ?: 0.5f
        val pred = SleepStagingV2Classifier.predictEpoch(context, melCompact, movement, samples, epochEndIndex)
        val eventTag = samples.takeLast(3).mapNotNull { it.eventTag }
            .groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
        return EpochFeatures(melCompact, pred.asleepProb, pred.confidence, pred.lightSleepProb, eventTag)
    }

    private fun heuristicEventTag(window: SleepAudioAnalyzer.WindowFeatures, movement: Float): String? = when {
        window.snoreLikelihood >= 0.5f -> "snore"
        window.breathRateBpm > 0f && window.rms >= 1.85f -> "talk"
        window.snoreLikelihood < 0.2f && window.rms >= 2.2f -> "noise"
        movement >= 1.35f -> "movement"
        else -> null
    }

    private fun ruleStageFromSample(s: SleepTrackSample, movement: Float): SleepStageLabel = when {
        movement >= 1.1f || (1f - movement.coerceIn(0f, 1f)) < 0.5f -> SleepStageLabel.AWAKE
        movement < 0.15f && s.quietFraction > 0.6f -> SleepStageLabel.DEEP
        s.lightSleepProb?.let { it > 0.55f } == true -> SleepStageLabel.LIGHT
        else -> SleepStageLabel.REM
    }
}
