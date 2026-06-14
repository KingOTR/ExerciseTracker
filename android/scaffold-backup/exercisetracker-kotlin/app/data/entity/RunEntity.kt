package com.exercisetracker.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runs")
data class RunEntity(
    @PrimaryKey val id: Long,
    val startedAtMs: Long,
    val endedAtMs: Long?,
    val distanceM: Double,
    val durationMs: Long,
    val activityType: String,
    val hrSamplesJson: String? = null,
)
