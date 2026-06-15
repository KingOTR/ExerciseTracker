package com.example.rungps.ui.main

import android.preference.PreferenceManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunHrSampleEntity
import com.example.rungps.feature.run.RunRow
import com.example.rungps.feature.run.RunsViewModel
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Polyline

@Composable
fun RunDetailsPanel(
    runId: Long,
    onClose: () -> Unit,
    onExport: (Long) -> Unit,
    onShareOnPhoto: () -> Unit,
    onUploadStrava: (Long) -> Unit,
    vm: RunsViewModel,
    stravaUploading: Boolean = false,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val detail by vm.runDetail(runId).collectAsState()
  var stravaMsg by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(runId) { vm.loadRunDetail(runId) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        TabHeroHeader(
            title = detail?.row?.activityType ?: "Run details",
            subtitle = detail?.row?.let { formatDistanceKm(it.distanceM) } ?: "Loading…",
        )

        if (detail == null) {
            LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
        } else {
            val d = detail!!
            RunDetailsStats(row = d.row, avgHr = d.avgHrBpm, maxHr = d.maxHrBpm)

            if (d.points.size >= 2) {
                RunDetailsMap(points = d.points, modifier = Modifier.fillMaxWidth().height(220.dp))
            }

            if (d.splits.isNotEmpty()) {
                TabSectionCard(title = "KM splits") {
                    d.splits.filter { it.kind == "km" }.forEach { split ->
                        SplitRow(split)
                    }
                }
            }

            if (d.hrSamples.isNotEmpty()) {
                TabSectionCard(title = "Heart rate") {
                    Text("${d.hrSamples.size} samples · avg ${d.avgHrBpm ?: "—"} · max ${d.maxHrBpm ?: "—"} bpm")
                }
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedButton(onClick = { onExport(runId) }) { Text("Export GPX") }
                OutlinedButton(onClick = onShareOnPhoto) { Text("Share on photo") }
            }
            Button(
                onClick = {
                    onUploadStrava(runId)
                    stravaMsg = "Uploading to Strava…"
                },
                enabled = !stravaUploading,
            ) {
                Text(if (stravaUploading) "Uploading…" else "Upload to Strava")
            }
            stravaMsg?.let { Text(it, style = MaterialTheme.typography.bodySmall) }
        }

        OutlinedButton(onClick = onClose, modifier = Modifier.fillMaxWidth()) {
            Text("Close")
        }
    }
}

@Composable
private fun RunDetailsStats(row: RunRow, avgHr: Int?, maxHr: Int?) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text(formatDistanceKm(row.distanceM), style = MaterialTheme.typography.headlineSmall)
            Text("Duration ${formatElapsed(row.durationMs)}", style = MaterialTheme.typography.titleMedium)
            if (avgHr != null) {
                Text("HR avg $avgHr bpm · max ${maxHr ?: "—"} bpm", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Composable
private fun SplitRow(split: KmSplitEntity) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("KM ${split.idx + 1}", style = MaterialTheme.typography.titleSmall)
        Text(formatPace(split.durationMs / 1000.0), style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun RunDetailsMap(
    points: List<PointEntity>,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    DisposableEffect(Unit) {
        Configuration.getInstance().load(context, PreferenceManager.getDefaultSharedPreferences(context))
        onDispose { }
    }
  val mapView = remember {
        MapView(context).apply {
            setTileSource(TileSourceFactory.MAPNIK)
            setMultiTouchControls(true)
        }
    }
    DisposableEffect(Unit) {
        onDispose { mapView.onDetach() }
    }
    AndroidView(
        modifier = modifier,
        factory = { mapView },
        update = { map ->
            map.overlays.removeAll { it is Polyline }
            val geo = points.map { GeoPoint(it.lat, it.lon) }
            if (geo.isNotEmpty()) {
                map.overlays.add(Polyline().apply { setPoints(geo) })
                map.controller.setZoom(15.0)
                map.controller.setCenter(geo.first())
            }
            map.invalidate()
        },
    )
}
