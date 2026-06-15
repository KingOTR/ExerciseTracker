package com.example.rungps.ui.main

import android.content.Context
import android.graphics.Color
import android.location.Location
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.example.rungps.data.ExerciseTrackerDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.maplibre.android.camera.CameraPosition
import org.maplibre.android.camera.CameraUpdateFactory
import org.maplibre.android.geometry.LatLng
import org.maplibre.android.geometry.LatLngBounds
import org.maplibre.android.location.LocationComponentActivationOptions
import org.maplibre.android.location.modes.CameraMode
import org.maplibre.android.location.modes.RenderMode
import org.maplibre.android.maps.MapLibreMap
import org.maplibre.android.maps.MapView
import org.maplibre.android.maps.Style
import org.maplibre.android.style.layers.LineLayer
import org.maplibre.android.style.layers.Property
import org.maplibre.android.style.layers.PropertyFactory
import org.maplibre.android.style.sources.GeoJsonSource
import org.maplibre.geojson.Feature
import org.maplibre.geojson.FeatureCollection
import org.maplibre.geojson.LineString
import org.maplibre.geojson.Point
import kotlin.math.max
import kotlin.math.min

private const val MAP_STYLE = "https://demotiles.maplibre.org/style.json"
private const val SRC_PLANNED = "planned-route"
private const val SRC_TRAVELLED = "travelled-route"
private const val LAYER_PLANNED = "planned-route-layer"
private const val LAYER_TRAVELLED = "travelled-route-layer"

@Composable
fun MapLibreRecordingMap(
    routeId: Long,
    liveLat: Double?,
    liveLon: Double?,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    var routePts by remember(routeId) { mutableStateOf<List<LatLng>>(emptyList()) }
    var trail by remember { mutableStateOf<List<LatLng>>(emptyList()) }
    var offRouteM by remember { mutableStateOf<Double?>(null) }
    var mapViewRef by remember { mutableStateOf<MapView?>(null) }
    var mapRef by remember { mutableStateOf<MapLibreMap?>(null) }
    var styleReady by remember { mutableStateOf(false) }

    LaunchedEffect(routeId) {
        routePts = if (routeId > 0L) {
            withContext(Dispatchers.IO) {
                ExerciseTrackerDatabase.get(context).routeDao()
                    .pointsForRoute(routeId)
                    .map { LatLng(it.lat, it.lon) }
            }
        } else {
            emptyList()
        }
        trail = emptyList()
    }

    LaunchedEffect(liveLat, liveLon, routePts) {
        val lat = liveLat ?: return@LaunchedEffect
        val lon = liveLon ?: return@LaunchedEffect
        val point = LatLng(lat, lon)
        offRouteM = if (routePts.size >= 2) offRouteDistanceM(point, routePts) else null
        val last = trail.lastOrNull()
        if (last == null || distanceM(last, point) >= 3.0) {
            trail = trail.plus(point).takeLast(500)
        }
        val map = mapRef ?: return@LaunchedEffect
        if (!styleReady || !map.locationComponent.isLocationComponentEnabled) return@LaunchedEffect
        val loc = Location("recording").apply {
            latitude = lat
            longitude = lon
            accuracy = 8f
        }
        map.locationComponent.forceLocationUpdate(loc)
    }

    LaunchedEffect(routePts, mapRef, styleReady) {
        val map = mapRef ?: return@LaunchedEffect
        val style = map.style ?: return@LaunchedEffect
        updateLineSource(style, SRC_PLANNED, routePts, 2)
        if (routePts.size >= 2 && trail.isEmpty()) {
            val bounds = LatLngBounds.Builder().includes(routePts).build()
            map.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100))
        }
    }

    LaunchedEffect(trail, mapRef, styleReady) {
        val style = mapRef?.style ?: return@LaunchedEffect
        updateLineSource(style, SRC_TRAVELLED, trail, 2)
    }

    AndroidView(
        modifier = modifier,
        factory = { ctx ->
            MapView(ctx).also { view ->
                mapViewRef = view
                view.onCreate(null)
                view.getMapAsync { map ->
                    mapRef = map
                    map.uiSettings.apply {
                        isAttributionEnabled = true
                        isCompassEnabled = false
                        isRotateGesturesEnabled = true
                        isTiltGesturesEnabled = true
                    }
                    map.setPadding(0, 48, 0, 320)
                    map.setStyle(Style.Builder().fromUri(MAP_STYLE)) { style ->
                        ensureRouteLayers(style)
                        styleReady = true
                        map.locationComponent.activateLocationComponent(
                            LocationComponentActivationOptions.builder(ctx, style)
                                .useDefaultLocationEngine(false)
                                .build(),
                        )
                        map.locationComponent.isLocationComponentEnabled = true
                        map.locationComponent.cameraMode = CameraMode.TRACKING
                        map.locationComponent.renderMode = RenderMode.COMPASS
                        map.animateCamera(CameraUpdateFactory.tiltTo(52.0))
                        updateLineSource(style, SRC_PLANNED, routePts, 2)
                        if (routePts.size >= 2) {
                            map.animateCamera(
                                CameraUpdateFactory.newLatLngBounds(
                                    LatLngBounds.Builder().includes(routePts).build(),
                                    100,
                                ),
                            )
                        } else {
                            map.cameraPosition = CameraPosition.Builder().zoom(16.0).build()
                        }
                    }
                }
            }
        },
    )

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_START -> mapViewRef?.onStart()
                Lifecycle.Event.ON_RESUME -> mapViewRef?.onResume()
                Lifecycle.Event.ON_PAUSE -> mapViewRef?.onPause()
                Lifecycle.Event.ON_STOP -> mapViewRef?.onStop()
                Lifecycle.Event.ON_DESTROY -> mapViewRef?.onDestroy()
                else -> Unit
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
            mapViewRef?.onDestroy()
            mapViewRef = null
            mapRef = null
            styleReady = false
        }
    }
}

