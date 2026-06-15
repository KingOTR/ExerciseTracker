package com.example.rungps.feature.run

import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.RunHrSampleEntity
import com.example.rungps.data.repository.ExerciseTrackerRepository
import com.example.rungps.strava.StravaRepository
import com.example.rungps.strava.StravaUploadApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
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

data class RunDetail(
    val row: RunRow,
    val points: List<PointEntity>,
    val splits: List<KmSplitEntity>,
    val hrSamples: List<RunHrSampleEntity>,
    val avgHrBpm: Int?,
    val maxHrBpm: Int?,
)

/** Ported from `com.example.rungps.feature.run.RunsViewModel`. */
class RunsViewModel(
    private val repository: ExerciseTrackerRepository,
    private val scope: CoroutineScope,
) {
    private val detailFlows = mutableMapOf<Long, MutableStateFlow<RunDetail?>>()

    val runs: StateFlow<List<RunRow>> =
        repository.observeRuns()
            .map { list -> list.map { it.toRow() } }
            .stateIn(scope, SharingStarted.WhileSubscribed(5_000), emptyList())

    fun runDetail(runId: Long): StateFlow<RunDetail?> =
        detailFlows.getOrPut(runId) { MutableStateFlow(null) }

    fun loadRunDetail(runId: Long) {
        scope.launch {
            val detail = repository.loadRunDetail(runId)
            detailFlows.getOrPut(runId) { MutableStateFlow(null) }.value = detail
        }
    }

    fun deleteRun(runId: Long) {
        scope.launch {
            repository.deleteRun(runId)
        }
    }

    suspend fun uploadToStrava(context: android.content.Context, runId: Long): Long {
        val detail = repository.loadRunDetail(runId) ?: error("Run not found")
        val strava = StravaRepository.get(context)
        val token = strava.obtainAccessToken()
        val sport = if (detail.row.activityType.contains("bike", true)) "Ride" else "Run"
        return StravaUploadApi.createRunActivity(
            accessToken = token,
            name = "${detail.row.activityType} ${formatDistanceKm(detail.row.distanceM)}",
            startTimeMs = detail.row.startedAtMs,
            elapsedSec = (detail.row.durationMs / 1000).toInt(),
            distanceM = detail.row.distanceM,
            sportType = sport,
        )
    }

    private fun RunEntity.toRow() = RunRow(
        id = id,
        startedAtMs = startedAtMs,
        distanceM = totalDistanceM,
        durationMs = totalDurationMs,
        activityType = activityType,
    )

    private fun formatDistanceKm(m: Double) = "%.1f km".format(m / 1000.0)
}
