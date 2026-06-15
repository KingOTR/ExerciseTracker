package com.example.rungps

import android.app.Application
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.MuscleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ExerciseTrackerApplication : Application() {
    val muscleRepository: MuscleRepository by lazy {
        MuscleRepository(this, ExerciseTrackerDatabase.get(this).exerciseTrackerDao())
    }

    override fun onCreate() {
        super.onCreate()
        ExerciseTrackerDatabase.get(this)
        com.example.rungps.tracking.RecordingHrBridge.init(this)
        com.example.rungps.maps.MapOfflineRegionManager.init(this)
        com.example.rungps.ble.BleClient.get(this).refreshEnabled()
        com.example.rungps.spotify.SpotifyController.refreshLinkedState(this)
        com.example.rungps.analytics.ExerciseTrackerAnalytics.init(this)
        GlobalScope.launch(Dispatchers.IO) {
            com.example.rungps.ml.TfliteModelDownloader.ensureModels(this@ExerciseTrackerApplication)
        }
    }
}
