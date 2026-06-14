package com.exercisetracker.app.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.exercisetracker.app.domain.muscle.MuscleDefinition
import com.exercisetracker.app.domain.muscle.MuscleLoad
import com.exercisetracker.app.domain.muscle.MuscleTaxonomy
import com.exercisetracker.app.domain.muscle.PatternTemplate

@Composable
fun MuscleMappingDialog(
    exerciseName: String,
    taxonomy: MuscleTaxonomy,
    onDismiss: () -> Unit,
    onConfirm: (List<MuscleLoad>) -> Unit,
    onApplyTemplate: (String) -> Unit,
) {
    val selectedPercents = remember { mutableStateMapOf<String, Int>() }
    var searchQuery by remember { mutableStateOf("") }

    val filteredMuscles = taxonomy.muscles.filter { muscle ->
        searchQuery.isBlank() ||
            muscle.label.contains(searchQuery, ignoreCase = true) ||
            muscle.id.contains(searchQuery, ignoreCase = true)
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Map muscles for \"$exerciseName\"") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    "No match in exercise database. Pick muscles or use a pattern template.",
                    style = MaterialTheme.typography.bodySmall,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    taxonomy.patternTemplates.forEach { template ->
                        AssistChip(
                            onClick = {
                                selectedPercents.clear()
                                template.loads.forEach { load ->
                                    selectedPercents[load.muscleId] = load.percent
                                }
                                onApplyTemplate(template.id)
                            },
                            label = { Text(template.label, maxLines = 1) },
                        )
                    }
                }
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    items(filteredMuscles.take(12), key = { it.id }) { muscle ->
                        MuscleSliderRow(
                            muscle = muscle,
                            percent = selectedPercents[muscle.id] ?: 0,
                            onPercentChange = { value ->
                                if (value <= 0) selectedPercents.remove(muscle.id)
                                else selectedPercents[muscle.id] = value
                            },
                        )
                    }
                }
                val total = selectedPercents.values.sum()
                Text("Total: $total%", style = MaterialTheme.typography.labelMedium)
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val loads = selectedPercents.map { (muscleId, percent) ->
                        MuscleLoad(muscleId, percent)
                    }
                    onConfirm(loads)
                },
                enabled = selectedPercents.isNotEmpty(),
            ) {
                Text("Save mapping")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Cancel") }
        },
    )
}

@Composable
private fun MuscleSliderRow(
    muscle: MuscleDefinition,
    percent: Int,
    onPercentChange: (Int) -> Unit,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(muscle.label, style = MaterialTheme.typography.bodySmall)
            Text("$percent%", style = MaterialTheme.typography.labelSmall)
        }
        Slider(
            value = percent.toFloat(),
            onValueChange = { onPercentChange(it.toInt()) },
            valueRange = 0f..100f,
            steps = 19,
        )
    }
}

@Composable
fun MuscleVolumeChips(
    entries: List<com.exercisetracker.app.domain.muscle.MuscleVolumeEntry>,
    modifier: Modifier = Modifier,
    maxItems: Int = 6,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        entries.take(maxItems).forEach { entry ->
            AssistChip(
                onClick = {},
                label = {
                    Text("${entry.label.take(18)}: ${entry.volume.toInt()} kg")
                },
            )
        }
    }
}

@Composable
fun PatternTemplateChips(
    templates: List<PatternTemplate>,
    onSelect: (PatternTemplate) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        templates.forEach { template ->
            FilterChip(
                selected = false,
                onClick = { onSelect(template) },
                label = { Text(template.label) },
            )
        }
    }
}
