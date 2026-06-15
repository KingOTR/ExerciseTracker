package com.example.rungps.data.repo

import com.example.rungps.data.dao.ExerciseTrackerDao
import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.RunHrSampleEntity

class RunRepository(private val dao: ExerciseTrackerDao) {
    suspend fun startRun(startedAtMs: Long, activityType: String): Long =
        dao.insertRun(
            RunEntity(
                startedAtMs = startedAtMs,
                activityType = activityType,
            ),
        )

    suspend fun insertPoint(point: PointEntity): Long = dao.insertPoint(point)

    suspend fun insertRunSplit(
        runId: Long,
        kind: String,
        idx: Int,
        elapsedEndMs: Long,
        durationMs: Long,
        distanceM: Double,
    ): Long = dao.insertKmSplit(
        KmSplitEntity(
            runId = runId,
            kind = kind,
            idx = idx,
            elapsedEndMs = elapsedEndMs,
            durationMs = durationMs,
            distanceM = distanceM,
        ),
    )

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
        if (!keepEvenIfJunk && totalDistanceM < 50.0 && totalDurationMs < 30_000L) {
            dao.deleteRun(runId)
            return
        }
        dao.finishRun(
            runId = runId,
            endedAtMs = endedAtMs,
            totalDistanceM = totalDistanceM,
            totalDurationMs = totalDurationMs,
            totalSteps = totalSteps,
            planType = planType,
            timeSession = timeSession,
        )
    }

    suspend fun runById(runId: Long): RunEntity? = dao.runById(runId)

    suspend fun runExists(runId: Long): Boolean = dao.runExists(runId) > 0

    suspend fun insertRunHrSample(runId: Long, timeMs: Long, bpm: Int): Long =
        dao.insertRunHrSample(RunHrSampleEntity(runId = runId, timeMs = timeMs, bpm = bpm))

    suspend fun sumDistanceM(runId: Long): Double = dao.sumDistanceM(runId) ?: 0.0
}
