package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.gym.GymPulleyConfig
import com.example.rungps.gym.GymPulleySelection
import com.example.rungps.gym.GymPulleyStore

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun GymPulleyPanel(
    selected: GymPulleySelection,
    onSelect: (GymPulleySelection) -> Unit,
    pinKgPreview: Double? = null,
    modifier: Modifier = Modifier,
    visible: Boolean = true,
) {
    if (!visible) return
    Column(modifier = modifier.fillMaxWidth().padding(vertical = 4.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
        Text("Cable pulley", style = MaterialTheme.typography.titleSmall)
        Text(selected.label(), style = MaterialTheme.typography.bodyMedium)
        pinKgPreview?.let {
            val effective = GymPulleyStore.pinKgPreview(it, selected)
            if (effective != null) {
                Text("Effective load: %.1f kg".format(effective), style = MaterialTheme.typography.bodySmall)
            }
        }
        FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            GymPulleyStore.allConfigs().forEach { config ->
                val active = config in selected.configs
                FilterChip(
                    selected = active,
                    onClick = {
                        val next = if (active) {
                            val remaining = selected.configs - config
                            if (remaining.isEmpty()) GymPulleySelection.NONE else GymPulleySelection(remaining)
                        } else {
                            val withoutNone = selected.configs - GymPulleyConfig.NONE
                            GymPulleySelection(withoutNone + config)
                        }
                        onSelect(next)
                    },
                    label = { Text(config.label) },
                )
            }
            FilterChip(
                selected = selected.isEmpty,
                onClick = { onSelect(GymPulleySelection.NONE) },
                label = { Text("None") },
            )
        }
    }
}
