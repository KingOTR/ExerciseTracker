package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "soccer_sessions")
data class SoccerSessionEntity(
    @PrimaryKey val id: Long,
    val kind: String,
    val startTimeMs: Long,
    val playMin: Int,
    val intensity: Int,
    val notes: String? = null,
    val watchSessionId: Long? = null,
)
