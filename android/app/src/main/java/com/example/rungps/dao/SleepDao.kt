package com.example.rungps.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.entity.SleepSoundEventEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SleepDao {
    @Query("SELECT * FROM sleep_entries ORDER BY startTimeMs DESC")
    fun observeSleepEntries(): Flow<List<SleepEntryEntity>>

    @Query("SELECT * FROM sleep_entries ORDER BY startTimeMs DESC LIMIT :limit")
    suspend fun recentEntries(limit: Int = 30): List<SleepEntryEntity>

    @Query("SELECT * FROM sleep_entries WHERE startTimeMs = :startTimeMs LIMIT 1")
    suspend fun entryByStart(startTimeMs: Long): SleepEntryEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: SleepEntryEntity): Long

    @Query("DELETE FROM sleep_entries WHERE id = :id")
    suspend fun deleteEntry(id: Long)

    @Query("SELECT * FROM sleep_sound_events WHERE nightStartTimeMs = :nightStart ORDER BY eventTimeMs")
    suspend fun soundEventsForNight(nightStart: Long): List<SleepSoundEventEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSoundEvent(event: SleepSoundEventEntity): Long
}
