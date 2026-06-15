package com.example.rungps.intervals

import com.example.rungps.tracking.TrackingService
import kotlinx.serialization.json.Json

object WorkoutPlanResolver {
    private val json = Json { ignoreUnknownKeys = true }

    fun resolve(planType: String?, planJson: String?, timeSession: String?): WorkoutPlan? = when (planType) {
        TrackingService.PLAN_CUSTOM -> parseCustomPlan(planJson)
        TrackingService.PLAN_TIME_INTERVALS -> timeIntervalPlan(timeSession)
        TrackingService.PLAN_DISTANCE_INTERVALS -> distanceIntervalPlan()
        else -> null
    }

    private fun parseCustomPlan(planJson: String?): WorkoutPlan? {
        if (planJson.isNullOrBlank()) return null
        return runCatching {
            json.decodeFromString(CustomPlan.serializer(), planJson).toWorkoutPlan()
        }.getOrNull()
    }

    private fun warmUp() = WorkoutSegment("Warm up", SegmentTarget.TimeMs(300_000L))

    private fun coolDown() = WorkoutSegment("Cool down", SegmentTarget.TimeMs(300_000L))

    private fun easyMinutes(minutes: Int, label: String = "Easy") =
        WorkoutSegment(label, SegmentTarget.TimeMs(minutes * 60_000L))

    private fun tempoMinutes(minutes: Int, label: String) =
        WorkoutSegment(label, SegmentTarget.TimeMs(minutes * 60_000L))

    private fun hardDistance(meters: Double = 400.0) =
        WorkoutSegment("Hard", SegmentTarget.DistanceM(meters))

    private fun easyDistance(meters: Double = 200.0) =
        WorkoutSegment("Easy", SegmentTarget.DistanceM(meters))

    /** Presets recovered from reference TrackingService.start lambdas + MainActivity defaults. */
    private fun timeIntervalPlan(timeSession: String?): WorkoutPlan {
        val (hardMin, easyMin, repeats) = when (timeSession) {
            TrackingService.TIME_SESSION_2 -> Triple(3, 2, 5)
            TrackingService.TIME_SESSION_3 -> Triple(5, 2, 4)
            else -> Triple(2, 1, 6)
        }
        val segments = buildList {
            add(warmUp())
            repeat(repeats) { i ->
                add(tempoMinutes(hardMin, if (repeats > 1) "Hard ${i + 1}" else "Hard"))
                if (i < repeats - 1 || easyMin > 0) {
                    add(easyMinutes(easyMin))
                }
            }
            add(coolDown())
        }
        return WorkoutPlan(segments)
    }

    private fun distanceIntervalPlan(): WorkoutPlan {
        val segments = buildList {
            add(warmUp())
            repeat(4) { i ->
                add(hardDistance())
                add(easyDistance())
            }
            add(coolDown())
        }
        return WorkoutPlan(segments)
    }
}
