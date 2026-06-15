package com.example.rungps.intervals

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CustomPlan(
    val name: String = "Custom workout",
    val segments: List<CustomSegment>,
)

@Serializable
data class CustomSegment(
    val label: String,
    val target: CustomTarget,
)

@Serializable
sealed interface CustomTarget {
    @Serializable
    @SerialName("timeMs")
    data class TimeMs(val ms: Long) : CustomTarget

    @Serializable
    @SerialName("distanceM")
    data class DistanceM(val meters: Double) : CustomTarget

    @Serializable
    @SerialName("speedHold")
    data class SpeedHold(val ms: Long, val kmh: Double) : CustomTarget
}

fun CustomPlan.toWorkoutPlan(): WorkoutPlan {
    val segments = segments.map { custom ->
        val target: SegmentTarget = when (val t = custom.target) {
            is CustomTarget.TimeMs -> SegmentTarget.TimeMs(t.ms)
            is CustomTarget.DistanceM -> SegmentTarget.DistanceM(t.meters)
            is CustomTarget.SpeedHold -> SegmentTarget.TimeMs(t.ms)
        }
        WorkoutSegment(custom.label, target)
    }
    return WorkoutPlan(segments)
}

fun CustomTarget.targetSpeedKmh(): Double? {
    val hold = this as? CustomTarget.SpeedHold ?: return null
    return hold.kmh.takeIf { it > 0.0 }
}
