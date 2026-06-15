package com.example.rungps.routing

import android.location.Location
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.osmdroid.util.GeoPoint
import java.net.HttpURLConnection
import java.net.URL
import kotlin.math.max
import kotlin.math.min

object OsrmWalkingRouter {
    private const val MAX_INPUT_COORDS = 85
    private const val MAX_STITCH_ANCHORS = 80
    private const val MAX_SNAP_BUTTON_ANCHORS = 28
    private const val VIA_STEP_M = 28.0
    private const val VIA_MIN_SEGMENT_M = 80.0

    private val bases = listOf(
        "https://router.project-osrm.org",
        "https://routing.openstreetmap.de/routed-foot",
    )
    private val cache = object : LinkedHashMap<String, List<GeoPoint>>(96, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, List<GeoPoint>>?): Boolean = size > 96
    }

    private val json = Json { ignoreUnknownKeys = true }

    private fun distM(a: GeoPoint, b: GeoPoint): Double {
        val la = Location("a").apply { latitude = a.latitude; longitude = a.longitude }
        val lb = Location("b").apply { latitude = b.latitude; longitude = b.longitude }
        return la.distanceTo(lb).toDouble()
    }

    fun viaPointsOnChord(a: GeoPoint, b: GeoPoint): List<GeoPoint> {
        val dist = distM(a, b)
        if (dist < VIA_MIN_SEGMENT_M) return emptyList()
        val count = ((dist / VIA_STEP_M).toInt() - 1).coerceIn(1, 28)
        return (1..count).map { i ->
            val t = i / (count + 1.0)
            GeoPoint(a.latitude + (b.latitude - a.latitude) * t, a.longitude + (b.longitude - a.longitude) * t)
        }
    }

    fun anchorsForSnap(waypoints: List<GeoPoint>, polyline: List<GeoPoint>, maxAnchors: Int = MAX_STITCH_ANCHORS): List<GeoPoint> {
        val source = if (waypoints.size >= 2) waypoints else polyline.takeIf { it.size >= 2 } ?: return emptyList()
        return dedupeShortLegs(subsampleUniformByIndex(source, maxAnchors), 3.0)
    }

    fun anchorsForSnapButton(waypoints: List<GeoPoint>, polyline: List<GeoPoint>): List<GeoPoint> {
        val source = if (waypoints.size >= 2) waypoints else polyline.takeIf { it.size >= 2 } ?: return emptyList()
        val sampled = if (waypoints.size < 2) subsampleUniformByIndex(polyline, MAX_SNAP_BUTTON_ANCHORS) else waypoints
        return dedupeShortLegs(subsampleUniformByIndex(sampled, MAX_SNAP_BUTTON_ANCHORS), 8.0)
    }

    suspend fun footRouteGeometry(points: List<GeoPoint>): Result<List<GeoPoint>> {
        if (points.size < 2) return Result.failure(IllegalArgumentException("Add at least 2 points"))
        val cleaned = subsampleUniformByIndex(dedupeShortLegs(points, 2.0), MAX_INPUT_COORDS)
        return requestFootGeometry(cleaned)
    }

    suspend fun snapWalkingRoute(anchors: List<GeoPoint>): Result<List<GeoPoint>> {
        if (anchors.size < 2) return Result.failure(IllegalArgumentException("Add at least 2 points"))
        val sampled = dedupeShortLegs(subsampleUniformByIndex(anchors, MAX_STITCH_ANCHORS), 3.0)
        return footRouteGeometry(sampled)
    }

    suspend fun footRouteStitched(points: List<GeoPoint>, addViaOnLongLegs: Boolean = true): Result<List<GeoPoint>> {
        if (points.size < 2) return Result.failure(IllegalArgumentException("Add at least 2 points"))
        val chain = if (addViaOnLongLegs) {
            buildList {
                for (i in points.indices) {
                    add(points[i])
                    if (i < points.lastIndex) addAll(viaPointsOnChord(points[i], points[i + 1]))
                }
            }
        } else {
            points
        }
        return stitchLegsParallel(chain)
    }

    private suspend fun stitchLegsParallel(chain: List<GeoPoint>): Result<List<GeoPoint>> = coroutineScope {
        if (chain.size < 2) return@coroutineScope Result.success(chain)
        val segments = (0 until chain.lastIndex).map { i -> chain[i] to chain[i + 1] }
        val legs = segments.map { (a, b) ->
            async { requestFootGeometry(listOf(a, b)).getOrElse { listOf(a, b) } }
        }.awaitAll()
        val merged = mutableListOf<GeoPoint>()
        legs.forEachIndexed { idx, leg ->
            if (idx == 0) merged += leg else merged += leg.drop(1)
        }
        Result.success(merged)
    }

    private suspend fun requestFootGeometry(points: List<GeoPoint>): Result<List<GeoPoint>> {
        val key = cacheKey(points)
        cache[key]?.let { return Result.success(it) }
        var lastError: Throwable? = null
        for (base in bases) {
            val result = runCatching { fetchFromBase(base, key) }
            if (result.isSuccess) {
                cache[key] = result.getOrThrow()
                return result
            }
            lastError = result.exceptionOrNull()
        }
        return Result.failure(lastError ?: IllegalStateException("OSRM routing failed"))
    }

    private suspend fun fetchFromBase(base: String, coordPath: String): List<GeoPoint> = withContext(Dispatchers.IO) {
        val url = URL("$base/route/v1/foot/$coordPath?overview=full&geometries=geojson&steps=false")
        val conn = (url.openConnection() as HttpURLConnection).apply {
            connectTimeout = 12_000
            readTimeout = 20_000
            requestMethod = "GET"
        }
        val code = conn.responseCode
        val body = (if (code in 200..299) conn.inputStream else conn.errorStream)
            ?.bufferedReader()?.use { it.readText() }.orEmpty()
        if (code !in 200..299) error("OSRM HTTP $code: $body")
        val routes = json.parseToJsonElement(body).jsonObject["routes"]?.jsonArray
            ?: error("OSRM missing routes")
        val geometry = routes.firstOrNull()?.jsonObject?.get("geometry")?.jsonObject
            ?: error("OSRM missing geometry")
        val coords = geometry["coordinates"]?.jsonArray ?: error("OSRM missing coordinates")
        coords.map { node ->
            val arr = node.jsonArray
            GeoPoint(arr[1].jsonPrimitive.content.toDouble(), arr[0].jsonPrimitive.content.toDouble())
        }
    }

    private fun cacheKey(points: List<GeoPoint>): String =
        points.joinToString(";") { "${it.longitude},${it.latitude}" }

    private fun subsampleUniformByIndex(points: List<GeoPoint>, max: Int): List<GeoPoint> {
        if (points.size <= max) return points
        val last = points.lastIndex
        return List(max) { idx -> points[(idx * last) / (max - 1)] }
    }

    private fun dedupeShortLegs(points: List<GeoPoint>, minLegM: Double): List<GeoPoint> {
        if (points.size < 2) return points
        val out = mutableListOf(points.first())
        for (i in 1 until points.size) {
            if (distM(out.last(), points[i]) >= minLegM) out += points[i]
        }
        val last = points.last()
        if (out.last().latitude != last.latitude || out.last().longitude != last.longitude) {
            if (distM(out.last(), last) >= 1.0) out += last
        }
        return out
    }

    private fun simplifyPoints(points: List<GeoPoint>, minStepM: Double, maxPoints: Int): List<GeoPoint> {
        if (points.size <= 2) return points
        val out = mutableListOf(points.first())
        var anchor = points.first()
        for (i in 1 until points.lastIndex) {
            val p = points[i]
            if (distM(anchor, p) >= minStepM) {
                out += p
                if (out.size >= maxPoints - 1) break
                anchor = p
            }
        }
        out += points.last()
        return out
    }
}
