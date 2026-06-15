package com.example.rungps.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import com.example.rungps.ble.BleClient
import com.example.rungps.ble.BleStatus

@Composable
fun BleWatchPanel(
    bleClient: BleClient,
    modifier: Modifier = Modifier,
    syncingMoyoung: Boolean = false,
    onSyncMoyoung: () -> Unit = {},
) {
    val status by bleClient.status.collectAsState()

    TabSectionCard(title = "BLE watch / HR strap", modifier = modifier) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(bleSummary(status), style = MaterialTheme.typography.bodySmall)
            status.latestHrBpm?.let { bpm ->
                val zone = HrZoneHelper.zoneLabel(bpm)
                Text("Live HR: $bpm bpm · $zone", style = MaterialTheme.typography.titleSmall)
            }
            status.lastError?.let {
                Text(it, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedButton(onClick = { bleClient.startScan() }, enabled = !status.scanning) {
                    Text(if (status.scanning) "Scanning…" else "Scan")
                }
                if (status.connectedAddress != null) {
                    OutlinedButton(onClick = { bleClient.disconnect() }) { Text("Disconnect") }
                }
            }
            if (status.devices.isNotEmpty()) {
                LazyColumn(
                    modifier = Modifier.fillMaxWidth().padding(top = 4.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    items(status.devices.take(5), key = { it.address }) { device ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Column(Modifier.weight(1f)) {
                                Text(device.name ?: "Unknown", style = MaterialTheme.typography.bodyMedium)
                                Text(device.address, style = MaterialTheme.typography.labelSmall)
                            }
                            FilterChip(
                                selected = status.connectedAddress == device.address,
                                onClick = { bleClient.connect(device.address) },
                                label = { Text("Connect") },
                            )
                        }
                    }
                }
            }
            if (status.hasMoyoungService) {
                Text("Moyoung watch detected", style = MaterialTheme.typography.labelMedium)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = { bleClient.testHeartRate() },
                    enabled = status.connectedAddress != null && !status.hrTestRunning,
                ) {
                    Text(if (status.hrTestRunning) "Testing HR…" else "Test HR")
                }
                if (status.hasMoyoungService && status.connectedAddress != null) {
                    OutlinedButton(onClick = onSyncMoyoung) {
                        Text(if (syncingMoyoung) "Syncing…" else "Sync workouts")
                    }
                }
            }
        }
    }
}

private fun bleSummary(status: BleStatus): String {
    val parts = mutableListOf<String>()
    parts += if (status.enabled) "Bluetooth on" else "Bluetooth off"
    status.connectedAddress?.let { parts += "Connected" }
    status.connectingTo?.let { parts += "Connecting…" }
    if (status.hasHeartRateService) parts += "HR service"
    if (status.hasMoyoungService) parts += "Moyoung"
    return parts.joinToString(" · ")
}
