package com.example.rungps.media

import android.graphics.Bitmap

data class SessionMediaSnapshot(
    val title: String,
    val subtitle: String?,
    val isPlaying: Boolean,
    val itemType: String?,
    val itemId: String?,
    val progressMs: Long?,
    val source: String,
    val artUrl: String? = null,
    val deviceArt: Bitmap? = null,
) {
    fun timelineKey(): String = listOfNotNull(itemType, itemId, title, subtitle).joinToString("|")

    val isPodcast: Boolean
        get() = itemType == "episode" ||
            (source == "device" && !subtitle.isNullOrBlank() &&
                !subtitle.equals(title, ignoreCase = true))

    companion object {
        fun fromDeviceNowPlaying(now: DeviceNowPlaying, progressMs: Long? = null): SessionMediaSnapshot {
            val itemType = if (now.isPodcast) "episode" else "track"
            return SessionMediaSnapshot(
                title = now.title ?: "Unknown",
                subtitle = now.displaySubtitle,
                isPlaying = now.isPlaying,
                itemType = itemType,
                itemId = now.timelineKey(),
                progressMs = progressMs,
                source = "device",
                artUrl = now.artUri,
                deviceArt = now.art,
            )
        }

        private fun DeviceNowPlaying.timelineKey(): String =
            listOfNotNull(title, showOrAlbum, artist).joinToString("|")
    }
}
