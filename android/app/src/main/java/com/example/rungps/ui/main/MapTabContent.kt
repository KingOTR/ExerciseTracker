package com.example.rungps.ui.main

import android.preference.PreferenceManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.tracking.TrackingUiState
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker
import org.osmdroid.views.overlay.Polyline

@Composable
fun MapTabContent(
    live: TrackingUiState,
    routes: List<RouteEntity>,
    followRouteId: Long?,
    followRouteName: String?,
    onSelectFollowRoute: (Long?, String?) -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    var showRoutes by remember { mutableStateOf(true) }

    DisposableEffect(Unit) {
        Configuration.getInstance().load(context, PreferenceManager.getDefaultSharedPreferences(context))
        onDispose { }
    }

    Column(
        modifier = modifier.fillMaxSize().padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TabHeroHeader(
            title = "Map",
            subtitle = if (live.isRecording) "Live GPS track" else "Offline maps & saved routes",
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                if (live.isRecording) formatDistanceKm(live.distanceM) else followRouteName ?: "No route selected",
                style = MaterialTheme.typography.titleMedium,
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("Routes", style = MaterialTheme.typography.labelMedium)
                Switch(checked = showRoutes, onCheckedChange = { showRoutes = it })
            }
        }

        Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
            val centerLat = live.lastLat ?: -33.8688
            val centerLon = live.lastLon ?: 151.2093
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { ctx ->
                    MapView(ctx).apply {
                        setTileSource(TileSourceFactory.MAPNIK)
                        setMultiTouchControls(true)
                        controller.setZoom(15.0)
                        controller.setCenter(GeoPoint(centerLat, centerLon))
                    }
                },
                update = { map ->
                    map.overlays.removeAll { it is Marker || it is Polyline }
                    if (live.lastLat != null && live.lastLon != null) {
                        val marker = Marker(map).apply {
                            position = GeoPoint(live.lastLat!!, live.lastLon!!)
                            title = if (live.isRecording) "Live" else "Last fix"
                        }
                        map.overlays.add(marker)
                        if (live.isRecording) {
                            map.controller.animateTo(GeoPoint(live.lastLat!!, live.lastLon!!))
                        }
                    }
                    if (showRoutes && followRouteId != null) {
                        map.overlays.add(
                            Polyline().apply {
                                title = followRouteName
                                outlinePaint.strokeWidth = 6f
                            },
                        )
                    }
                    map.invalidate()
                },
            )
        }

        if (showRoutes && routes.isNotEmpty()) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                items(routes.take(5), key = { it.id }) { route ->
                    val selected = route.id == followRouteId
                    FilterChip(
                        selected = selected,
                        onClick = {
                            if (selected) onSelectFollowRoute(null, null)
                            else onSelectFollowRoute(route.id, route.name)
                        },
                        label = { Text("${route.name} · ${formatDistanceKm(route.distanceM)}") },
                    )
                }
            }
        }
    }
}
