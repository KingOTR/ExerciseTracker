package com.example.rungps.sleep

import android.content.Context
import org.json.JSONObject
import kotlin.math.exp
import kotlin.math.max

object SleepMlClassifier {
    private var loaded = false
    private var usesContextModel = false
    private var w1 = FloatArray(0)
    private var b1 = FloatArray(0)
    private var w2 = FloatArray(0)
    private var b2 = FloatArray(0)
    private var inputSize = 8
    private var hiddenSize = 12

    fun featuresFor(samples: List<SleepTrackSample>, index: Int): FloatArray =
        if (usesContextModel) SleepFeatureEncoder.encode(samples, index)
        else SleepFeatureEncoder.encodeCurrent(samples[index])

    fun isLoaded(): Boolean = loaded

    fun ensureLoaded(context: Context) {
        if (loaded) return
        runCatching {
            context.assets.open("sleep_ml_weights.json").bufferedReader().use { reader ->
                val json = JSONObject(reader.readText())
                inputSize = json.getInt("inputSize")
                hiddenSize = json.getInt("hiddenSize")
                w1 = json.getJSONArray("w1").toFloatArray()
                b1 = json.getJSONArray("b1").toFloatArray()
                w2 = json.getJSONArray("w2").toFloatArray()
                b2 = json.getJSONArray("b2").toFloatArray()
            }
            if (w2.any { it.isNaN() } || b2.any { it.isNaN() }) {
                loadFallbackWeights()
            } else {
                usesContextModel = inputSize > 8
            }
            loaded = true
        }.onFailure {
            loadFallbackWeights()
            loaded = true
        }
    }

    fun stageProbabilities(features: FloatArray): FloatArray {
        if (!loaded) return floatArrayOf(0.25f, 0.25f, 0.25f, 0.25f)
        val hidden = FloatArray(hiddenSize)
        val min = minOf(features.size, inputSize)
        for (h in 0 until hiddenSize) {
            var sum = b1.getOrElse(h) { 0f }
            for (i in 0 until min) {
                val idx = inputSize * h + i
                sum += features[i] * w1.getOrElse(idx) { 0f }
            }
            hidden[h] = relu(sum)
        }
        val logits = FloatArray(4)
        for (o in 0 until 4) {
            var sum = b2.getOrElse(o) { 0f }
            for (h in 0 until hiddenSize) {
                sum += hidden[h] * w2.getOrElse(h * 4 + o) { 0f }
            }
            logits[o] = sum
        }
        return softmax(logits)
    }

    fun predictStage(features: FloatArray): SleepStageLabel {
        val probs = stageProbabilities(features)
        return SleepStageLabel.fromIndex(probs.indices.maxByOrNull { probs[it] } ?: 1)
    }

    fun asleepProbability(features: FloatArray): Float =
        stageProbabilities(features).let { (it[1] + it[2] + it[3]).coerceIn(0f, 1f) }

    fun confidence(features: FloatArray): Float =
        stageProbabilities(features).maxOrNull() ?: 0f

    fun blendedStage(
        sample: SleepTrackSample,
        features: FloatArray,
        rule: SleepStageLabel,
        context: Context? = null,
    ): SleepStageLabel {
        if (confidence(features) < 0.52f) return rule
        val probs = stageProbabilities(features)
        val adjusted = floatArrayOf(probs[0], probs[1], probs[2], probs[3])
        return SleepStageLabel.fromIndex(adjusted.indices.maxByOrNull { adjusted[it] } ?: 1)
    }

    private fun relu(v: Float): Float = if (v > 0f) v else 0f

    private fun softmax(logits: FloatArray): FloatArray {
        val max = logits.maxOrNull() ?: 0f
        val exps = FloatArray(logits.size) { exp(logits[it] - max) }
        val sum = max(exps.sum(), 1e-6f)
        return FloatArray(logits.size) { exps[it] / sum }
    }

    private fun org.json.JSONArray.toFloatArray(): FloatArray =
        FloatArray(length()) { i ->
            val v = getDouble(i)
            if (v.isNaN()) Float.NaN else v.toFloat()
        }

    private fun loadFallbackWeights() {
        inputSize = 8
        hiddenSize = 8
        usesContextModel = false
        w1 = floatArrayOf(
            0.42f, 0.38f, -0.35f, -0.28f, -0.22f, 0.18f, 0.12f, 0.45f,
            -0.38f, -0.32f, 0.41f, 0.36f, 0.28f, -0.15f, -0.12f, 0.22f,
            0.35f, 0.28f, 0.32f, -0.42f, 0.38f, -0.25f, -0.18f, -0.35f,
            -0.45f, -0.28f, 0.22f, 0.18f, -0.32f, 0.42f, 0.15f, 0.38f,
            0.28f, -0.22f, 0.25f, 0.32f, -0.28f, -0.35f, 0.4f, 0.2f,
            -0.32f, 0.35f, -0.28f, 0.42f, 0.15f, 0.22f, -0.38f, 0.3f,
            0.4f, 0.32f, -0.3f, -0.25f, -0.2f, 0.35f, 0.18f, 0.42f,
            -0.28f, -0.35f, 0.38f, 0.32f, 0.25f, -0.22f, 0.15f, -0.4f,
        )
        b1 = floatArrayOf(-0.12f, -0.08f, -0.15f, -0.1f, -0.14f, -0.11f, -0.09f, -0.13f)
        w2 = floatArrayOf(
            0.55f, -0.15f, -0.35f, -0.42f, -0.42f, 0.48f, -0.22f, -0.28f,
            -0.38f, -0.28f, 0.52f, -0.32f, -0.32f, -0.25f, -0.28f, 0.45f,
            0.35f, -0.22f, -0.3f, -0.35f, -0.4f, 0.32f, -0.25f, -0.28f,
            -0.35f, -0.3f, -0.32f, 0.42f, -0.28f, -0.25f, -0.22f, 0.38f,
        )
        b2 = floatArrayOf(0.85f, 0.05f, -0.45f, -0.35f)
    }
}
