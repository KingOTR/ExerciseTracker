package com.example.rungps.intervals

data class WorkoutProgress(
    val segmentIndex: Int,
    val segmentElapsedMs: Long,
    val segmentRemainingMs: Long?,
    val segmentDistanceM: Double,
    val segmentRemainingM: Double?,
    val finished: Boolean,
)
