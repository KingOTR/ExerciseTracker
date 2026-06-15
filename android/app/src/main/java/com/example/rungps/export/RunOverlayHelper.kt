package com.example.rungps.export

import android.content.Context
import com.example.rungps.data.repository.ExerciseTrackerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object RunOverlayHelper {
    suspend fun loadLatLon(context: Context, repository: ExerciseTrackerRepository, runId: Long): List<Pair<Double, Double>> =
        withContext(Dispatchers.IO) {
            repository.loadRunDetail(runId)?.points
                ?.map { it.lat to it.lon }
                ?.filter { it.first.isFinite() && it.second.isFinite() }
                ?: emptyList()
        }

    suspend fun renderRunOverlay(
        context: Context,
        repository: ExerciseTrackerRepository,
        runId: Long,
    ): ByteArray? = withContext(Dispatchers.Default) {
        val detail = repository.loadRunDetail(runId) ?: return@withContext null
        val latLon = detail.points.map { it.lat to it.lon }
        if (latLon.size < 2) return@withContext null
        val stats = RunRouteOverlayRenderer.RunStats(
            distanceKm = detail.row.distanceM / 1000.0,
            durationMs = detail.row.durationMs,
        )
        val base = RunRouteOverlayRenderer.renderDarkBase()
        val rendered = RunRouteOverlayRenderer.render(base, latLon, stats)
        val bytes = RunOverlayShare.pngBytes(rendered)
        if (rendered !== base) rendered.recycle()
        base.recycle()
        bytes
    }
}
