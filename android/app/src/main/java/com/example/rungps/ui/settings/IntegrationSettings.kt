package com.example.rungps.ui.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.ui.main.TabSectionCard

@Composable
fun IntegrationSettingsPanel(
    stravaLinked: Boolean,
    samsungHealthReachable: Boolean,
    healthConnectReady: Boolean,
    modifier: Modifier = Modifier,
) {
    TabSectionCard(title = "Integrations", modifier = modifier) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            IntegrationRow("Strava", if (stravaLinked) "Linked" else "Not linked")
            IntegrationRow("Samsung Health", if (samsungHealthReachable) "SDK reachable" else "Unavailable")
            IntegrationRow("Health Connect", if (healthConnectReady) "Ready" else "Not ready")
        }
    }
}

@Composable
private fun IntegrationRow(name: String, status: String) {
    Column(Modifier.fillMaxWidth()) {
        Text(name, style = MaterialTheme.typography.titleSmall)
        Text(status, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}
