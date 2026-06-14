package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sleep_records")
data class SleepRecordEntity(
    @PrimaryKey(autoGenerate = true) val rowId: Long = 0,
    val startTimeMs: Long,
    val endTimeMs: Long,
    val totalSleepMin: Int,
    val sleepEfficiency: Int? = null,
    val sleepQuality: Int? = null,
    val source: String? = null,
)
