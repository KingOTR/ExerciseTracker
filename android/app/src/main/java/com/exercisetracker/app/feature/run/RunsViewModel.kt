package com.exercisetracker.app.feature.run

import com.exercisetracker.app.data.entity.RunEntity
import com.exercisetracker.app.data.repository.ExerciseTrackerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class RunRow(
    val id: Long,
    val startedAtMs: Long,
    val distanceM: Double,
    val durationMs: Long,
    val activityType: String,
)

/** Ported from `com.example.rungps.feature.run.RunsViewModel`. */
class RunsViewModel(
    private val repository: ExerciseTrackerRepository,
    private val scope: CoroutineScope,
) {
    val runs: StateFlow<List<RunRow>> =
        repository.observeRuns()
            .map { list -> list.map { it.toRow() } }
            .stateIn(scope, SharingStarted.WhileSubscribed(5_000), emptyList())

    fun deleteRun(runId: Long) {
        scope.launch {
            // TODO: Room delete + RunFirestoreSync.deleteRunFromCloud
        }
    }

    private fun RunEntity.toRow() = RunRow(
        id = id,
        startedAtMs = startedAtMs,
        distanceM = distanceM,
        durationMs = durationMs,
        activityType = activityType,
    )
}
