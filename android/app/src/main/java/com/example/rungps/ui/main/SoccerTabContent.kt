package com.example.rungps.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.data.entity.SoccerSessionEntity
import kotlinx.coroutines.flow.Flow

@Composable
fun SoccerTabContent(
    sessionsFlow: Flow<List<SoccerSessionEntity>>,
    modifier: Modifier = Modifier,
) {
    val sessions by sessionsFlow.collectAsState(initial = emptyList())

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        TabHeroHeader(
            title = "Soccer",
            subtitle = "Matches, training, watch sync",
        )

        TabSectionCard(title = "Sessions (${sessions.size})") {
            if (sessions.isEmpty()) {
                Text(
                    "No soccer sessions logged. Record a match or training from your watch.",
                    style = MaterialTheme.typography.bodyMedium,
                )
            } else {
                sessions.take(10).forEach { session ->
                    Text(
                        "${session.kind} · ${session.playMin} min",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(vertical = 4.dp),
                    )
                }
            }
        }

        TabSectionCard(title = "Watch sync") {
            Text("BLE watch soccer mode sync — partial port.", style = MaterialTheme.typography.bodySmall)
        }
    }
}
