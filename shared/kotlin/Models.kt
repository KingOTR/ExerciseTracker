package com.exercisetracker.shared

/**
 * Kotlin data models mirroring export.json / JSON schemas.
 * Copy or publish as a shared module when wiring Android ↔ Firestore sync.
 */

data class GymSet(
    val exerciseName: String,
    val setIndex: Int,
    val reps: Int? = null,
    val weightKg: Double? = null,
    val loggedAtMs: Long? = null,
)

data class GymSession(
    val id: Long,
    val startedAtMs: Long,
    val endedAtMs: Long? = null,
    val freeDay: Boolean = false,
    val sets: List<GymSet> = emptyList(),
)

data class KmSplit(
    val kind: String,
    val idx: Int,
    val durationMs: Long,
    val distanceM: Double,
)

data class Run(
    val id: Long,
    val startedAtMs: Long,
    val endedAtMs: Long? = null,
    val distanceM: Double,
    val durationMs: Long,
    val activityType: String,
    val hrSamples: List<Any> = emptyList(),
    val kmSplits: List<KmSplit> = emptyList(),
)

data class SoccerSession(
    val id: Long,
    val kind: String,
    val startTimeMs: Long,
    val playMin: Int,
    val intensity: Int,
    val notes: String? = null,
    val watchSessionId: Long? = null,
)

data class SleepRecord(
    val startTimeMs: Long,
    val endTimeMs: Long,
    val totalSleepMin: Int,
    val sleepEfficiency: Int? = null,
    val sleepQuality: Int? = null,
    val source: String? = null,
)

data class ExerciseTrackerExport(
    val exportedAtMs: Long,
    val version: Int,
    val gymSessions: List<GymSession>,
    val runs: List<Run>,
    val soccerSessions: List<SoccerSession>,
    val sleep: List<SleepRecord>,
)
