package com.example.rungps.ui.main

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.feature.run.RunRow
import com.example.rungps.feature.run.RunsViewModel
import com.example.rungps.health.HealthConnectManager
import com.example.rungps.tracking.TrackingService
import com.example.rungps.tracking.TrackingUiState

@Composable
fun RunTabContent(
    runsViewModel: RunsViewModel,
    live: TrackingUiState,
    routes: List<RouteEntity>,
    selectedRunId: Long?,
    onCloseRun: () -> Unit,
    onSelectRun: (Long) -> Unit,
    onStart: () -> Unit,
    onStop: () -> Unit,
    onGoTab: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val runs by runsViewModel.runs.collectAsState()
    val hc = HealthConnectManager(context)

    if (selectedRunId != null && !live.isRecording) {
        RunDetailsCard(
            runId = selectedRunId,
            runs = runs,
            onClose = onCloseRun,
            modifier = modifier,
        )
        return
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        if (!live.isRecording) {
            TabHeroHeader(
                title = "Run",
                subtitle = "GPS run & ride recording",
            )
        }

        if (live.isRecording) {
            ActiveRecordingPane(
                live = live,
                onTogglePause = {
                    context.startService(
                        Intent(context, TrackingService::class.java).setAction(TrackingService.ACTION_TOGGLE_PAUSE),
                    )
                },
                onStop = onStop,
            )
        } else {
            HealthConnectBanner(hc = hc)

            TabSectionCard(title = "Quick start") {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = onStart) { Text("Start run") }
                    OutlinedButton(onClick = { onGoTab("map") }) { Text("Map") }
                }
                if (routes.isNotEmpty()) {
                    Text(
                        "Saved routes: ${routes.size}",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 8.dp),
                    )
                }
            }

            TabSectionCard(title = "Recent runs") {
                if (runs.isEmpty()) {
                    Text("No runs yet — tap Start run to record.", style = MaterialTheme.typography.bodyMedium)
                } else {
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        items(runs.take(8), key = { it.id }) { row ->
                            RunListRow(row = row, onClick = { onSelectRun(row.id) })
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun HealthConnectBanner(hc: HealthConnectManager) {
    val status = hc.statusMessage()
    TabSectionCard(title = "Health Connect") {
        Text(status, style = MaterialTheme.typography.bodySmall)
        Text(
            "Enable auto-backup in Settings to sync runs and sleep.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

@Composable
fun ActiveRecordingPane(
    live: TrackingUiState,
    onTogglePause: () -> Unit,
    onStop: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val paceSec = if (live.distanceM > 0) live.elapsedMs / 1000.0 / (live.distanceM / 1000.0) else 0.0
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Recording", style = MaterialTheme.typography.headlineMedium)
        Text(formatElapsed(live.elapsedMs), style = MaterialTheme.typography.displaySmall)
        Text(formatDistanceKm(live.distanceM), style = MaterialTheme.typography.titleLarge)
        Text(formatPace(paceSec), style = MaterialTheme.typography.bodyLarge)
        Text(formatSteps(live.steps), style = MaterialTheme.typography.bodyMedium)
        live.segmentLabel?.let {
            Text(it, style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.primary)
        }
        if (live.isPaused || live.isAutoPaused) {
            Text("Paused", style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.error)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = onTogglePause) {
                Text(if (live.isPaused) "Resume" else "Pause")
            }
            Button(onClick = onStop) { Text("Stop") }
        }
    }
}

@Composable
fun RunListRow(row: RunRow, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(row.activityType, style = MaterialTheme.typography.titleSmall)
            Text(formatDistanceKm(row.distanceM), style = MaterialTheme.typography.bodyMedium)
        }
        FilterChip(selected = false, onClick = onClick, label = { Text("View") })
    }
}

@Composable
fun RunDetailsCard(
    runId: Long,
    runs: List<RunRow>,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val row = runs.firstOrNull { it.id == runId }
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        TabHeroHeader(title = "Run details", subtitle = row?.activityType ?: "Run #$runId")
        if (row != null) {
            Text(formatDistanceKm(row.distanceM), style = MaterialTheme.typography.headlineSmall)
            Text(formatElapsed(row.durationMs), style = MaterialTheme.typography.titleMedium)
        }
        OutlinedButton(onClick = onClose) { Text("Close") }
    }
}
