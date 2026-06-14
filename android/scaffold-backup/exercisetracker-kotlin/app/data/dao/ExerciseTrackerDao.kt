package com.exercisetracker.app.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.exercisetracker.app.data.entity.GymSessionEntity
import com.exercisetracker.app.data.entity.GymSetEntity
import com.exercisetracker.app.data.entity.KmSplitEntity
import com.exercisetracker.app.data.entity.RunEntity
import com.exercisetracker.app.data.entity.SleepRecordEntity
import com.exercisetracker.app.data.entity.SoccerSessionEntity
import com.exercisetracker.app.data.entity.UserExerciseOverrideEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseTrackerDao {
    @Query("SELECT * FROM gym_sessions ORDER BY startedAtMs DESC")
    fun observeGymSessions(): Flow<List<GymSessionEntity>>

    @Query("SELECT * FROM gym_sets WHERE sessionId = :sessionId ORDER BY setIndex")
    fun observeGymSets(sessionId: Long): Flow<List<GymSetEntity>>

    @Query("SELECT * FROM gym_sets WHERE sessionId = :sessionId ORDER BY setIndex")
    suspend fun getGymSetsForSession(sessionId: Long): List<GymSetEntity>

    @Query("SELECT * FROM runs ORDER BY startedAtMs DESC")
    fun observeRuns(): Flow<List<RunEntity>>

    @Query("SELECT * FROM km_splits WHERE runId = :runId ORDER BY idx")
    fun observeKmSplits(runId: Long): Flow<List<KmSplitEntity>>

    @Query("SELECT * FROM soccer_sessions ORDER BY startTimeMs DESC")
    fun observeSoccerSessions(): Flow<List<SoccerSessionEntity>>

    @Query("SELECT * FROM sleep_records ORDER BY startTimeMs DESC")
    fun observeSleepRecords(): Flow<List<SleepRecordEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGymSession(session: GymSessionEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGymSets(sets: List<GymSetEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: RunEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertKmSplits(splits: List<KmSplitEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSoccerSession(session: SoccerSessionEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSleepRecord(record: SleepRecordEntity)

    @Query("SELECT * FROM user_exercise_overrides ORDER BY displayName")
    fun observeUserExerciseOverrides(): Flow<List<UserExerciseOverrideEntity>>

    @Query("SELECT * FROM user_exercise_overrides")
    suspend fun getUserExerciseOverrides(): List<UserExerciseOverrideEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserExerciseOverride(override: UserExerciseOverrideEntity)

    @Query("DELETE FROM gym_sets WHERE sessionId = :sessionId")
    suspend fun deleteGymSetsForSession(sessionId: Long)

    @Query("SELECT MAX(id) FROM gym_sessions")
    suspend fun maxGymSessionId(): Long?

    @Query("SELECT * FROM gym_sessions ORDER BY startedAtMs DESC LIMIT 1")
    suspend fun latestGymSession(): GymSessionEntity?

    @Query("SELECT * FROM gym_sets ORDER BY loggedAtMs DESC")
    suspend fun getAllGymSets(): List<GymSetEntity>

    @Query("SELECT * FROM runs ORDER BY startedAtMs DESC")
    suspend fun getAllRuns(): List<RunEntity>

    @Query("SELECT * FROM soccer_sessions ORDER BY startTimeMs DESC")
    suspend fun getAllSoccerSessions(): List<SoccerSessionEntity>
}
