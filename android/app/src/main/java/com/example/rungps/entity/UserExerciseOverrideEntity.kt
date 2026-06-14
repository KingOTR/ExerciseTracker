package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_exercise_overrides")
data class UserExerciseOverrideEntity(
    @PrimaryKey val exerciseNameNormalized: String,
    val displayName: String,
    val loadsJson: String,
    val createdAtMs: Long,
)
