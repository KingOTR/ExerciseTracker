package com.example.rungps.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GpsFixed
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.rungps.tracking.TrackingUiState
import kotlin.math.min

@Composable
fun ActiveRecordingPane(
    live: TrackingUiState,
    followRouteId: Long? = null,
    followRouteName: String? = null,
    isBike: Boolean = false,
    onPauseToggle: () -> Unit,
    onStop: () -> Unit,
    hrZoneLabel: String? = null,
    hrBpm: Int? = null,
    modifier: Modifier = Modifier,
) {
    val paused = live.isPaused || live.isAutoPaused
    val hasFix = live.hasGpsFix || (live.lastLat != null && live.lastLon != null)
    val paceSec = if (live.distanceM > 0) live.elapsedMs / 1000.0 / (live.distanceM / 1000.0) else 0.0

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
            MapLibreRecordingMap(
                routeId = followRouteId ?: 0L,
                liveLat = live.lastLat,
                liveLon = live.lastLon,
                modifier = Modifier.fillMaxSize(),
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.92f))
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                RecordingGpsStrip(hasFix = hasFix)
                followRouteName?.let {
                    Text("Following: $it", style = MaterialTheme.typography.labelMedium)
                }
                RecordingStatsCard(
                    live = live,
                    isBike = isBike,
                    paceSec = paceSec,
                    hrBpm = hrBpm,
                    hrZoneLabel = hrZoneLabel,
                )
            }
        }
        live.segmentLabel?.let { label ->
            Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)) {
                Column(Modifier.padding(12.dp)) {
                    Text(label, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                    live.segmentRemainingMs?.let {
                        Text("Remaining ${formatElapsed(it)}", style = MaterialTheme.typography.bodySmall)
                    }
                    live.targetPaceSecPerKm?.let {
                        Text("Target ${formatPace(it.toDouble())}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
        if (live.splitCount > 0) {
            KmSplitBars(splitCount = live.splitCount, distanceM = live.distanceM)
        }
        RecordingControlBar(paused = paused, onPauseToggle = onPauseToggle, onStop = onStop)
    }
}

@Composable
private fun RecordingGpsStrip(hasFix: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            Icons.Default.GpsFixed,
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = if (hasFix) Color(0xFF4CAF50) else MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Text(
            if (hasFix) "GPS" else "GPS…",
            modifier = Modifier.padding(start = 6.dp),
            style = MaterialTheme.typography.labelMedium,
            color = if (hasFix) Color(0xFF4CAF50) else MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

@Composable
private fun RecordingStatsCard(
    live: TrackingUiState,
    isBike: Boolean,
    paceSec: Double,
    hrBpm: Int?,
    hrZoneLabel: String?,
) {
    val paused = live.isPaused || live.isAutoPaused
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(formatElapsed(live.elapsedMs), style = MaterialTheme.typography.displaySmall, fontWeight = FontWeight.Bold)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                StatColumn("Distance", formatDistanceKm(live.distanceM))
                StatColumn(
                    if (isBike) "Speed" else "Pace",
                    if (isBike && paceSec > 0) "%.1f km/h".format(3600.0 / paceSec) else formatPace(paceSec),
                )
                StatColumn("Steps", formatSteps(live.steps))
            }
            hrBpm?.let { bpm ->
                val zone = hrZoneLabel ?: HrZoneHelper.zoneLabel(bpm)
                val color = HrZoneHelper.zoneColor(bpm)
                Surface(color = color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp)) {
                    Text(
                        "♥ $bpm bpm · $zone",
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        color = color,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
            }
            if (paused) {
                Text("Paused", color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.labelLarge)
            }
        }
    }
}

@Composable
private fun StatColumn(label: String, value: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(value, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
        Text(label, style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
fun KmSplitBars(splitCount: Int, distanceM: Double, modifier: Modifier = Modifier) {
    val km = (distanceM / 1000.0).coerceAtLeast(0.0)
    val currentKmFrac = km - km.toInt()
    Column(modifier, verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Text("KM splits: $splitCount", style = MaterialTheme.typography.labelMedium)
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            repeat(min(splitCount, 12)) {
                Box(
                    Modifier
                        .weight(1f)
                        .height(8.dp)
                        .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(2.dp)),
                )
            }
            if (km > splitCount) {
                Box(
                    Modifier
                        .weight(1f)
                        .height(8.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant, RoundedCornerShape(2.dp)),
                ) {
                    LinearProgressIndicator(
                        progress = { currentKmFrac.toFloat() },
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}

@Composable
private fun RecordingControlBar(
    paused: Boolean,
    onPauseToggle: () -> Unit,
    onStop: () -> Unit,
) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        OutlinedButton(onClick = onPauseToggle, modifier = Modifier.weight(1f)) {
            Icon(if (paused) Icons.Default.PlayArrow else Icons.Default.Pause, contentDescription = null)
            Text(if (paused) " Resume" else " Pause", modifier = Modifier.padding(start = 4.dp))
        }
        Button(
            onClick = onStop,
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error),
        ) {
            Icon(Icons.Default.Stop, contentDescription = null)
            Text(" Stop", modifier = Modifier.padding(start = 4.dp))
        }
    }
}

fun intervalPaceSecPerKm(live: TrackingUiState): Double? {
    val segDist = live.segmentDistanceM ?: return null
    val segElapsed = live.segmentElapsedMs ?: return null
    if (segDist < 10 || segElapsed <= 0) return null
    return segElapsed / 1000.0 / (segDist / 1000.0)
}

fun avgPaceSecPerKm(live: TrackingUiState): Double? {
    if (live.distanceM < 10 || live.elapsedMs <= 0) return null
    return live.elapsedMs / 1000.0 / (live.distanceM / 1000.0)
}
