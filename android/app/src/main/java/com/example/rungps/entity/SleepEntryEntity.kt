package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "sleep_entries",
    indices = [
        Index(value = ["startTimeMs"], unique = true),
        Index(value = ["endTimeMs"]),
    ],
)
data class SleepEntryEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val startTimeMs: Long,
    val endTimeMs: Long,
    val totalSleepMin: Int,
    val deepSleepMin: Int? = null,
    val lightSleepMin: Int? = null,
    val sleepEfficiency: Int? = null,
    val sleepQuality: Int? = null,
    val source: String = "manual",
    val notes: String? = null,
    val wakeMood: Int? = null,
    val snoreEvents: Int? = null,
    val awakeSleepMin: Int? = null,
    val restlessnessIndex: Int? = null,
    val remSleepMin: Int? = null,
    val smartAlarmUsed: Boolean = false,
    val timeToFallAsleepMin: Int? = null,
    val scoreRoutine: Int? = null,
    val scoreQualityPillar: Int? = null,
    val scoreDuration: Int? = null,
    val hypnogramCompact: String? = null,
    val eventMarkersCompact: String? = null,
    val stageConfidenceMean: Float? = null,
    val micCoverageRatio: Float? = null,
    val fusionSource: String? = null,
    val breathRateMean: Float? = null,
    val osaRiskHint: String? = null,
    val sleepDebtHours: Float? = null,
    val consistencyScore: Int? = null,
    val sleepAnalyticsJson: String? = null,
)
