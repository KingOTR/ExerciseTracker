package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.rungps.data.entity.SpotifyTimelineEntity
import com.example.rungps.media.SessionMediaSnapshot
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

private val timeFmt = DateTimeFormatter.ofPattern("HH:mm")

object GymSessionMediaTimeline {
    fun isPodcastRow(entity: SpotifyTimelineEntity): Boolean = entity.isPodcast
    fun displayTitle(entity: SpotifyTimelineEntity): String = entity.title ?: "Unknown"
    fun displaySubtitle(entity: SpotifyTimelineEntity): String? =
        if (entity.isPodcast) entity.podcastShowName else entity.subtitle
}

@Composable
fun GymSessionMediaTimelineList(
    timeline: List<SpotifyTimelineEntity>,
    startedAtMs: Long,
    liveSnapshot: SessionMediaSnapshot? = null,
    modifier: Modifier = Modifier,
) {
    if (timeline.isEmpty() && liveSnapshot == null) return
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Media timeline", style = MaterialTheme.typography.titleSmall)
        liveSnapshot?.let { live ->
            MediaTimelineRow(
                title = live.title,
                subtitle = live.subtitle,
                isPodcast = live.isPodcast,
                offsetMs = System.currentTimeMillis() - startedAtMs,
                isLive = true,
            )
        }
        timeline.forEach { entry ->
            MediaTimelineRow(
                title = GymSessionMediaTimeline.displayTitle(entry),
                subtitle = GymSessionMediaTimeline.displaySubtitle(entry),
                isPodcast = GymSessionMediaTimeline.isPodcastRow(entry),
                offsetMs = entry.timeMs - startedAtMs,
                isLive = entry.isPlaying,
            )
        }
    }
}

@Composable
private fun MediaTimelineRow(
    title: String,
    subtitle: String?,
    isPodcast: Boolean,
    offsetMs: Long,
    isLive: Boolean,
) {
    val timeLabel = Instant.ofEpochMilli(System.currentTimeMillis() - offsetMs.coerceAtLeast(0))
        .atZone(ZoneId.systemDefault()).format(timeFmt)
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    if (isPodcast) "Podcast" else "Music",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                )
                Text(
                    if (isLive) "▶ live" else timeLabel,
                    style = MaterialTheme.typography.labelSmall,
                )
            }
            Text(title, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Medium)
            subtitle?.let {
                Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}

@Composable
fun GymSessionPodcastSummary(
    showName: String?,
    episodeTitle: String?,
    playbackStartedMs: Long?,
    playbackEndMs: Long?,
    modifier: Modifier = Modifier,
) {
    if (showName.isNullOrBlank() && episodeTitle.isNullOrBlank()) return
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text("Podcast during session", style = MaterialTheme.typography.titleSmall)
            episodeTitle?.let { Text(it, style = MaterialTheme.typography.bodyMedium) }
            showName?.let {
                Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            if (playbackStartedMs != null && playbackEndMs != null) {
                val mins = ((playbackEndMs - playbackStartedMs) / 60_000).coerceAtLeast(1)
                Text("Partial play · ~${mins}m listened", style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}
