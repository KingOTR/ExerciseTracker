package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "sleep_sound_events",
    indices = [
        Index(value = ["nightStartTimeMs"]),
        Index(value = ["nightStartTimeMs", "eventTimeMs"]),
        Index(value = ["kind"]),
    ],
)
data class SleepSoundEventEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nightStartTimeMs: Long,
    val eventTimeMs: Long,
    val kind: String,
    val intensity: Float = 0f,
    val durationMs: Int = 0,
    val encryptedFileName: String = "",
    val createdAtMs: Long = System.currentTimeMillis(),
)
