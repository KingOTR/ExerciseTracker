package com.example.rungps.intervals

sealed interface SegmentTarget {
    data class TimeMs(val ms: Long) : SegmentTarget
    data class DistanceM(val meters: Double) : SegmentTarget
}
