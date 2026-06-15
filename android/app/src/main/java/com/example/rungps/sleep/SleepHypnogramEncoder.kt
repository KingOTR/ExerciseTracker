package com.example.rungps.sleep

object SleepHypnogramEncoder {
    private const val CHARS = "0123"

    fun encode(labels: List<SleepStageLabel>, bucketsPerMinute: Int = 6): String {
        if (labels.isEmpty()) return ""
        val step = bucketsPerMinute.coerceIn(1, 12)
        val sb = StringBuilder()
        var i = 0
        while (i < labels.size) {
            sb.append(CHARS[labels[i].ordinal.coerceIn(0, 3)])
            i += step
        }
        return sb.toString().take(900)
    }

    fun encodeForInBed(labels: List<SleepStageLabel>, inBedMin: Int): String {
        val step = if (labels.size > inBedMin.coerceAtLeast(1) * 2) 6 else 1
        return encode(labels, step)
    }

    fun decode(compact: String?): List<SleepStageLabel> {
        if (compact.isNullOrBlank()) return emptyList()
        return compact.map { c ->
            when (c) {
                '0' -> SleepStageLabel.AWAKE
                '2' -> SleepStageLabel.DEEP
                '3' -> SleepStageLabel.REM
                else -> SleepStageLabel.LIGHT
            }
        }
    }
}

/** Alias for hypnogram UI references. */
typealias SleepHypnogram = SleepHypnogramEncoder
