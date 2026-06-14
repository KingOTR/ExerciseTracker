package com.exercisetracker.app.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.exercisetracker.app.data.ExerciseTrackerDatabase
import com.exercisetracker.app.data.entity.GymSessionEntity
import com.exercisetracker.app.data.repository.MuscleRepository
import com.exercisetracker.app.data.entity.GymSetEntity
import com.exercisetracker.app.domain.muscle.MappingSource
import com.exercisetracker.app.domain.muscle.MuscleLoad
import com.exercisetracker.app.domain.muscle.MuscleVolumeEntry
import com.exercisetracker.app.domain.muscle.SetMuscleBreakdown
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class GymUiState(
    val sessionId: Long? = null,
    val sets: List<GymSetEntity> = emptyList(),
    val sessionVolumes: List<MuscleVolumeEntry> = emptyList(),
    val lastBreakdown: SetMuscleBreakdown? = null,
    val pendingExerciseName: String? = null,
    val userOverrides: Map<String, List<MuscleLoad>> = emptyMap(),
)

@OptIn(ExperimentalCoroutinesApi::class)
class GymViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = ExerciseTrackerDatabase.get(application).exerciseTrackerDao()
    private val muscleRepo = MuscleRepository(application, dao)

    private val activeSessionId = MutableStateFlow<Long?>(null)
    private val lastBreakdown = MutableStateFlow<SetMuscleBreakdown?>(null)
    private val pendingExercise = MutableStateFlow<String?>(null)

    val uiState: StateFlow<GymUiState> = combine(
        activeSessionId,
        activeSessionId.flatMapLatest { sessionId ->
            if (sessionId == null) flowOf(emptyList())
            else dao.observeGymSets(sessionId)
        },
        lastBreakdown,
        pendingExercise,
        muscleRepo.observeUserOverrides(),
    ) { sessionId, sets, breakdown, pending, overrides ->
        val volumes = muscleRepo.recoveryEngine.computeSessionMuscleVolumes(sets, overrides)
        GymUiState(
            sessionId = sessionId,
            sets = sets,
            sessionVolumes = volumes,
            lastBreakdown = breakdown,
            pendingExerciseName = pending,
            userOverrides = overrides,
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), GymUiState())

    init {
        viewModelScope.launch {
            val latest = dao.latestGymSession()
            if (latest != null) {
                activeSessionId.value = latest.id
            } else {
                val newId = (dao.maxGymSessionId() ?: 0L) + 1L
                dao.insertGymSession(
                    GymSessionEntity(
                        id = newId,
                        startedAtMs = System.currentTimeMillis(),
                        endedAtMs = null,
                    ),
                )
                activeSessionId.value = newId
            }
        }
    }

    fun logSet(exerciseName: String, reps: Int, weightKg: Double?) {
        viewModelScope.launch {
            val sessionId = activeSessionId.value ?: return@launch
            val overrides = muscleRepo.getUserOverridesSnapshot()
            val resolved = muscleRepo.resolver.resolve(exerciseName, overrides)
            if (resolved.source == MappingSource.UNKNOWN) {
                pendingExercise.value = exerciseName
                return@launch
            }

            val currentSets = dao.getGymSetsForSession(sessionId)
            val setIndex = (currentSets.maxOfOrNull { it.setIndex } ?: 0) + 1
            val entity = GymSetEntity(
                sessionId = sessionId,
                exerciseName = exerciseName.trim(),
                setIndex = setIndex,
                reps = reps,
                weightKg = weightKg,
                loggedAtMs = System.currentTimeMillis(),
            )
            dao.insertGymSets(listOf(entity))
            lastBreakdown.value = muscleRepo.calculator.breakdownForSet(
                exerciseName = exerciseName,
                loads = resolved.loads,
                weightKg = weightKg,
                reps = reps,
                resolved = true,
            )
            pendingExercise.value = null
        }
    }

    fun saveExerciseMapping(exerciseName: String, loads: List<MuscleLoad>, reps: Int, weightKg: Double?) {
        viewModelScope.launch {
            muscleRepo.saveUserOverride(exerciseName, loads)
            pendingExercise.value = null
            logSet(exerciseName, reps, weightKg)
        }
    }

    fun dismissMappingDialog() {
        pendingExercise.value = null
    }

    fun applyTemplate(exerciseName: String, templateId: String, reps: Int, weightKg: Double?) {
        val loads = muscleRepo.resolver.templateLoads(templateId) ?: return
        viewModelScope.launch {
            saveExerciseMapping(exerciseName, loads, reps, weightKg)
        }
    }
}
