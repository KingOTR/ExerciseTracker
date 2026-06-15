package com.example.rungps.data.repository

import com.example.rungps.data.dao.ExerciseTrackerDao
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SleepRecordEntity
import com.example.rungps.data.entity.SoccerSessionEntity
import kotlinx.coroutines.flow.Flow

class ExerciseTrackerRepository(private val dao: ExerciseTrackerDao) {
    fun observeGymSessions(): Flow<List<GymSessionEntity>> = dao.observeGymSessions()
    fun observeGymSets(sessionId: Long): Flow<List<GymSetEntity>> = dao.observeGymSets(sessionId)
    fun observeRuns(): Flow<List<RunEntity>> = dao.observeRuns()
    fun observeSoccerSessions(): Flow<List<SoccerSessionEntity>> = dao.observeSoccerSessions()
    fun observeSleepRecords(): Flow<List<SleepRecordEntity>> = dao.observeSleepRecords()

    suspend fun insertGymSession(session: GymSessionEntity) = dao.insertGymSession(session)
    suspend fun insertGymSets(sets: List<GymSetEntity>) = dao.insertGymSets(sets)
    suspend fun insertRun(run: RunEntity) = dao.insertRun(run)

    suspend fun loadRunDetail(runId: Long): com.example.rungps.feature.run.RunDetail? {
        val run = dao.runById(runId) ?: return null
        val points = dao.pointsForRun(runId)
        val splits = dao.kmSplitsForRun(runId)
        val hr = dao.hrSamplesForRun(runId)
        val avg = hr.map { it.bpm }.average().takeIf { !it.isNaN() }?.toInt()
        val max = hr.maxOfOrNull { it.bpm }
        return com.example.rungps.feature.run.RunDetail(
            row = com.example.rungps.feature.run.RunRow(
                id = run.id,
                startedAtMs = run.startedAtMs,
                distanceM = run.totalDistanceM,
                durationMs = run.totalDurationMs,
                activityType = run.activityType,
            ),
            points = points,
            splits = splits,
            hrSamples = hr,
            avgHrBpm = avg,
            maxHrBpm = max,
        )
    }

    suspend fun deleteRun(runId: Long) = dao.deleteRun(runId)
}
