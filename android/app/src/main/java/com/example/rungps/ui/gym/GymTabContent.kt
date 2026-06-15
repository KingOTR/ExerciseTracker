package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.LaunchedEffect
import com.example.rungps.gym.GymActiveSessionForegroundService
import com.example.rungps.gym.GymPulleySelection
import com.example.rungps.gym.GymPulleyStore
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.MuscleRepository
import com.example.rungps.nfc.GymNfcController
import com.example.rungps.ui.components.MuscleVolumeChips
import com.example.rungps.ui.screens.GymScreen
import com.example.rungps.ui.viewmodel.GymViewModel

@Composable
fun GymTabContent(
    viewModel: GymViewModel,
    nfcController: GymNfcController?,
    modifier: Modifier = Modifier,
) {
    val uiState by viewModel.uiState.collectAsState()
    val liveMedia by viewModel.liveMedia.collectAsState()
    var detailMuscleId by remember { mutableStateOf<String?>(null) }
    var pulleySelection by remember { mutableStateOf(GymPulleySelection.NONE) }
    val context = LocalContext.current
    val taxonomy = remember {
        MuscleRepository(context, ExerciseTrackerDatabase.get(context).exerciseTrackerDao()).taxonomy
    }

    Column(modifier = modifier.fillMaxSize().padding(horizontal = 16.dp, vertical = 8.dp)) {
        GymSessionHeader(
            title = "Gym",
            subtitle = "Log sets, NFC check-in, and muscle load tracking",
        )
        nfcController?.let { nfc ->
            Card(
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            ) {
                Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text("NFC tap", style = MaterialTheme.typography.titleSmall)
                    Text(
                        nfc.prompt ?: "Hold phone to gym tag to register or toggle session",
                        style = MaterialTheme.typography.bodySmall,
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        OutlinedButton(onClick = { nfc.bumpPulse() }) { Text("Pulse ${nfc.pulse}") }
                        OutlinedButton(onClick = { nfc.clearPrompt() }) { Text("Clear") }
                    }
                }
            }
        }
        GymPulleyPanel(
            selected = pulleySelection,
            onSelect = { sel ->
                pulleySelection = sel
                uiState.sessionId?.let { GymPulleyStore.saveSessionSelection(context, it, sel) }
            },
            pinKgPreview = uiState.sets.lastOrNull()?.weightKg,
        )
        if (uiState.sessionVolumes.isNotEmpty()) {
            Text("Session muscle volume", style = MaterialTheme.typography.labelMedium)
            MuscleVolumeChips(entries = uiState.sessionVolumes)
        }
        uiState.sessionId?.let { sessionId ->
            LaunchedEffect(sessionId) {
                GymActiveSessionForegroundService.start(context, sessionId)
            }
            GymSessionPodcastSummary(
                showName = uiState.mediaTimeline.lastOrNull()?.podcastShowName
                    ?: liveMedia?.subtitle,
                episodeTitle = uiState.mediaTimeline.lastOrNull()?.podcastEpisodeTitle
                    ?: liveMedia?.title,
                playbackStartedMs = uiState.mediaTimeline.firstOrNull()?.timeMs,
                playbackEndMs = uiState.mediaTimeline.lastOrNull()?.timeMs,
                modifier = Modifier.padding(vertical = 8.dp),
            )
            GymSessionMediaTimelineList(
                timeline = uiState.mediaTimeline,
                startedAtMs = uiState.mediaTimeline.firstOrNull()?.timeMs ?: System.currentTimeMillis(),
                liveSnapshot = liveMedia,
                modifier = Modifier.padding(bottom = 8.dp),
            )
        }
        GymScreen(viewModel = viewModel)
    }

    detailMuscleId?.let { muscleId ->
        MuscleDetailScreen(
            muscleId = muscleId,
            taxonomy = taxonomy,
            recentVolume = uiState.sessionVolumes.filter { it.muscleId == muscleId },
            onDismiss = { detailMuscleId = null },
        )
    }
}
