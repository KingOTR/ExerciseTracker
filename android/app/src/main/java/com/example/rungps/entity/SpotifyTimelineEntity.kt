package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "spotify_timeline",
    indices = [
        Index("gymSessionId"),
        Index("runId"),
        Index("timeMs"),
    ],
)
data class SpotifyTimelineEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val timeMs: Long,
    val runId: Long? = null,
    val gymSessionId: Long? = null,
    val isPlaying: Boolean = false,
    val itemType: String? = null,
    val itemId: String? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val progressMs: Long? = null,
    val artUrl: String? = null,
) {
    val isPodcast: Boolean
        get() = itemType == "episode" ||
            (!subtitle.isNullOrBlank() && !subtitle.equals(title, ignoreCase = true))

    val podcastEpisodeTitle: String? get() = title
    val podcastShowName: String? get() = subtitle?.takeIf { isPodcast }
}
