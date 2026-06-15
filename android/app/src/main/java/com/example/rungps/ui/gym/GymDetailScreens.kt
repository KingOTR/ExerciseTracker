package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.domain.muscle.MuscleTaxonomy
import com.example.rungps.domain.muscle.MuscleVolumeEntry

@Composable
fun MuscleDetailScreen(
    muscleId: String,
    taxonomy: MuscleTaxonomy,
    recentVolume: List<MuscleVolumeEntry>,
    onDismiss: () -> Unit,
) {
    val muscle = taxonomy.muscles.firstOrNull { it.id == muscleId }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(muscle?.label ?: muscleId) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                muscle?.let {
                    Text("Group: ${it.groupId}", style = MaterialTheme.typography.bodySmall)
                    Text("Region: ${it.regionId}", style = MaterialTheme.typography.bodySmall)
                }
                Text("Recent session volume", style = MaterialTheme.typography.labelLarge)
                if (recentVolume.isEmpty()) {
                    Text("No recent sets mapped to this muscle.", style = MaterialTheme.typography.bodySmall)
                } else {
                    recentVolume.take(6).forEach { entry ->
                        Text("${entry.label}: ${entry.volume.toInt()} kg", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text("Close") } },
    )
}

@Composable
fun ExerciseHistorySheet(
    exerciseName: String,
    rows: List<Triple<Int, Int?, Double?>>,
    onDismiss: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("$exerciseName history") },
        text = {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(rows, key = { it.first }) { (idx, reps, weight) ->
                    GymSetEntryRow(idx, exerciseName, reps, weight)
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text("Close") } },
    )
}
