package com.example.rungps.sleep

import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object SleepMelFeatureExtractor {
    const val MEL_BINS = 32
    private const val FRAME_SIZE = 512
    private const val HOP = 256
    private const val PCM_SCALE = 32768.0

    private val melWeights: Array<IntArray> = buildMelWeights()

    fun fromPcm16(pcm: ByteArray, sampleRate: Int = SleepAudioConstants.SAMPLE_RATE_V2): FloatArray =
        if (pcm.size < 1024) FloatArray(MEL_BINS) else fromSamples(pcmToShorts(pcm), sampleRate)

    fun fromSamples(samples: ShortArray, sampleRate: Int = SleepAudioConstants.SAMPLE_RATE_V2): FloatArray {
        if (samples.size < FRAME_SIZE) return FloatArray(MEL_BINS)
        val sums = DoubleArray(MEL_BINS)
        var frames = 0
        var offset = 0
        while (offset + FRAME_SIZE <= samples.size) {
            val frame = frameMel(samples, offset, sampleRate)
            for (i in 0 until MEL_BINS) sums[i] += frame[i]
            frames++
            offset += HOP
        }
        if (frames == 0) return FloatArray(MEL_BINS)
        return FloatArray(MEL_BINS) { i ->
            (kotlin.math.ln(kotlin.math.max(sums[i] / frames, 1e-10)) + 10.0).toFloat().coerceIn(0f, 10f) / 10f
        }
    }

    fun combineEpoch(partials: List<FloatArray>): FloatArray {
        if (partials.isEmpty()) return FloatArray(MEL_BINS)
        val out = FloatArray(MEL_BINS)
        for (partial in partials) {
            for (i in 0 until MEL_BINS) {
                out[i] += if (i < partial.size) partial[i] else 0f
            }
        }
        val n = kotlin.math.max(partials.size, 1).toFloat()
        for (i in 0 until MEL_BINS) out[i] /= n
        return out
    }

    private fun frameMel(samples: ShortArray, start: Int, sampleRate: Int): DoubleArray {
        val out = DoubleArray(MEL_BINS)
        for (bin in 0 until MEL_BINS) {
            val freqs = melWeights[bin]
            var energy = 0.0
            for (freq in freqs) {
                val omega = (freq * 2.0 * Math.PI) / sampleRate
                var real = 0.0
                var imag = 0.0
                for (i in 0 until FRAME_SIZE) {
                    val sample = samples[start + i] / PCM_SCALE
                    val phase = i * omega
                    real += cos(phase) * sample
                    imag += sin(phase) * sample
                }
                energy += real * real + imag * imag
            }
            out[bin] = energy / kotlin.math.max(freqs.size, 1)
        }
        return out
    }

    private fun buildMelWeights(): Array<IntArray> {
        return Array(MEL_BINS) { i ->
            val low = i / MEL_BINS.toDouble()
            val high = (i + 1) / MEL_BINS.toDouble()
            val start = (2 + 198 * low * low).toInt()
            val end = kotlin.math.max((2 + 198 * high * high).toInt(), start + 1)
            IntArray(end - start) { j -> start + j }
        }
    }

    private fun pcmToShorts(pcm: ByteArray): ShortArray {
        val count = pcm.size / 2
        return ShortArray(count) { i ->
            val lo = pcm[i * 2].toInt() and 0xFF
            val hi = pcm[i * 2 + 1].toInt() and 0xFF
            ((hi shl 8) or lo).toShort()
        }
    }
}
