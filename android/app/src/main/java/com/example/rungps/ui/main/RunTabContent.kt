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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.rungps.ble.BleClient
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.feature.run.RunsViewModel
import com.example.rungps.health.HealthConnectManager
import androidx.compose.runtime.rememberCoroutineScope
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repo.SleepRepository
import com.example.rungps.export.RunExportHelper
import com.example.rungps.tracking.TrackingService
import com.example.rungps.tracking.TrackingUiState
import com.example.rungps.sleep.SleepConsistencyScorer
import com.example.rungps.sleep.SleepDebtTracker
import com.example.rungps.ui.components.TabEmptyState
import kotlinx.coroutines.launch

@Composable
fun RunTabContent(
    runsViewModel: RunsViewModel,
    live: TrackingUiState,
    routes: List<RouteEntity>,
    selectedRunId: Long?,
    bleClient: BleClient,
    onCloseRun: () -> Unit,
    onSelectRun: (Long) -> Unit,
    onStart: () -> Unit,
    onStop: () -> Unit,
    onGoTab: (String) -> Unit,
    onUploadStrava: (Long) -> Unit,
    onShareOnPhoto: (Long) -> Unit = {},
    stravaUploading: Boolean = false,
    syncingMoyoung: Boolean = false,
    onSyncMoyoung: () -> Unit = {},
    followRouteId: Long? = null,
    followRouteName: String? = null,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val runs by runsViewModel.runs.collectAsState()
    val sleepRepo = remember { SleepRepository(ExerciseTrackerDatabase.get(context).sleepDao()) }
    val sleepEntries by sleepRepo.observeEntries().collectAsState(initial = emptyList())
    val debtSnapshot = remember(sleepEntries) { SleepDebtTracker.analyze(sleepEntries) }
    val consistency = remember(sleepEntries) { SleepConsistencyScorer.score(sleepEntries) }
    val hc = HealthConnectManager(context)
    val bleStatus by bleClient.status.collectAsState()
    val hrBpm = live.hrBpm ?: bleStatus.latestHrBpm
    val hrZone = hrBpm?.let { HrZoneHelper.zoneLabel(it) }

    if (selectedRunId != null && !live.isRecording) {
        RunDetailsPanel(
            runId = selectedRunId,
            onClose = onCloseRun,
            onExport = { runId ->
                scope.launch {
                    RunExportHelper.exportGpx(context, runId)
                        .onSuccess { RunExportHelper.shareFile(context, it, "application/gpx+xml") }
                }
            },
            onShareOnPhoto = { onShareOnPhoto(selectedRunId) },
            onUploadStrava = onUploadStrava,
            vm = runsViewModel,
            stravaUploading = stravaUploading,
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
                followRouteId = followRouteId,
                followRouteName = followRouteName,
                onPauseToggle = {
                    context.startService(
                        Intent(context, TrackingService::class.java).setAction(TrackingService.ACTION_TOGGLE_PAUSE),
                    )
                },
                onStop = onStop,
                hrBpm = hrBpm,
                hrZoneLabel = hrZone,
            )
        } else {
            HealthConnectBanner(hc = hc)
            if (sleepEntries.isNotEmpty()) {
                SleepDebtHomeCard(debt = debtSnapshot, onOpenSleep = { onGoTab("sleep") })
                SleepRhythmHomeCard(
                    consistencyScore = consistency.score,
                    summary = consistency.summary,
                    onOpenSleep = { onGoTab("sleep") },
                )
                SleepGymNudgeCard(debtHours = debtSnapshot.debtHours, onOpenGym = { onGoTab("gym") })
            }
            BleWatchPanel(
                bleClient = bleClient,
                syncingMoyoung = syncingMoyoung,
                onSyncMoyoung = onSyncMoyoung,
            )

            TabSectionCard(title = "Quick start") {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = onStart) { Text("Start run") }
                    OutlinedButton(onClick = { onGoTab("map") }) { Text("Map") }
                }
                RecordingHudFieldSettings(modifier = Modifier.padding(top = 8.dp))
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
                    TabEmptyState(
                        title = "No runs yet",
                        message = "Start your first GPS run to see distance, pace, and splits here.",
                        actionLabel = "Start run",
                        onAction = onStart,
                    )
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
fun RunListRow(row: com.example.rungps.feature.run.RunRow, onClick: () -> Unit, modifier: Modifier = Modifier) {
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
