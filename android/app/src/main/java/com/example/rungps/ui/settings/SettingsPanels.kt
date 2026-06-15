package com.example.rungps.ui.settings

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
import com.example.rungps.sync.CloudSyncManager
import kotlinx.coroutines.launch

@Composable
fun CloudBackupPanel(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var status by remember { mutableStateOf<String?>(null) }
    Column(modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Cloud backup", style = MaterialTheme.typography.titleMedium)
        Text("Explicit backup/restore via Firestore sync.", style = MaterialTheme.typography.bodySmall)
        Button(onClick = {
            scope.launch {
                val result = CloudSyncManager.syncAll(context)
                status = if (result.ok) "Backup complete (${result.totalPulled} items)" else "Failed: ${result.errors.joinToString()}"
            }
        }) { Text("Backup now") }
        Button(onClick = {
            scope.launch {
                val result = CloudSyncManager.syncAll(context)
                status = if (result.ok) "Restore complete (${result.totalPulled} items)" else "Failed: ${result.errors.joinToString()}"
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
    conflicts: List<String>,
    onMergeLocal: () -> Unit,
    onMergeRemote: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (conflicts.isEmpty()) return
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Sync conflicts", style = MaterialTheme.typography.titleMedium)
            conflicts.forEach { Text("• $it", style = MaterialTheme.typography.bodySmall) }
            Button(onClick = onMergeLocal) { Text("Keep this device") }
            Button(onClick = onMergeRemote) { Text("Use cloud version") }
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
    modifier: Modifier = Modifier,
) {
    Card(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Selective sharing", style = MaterialTheme.typography.titleMedium)
            Text("Share a run or gym week via Firestore link.", style = MaterialTheme.typography.bodySmall)
            Button(onClick = onCreateLink) { Text("Create share link") }
            shareUrl?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
        }
    }
}
