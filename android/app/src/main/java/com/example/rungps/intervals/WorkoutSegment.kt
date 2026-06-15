package com.example.rungps.intervals

data class WorkoutSegment(
    val label: String,
    val target: SegmentTarget,
    val cues: List<Cue> = emptyList(),
)
