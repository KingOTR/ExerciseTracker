package com.example.rungps.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.example.rungps.sleep.SleepConsistencyScorer
import com.example.rungps.sleep.SleepDebtTracker

@Composable
fun SleepRhythmHomeCard(
    consistencyScore: Int,
    summary: String,
    onOpenSleep: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.fillMaxWidth().semantics { contentDescription = "Sleep rhythm card" },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
    ) {
        Column(Modifier.padding(12.dp)) {
            Text("Sleep rhythm", style = MaterialTheme.typography.titleSmall)
            Text("Consistency $consistencyScore/100", style = MaterialTheme.typography.bodyMedium)
            Text(summary, style = MaterialTheme.typography.bodySmall)
            TextButton(onClick = onOpenSleep) { Text("Open sleep tab") }
        }
    }
}

@Composable
fun SleepDebtHomeCard(
    debt: SleepDebtTracker.Snapshot,
    onOpenSleep: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.fillMaxWidth().semantics { contentDescription = "Sleep debt card" },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer),
    ) {
        Column(Modifier.padding(12.dp)) {
            Text("Sleep debt", style = MaterialTheme.typography.titleSmall)
            Text(debt.summary, style = MaterialTheme.typography.bodyMedium)
            debt.suggestedBedtimeLabel?.let {
                Text("Suggested bedtime: $it", style = MaterialTheme.typography.bodySmall)
            }
            TextButton(onClick = onOpenSleep) { Text("View sleep") }
        }
    }
}

@Composable
fun SleepGymNudgeCard(
    debtHours: Double,
    onOpenGym: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (debtHours < 2.0) return
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
    ) {
        Column(Modifier.padding(12.dp)) {
            Text("Recovery nudge", style = MaterialTheme.typography.titleSmall)
            Text(
                "Sleep debt is elevated — consider lighter gym volume today.",
                style = MaterialTheme.typography.bodySmall,
            )
            TextButton(onClick = onOpenGym) { Text("Open gym") }
        }
    }
}
