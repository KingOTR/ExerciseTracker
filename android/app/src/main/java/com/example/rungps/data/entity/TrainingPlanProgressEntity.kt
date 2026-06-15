package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "training_plan_progress")
data class TrainingPlanProgressEntity(
    @PrimaryKey val id: Int = 1,
    val planSlug: String,
    val title: String,
    val startEpochDay: Long,
    val nextWorkoutIndex: Int = 0,
    val updatedAtMs: Long = System.currentTimeMillis(),
)
