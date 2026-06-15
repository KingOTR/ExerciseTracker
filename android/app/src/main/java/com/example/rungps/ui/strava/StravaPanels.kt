package com.example.rungps.ui.strava

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.strava.StravaPbRecord
import com.example.rungps.ui.main.TabSectionCard
import com.example.rungps.ui.main.formatElapsed

@Composable
fun StravaPbPanel(
    records: List<StravaPbRecord>,
    modifier: Modifier = Modifier,
) {
    TabSectionCard(title = "Strava personal bests", modifier = modifier) {
        if (records.isEmpty()) {
            Text("Import Strava history to populate PB table.", style = MaterialTheme.typography.bodySmall)
            return@TabSectionCard
        }
        LazyColumn(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            items(records, key = { "${it.activityKind}_${it.label}" }) { pb ->
                Column(Modifier.fillMaxWidth().padding(vertical = 2.dp)) {
                    Text("${pb.label} (${pb.activityKind})", style = MaterialTheme.typography.titleSmall)
                    Text(
                        "${formatElapsed(pb.timeSec * 1000L)} · ${pb.activityName ?: "Activity ${pb.stravaActivityId}"}",
                        style = MaterialTheme.typography.bodySmall,
                    )
                }
            }
        }
    }
}

@Composable
fun StravaLinkStatusPanel(
    linked: Boolean,
    athleteHint: String?,
    modifier: Modifier = Modifier,
) {
    TabSectionCard(title = "Strava", modifier = modifier) {
        Text(
            if (linked) "Connected${athleteHint?.let { " · $it" } ?: ""}" else "Not connected — use OAuth deep link",
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}
