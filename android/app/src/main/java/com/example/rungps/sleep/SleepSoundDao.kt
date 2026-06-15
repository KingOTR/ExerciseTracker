package com.example.rungps.sleep

import android.content.Context
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.entity.SleepSoundEventEntity
import com.example.rungps.data.dao.SleepDao
import kotlinx.coroutines.flow.Flow

interface SleepSoundDao {
    fun observeSoundEvents(nightId: Long): Flow<List<SleepSoundEventEntity>>
    suspend fun insertSoundEvent(event: SleepSoundEventEntity)
    suspend fun soundEventsForNight(nightId: Long): List<SleepSoundEventEntity>
}

class RoomSleepSoundDao(private val sleepDao: SleepDao) : SleepSoundDao {
    override fun observeSoundEvents(nightId: Long): Flow<List<SleepSoundEventEntity>> {
        // nightId maps to startTimeMs for sound event grouping
        return kotlinx.coroutines.flow.flow {
            emit(sleepDao.soundEventsForNight(nightId))
        }
    }
    override suspend fun insertSoundEvent(event: SleepSoundEventEntity) {
        sleepDao.insertSoundEvent(event)
    }
    override suspend fun soundEventsForNight(nightId: Long) = sleepDao.soundEventsForNight(nightId)
}

object SleepCycleCsvImporter {
    data class ImportedNight(
        val startMs: Long,
        val endMs: Long,
        val stages: List<SleepStageLabel>,
    )

    fun parseCsv(text: String): List<ImportedNight> {
        val lines = text.lines().filter { it.isNotBlank() && !it.startsWith("#") }
        if (lines.isEmpty()) return emptyList()
        return lines.drop(1).mapNotNull { line ->
            val parts = line.split(",")
            if (parts.size < 3) return@mapNotNull null
            val start = parts[0].trim().toLongOrNull() ?: return@mapNotNull null
            val end = parts[1].trim().toLongOrNull() ?: return@mapNotNull null
            val stage = when (parts[2].trim().uppercase()) {
                "DEEP" -> SleepStageLabel.DEEP
                "REM" -> SleepStageLabel.REM
                "AWAKE" -> SleepStageLabel.AWAKE
                else -> SleepStageLabel.LIGHT
            }
            ImportedNight(start, end, listOf(stage))
        }
    }

    fun toEntry(imported: ImportedNight): SleepEntryEntity {
        val inBedMin = ((imported.endMs - imported.startMs) / 60_000).toInt().coerceAtLeast(1)
        return SleepEntryEntity(
            startTimeMs = imported.startMs,
            endTimeMs = imported.endMs,
            totalSleepMin = inBedMin,
            hypnogramCompact = SleepHypnogramEncoder.encode(imported.stages),
            source = "csv_import",
        )
    }
}
