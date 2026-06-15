package com.example.rungps.ui.onboarding

import android.Manifest
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun OnboardingScreen(onComplete: () -> Unit) {
    val context = LocalContext.current
    val permissions = buildList {
        add(Manifest.permission.ACCESS_FINE_LOCATION)
        add(Manifest.permission.ACTIVITY_RECOGNITION)
        if (Build.VERSION.SDK_INT >= 31) {
            add(Manifest.permission.BLUETOOTH_SCAN)
            add(Manifest.permission.BLUETOOTH_CONNECT)
        }
        if (Build.VERSION.SDK_INT >= 33) add(Manifest.permission.POST_NOTIFICATIONS)
        add(Manifest.permission.RECORD_AUDIO)
    }.toTypedArray()
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions(),
    ) {
        OnboardingPreferences.markComplete(context)
        onComplete()
    }

    Column(
        Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text("Welcome to Exercise Tracker", style = MaterialTheme.typography.headlineMedium)
        Text(
            "Track runs, gym, sleep, and recovery in one app. Grant permissions for the best experience.",
            style = MaterialTheme.typography.bodyMedium,
        )
        listOf(
            "Location — GPS runs and map follow mode",
            "Microphone — overnight sleep staging",
            "Bluetooth — HR watch and Moyoung sync",
            "Notifications — recording and sleep alarms",
            "NFC — gym tag check-in",
            "Health Connect — steps, sleep, exercise sync",
        ).forEach { item ->
            Card(Modifier.fillMaxWidth()) {
                Text(item, Modifier.padding(12.dp), style = MaterialTheme.typography.bodyMedium)
            }
        }
        Button(
            onClick = { launcher.launch(permissions) },
            modifier = Modifier.fillMaxWidth().semantics { contentDescription = "Continue onboarding" },
        ) {
            Text("Grant permissions & continue")
        }
        Button(
            onClick = {
                OnboardingPreferences.markComplete(context)
                onComplete()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("Skip for now")
        }
    }
}

object OnboardingPreferences {
    private const val PREFS = "onboarding"
    private const val KEY_DONE = "complete"

    fun isComplete(context: android.content.Context): Boolean =
        context.getSharedPreferences(PREFS, android.content.Context.MODE_PRIVATE)
            .getBoolean(KEY_DONE, false)

    fun markComplete(context: android.content.Context) {
        context.getSharedPreferences(PREFS, android.content.Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_DONE, true).apply()
    }
}
