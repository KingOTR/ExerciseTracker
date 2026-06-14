package com.exercisetracker.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gym_sessions")
data class GymSessionEntity(
    @PrimaryKey val id: Long,
    val startedAtMs: Long,
    val endedAtMs: Long?,
    val freeDay: Boolean = false,
)
