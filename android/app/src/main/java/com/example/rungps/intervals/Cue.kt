package com.example.rungps.intervals

sealed interface Cue {
    data class Speak(val text: String) : Cue

    data class Beep(val pattern: Pattern = Pattern.Short) : Cue {
        enum class Pattern {
            Short,
            Long,
            IntervalEndOne,
            IntervalEndTwo,
            IntervalEndThree,
            IntervalStartThree,
            IntervalStartTwo,
            IntervalStartOne,
        }
    }
}
