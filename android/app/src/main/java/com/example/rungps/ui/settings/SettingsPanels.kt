package com.example.rungps.ui.settings

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.rungps.diagnostics.DiagnosticsExporter
import com.example.rungps.export.GymTrainingLogPdf
import com.example.rungps.export.RunExportHelper
import com.example.rungps.health.SamsungHealthManager
import com.example.rungps.sync.CloudSyncManager
import com.example.rungps.sync.ConflictDetector
import com.example.rungps.sync.GymConflict
import com.example.rungps.sync.ShareLinkRepository
import kotlinx.coroutines.launch

@Composable
fun CloudBackupPanel(modifier: Modifier = Modifier, onStatus: (String) -> Unit = {}) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var status by remember { mutableStateOf<String?>(null) }
    Column(modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Cloud backup", style = MaterialTheme.typography.titleMedium)
        Text("Explicit backup/restore via Firestore sync.", style = MaterialTheme.typography.bodySmall)
        Button(onClick = {
            scope.launch {
                val result = CloudSyncManager.syncAll(context)
                val msg = if (result.ok) "Backup complete (${result.totalPulled} items)" else "Failed: ${result.errors.joinToString()}"
                status = msg
                onStatus(msg)
            }
        }) { Text("Backup now") }
        Button(onClick = {
            scope.launch {
                val result = CloudSyncManager.syncAll(context)
                val msg = if (result.ok) "Restore complete (${result.totalPulled} items)" else "Failed: ${result.errors.joinToString()}"
                status = msg
                onStatus(msg)
            }
        }) { Text("Restore from cloud") }
        status?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
    }
}

@Composable
fun DiagnosticsPanel(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var status by remember { mutableStateOf<String?>(null) }
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Diagnostics", style = MaterialTheme.typography.titleMedium)
            Text("Export anonymized bundle for support.", style = MaterialTheme.typography.bodySmall)
            Button(onClick = {
                scope.launch {
                    val file = DiagnosticsExporter.exportAnonymizedBundle(context)
                    status = "Exported ${file.name} (${file.length() / 1024} KB)"
                }
            }) { Text("Export diagnostics") }
            status?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
        }
    }
}

@Composable
fun ConflictResolutionPanel(
    conflicts: List<GymConflict>,
    onMergeLocal: (Long) -> Unit,
    onMergeRemote: (Long) -> Unit,
    modifier: Modifier = Modifier,
) {
    if (conflicts.isEmpty()) return
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Sync conflicts", style = MaterialTheme.typography.titleMedium)
            conflicts.forEach { conflict ->
                Text(
                    "Gym session ${conflict.sessionId} — local vs cloud",
                    style = MaterialTheme.typography.bodySmall,
                )
                Button(onClick = { onMergeLocal(conflict.sessionId) }) {
                    Text("Keep this device (#${conflict.sessionId})")
                }
                Button(onClick = { onMergeRemote(conflict.sessionId) }) {
                    Text("Use cloud (#${conflict.sessionId})")
                }
            }
        }
    }
}

@Composable
fun HealthConnectDashboard(
    readStatus: Map<String, Boolean>,
    writeStatus: Map<String, Boolean>,
    onReconcile: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text("Health Connect writeback", style = MaterialTheme.typography.titleMedium)
            readStatus.forEach { (type, ok) ->
                Text("Read $type: ${if (ok) "✓" else "—"}", style = MaterialTheme.typography.bodySmall)
            }
            writeStatus.forEach { (type, ok) ->
                Text("Write $type: ${if (ok) "✓" else "—"}", style = MaterialTheme.typography.bodySmall)
            }
            Button(onClick = onReconcile) { Text("Reconcile now") }
        }
    }
}

@Composable
fun ShareLinkPanel(
    shareUrl: String?,
    onCreateLink: () -> Unit,
    onShare: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Selective sharing", style = MaterialTheme.typography.titleMedium)
            Text("Share a run or gym week via Firestore link.", style = MaterialTheme.typography.bodySmall)
            Button(onClick = onCreateLink) { Text("Create share link") }
            shareUrl?.let { url ->
                Text(url, style = MaterialTheme.typography.bodySmall)
                Button(onClick = { onShare(url) }) { Text("Share link") }
            }
        }
    }
}

@Composable
fun TrainingLogPdfPanel(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var status by remember { mutableStateOf<String?>(null) }
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("PDF training log", style = MaterialTheme.typography.titleMedium)
            Text("Monthly gym + run summary.", style = MaterialTheme.typography.bodySmall)
            Button(onClick = {
                scope.launch {
                    GymTrainingLogPdf.exportMonthlyLog(context).fold(
                        onSuccess = { file ->
                            status = "Created ${file.name}"
                            RunExportHelper.shareFile(context, file, "application/pdf")
                        },
                        onFailure = { status = it.message ?: "Export failed" },
                    )
                }
            }) { Text("Export monthly PDF") }
            status?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
        }
    }
}

@Composable
fun SamsungHealthPanel(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val samsung = remember { SamsungHealthManager(context) }
    val reachable = remember { samsung.isSamsungHealthReachable() }
    IntegrationSettingsPanel(
        stravaLinked = false,
        samsungHealthReachable = reachable,
        healthConnectReady = true,
        modifier = modifier,
    )
}

@Composable
fun ConnectedSettingsSection(onMessage: (String) -> Unit = {}) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var shareUrl by remember { mutableStateOf<String?>(null) }
    var conflicts by remember { mutableStateOf<List<GymConflict>>(emptyList()) }

    ShareLinkPanel(
        shareUrl = shareUrl,
        onCreateLink = {
            scope.launch {
                ShareLinkRepository.createShareLink(context).fold(
                    onSuccess = { url -> shareUrl = url },
                    onFailure = { onMessage(it.message ?: "Share link failed") },
                )
            }
        },
        onShare = { url ->
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, url)
            }
            context.startActivity(Intent.createChooser(intent, "Share training link"))
        },
    )
    ConflictResolutionPanel(
        conflicts = conflicts,
        onMergeLocal = { id ->
            scope.launch {
                ConflictDetector.mergeKeepLocal(context, id)
                conflicts = ConflictDetector.detectGymConflicts(context)
                onMessage("Kept local version for session $id")
            }
        },
        onMergeRemote = { id ->
            scope.launch {
                ConflictDetector.mergeKeepRemote(context, id)
                conflicts = ConflictDetector.detectGymConflicts(context)
                onMessage("Applied cloud version for session $id")
            }
        },
    )
    androidx.compose.runtime.LaunchedEffect(Unit) {
        conflicts = ConflictDetector.detectGymConflicts(context)
    }
    TrainingLogPdfPanel()
    SamsungHealthPanel()
}
