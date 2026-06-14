package com.example.rungps.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.repository.ExerciseTrackerRepository
import com.example.rungps.feature.gym.GymViewModel
import com.example.rungps.feature.run.RunsViewModel
import com.example.rungps.sync.CloudSyncManager
import com.example.rungps.sync.CloudSyncResult
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
