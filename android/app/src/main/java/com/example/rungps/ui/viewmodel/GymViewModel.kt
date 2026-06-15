package com.example.rungps.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.SpotifyTimelineEntity
import com.example.rungps.data.repository.MuscleRepository
import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.domain.muscle.MappingSource
import com.example.rungps.domain.muscle.MuscleLoad
import com.example.rungps.domain.muscle.MuscleVolumeEntry
import com.example.rungps.domain.muscle.SetMuscleBreakdown
import com.example.rungps.gym.GymActiveSessionForegroundService
import com.example.rungps.media.DeviceNowPlayingReader
import com.example.rungps.media.SessionMediaSnapshot
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
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
    val mediaTimeline: List<SpotifyTimelineEntity> = emptyList(),
    val liveMedia: SessionMediaSnapshot? = null,
    val session: GymSessionEntity? = null,
)

@OptIn(ExperimentalCoroutinesApi::class)
class GymViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = ExerciseTrackerDatabase.get(application).exerciseTrackerDao()
    private val muscleRepo = MuscleRepository(application, dao)

    private val activeSessionId = MutableStateFlow<Long?>(null)
    private val lastBreakdown = MutableStateFlow<SetMuscleBreakdown?>(null)
    private val pendingExercise = MutableStateFlow<String?>(null)

    private val setsFlow = activeSessionId.flatMapLatest { sessionId ->
        if (sessionId == null) flowOf(emptyList())
        else dao.observeGymSets(sessionId)
    }
    private val timelineFlow = activeSessionId.flatMapLatest { sessionId ->
        if (sessionId == null) flowOf(emptyList())
        else dao.observeSpotifyTimelineForGymSession(sessionId)
    }

    val uiState: StateFlow<GymUiState> = combine(
        combine(activeSessionId, setsFlow, timelineFlow) { sessionId, sets, timeline ->
            Triple(sessionId, sets, timeline)
        },
        combine(lastBreakdown, pendingExercise, muscleRepo.observeUserOverrides()) { breakdown, pending, overrides ->
            Triple(breakdown, pending, overrides)
        },
    ) { sessionPart, metaPart ->
        val (sessionId, sets, timeline) = sessionPart
        val (breakdown, pending, overrides) = metaPart
        val volumes = muscleRepo.recoveryEngine.computeSessionMuscleVolumes(sets, overrides)
        GymUiState(
            sessionId = sessionId,
            sets = sets,
            sessionVolumes = volumes,
            lastBreakdown = breakdown,
            pendingExerciseName = pending,
            userOverrides = overrides,
            mediaTimeline = timeline,
            liveMedia = _liveMedia.value,
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), GymUiState())

    private val _liveMedia = MutableStateFlow<SessionMediaSnapshot?>(null)
    val liveMedia: StateFlow<SessionMediaSnapshot?> = _liveMedia.asStateFlow()

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
            activeSessionId.value?.let { id ->
                GymActiveSessionForegroundService.start(getApplication(), id)
            }
        }
        viewModelScope.launch {
            while (true) {
                kotlinx.coroutines.delay(10_000)
                if (activeSessionId.value == null) continue
                val now = DeviceNowPlayingReader.read(getApplication())
                _liveMedia.value = now?.let { SessionMediaSnapshot.fromDeviceNowPlaying(it) }
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
