package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GymSetEntryRow(
    index: Int,
    exerciseName: String,
    reps: Int?,
    weightKg: Double?,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text("$index. $exerciseName", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.weight(1f))
        Text(
            "${reps ?: 0} × ${weightKg?.let { "%.1f".format(it) } ?: "-"} kg",
            style = MaterialTheme.typography.labelMedium,
        )
    }
}

@Composable
fun GymSessionHeader(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.fillMaxWidth().padding(bottom = 8.dp), verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(title, style = MaterialTheme.typography.titleMedium)
        Text(subtitle, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
fun GymProgressiveOverloadHint(
    exerciseName: String,
    lastWeightKg: Double?,
    suggestedKg: Double?,
    modifier: Modifier = Modifier,
) {
    if (lastWeightKg == null && suggestedKg == null) return
    Column(modifier = modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text("Progressive overload — $exerciseName", style = MaterialTheme.typography.labelLarge)
        Text(
            buildString {
                lastWeightKg?.let { append("Last: ${"%.1f".format(it)} kg") }
                if (lastWeightKg != null && suggestedKg != null) append(" · ")
                suggestedKg?.let { append("Try: ${"%.1f".format(it)} kg") }
            },
            style = MaterialTheme.typography.bodySmall,
        )
    }
}
