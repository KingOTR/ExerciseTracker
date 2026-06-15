package com.example.rungps.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rungps.ui.settings.CloudBackupPanel
import com.example.rungps.ui.settings.DiagnosticsPanel
import com.example.rungps.ui.settings.HealthConnectDashboard
import com.example.rungps.ui.viewmodel.RecoveryViewModel

@Composable
fun RecoveryScreen(
    viewModel: RecoveryViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsState()
    var stepsText by remember(uiState.dailySteps) { mutableStateOf(uiState.dailySteps.toString()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Recovery", style = MaterialTheme.typography.headlineMedium)
        Text(
            "Muscle-specific fatigue from gym, runs, cycling, soccer, and daily steps.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SummaryCard(
                label = "Lower body",
                value = uiState.lowerBodyLoad,
                modifier = Modifier.weight(1f),
            )
            SummaryCard(
                label = "Upper body",
                value = uiState.upperBodyLoad,
                modifier = Modifier.weight(1f),
            )
            SummaryCard(
                label = "Cardio load",
                value = uiState.cardioLoad,
                modifier = Modifier.weight(1f),
            )
        }

        OutlinedTextField(
            value = stepsText,
            onValueChange = {
                stepsText = it.filter { ch -> ch.isDigit() }
                stepsText.toIntOrNull()?.let(viewModel::setDailySteps)
            },
            label = { Text("Today's steps") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
        )

        Text("Muscle fatigue (7-day window)", style = MaterialTheme.typography.titleMedium)
        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(uiState.scores, key = { it.muscleId }) { score ->
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column {
                            Text(score.label, style = MaterialTheme.typography.bodyMedium)
                            Text(
                                "${score.regionId} · gym ${score.gymLoad.toInt()} + cardio ${score.cardioLoad.toInt()}",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                        Text(
                            "${score.fatiguePercent.toInt()}%",
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                    LinearProgressIndicator(
                        progress = { (score.fatiguePercent / 100.0).toFloat().coerceIn(0f, 1f) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                    )
                }
            }
        }

        CloudBackupPanel()
        DiagnosticsPanel()
        HealthConnectDashboard(
            readStatus = mapOf("Sleep" to true, "Steps" to true, "Exercise" to true),
            writeStatus = mapOf("Sleep" to true, "Exercise" to false),
            onReconcile = { },
        )
    }
}

@Composable
private fun SummaryCard(
    label: String,
    value: Double,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(label, style = MaterialTheme.typography.labelMedium)
            Text(
                value.toInt().toString(),
                style = MaterialTheme.typography.titleLarge,
            )
        }
    }
}
