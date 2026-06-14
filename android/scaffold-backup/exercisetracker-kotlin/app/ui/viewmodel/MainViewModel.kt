package com.exercisetracker.app.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.exercisetracker.app.data.ExerciseTrackerDatabase
import com.exercisetracker.app.data.entity.GymSessionEntity
import com.exercisetracker.app.data.repository.ExerciseTrackerRepository
import com.exercisetracker.app.feature.gym.GymViewModel
import com.exercisetracker.app.feature.run.RunsViewModel
import com.exercisetracker.app.sync.CloudSyncManager
import com.exercisetracker.app.sync.CloudSyncResult
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/**
 * Ported from `com.example.rungps.ui.viewmodel.MainViewModel`.
 */
class MainViewModel(app: Application) : AndroidViewModel(app) {
    private val repository = ExerciseTrackerRepository(
        ExerciseTrackerDatabase.get(app).exerciseTrackerDao(),
    )

    val runs = RunsViewModel(repository, viewModelScope)
    val gym = GymViewModel(repository, viewModelScope)

    val gymSessions: StateFlow<List<GymSessionEntity>> =
        repository.observeGymSessions()
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    fun syncCloud(onResult: (CloudSyncResult) -> Unit = {}) {
        viewModelScope.launch {
            val result = CloudSyncManager.syncAll(getApplication())
            onResult(result)
        }
    }
}
