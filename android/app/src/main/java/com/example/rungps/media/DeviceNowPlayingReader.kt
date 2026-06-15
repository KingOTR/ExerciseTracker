package com.example.rungps.media

import android.content.ComponentName
import android.content.Context
import android.media.MediaMetadata
import android.media.session.MediaController
import android.media.session.MediaSessionManager
import android.media.session.PlaybackState
import android.os.Build
import android.provider.Settings
import androidx.core.content.ContextCompat
import com.example.rungps.sleep.SleepAlarmPreferences

object DeviceNowPlayingReader {

    private const val META_TITLE = MediaMetadata.METADATA_KEY_TITLE
    private const val META_DISPLAY_TITLE = MediaMetadata.METADATA_KEY_DISPLAY_TITLE
    private const val META_ALBUM = MediaMetadata.METADATA_KEY_ALBUM
    private const val META_COMPILATION = MediaMetadata.METADATA_KEY_COMPILATION
    private const val META_ARTIST = MediaMetadata.METADATA_KEY_ARTIST
    private const val META_ALBUM_ARTIST = MediaMetadata.METADATA_KEY_ALBUM_ARTIST
    private const val META_AUTHOR = MediaMetadata.METADATA_KEY_AUTHOR
    private const val META_WRITER = MediaMetadata.METADATA_KEY_WRITER
    private const val META_SUBTITLE = MediaMetadata.METADATA_KEY_DISPLAY_SUBTITLE
    private const val META_DESCRIPTION = MediaMetadata.METADATA_KEY_DISPLAY_DESCRIPTION
    private const val META_DURATION = MediaMetadata.METADATA_KEY_DURATION
    private const val META_ALBUM_ART = MediaMetadata.METADATA_KEY_ALBUM_ART
    private const val META_ART = MediaMetadata.METADATA_KEY_ART
    private const val META_ICON = MediaMetadata.METADATA_KEY_DISPLAY_ICON
    private const val META_ALBUM_ART_URI = MediaMetadata.METADATA_KEY_ALBUM_ART_URI
    private const val META_ICON_URI = MediaMetadata.METADATA_KEY_DISPLAY_ICON_URI

    fun hasNotificationListenerAccess(context: Context): Boolean {
        val enabled = Settings.Secure.getString(context.contentResolver, "enabled_notification_listeners")
            ?: return false
        return enabled.contains(context.packageName, ignoreCase = true)
    }

    fun read(context: Context): DeviceNowPlaying? {
        val msm = ContextCompat.getSystemService(context, MediaSessionManager::class.java) ?: return null
        val component = ComponentName(context, MediaSessionListenerService::class.java)
        val controllers = runCatching { msm.getActiveSessions(component) }.getOrNull() ?: emptyList()
        val parsed = controllers.mapNotNull { parseController(it) }
        if (parsed.isEmpty()) return null
        return parsed.firstOrNull { it.isPlaying } ?: parsed.first()
    }

    private fun parseController(controller: MediaController): DeviceNowPlaying? {
        val metadata = controller.metadata ?: return null
        val primaryTitle = primaryTitle(metadata) ?: return null
        val podcastOrAlbum = podcastOrAlbumName(metadata)
        val artistLine = artistLine(metadata)
        val displaySubtitle = metadata.getString(META_SUBTITLE)?.trim()?.takeIf { it.isNotBlank() }
        val playbackState = controller.playbackState
        val playing = playbackState?.state == PlaybackState.STATE_PLAYING
        val pkgLower = controller.packageName.lowercase()
        val isSpotify = pkgLower.contains(SleepAlarmPreferences.SOUND_SPOTIFY)
        val spotifyArtist = if (isSpotify) {
            artistLine?.takeIf { it.isNotBlank() && !it.equals(primaryTitle, ignoreCase = true) }
        } else null
        val displayDesc = metadata.getString(META_DESCRIPTION)?.trim()?.takeIf { it.isNotBlank() }
        var subtitle = when {
            !podcastOrAlbum.isNullOrBlank() && !podcastOrAlbum.equals(primaryTitle, ignoreCase = true) ->
                podcastOrAlbum
            spotifyArtist != null -> spotifyArtist
            !displayDesc.isNullOrBlank() && !displayDesc.equals(primaryTitle, ignoreCase = true) ->
                displayDesc
            !displaySubtitle.isNullOrBlank() && displaySubtitle.length < primaryTitle.length ->
                displaySubtitle
            else -> null
        }
        val durationMs = metadata.getLong(META_DURATION)
        val heuristicPodcast = durationMs > 20 * 60_000 ||
            pkgLower.contains("podcast") ||
            pkgLower.contains("castbox") ||
            pkgLower.contains("pocketcasts") ||
            pkgLower.contains("antennapod") ||
            pkgLower.contains("player.fm")
        val mediaTypePodcast = if (Build.VERSION.SDK_INT >= 33) {
            @Suppress("DEPRECATION")
            metadata.getLong(MediaMetadata.METADATA_KEY_BT_FOLDER_TYPE) // fallback heuristic only
            heuristicPodcast
        } else heuristicPodcast
        val isPodcast = mediaTypePodcast ||
            (subtitle != null && !subtitle.equals(primaryTitle, ignoreCase = true) &&
                (isSpotify || heuristicPodcast))
        if (isPodcast && !podcastOrAlbum.isNullOrBlank() &&
            !podcastOrAlbum.equals(primaryTitle, ignoreCase = true)
        ) {
            subtitle = podcastOrAlbum
        } else if (isPodcast && !artistLine.isNullOrBlank() &&
            !artistLine.equals(primaryTitle, ignoreCase = true) &&
            podcastOrAlbum.isNullOrBlank()
        ) {
            subtitle = artistLine
        }
        val artUri = metadata.getString(META_ALBUM_ART_URI)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_ICON_URI)?.trim()?.takeIf { it.isNotBlank() }
        return DeviceNowPlaying(
            packageName = controller.packageName,
            title = primaryTitle,
            showOrAlbum = subtitle ?: podcastOrAlbum,
            artist = artistLine,
            isPlaying = playing,
            isPodcast = isPodcast,
            art = metadata.getBitmap(META_ALBUM_ART)
                ?: metadata.getBitmap(META_ART)
                ?: metadata.getBitmap(META_ICON),
            artUri = artUri,
            controller = controller,
        )
    }

    private fun primaryTitle(metadata: MediaMetadata): String? {
        return metadata.getString(META_TITLE)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_DISPLAY_TITLE)?.trim()?.takeIf { it.isNotBlank() }
    }

    private fun podcastOrAlbumName(metadata: MediaMetadata): String? {
        return metadata.getString(META_ALBUM)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_COMPILATION)?.trim()?.takeIf { it.isNotBlank() }
    }

    private fun artistLine(metadata: MediaMetadata): String? {
        return metadata.getString(META_ARTIST)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_ALBUM_ARTIST)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_AUTHOR)?.trim()?.takeIf { it.isNotBlank() }
            ?: metadata.getString(META_WRITER)?.trim()?.takeIf { it.isNotBlank() }
    }
}
