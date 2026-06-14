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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.MuscleRepository
import com.example.rungps.ui.components.MuscleMappingDialog
import com.example.rungps.ui.components.MuscleVolumeChips
import com.example.rungps.ui.viewmodel.GymViewModel

@Composable
fun GymScreen(
    viewModel: GymViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    val taxonomy = remember {
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        MuscleRepository(context, dao).taxonomy
    }

    var exerciseName by remember { mutableStateOf("") }
    var repsText by remember { mutableStateOf("10") }
    var weightText by remember { mutableStateOf("") }
  var pendingReps by remember { mutableStateOf(10) }
    var pendingWeight by remember { mutableStateOf<Double?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Gym", style = MaterialTheme.typography.headlineMedium)
        Text(
            "Log sets — muscle load is applied automatically from the exercise database.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        OutlinedTextField(
            value = exerciseName,
            onValueChange = { exerciseName = it },
            label = { Text("Exercise") },
            placeholder = { Text("e.g. Bench Press, Lat Pulldown") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
        )
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = repsText,
                onValueChange = { repsText = it.filter { ch -> ch.isDigit() } },
                label = { Text("Reps") },
                modifier = Modifier.weight(1f),
                singleLine = true,
            )
            OutlinedTextField(
                value = weightText,
                onValueChange = { weightText = it.filter { ch -> ch.isDigit() || ch == '.' } },
                label = { Text("Weight (kg)") },
                modifier = Modifier.weight(1f),
                singleLine = true,
            )
        }
        TextButton(
            onClick = {
                val reps = repsText.toIntOrNull() ?: return@TextButton
                val weight = weightText.toDoubleOrNull()
                pendingReps = reps
                pendingWeight = weight
                viewModel.logSet(exerciseName, reps, weight)
            },
            enabled = exerciseName.isNotBlank(),
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("Log set")
        }

        uiState.lastBreakdown?.let { breakdown ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
            ) {
                Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(
                        "Last set: ${breakdown.exerciseName} (${breakdown.setVolume.toInt()} kg volume)",
                        style = MaterialTheme.typography.titleSmall,
                    )
                    MuscleVolumeChips(entries = breakdown.entries)
                }
            }
        }

        if (uiState.sessionVolumes.isNotEmpty()) {
            Text("Session muscle volume", style = MaterialTheme.typography.titleMedium)
            val maxVolume = uiState.sessionVolumes.maxOfOrNull { it.volume } ?: 1.0
            uiState.sessionVolumes.take(8).forEach { entry ->
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(entry.label, style = MaterialTheme.typography.bodySmall)
                        Text("${entry.volume.toInt()} kg", style = MaterialTheme.typography.labelSmall)
                    }
                    LinearProgressIndicator(
                        progress = { (entry.volume / maxVolume).toFloat().coerceIn(0f, 1f) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 2.dp),
                    )
                }
            }
        }

        HorizontalDivider()
        Text("Logged sets (${uiState.sets.size})", style = MaterialTheme.typography.titleSmall)
        LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            items(uiState.sets, key = { it.rowId }) { set ->
                Text(
                    "${set.setIndex}. ${set.exerciseName} — ${set.reps ?: 0} × ${set.weightKg ?: "-"} kg",
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
    }

    uiState.pendingExerciseName?.let { pendingName ->
        MuscleMappingDialog(
            exerciseName = pendingName,
            taxonomy = taxonomy,
            onDismiss = viewModel::dismissMappingDialog,
            onConfirm = { loads ->
                viewModel.saveExerciseMapping(pendingName, loads, pendingReps, pendingWeight)
            },
            onApplyTemplate = { templateId ->
                viewModel.applyTemplate(pendingName, templateId, pendingReps, pendingWeight)
            },
        )
    }
}
