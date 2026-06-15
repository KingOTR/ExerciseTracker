package com.example.rungps.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.RunHrSampleEntity
import com.example.rungps.data.entity.SleepRecordEntity
import com.example.rungps.data.entity.SoccerSessionEntity
import com.example.rungps.data.entity.SpotifyTimelineEntity
import com.example.rungps.data.entity.UserExerciseOverrideEntity
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
    suspend fun insertRun(run: RunEntity): Long

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

    @Query("SELECT * FROM runs WHERE id = :runId LIMIT 1")
    suspend fun runById(runId: Long): RunEntity?

    @Query("SELECT COUNT(*) FROM runs WHERE id = :runId")
    suspend fun runExists(runId: Long): Int

    @Query(
        """
        UPDATE runs SET
            endedAtMs = :endedAtMs,
            totalDistanceM = :totalDistanceM,
            totalDurationMs = :totalDurationMs,
            totalSteps = :totalSteps,
            planType = :planType,
            timeSession = :timeSession
        WHERE id = :runId
        """,
    )
    suspend fun finishRun(
        runId: Long,
        endedAtMs: Long,
        totalDistanceM: Double,
        totalDurationMs: Long,
        totalSteps: Long,
        planType: String?,
        timeSession: String?,
    )

    @Query("DELETE FROM runs WHERE id = :runId")
    suspend fun deleteRun(runId: Long)

    @Insert
    suspend fun insertPoint(point: PointEntity): Long

    @Insert
    suspend fun insertKmSplit(split: KmSplitEntity): Long

    @Insert
    suspend fun insertRunHrSample(sample: RunHrSampleEntity): Long

    @Query("SELECT COALESCE(SUM(distanceFromPrevM), 0.0) FROM run_points WHERE runId = :runId")
    suspend fun sumDistanceM(runId: Long): Double?

    @Query("SELECT * FROM km_splits WHERE runId = :runId ORDER BY idx")
    suspend fun kmSplitsForRun(runId: Long): List<KmSplitEntity>

    @Query("SELECT * FROM run_points WHERE runId = :runId ORDER BY timeMs")
    suspend fun pointsForRun(runId: Long): List<PointEntity>

    @Query("SELECT * FROM run_hr_samples WHERE runId = :runId ORDER BY timeMs")
    suspend fun hrSamplesForRun(runId: Long): List<RunHrSampleEntity>

    @Query("SELECT * FROM gym_sessions WHERE id = :sessionId LIMIT 1")
    suspend fun getGymSession(sessionId: Long): GymSessionEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSpotifyTimeline(entry: SpotifyTimelineEntity)

    @Query("SELECT * FROM spotify_timeline WHERE gymSessionId = :sessionId ORDER BY timeMs")
    fun observeSpotifyTimelineForGymSession(sessionId: Long): Flow<List<SpotifyTimelineEntity>>

    @Query("SELECT * FROM spotify_timeline WHERE gymSessionId = :sessionId ORDER BY timeMs")
    suspend fun getSpotifyTimelineForGymSession(sessionId: Long): List<SpotifyTimelineEntity>

    @Query("SELECT * FROM spotify_timeline WHERE runId = :runId ORDER BY timeMs")
    suspend fun getSpotifyTimelineForRun(runId: Long): List<SpotifyTimelineEntity>
}
