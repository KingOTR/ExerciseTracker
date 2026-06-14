package com.exercisetracker.app.feature.gym

import com.exercisetracker.app.data.repository.ExerciseTrackerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

/** Ported from `com.example.rungps.feature.gym.GymViewModel`. */
class GymViewModel(
    repository: ExerciseTrackerRepository,
    scope: CoroutineScope,
) {
    val sessionCount: StateFlow<Int> =
        repository.observeGymSessions()
            .map { it.size }
            .stateIn(scope, SharingStarted.WhileSubscribed(5_000), 0)

    val recentExercises: StateFlow<List<String>> =
        repository.observeGymSessions()
            .map { sessions ->
                sessions.flatMap { session ->
                    repository.observeGymSets(session.id).let { emptyList<String>() }
                }
            }
            .stateIn(scope, SharingStarted.WhileSubscribed(5_000), emptyList())
}
