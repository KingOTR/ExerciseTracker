package com.example.rungps.sleep

import android.content.Context

object SleepYamNetClassifier {
    private const val IDX_SNORING = 38
    private const val IDX_SPEECH = 0
    private const val IDX_COUGH = 42
    private const val IDX_SILENCE = 494

    private val runner = SleepTfliteRunner(SleepTfliteRunner.ASSET_YAMNET)

    fun ensureLoaded(context: Context): Boolean = runner.ensureLoaded(context)

    fun classifyEvent(
        context: Context,
        pcm16le: ByteArray,
        sampleRate: Int,
        heuristicSample: SleepTrackSample? = null,
    ): String? {
        if (pcm16le.isEmpty()) return heuristicTag(heuristicSample)
        if (!runner.ensureLoaded(context)) return heuristicTag(heuristicSample)
        val scores = runner.run(SleepMelFeatureExtractor.fromPcm16(pcm16le, sampleRate))
            ?: return heuristicTag(heuristicSample)
        return mapYamNetScores(scores)
    }

    fun snoreScore(
        context: Context,
        pcm16le: ByteArray,
        sampleRate: Int,
        sample: SleepTrackSample?,
    ): Float {
        if (pcm16le.isEmpty()) return sample?.snoreLikelihood ?: 0f
        if (!runner.ensureLoaded(context)) return sample?.snoreLikelihood ?: 0f
        val scores = runner.run(SleepMelFeatureExtractor.fromPcm16(pcm16le, sampleRate))
        if (scores != null) {
            return (if (IDX_SNORING < scores.size) scores[IDX_SNORING] else 0f).coerceIn(0f, 1f)
        }
        return sample?.snoreLikelihood ?: 0f
    }

    fun environmentalNoiseTag(
        context: Context,
        pcm16le: ByteArray,
        sampleRate: Int,
        sample: SleepTrackSample?,
    ): String? {
        if (sample == null) return null
        if (SleepAudioQualityClassifier.fanLikelihood(listOf(sample.audioLevel * 50f), 50f) >= 0.65f) {
            return "fan"
        }
        if (pcm16le.isNotEmpty() && runner.ensureLoaded(context)) {
            val scores = runner.run(SleepMelFeatureExtractor.fromPcm16(pcm16le, sampleRate))
            if (scores != null) return mapEnvironmentalScores(scores) ?: heuristicEnvTag(sample)
        }
        return heuristicEnvTag(sample)
    }

    private fun mapYamNetScores(scores: FloatArray): String? {
        val candidates = listOf(
            "snore" to (if (IDX_SNORING < scores.size) scores[IDX_SNORING] else 0f),
            "talk" to (if (IDX_SPEECH < scores.size) scores[IDX_SPEECH] else 0f),
            "cough" to (if (IDX_COUGH < scores.size) scores[IDX_COUGH] else 0f),
            "silence" to (if (IDX_SILENCE < scores.size) scores[IDX_SILENCE] else 0f),
        )
        val best = candidates.maxByOrNull { it.second } ?: return null
        if (best.second < 0.15f) return null
        if (best.first == "silence" && best.second < 0.4f) return null
        return if (best.first == "silence") null else best.first
    }

    private fun mapEnvironmentalScores(scores: FloatArray): String? {
        val candidates = listOf(
            "fan" to (if (288 < scores.size) scores[288] else 0f),
            "traffic" to (if (309 < scores.size) scores[309] else 0f),
            "pet" to (if (74 < scores.size) scores[74] else 0f),
        )
        val best = candidates.maxByOrNull { it.second } ?: return null
        return if (best.second >= 0.2f) best.first else null
    }

    private fun heuristicEnvTag(sample: SleepTrackSample): String? {
        if (SleepAudioQualityClassifier.fanLikelihood(listOf(sample.audioLevel * 50f), 50f) >= 0.65f) {
            return "fan"
        }
        if (sample.audioLevel >= 2.2f && sample.snoreLikelihood < 0.2f && sample.breathRegularity < 0.2f) {
            return "traffic"
        }
        val audio = sample.audioLevel
        if (audio in 1.4f..2.0f && sample.movement < 0.5f && sample.quietFraction < 0.4f) return "pet"
        return null
    }

    private fun heuristicTag(sample: SleepTrackSample?): String? {
        if (sample == null) return null
        if (sample.snoreLikelihood >= 0.35f) return "snore"
        if (sample.audioLevel >= 2.4f && sample.breathRegularity < 0.25f && sample.snoreLikelihood < 0.25f) {
            return "cough"
        }
        if (sample.audioLevel >= 1.85f && sample.breathRateBpm > 0f) return "talk"
        if (sample.audioLevel >= 2.2f && sample.snoreLikelihood < 0.2f) return "noise"
        if (sample.quietFraction >= 0.75f) return "silence"
        return null
    }
}
