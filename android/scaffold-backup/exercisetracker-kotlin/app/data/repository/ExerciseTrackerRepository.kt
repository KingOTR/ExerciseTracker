package com.exercisetracker.app.data.repository

import com.exercisetracker.app.data.dao.ExerciseTrackerDao
import com.exercisetracker.app.data.entity.GymSessionEntity
import com.exercisetracker.app.data.entity.GymSetEntity
import com.exercisetracker.app.data.entity.RunEntity
import com.exercisetracker.app.data.entity.SleepRecordEntity
import com.exercisetracker.app.data.entity.SoccerSessionEntity
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
}
