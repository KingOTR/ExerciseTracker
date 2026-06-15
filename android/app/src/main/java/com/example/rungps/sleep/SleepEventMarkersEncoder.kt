package com.example.rungps.sleep

import kotlin.math.roundToInt

object SleepEventMarkersEncoder {
    fun encodeFromSamples(
        samples: List<SleepTrackSample>,
        hypnogramMinutes: Int,
        snoreThreshold: Float = 0.35f,
    ): String {
        if (samples.isEmpty() || hypnogramMinutes <= 0) return ""
        val minutes = hypnogramMinutes.coerceAtMost(900)
        val bucketsPerMinute = (samples.size.toFloat() / hypnogramMinutes.coerceAtLeast(1))
            .roundToInt().coerceIn(1, 12)
        return buildString {
            for (i in 0 until minutes) {
                val slice = samples.drop(i * bucketsPerMinute).take(bucketsPerMinute)
                append(charForSlice(slice, snoreThreshold))
            }
        }
    }

    fun decode(compact: String?): List<SleepMinuteEvent> {
        if (compact.isNullOrBlank()) return emptyList()
        return compact.mapIndexed { index, c ->
            SleepMinuteEvent(
                minuteIndex = index,
                snore = c == 's',
                talk = c == 't',
                movement = c == 'm',
                breathPause = c == 'p',
                cough = c == 'c',
                environment = c == 'e',
            )
        }
    }

    fun synthesize(stages: List<SleepStageLabel>, snoreEvents: Int = 0): String {
        if (stages.isEmpty()) return ""
        val awakeSlots = stages.mapIndexedNotNull { i, s -> if (s == SleepStageLabel.AWAKE) i else null }
            .ifEmpty { stages.indices.toList() }
        val snoreSlots = distributeEvents(snoreEvents, awakeSlots).toSet()
        return buildString {
            stages.forEachIndexed { i, stage ->
                append(
                    when {
                        snoreSlots.contains(i) -> 's'
                        stage == SleepStageLabel.AWAKE -> 't'
                        else -> '.'
                    },
                )
            }
        }
    }

    fun resolve(
        eventMarkersCompact: String?,
        hypnogramCompact: String?,
        snoreEvents: Int?,
    ): List<SleepMinuteEvent> {
        val stages = SleepHypnogramEncoder.decode(hypnogramCompact)
        if (stages.isEmpty()) return emptyList()
        val decoded = decode(eventMarkersCompact)
        if (decoded.isNotEmpty()) return padToHypnogram(decoded, stages.size)
        val count = snoreEvents ?: 0
        if (count > 0) return padToHypnogram(decode(synthesizeSnoreOnly(stages, count)), stages.size)
        return List(stages.size) { SleepMinuteEvent(it) }
    }

    private fun synthesizeSnoreOnly(stages: List<SleepStageLabel>, snoreEvents: Int): String {
        if (stages.isEmpty() || snoreEvents <= 0) return ".".repeat(stages.size)
        val slots = stages.mapIndexedNotNull { i, s -> if (s == SleepStageLabel.AWAKE) i else null }
            .ifEmpty { stages.indices.toList() }
        val snoreSlots = distributeEvents(snoreEvents, slots).toSet()
        return buildString { stages.indices.forEach { append(if (snoreSlots.contains(it)) 's' else '.') } }
    }

    private fun padToHypnogram(events: List<SleepMinuteEvent>, hypnogramMinutes: Int): List<SleepMinuteEvent> {
        if (hypnogramMinutes <= 0) return events
        val trimmed = events.take(hypnogramMinutes).mapIndexed { i, e -> e.copy(minuteIndex = i) }
        if (trimmed.size >= hypnogramMinutes) return trimmed
        return trimmed + List(hypnogramMinutes - trimmed.size) { SleepMinuteEvent(trimmed.size + it) }
    }

    private fun charForSlice(slice: List<SleepTrackSample>, snoreThreshold: Float): Char {
        if (slice.isEmpty()) return '.'
        val snoreCount = slice.count { it.snoreLikelihood >= snoreThreshold || it.eventTag == "snore" }
        if (snoreCount >= (slice.size + 1) / 2) return 's'
        if (slice.any { it.eventTag == "talk" || isTalkBucket(it) }) return 't'
        if (slice.any { it.eventTag == "cough" }) return 'c'
        if (slice.any { it.breathPause == true || SleepBreathingDisruptionAnalyzer.isPauseBucket(it) }) return 'p'
        if (slice.any { it.movement >= 1.2f }) return 'm'
        val env = slice.mapNotNull { it.noiseTag ?: it.eventTag }.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
        return when (env) {
            "fan", "traffic", "pet", "noise" -> 'e'
            else -> '.'
        }
    }

    private fun isTalkBucket(s: SleepTrackSample): Boolean =
        s.breathRateBpm > 0f && (s.audioLevel >= 1.85f || (s.audioLevel >= 1.55f && s.quietFraction <= 0.14f))

    private fun distributeEvents(count: Int, slots: List<Int>): Set<Int> {
        if (count <= 0 || slots.isEmpty()) return emptySet()
        val step = (slots.size.toFloat() / count).coerceAtLeast(1f)
        return (0 until count).map { i ->
            slots[(i * step).toInt().coerceIn(0, slots.lastIndex)]
        }.toSet()
    }
}
