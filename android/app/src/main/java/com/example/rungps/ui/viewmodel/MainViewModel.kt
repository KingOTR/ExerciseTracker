package com.example.rungps.ui.viewmodel

import android.app.Application
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rungps.ble.BleClient
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.data.repository.ExerciseTrackerRepository
import com.example.rungps.feature.gym.GymViewModel
import com.example.rungps.feature.run.RunsViewModel
import com.example.rungps.sync.CloudSyncManager
import com.example.rungps.sync.CloudSyncResult
import com.example.rungps.sync.StravaHistorySync
import com.example.rungps.tracking.TrackingService
import com.example.rungps.tracking.TrackingState
import com.example.rungps.tracking.TrackingUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(app: Application) : AndroidViewModel(app) {
    private val db = ExerciseTrackerDatabase.get(app)
    private val repository = ExerciseTrackerRepository(db.exerciseTrackerDao())

    val runs = RunsViewModel(repository, viewModelScope)
    val gym = GymViewModel(repository, viewModelScope)
    val bleClient: BleClient = BleClient.get(app)

    private val _stravaUploading = MutableStateFlow(false)
    val stravaUploading: StateFlow<Boolean> = _stravaUploading.asStateFlow()
    private val _stravaImportMessage = MutableStateFlow<String?>(null)
    val stravaImportMessage: StateFlow<String?> = _stravaImportMessage.asStateFlow()
    private val _stravaImporting = MutableStateFlow(false)
    val stravaImporting: StateFlow<Boolean> = _stravaImporting.asStateFlow()

    val gymSessions: StateFlow<List<GymSessionEntity>> =
        repository.observeGymSessions()
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val routes: StateFlow<List<RouteEntity>> =
        db.routeDao().routesFlow()
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val soccerSessions = repository.observeSoccerSessions()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val trackingState: StateFlow<TrackingUiState> = TrackingState.state

    fun syncCloud(onResult: (CloudSyncResult) -> Unit = {}) {
        viewModelScope.launch {
            val result = CloudSyncManager.syncAll(getApplication())
            onResult(result)
        }
    }

    fun startRun(activityType: String = "RUN") {
        val ctx = getApplication<Application>()
        bleClient.setRecordingHrPoll(true)
        ctx.startForegroundService(
            Intent(ctx, TrackingService::class.java)
                .setAction(TrackingService.ACTION_START)
                .putExtra(TrackingService.EXTRA_ACTIVITY_TYPE, activityType),
        )
    }

    fun stopRun() {
        val ctx = getApplication<Application>()
        bleClient.setRecordingHrPoll(false)
        ctx.startService(
            Intent(ctx, TrackingService::class.java).setAction(TrackingService.ACTION_STOP),
        )
    }

    fun importStravaHistory(daysBack: Int = 90, onResult: (String) -> Unit = {}) {
        viewModelScope.launch {
            _stravaImporting.value = true
            val result = StravaHistorySync.importRecent(getApplication(), daysBack)
            _stravaImportMessage.value = result.message
            _stravaImporting.value = false
            onResult(result.message)
        }
    }

    fun uploadRunToStrava(runId: Long, onResult: (String) -> Unit = {}) {
        viewModelScope.launch {
            _stravaUploading.value = true
            val message = runCatching {
                val id = runs.uploadToStrava(getApplication(), runId)
                "Uploaded to Strava (activity $id)"
            }.fold(
                onSuccess = { it },
                onFailure = { it.message ?: "Upload failed" },
            )
            _stravaUploading.value = false
            onResult(message)
        }
    }
}