private fun ensureRouteLayers(style: Style) {
    if (style.getSource(SRC_PLANNED) == null) {
        style.addSource(GeoJsonSource(SRC_PLANNED))
        style.addLayer(
            LineLayer(LAYER_PLANNED, SRC_PLANNED).withProperties(
                PropertyFactory.lineColor(Color.parseColor("#1565C0")),
                PropertyFactory.lineWidth(7.5f),
                PropertyFactory.lineOpacity(0.95f),
                PropertyFactory.lineCap(Property.LINE_CAP_ROUND),
                PropertyFactory.lineJoin(Property.LINE_JOIN_ROUND),
            ),
        )
    }
    if (style.getSource(SRC_TRAVELLED) == null) {
        style.addSource(GeoJsonSource(SRC_TRAVELLED))
        style.addLayer(
            LineLayer(LAYER_TRAVELLED, SRC_TRAVELLED).withProperties(
                PropertyFactory.lineColor(Color.parseColor("#E53935")),
                PropertyFactory.lineWidth(5.5f),
                PropertyFactory.lineOpacity(0.9f),
                PropertyFactory.lineCap(Property.LINE_CAP_ROUND),
                PropertyFactory.lineJoin(Property.LINE_JOIN_ROUND),
            ),
        )
    }
}

private fun updateLineSource(style: Style, sourceId: String, points: List<LatLng>, minPoints: Int) {
    val source = style.getSourceAs<GeoJsonSource>(sourceId) ?: return
    if (points.size < minPoints) {
        source.setGeoJson(FeatureCollection.fromFeatures(emptyArray()))
        return
    }
    val coords = points.map { Point.fromLngLat(it.longitude, it.latitude) }
    source.setGeoJson(FeatureCollection.fromFeature(Feature.fromGeometry(LineString.fromLngLats(coords))))
}

private fun distanceM(a: LatLng, b: LatLng): Double {
    val locA = Location("a").apply { latitude = a.latitude; longitude = a.longitude }
    val locB = Location("b").apply { latitude = b.latitude; longitude = b.longitude }
    return locA.distanceTo(locB).toDouble()
}

private fun offRouteDistanceM(current: LatLng, route: List<LatLng>): Double? {
    if (route.size < 2) return null
    var best = Double.POSITIVE_INFINITY
    for (i in 1 until route.size) {
        best = min(best, pointToSegmentM(current, route[i - 1], route[i]))
    }
    return if (best.isInfinite() || best.isNaN()) null else best
}

private fun pointToSegmentM(p: LatLng, a: LatLng, b: LatLng): Double {
    val ax = a.longitude
    val ay = a.latitude
    val dx = b.longitude - ax
    val dy = b.latitude - ay
    val lenSq = dx * dx + dy * dy
    val t = if (lenSq > 0.0) {
        ((p.longitude - ax) * dx + (p.latitude - ay) * dy) / lenSq
    } else {
        0.0
    }.coerceIn(0.0, 1.0)
    return distanceM(p, LatLng(ay + dy * t, ax + dx * t))
}
