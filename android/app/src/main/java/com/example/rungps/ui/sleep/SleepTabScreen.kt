package com.example.rungps.ui.sleep

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rungps.ui.viewmodel.SleepViewModel

@Composable
fun SleepTabScreenBody(modifier: Modifier = Modifier, viewModel: SleepViewModel = viewModel()) {
    val context = LocalContext.current
    val entries by viewModel.entries.collectAsState()
    var tracking by remember { mutableStateOf(viewModel.isTracking) }
    var serviceRunning by remember { mutableStateOf(viewModel.isServiceRunning) }
    val samples = remember(tracking, serviceRunning) { viewModel.liveSamples() }
    var selectedEntry by remember { mutableStateOf<com.example.rungps.data.entity.SleepEntryEntity?>(null) }
    val (alarmHour, alarmMinute) = remember { viewModel.alarmTime() }
    var hour by remember { mutableIntStateOf(alarmHour) }
    var minute by remember { mutableIntStateOf(alarmMinute) }
    var windowMin by remember { mutableIntStateOf(viewModel.windowMin()) }
    var smart by remember { mutableStateOf(viewModel.smartAlarmEnabled()) }

    val micLauncher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
        if (granted) viewModel.startTracking()
        tracking = viewModel.isTracking
        serviceRunning = viewModel.isServiceRunning
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Sleep", style = MaterialTheme.typography.headlineMedium)

        SleepTrackingLiveCard(
            tracking = tracking,
            serviceRunning = serviceRunning,
            sampleCount = samples.size,
            lastSample = samples.lastOrNull(),
            liveSamples = samples,
        )

        Text("Alarm", style = MaterialTheme.typography.titleSmall)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
            FilterChip(selected = false, onClick = { hour = (hour + 23) % 24; viewModel.setAlarmTime(hour, minute) }, label = { Text("−1h") })
            Text("%02d:%02d".format(hour, minute), style = MaterialTheme.typography.titleLarge)
            FilterChip(selected = false, onClick = { hour = (hour + 1) % 24; viewModel.setAlarmTime(hour, minute) }, label = { Text("+1h") })
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf(15, 30, 45).forEach { w ->
                FilterChip(
                    selected = windowMin == w,
                    onClick = {
                        windowMin = w
                        viewModel.setWindowMin(w)
                    },
                    label = { Text("${w}m window") },
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Smart alarm")
            Switch(checked = smart, onCheckedChange = {
                smart = it
                viewModel.setSmartAlarm(it)
            })
        }

        if (!tracking) {
            Button(
                onClick = {
                    val hasMic = ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) ==
                        PackageManager.PERMISSION_GRANTED
                    if (hasMic) {
                        viewModel.startTracking()
                    } else {
                        micLauncher.launch(Manifest.permission.RECORD_AUDIO)
                    }
                    tracking = viewModel.isTracking
                    serviceRunning = viewModel.isServiceRunning
                },
                modifier = Modifier.fillMaxWidth(),
            ) { Text("Start overnight tracking") }
        } else {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                OutlinedButton(
                    onClick = {
                        viewModel.stopTracking()
                        tracking = false
                        serviceRunning = false
                    },
                    modifier = Modifier.weight(1f),
                ) { Text("Stop") }
                Button(
                    onClick = {
                        viewModel.finishNight { tracking = false; serviceRunning = false }
                    },
                    modifier = Modifier.weight(1f),
                ) { Text("Save night") }
            }
        }

        SleepTrendCard(entries)

        Text("Recent nights", style = MaterialTheme.typography.titleSmall)
        entries.take(10).forEach { entry ->
            SleepNightRow(entry, onClick = { selectedEntry = entry })
        }
    }

    SleepNightDetailSheet(entry = selectedEntry, onDismiss = { selectedEntry = null })
}

@Composable
fun SleepTabScreen(modifier: Modifier = Modifier) {
    SleepTabScreenBody(modifier = modifier)
}
