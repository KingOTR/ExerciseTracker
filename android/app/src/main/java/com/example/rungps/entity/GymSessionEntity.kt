package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gym_sessions")
data class GymSessionEntity(
    @PrimaryKey val id: Long,
    val startedAtMs: Long,
    val endedAtMs: Long?,
    val freeDay: Boolean = false,
    val templateDayId: Long? = null,
    val notes: String? = null,
    val ambientTag: String? = null,
    val ambientTagCustom: String? = null,
    val remoteId: String? = null,
    val podcastShowName: String? = null,
    val podcastEpisodeTitle: String? = null,
    val playbackStartedMs: Long? = null,
    val playbackEndMs: Long? = null,
)
