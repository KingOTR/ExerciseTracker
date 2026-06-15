package com.example.rungps.sleep

import org.json.JSONObject

object SleepAudioQualityClassifier {
    data class BucketQuality(
        val passesGate: Boolean,
        val snrDb: Float,
        val clipped: Boolean,
        val noiseTag: String?,
    )

    data class NightSummary(
        val passRatio: Float,
        val reliable: Boolean,
        val dominantNoise: String?,
    )

    private const val GATE_SNR_DB = 8f
    private const val RELIABLE_RATIO = 0.7f
    private const val CLIP_THRESHOLD = 30000

    fun assessBucket(
        pcm16le: ByteArray,
        rms: Float,
        baselineRms: Float,
        eventTag: String?,
        noiseTag: String?,
    ): BucketQuality {
        val clipped = detectClipping(pcm16le)
        val snr = estimateSnrDb(rms, baselineRms)
        val env = noiseTag ?: environmentalTagFromEvent(eventTag)
        val passes = !clipped && snr >= GATE_SNR_DB && env != "fan"
        return BucketQuality(passes, snr, clipped, env)
    }

    fun summarize(samples: List<SleepTrackSample>): NightSummary {
        if (samples.isEmpty()) return NightSummary(0f, false, null)
        val passCount = samples.count { it.audioQualityOk == true }
        val passRatio = passCount.toFloat() / samples.size
        val noiseTags = samples.mapNotNull { it.noiseTag }
        val dominant = noiseTags.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
        return NightSummary(passRatio, passRatio >= RELIABLE_RATIO, dominant)
    }

    fun detectClipping(pcm16le: ByteArray): Boolean {
        if (pcm16le.size < 4) return false
        var clipped = 0
        var total = 0
        var i = 0
        while (i + 1 < pcm16le.size) {
            var sample = (pcm16le[i + 1].toInt() shl 8) or (pcm16le[i].toInt() and 0xFF)
            if (sample > 32767) sample -= 65536
            if (kotlin.math.abs(sample) >= CLIP_THRESHOLD) clipped++
            total++
            i += 2
        }
        return total > 0 && clipped.toFloat() / total > 0.02f
    }

    fun estimateSnrDb(rms: Float, baselineRms: Float): Float {
        val ratio = rms.coerceAtLeast(1f) / baselineRms.coerceAtLeast(1f)
        return (kotlin.math.log10(ratio) * 20f).coerceIn(-10f, 40f)
    }

    fun environmentalTagFromEvent(eventTag: String?): String? = when (eventTag) {
        "traffic", "fan", "pet", "noise" -> eventTag
        else -> null
    }

    fun fanLikelihood(rmsSeries: List<Float>, baselineRms: Float): Float {
        if (rmsSeries.size < 6) return 0f
        val base = baselineRms.coerceAtLeast(50f)
        val mean = rmsSeries.average().toFloat()
        if (mean < base * 0.9f || mean > base * 2.5f) return 0f
        val variance = rmsSeries.map { (it - mean) * (it - mean) }.average().toFloat()
        val cv = kotlin.math.sqrt(variance) / mean.coerceAtLeast(1f)
        return when {
            cv < 0.08f && mean >= base * 1.1f -> 0.75f
            cv < 0.15f && mean >= base -> 0.55f
            else -> 0.1f
        }
    }
}
