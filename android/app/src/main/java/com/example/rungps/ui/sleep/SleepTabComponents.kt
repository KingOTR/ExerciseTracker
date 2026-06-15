package com.example.rungps.ui.sleep

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.sleep.SleepTrackSample
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

private val timeFmt = DateTimeFormatter.ofPattern("EEE d MMM · HH:mm")

@Composable
fun SleepNightRow(entry: SleepEntryEntity, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(
                formatNight(entry.startTimeMs),
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                "${entry.totalSleepMin / 60}h ${entry.totalSleepMin % 60}m sleep · ${entry.sleepEfficiency ?: "—"}% efficiency",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 4.dp),
            )
            entry.notes?.takeIf { it.isNotBlank() }?.let {
                Text(it, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(top = 4.dp))
            }
        }
    }
}

@Composable
fun SleepTrackingLiveCard(
    tracking: Boolean,
    serviceRunning: Boolean,
    sampleCount: Int,
    lastSample: SleepTrackSample?,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("Tonight", style = MaterialTheme.typography.titleMedium)
            Text(
                when {
                    tracking && serviceRunning -> "Recording — $sampleCount buckets"
                    tracking -> "Session active — restarting service…"
                    else -> "Not tracking"
                },
                modifier = Modifier.padding(top = 4.dp),
            )
            lastSample?.let { s ->
                Text(
                    "Movement ${"%.2f".format(s.movement)} · audio ${"%.2f".format(s.audioLevel)} · snore ${"%.0f".format(s.snoreLikelihood * 100)}%",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp),
                )
            }
        }
    }
}

@Composable
fun SleepTrendCard(entries: List<SleepEntryEntity>, modifier: Modifier = Modifier) {
    if (entries.size < 2) return
    val avg = entries.take(7).map { it.totalSleepMin }.average()
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("7-night trend", style = MaterialTheme.typography.titleMedium)
            Text(
                "Avg ${avg.toInt() / 60}h ${avg.toInt() % 60}m · ${entries.size} nights in history",
                modifier = Modifier.padding(top = 4.dp),
            )
        }
    }
}

private fun formatNight(startMs: Long): String =
    Instant.ofEpochMilli(startMs).atZone(ZoneId.systemDefault()).format(timeFmt)
