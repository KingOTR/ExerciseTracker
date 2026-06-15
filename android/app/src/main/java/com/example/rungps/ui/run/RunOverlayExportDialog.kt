package com.example.rungps.ui.run

import android.graphics.Bitmap
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.ExerciseTrackerRepository
import com.example.rungps.export.RunOverlayShare
import com.example.rungps.export.RunRouteOverlayRenderer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun RunOverlayExportDialog(runId: Long, onDismiss: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val repository = remember {
        ExerciseTrackerRepository(ExerciseTrackerDatabase.get(context).exerciseTrackerDao())
    }
    var loading by remember { mutableStateOf(true) }
    var bitmap by remember { mutableStateOf<Bitmap?>(null) }
    var stats by remember { mutableStateOf(RunRouteOverlayRenderer.RunStats(0.0, 0L)) }

    LaunchedEffect(runId) {
        loading = true
        val detail = withContext(Dispatchers.IO) { repository.loadRunDetail(runId) }
        val latLon = detail?.points?.map { it.lat to it.lon } ?: emptyList()
        if (latLon.size < 2 || detail == null) {
            loading = false
            Toast.makeText(context, "Not enough GPS points for this run.", Toast.LENGTH_LONG).show()
            onDismiss()
            return@LaunchedEffect
        }
        stats = RunRouteOverlayRenderer.RunStats(
            distanceKm = detail.row.distanceM / 1000.0,
            durationMs = detail.row.durationMs,
        )
        val base = RunRouteOverlayRenderer.renderDarkBase()
        bitmap = RunRouteOverlayRenderer.render(base, latLon, stats)
        base.recycle()
        loading = false
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Share on photo") },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                if (loading) {
                    CircularProgressIndicator()
                    Text("Rendering route overlay…")
                } else {
                    Text("%.1f km · %s".format(stats.distanceKm, formatDuration(stats.durationMs)))
                    Text("Route overlay ready — share or save to gallery.")
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val bmp = bitmap ?: return@Button
                    RunOverlayShare.sharePng(context, bmp)
                },
                enabled = !loading && bitmap != null,
            ) { Text("Share") }
        },
        dismissButton = {
            OutlinedButton(
                onClick = {
                    val bmp = bitmap ?: return@OutlinedButton
                    scope.launch {
                        val result = withContext(Dispatchers.IO) { RunOverlayShare.saveToGallery(context, bmp) }
                        val msg = result.error ?: "Saved to gallery"
                        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
                    }
                },
                enabled = !loading && bitmap != null,
            ) { Text("Save") }
        },
    )
}

private fun formatDuration(ms: Long): String {
    val total = maxOf(ms / 1000, 0)
    val m = (total % 3600) / 60
    val s = total % 60
    return "%d:%02d".format(m, s)
}
