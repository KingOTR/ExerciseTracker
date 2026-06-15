package com.example.rungps.intervals

data class WorkoutPlan(val segments: List<WorkoutSegment>) {
    init {
        require(segments.isNotEmpty()) { "WorkoutPlan must have at least one segment." }
    }
}
