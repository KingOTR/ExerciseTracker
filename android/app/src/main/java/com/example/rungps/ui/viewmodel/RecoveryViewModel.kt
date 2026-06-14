package com.example.rungps.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.MuscleRepository
import com.example.rungps.domain.muscle.DailyStepsInput
import com.example.rungps.domain.muscle.GymSetInput
import com.example.rungps.domain.muscle.MuscleLoad
import com.example.rungps.domain.muscle.RecoveryLoadInput
import com.example.rungps.domain.muscle.RecoveryMuscleScore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class RecoveryUiState(
    val scores: List<RecoveryMuscleScore> = emptyList(),
    val lowerBodyLoad: Double = 0.0,
    val upperBodyLoad: Double = 0.0,
    val cardioLoad: Double = 0.0,
    val dailySteps: Int = 8_000,
)

class RecoveryViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = ExerciseTrackerDatabase.get(application).exerciseTrackerDao()
    private val muscleRepo = MuscleRepository(application, dao)

    private val dailySteps = MutableStateFlow(8_000)
    private val uiStateInternal = MutableStateFlow(RecoveryUiState())

    val uiState: StateFlow<RecoveryUiState> = uiStateInternal.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        RecoveryUiState(),
    )

    init {
        viewModelScope.launch {
            combine(
                dao.observeGymSessions(),
                dao.observeRuns(),
                dao.observeSoccerSessions(),
                dailySteps,
                muscleRepo.observeUserOverrides(),
            ) { _, _, _, steps, overrides ->
                steps to overrides
            }.collect { (steps, overrides) ->
                refresh(steps, overrides)
            }
        }
    }

    fun setDailySteps(steps: Int) {
        dailySteps.value = steps.coerceAtLeast(0)
    }

    private suspend fun refresh(steps: Int, overrides: Map<String, List<MuscleLoad>>) {
        val gymSets = dao.getAllGymSets().map { set ->
            GymSetInput(
                exerciseName = set.exerciseName,
                weightKg = set.weightKg,
                reps = set.reps,
                loggedAtMs = set.loggedAtMs,
            )
        }
        val runs = dao.getAllRuns()
        val soccer = dao.getAllSoccerSessions()
        val now = System.currentTimeMillis()
        val dayStart = now - (now % 86_400_000L)
        val input = RecoveryLoadInput(
            gymSets = gymSets,
            runs = runs,
            soccerSessions = soccer,
            dailySteps = listOf(DailyStepsInput(dayStartMs = dayStart, steps = steps)),
            userOverrides = overrides,
            nowMs = now,
        )
        val scores = muscleRepo.recoveryEngine.computeRecovery(input)
        val lower = scores.filter { it.regionId == "lower" }.sumOf { it.totalLoad }
        val upper = scores.filter { it.regionId == "upper" }.sumOf { it.totalLoad }
        val cardio = scores.sumOf { it.cardioLoad }
        uiStateInternal.value = RecoveryUiState(
            scores = scores.filter { it.totalLoad > 0.0 }.take(20),
            lowerBodyLoad = lower,
            upperBodyLoad = upper,
            cardioLoad = cardio,
            dailySteps = steps,
        )
    }
}
