package com.example.rungps.media

import android.graphics.Bitmap
import android.media.session.MediaController

data class DeviceNowPlaying(
    val packageName: String,
    val title: String?,
    val showOrAlbum: String?,
    val artist: String?,
    val isPlaying: Boolean,
    val isPodcast: Boolean,
    val art: Bitmap? = null,
    val artUri: String? = null,
    val controller: MediaController? = null,
) {
    val displaySubtitle: String?
        get() {
            if (isPodcast) {
                val show = showOrAlbum
                if (!show.isNullOrBlank() && !show.equals(title, ignoreCase = true)) return show
            }
            val a = artist
            if (!a.isNullOrBlank() && !a.equals(title, ignoreCase = true)) return a
            return null
        }

    val podcastEpisodeTitle: String? get() = title
    val podcastShowName: String?
        get() = when {
            isPodcast && !showOrAlbum.isNullOrBlank() -> showOrAlbum
            isPodcast && !artist.isNullOrBlank() && !artist.equals(title, ignoreCase = true) -> artist
            else -> showOrAlbum
        }
}
