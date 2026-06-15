package com.example.rungps.ui.main

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.feature.run.RunRow
import com.example.rungps.feature.run.RunsViewModel

@Composable
fun HistoryTabContent(
    runsViewModel: RunsViewModel,
    onSelectRun: (Long) -> Unit,
    onImportStrava: () -> Unit = {},
    stravaImporting: Boolean = false,
    modifier: Modifier = Modifier,
) {
    val runs by runsViewModel.runs.collectAsState()

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        TabHeroHeader(
            title = "History",
            subtitle = "Past runs, splits, Strava PB import",
        )

        TabSectionCard(title = "All runs (${runs.size})") {
            if (runs.isEmpty()) {
                Text("No recorded runs yet.", style = MaterialTheme.typography.bodyMedium)
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(runs, key = { it.id }) { row ->
                        HistoryRunRow(row = row, onOpen = { onSelectRun(row.id) })
                    }
                }
            }
        }

        TabSectionCard(title = "Imports") {
            androidx.compose.material3.Button(
                onClick = onImportStrava,
                enabled = !stravaImporting,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(if (stravaImporting) "Importing Strava…" else "Import Strava history (90d)")
            }
            Text("Syncs activities and personal bests to Firestore.", style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
private fun HistoryRunRow(row: RunRow, onOpen: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(row.activityType, style = MaterialTheme.typography.titleSmall)
            Text(formatDistanceKm(row.distanceM), style = MaterialTheme.typography.bodyMedium)
            Text(formatElapsed(row.durationMs), style = MaterialTheme.typography.bodySmall)
        }
        FilterChip(selected = false, onClick = onOpen, label = { Text("Open") })
    }
}
