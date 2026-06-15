package com.example.rungps.sleep

data class SleepMinuteEvent(
    val minuteIndex: Int,
    val snore: Boolean = false,
    val talk: Boolean = false,
    val movement: Boolean = false,
    val breathPause: Boolean = false,
    val cough: Boolean = false,
    val environment: Boolean = false,
) {
    val hasMarker: Boolean =
        snore || talk || movement || breathPause || cough || environment
}
