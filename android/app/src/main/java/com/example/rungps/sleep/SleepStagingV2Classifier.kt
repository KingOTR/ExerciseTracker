package com.example.rungps.sleep

import android.content.Context

object SleepStagingV2Classifier {
    private val runner = SleepTfliteRunner(SleepTfliteRunner.ASSET_STAGING_V2)

    data class EpochPrediction(
        val stageProbs: FloatArray,
        val confidence: Float,
        val lightSleepProb: Float,
        val asleepProb: Float,
        val usedTflite: Boolean,
    )

    fun ensureLoaded(context: Context): Boolean {
        SleepMlClassifier.ensureLoaded(context)
        return runner.ensureLoaded(context)
    }

    fun predictEpoch(
        context: Context,
        melEpoch: FloatArray,
        movement: Float,
        samples: List<SleepTrackSample>,
        centerIndex: Int,
    ): EpochPrediction {
        if (runner.ensureLoaded(context)) {
            val input = FloatArray(melEpoch.size + 1)
            for (i in melEpoch.indices) input[i] = melEpoch[i]
            input[melEpoch.size] = (movement / 2f).coerceIn(0f, 1f)
            runner.run(input)?.let { return parseTfliteOutput(it) }
        }
        return legacyPrediction(context, samples, centerIndex)
    }

    fun predictBucket(context: Context, samples: List<SleepTrackSample>, index: Int): EpochPrediction {
        val sample = samples.getOrNull(index) ?: return legacyPrediction(context, samples, index)
        val mel = sample.melCompact
        if (mel != null && mel.isNotEmpty()) {
            val pred = predictEpoch(context, mel, sample.movement, samples, index)
            if (pred.usedTflite || sample.asleepProb != null) return pred
        }
        return legacyPrediction(context, samples, index)
    }

    private fun parseTfliteOutput(out: FloatArray): EpochPrediction {
        val probs = when (out.size) {
            2 -> floatArrayOf(out[0], out[1], 0f, 0f)
            3 -> floatArrayOf(out[0], out[1], 0f, out[2])
            else -> FloatArray(4) { i -> if (i < out.size) out[i] else 0f }
        }
        val sum = probs.sum().coerceAtLeast(1e-6f)
        for (i in probs.indices) probs[i] /= sum
        return EpochPrediction(
            stageProbs = probs,
            confidence = probs.maxOrNull() ?: 0.25f,
            lightSleepProb = probs[1],
            asleepProb = (probs[1] + probs[2] + probs[3]).coerceIn(0f, 1f),
            usedTflite = true,
        )
    }

    private fun legacyPrediction(
        context: Context,
        samples: List<SleepTrackSample>,
        index: Int,
    ): EpochPrediction {
        SleepMlClassifier.ensureLoaded(context)
        val features = SleepMlClassifier.featuresFor(samples, index)
        val probs = SleepMlClassifier.stageProbabilities(features)
        return EpochPrediction(
            stageProbs = probs,
            confidence = SleepMlClassifier.confidence(features),
            lightSleepProb = probs[1],
            asleepProb = SleepMlClassifier.asleepProbability(features),
            usedTflite = false,
        )
    }
}
