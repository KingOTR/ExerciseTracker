package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runs")
data class RunEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val startedAtMs: Long,
    val endedAtMs: Long? = null,
    val totalDistanceM: Double = 0.0,
    val totalDurationMs: Long = 0,
    val totalSteps: Long = 0,
    val planType: String? = null,
    val timeSession: String? = null,
    val activityType: String = "RUN",
    val watchImportId: Long? = null,
    val stravaImportId: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val privateNotes: String? = null,
    val gearId: Long? = null,
)
