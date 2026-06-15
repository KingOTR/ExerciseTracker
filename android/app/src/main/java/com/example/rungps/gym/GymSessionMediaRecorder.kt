package com.example.rungps.gym

import android.content.Context
import com.example.rungps.data.dao.ExerciseTrackerDao
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.SpotifyTimelineEntity
import com.example.rungps.media.DeviceNowPlayingReader
import com.example.rungps.media.SessionMediaSnapshot
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GymSessionMediaRecorder {
    private var lastKey: String? = null
    private var lastSavedAtMs: Long = 0L
    private var sessionPlaybackStartMs: Long? = null

    fun reset() {
        lastKey = null
        lastSavedAtMs = 0L
        sessionPlaybackStartMs = null
    }

    suspend fun pollAndSave(sessionId: Long, context: Context, dao: ExerciseTrackerDao): Boolean =
        withContext(Dispatchers.IO) {
            val now = DeviceNowPlayingReader.read(context) ?: return@withContext false
            val snapshot = SessionMediaSnapshot.fromDeviceNowPlaying(
                now,
                now.controller?.playbackState?.position,
            )
            val key = snapshot.timelineKey()
            val timeMs = System.currentTimeMillis()
            if (key == lastKey && timeMs - lastSavedAtMs < 15_000) return@withContext false
            lastKey = key
            lastSavedAtMs = timeMs
            if (sessionPlaybackStartMs == null && snapshot.isPlaying) {
                sessionPlaybackStartMs = timeMs
            }
            dao.insertSpotifyTimeline(
                SpotifyTimelineEntity(
                    timeMs = timeMs,
                    gymSessionId = sessionId,
                    isPlaying = snapshot.isPlaying,
                    itemType = snapshot.itemType,
                    itemId = snapshot.itemId,
                    title = snapshot.title,
                    subtitle = snapshot.subtitle,
                    progressMs = snapshot.progressMs,
                    artUrl = snapshot.artUrl,
                ),
            )
            if (snapshot.isPodcast || snapshot.subtitle != null) {
                val session = dao.getGymSession(sessionId) ?: return@withContext true
                dao.insertGymSession(
                    session.copy(
                        podcastShowName = snapshot.subtitle ?: now.podcastShowName,
                        podcastEpisodeTitle = snapshot.title,
                        playbackStartedMs = session.playbackStartedMs ?: sessionPlaybackStartMs,
                        playbackEndMs = if (snapshot.isPlaying) timeMs else session.playbackEndMs,
                    ),
                )
            }
            true
        }

    suspend fun finalizeSession(sessionId: Long, dao: ExerciseTrackerDao) {
        withContext(Dispatchers.IO) {
            val session = dao.getGymSession(sessionId) ?: return@withContext
            val endMs = System.currentTimeMillis()
            val timeline = dao.getSpotifyTimelineForGymSession(sessionId)
            val lastPodcast = timeline.lastOrNull { it.isPodcast || !it.subtitle.isNullOrBlank() }
            dao.insertGymSession(
                session.copy(
                    endedAtMs = session.endedAtMs ?: endMs,
                    podcastShowName = session.podcastShowName ?: lastPodcast?.podcastShowName,
                    podcastEpisodeTitle = session.podcastEpisodeTitle ?: lastPodcast?.podcastEpisodeTitle,
                    playbackStartedMs = session.playbackStartedMs ?: sessionPlaybackStartMs,
                    playbackEndMs = session.playbackEndMs ?: endMs,
                ),
            )
            reset()
        }
    }
}
