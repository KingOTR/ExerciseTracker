package com.example.rungps.data.repo

import com.example.rungps.data.dao.SleepDao
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.entity.SleepSoundEventEntity
import kotlinx.coroutines.flow.Flow

class SleepRepository(private val dao: SleepDao) {
    fun observeEntries(): Flow<List<SleepEntryEntity>> = dao.observeSleepEntries()

    suspend fun recentEntries(limit: Int = 30): List<SleepEntryEntity> = dao.recentEntries(limit)

    suspend fun saveEntry(entry: SleepEntryEntity): Long = dao.insertEntry(entry)

    suspend fun soundEventsForNight(nightStart: Long): List<SleepSoundEventEntity> =
        dao.soundEventsForNight(nightStart)

    suspend fun insertSoundEvent(event: SleepSoundEventEntity): Long = dao.insertSoundEvent(event)
}
