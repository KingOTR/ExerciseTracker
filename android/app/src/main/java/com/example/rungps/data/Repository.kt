package com.example.rungps.data

import android.content.Context
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.repo.RunRepository

class Repository private constructor(context: Context) {
    private val runRepo = RunRepository(ExerciseTrackerDatabase.get(context).exerciseTrackerDao())

    suspend fun startRun(startedAtMs: Long, activityType: String): Long =
        runRepo.startRun(startedAtMs, activityType)

    suspend fun insertPoint(point: PointEntity): Long = runRepo.insertPoint(point)

    suspend fun insertRunSplit(
        runId: Long,
        kind: String,
        idx: Int,
        elapsedEndMs: Long,
        durationMs: Long,
        distanceM: Double,
    ): Long = runRepo.insertRunSplit(runId, kind, idx, elapsedEndMs, durationMs, distanceM)

    suspend fun finishRun(
        runId: Long,
        endedAtMs: Long,
        totalDistanceM: Double,
        totalDurationMs: Long,
        totalSteps: Long,
        planType: String?,
        timeSession: String?,
        keepEvenIfJunk: Boolean = false,
    ) {
        runRepo.finishRun(
            runId,
            endedAtMs,
            totalDistanceM,
            totalDurationMs,
            totalSteps,
            planType,
            timeSession,
            keepEvenIfJunk,
        )
    }

    suspend fun runById(runId: Long): RunEntity? = runRepo.runById(runId)

    suspend fun runExists(runId: Long): Boolean = runRepo.runExists(runId)

    suspend fun insertRunHrSample(runId: Long, timeMs: Long, bpm: Int): Long =
        runRepo.insertRunHrSample(runId, timeMs, bpm)

    companion object {
        @Volatile
        private var instance: Repository? = null

        fun get(context: Context): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(context.applicationContext).also { instance = it }
            }
    }
}
