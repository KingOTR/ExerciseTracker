package com.example.rungps.sleep

enum class SleepStageLabel {
    AWAKE,
    LIGHT,
    DEEP,
    REM,
    ;

    companion object {
        fun fromIndex(i: Int): SleepStageLabel =
            entries.getOrElse(i.coerceIn(0, entries.lastIndex)) { LIGHT }
    }
}
