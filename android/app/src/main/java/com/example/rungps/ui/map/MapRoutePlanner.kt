package com.example.rungps.ui.map

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rungps.routing.OsrmWalkingRouter
import com.example.rungps.ui.main.TabSectionCard
import com.example.rungps.ui.main.formatDistanceKm
import kotlinx.coroutines.launch
import org.osmdroid.util.GeoPoint

data class RoutePlanState(
    val planning: Boolean = false,
    val message: String = "Drop waypoints on map, then plan a walking route.",
    val plannedPoints: List<GeoPoint> = emptyList(),
    val distanceM: Double = 0.0,
)

@Composable
fun MapRoutePlannerPanel(
    waypoints: List<GeoPoint>,
    onPlannedRoute: (List<GeoPoint>) -> Unit,
    modifier: Modifier = Modifier,
) {
    var state by remember { mutableStateOf(RoutePlanState()) }
    val scope = rememberCoroutineScope()

    TabSectionCard(title = "OSRM route planning", modifier = modifier) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(state.message, style = MaterialTheme.typography.bodySmall)
            if (state.planning) {
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
            }
            Text("Waypoints: ${waypoints.size}", style = MaterialTheme.typography.labelMedium)
            if (state.plannedPoints.isNotEmpty()) {
                Text(
                    "Planned ${formatDistanceKm(state.distanceM)} · ${state.plannedPoints.size} points",
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    enabled = waypoints.size >= 2 && !state.planning,
                    onClick = {
                        scope.launch {
                            state = state.copy(planning = true, message = "Snapping route to foot paths…")
                            val result = OsrmWalkingRouter.footRouteStitched(waypoints, addViaOnLongLegs = true)
                            result.fold(
                                onSuccess = { route ->
                                    val dist = route.zipWithNext { a, b ->
                                        val la = android.location.Location("a").apply {
                                            latitude = a.latitude; longitude = a.longitude
                                        }
                                        val lb = android.location.Location("b").apply {
                                            latitude = b.latitude; longitude = b.longitude
                                        }
                                        la.distanceTo(lb).toDouble()
                                    }.sum()
                                    state = RoutePlanState(
                                        planning = false,
                                        message = "Route ready",
                                        plannedPoints = route,
                                        distanceM = dist,
                                    )
                                    onPlannedRoute(route)
                                },
                                onFailure = {
                                    state = state.copy(planning = false, message = it.message ?: "Routing failed")
                                },
                            )
                        }
                    },
                ) { Text("Plan foot route") }
                OutlinedButton(
                    enabled = waypoints.size >= 2 && !state.planning,
                    onClick = {
                        scope.launch {
                            state = state.copy(planning = true, message = "Snapping anchors…")
                            val anchors = OsrmWalkingRouter.anchorsForSnapButton(waypoints, waypoints)
                            val result = OsrmWalkingRouter.snapWalkingRoute(anchors)
                            result.fold(
                                onSuccess = { route ->
                                    state = state.copy(
                                        planning = false,
                                        message = "Snapped route ready",
                                        plannedPoints = route,
                                    )
                                    onPlannedRoute(route)
                                },
                                onFailure = {
                                    state = state.copy(planning = false, message = it.message ?: "Snap failed")
                                },
                            )
                        }
                    },
                ) { Text("Snap") }
            }
        }
    }
}
