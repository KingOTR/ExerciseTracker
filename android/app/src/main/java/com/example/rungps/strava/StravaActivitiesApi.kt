package com.example.rungps.strava

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.time.Instant
import kotlin.math.max

object StravaActivitiesApi {
    private val json = Json { ignoreUnknownKeys = true }
    private val listSerializer = ListSerializer(StravaActivityJson.serializer())

    fun fetchAllRunActivities(accessToken: String, maxPages: Int = 25, afterEpochSec: Long? = null): List<StravaActivityJson> =
        fetchAthleteActivities(accessToken, maxPages, afterEpochSec) { StravaActivityTypes.isStravaRun(it.type, it.sportType) }

    fun fetchAllRideActivities(accessToken: String, maxPages: Int = 25, afterEpochSec: Long? = null): List<StravaActivityJson> =
        fetchAthleteActivities(accessToken, maxPages, afterEpochSec) { StravaActivityTypes.isStravaBike(it.type, it.sportType) }

    fun fetchTrainingActivities(accessToken: String, maxPages: Int = 10, afterEpochSec: Long? = null): List<StravaActivityJson> =
        fetchAthleteActivities(accessToken, maxPages, afterEpochSec) {
            StravaActivityTypes.isStravaRun(it.type, it.sportType) ||
                StravaActivityTypes.isStravaBike(it.type, it.sportType)
        }

    fun fetchAllTrainingActivities(accessToken: String, maxPages: Int = 100, afterEpochSec: Long? = null): List<StravaActivityJson> =
        fetchTrainingActivities(accessToken, maxPages, afterEpochSec)

    fun fetchTrainingActivitiesSince(
        accessToken: String,
        sinceMs: Long,
        maxPagesRecent: Int = 20,
        maxPagesAfter: Int = 25,
    ): List<StravaActivityJson> {
        val merged = linkedMapOf<Long, StravaActivityJson>()
        fetchRecentTrainingActivities(accessToken, sinceMs, maxPagesRecent).forEach { merged[it.id] = it }
        val afterSec = max(sinceMs / 1000L, 0L)
        fetchTrainingActivities(accessToken, maxPagesAfter, afterSec).forEach { activity ->
            val start = parseStartMs(activity.startDate, activity.startDateLocal) ?: return@forEach
            if (start >= sinceMs && isTrainingActivityType(activity.type, activity.sportType)) {
                merged.putIfAbsent(activity.id, activity)
            }
        }
        return merged.values.toList()
    }

    fun fetchRecentTrainingActivities(accessToken: String, sinceMs: Long, maxPages: Int = 20): List<StravaActivityJson> {
        val out = mutableListOf<StravaActivityJson>()
        for (page in 1..maxPages) {
            val batch = fetchActivitiesPage(accessToken, page)
            if (batch.isEmpty()) break
            var sawOlder = false
            var sawNewer = false
            for (activity in batch) {
                val start = parseStartMs(activity.startDate, activity.startDateLocal) ?: continue
                when {
                    start < sinceMs -> sawOlder = true
                    isTrainingActivityType(activity.type, activity.sportType) -> {
                        out += activity
                        sawNewer = true
                    }
                }
            }
            if (batch.size < 200 || (sawOlder && !sawNewer)) break
        }
        return out
    }

    private fun fetchAthleteActivities(
        accessToken: String,
        maxPages: Int,
        afterEpochSec: Long?,
        include: (StravaActivityJson) -> Boolean,
    ): List<StravaActivityJson> {
        val extra = afterEpochSec?.takeIf { it > 0 }?.let { "&after=$it" }.orEmpty()
        val out = mutableListOf<StravaActivityJson>()
        for (page in 1..maxPages) {
            val batch = fetchActivitiesPage(accessToken, page, extra)
            if (batch.isEmpty()) break
            batch.filterTo(out) { include(it) }
            if (batch.size < 200) break
        }
        return out
    }

    private fun fetchActivitiesPage(accessToken: String, page: Int, extraQuery: String = ""): List<StravaActivityJson> {
        val url = URL("https://www.strava.com/api/v3/athlete/activities?per_page=200&page=$page$extraQuery")
        val conn = (url.openConnection() as HttpURLConnection).apply {
            requestMethod = "GET"
            setRequestProperty("Authorization", "Bearer $accessToken")
        }
        val code = conn.responseCode
        val stream = if (code in 200..299) conn.inputStream else conn.errorStream
        val body = stream?.bufferedReader()?.use(BufferedReader::readText).orEmpty()
        if (code !in 200..299) error("Strava activities HTTP $code: $body")
        return json.decodeFromString(listSerializer, body)
    }

    fun isTrainingActivityType(type: String, sportType: String? = null): Boolean =
        StravaActivityTypes.isStravaRun(type, sportType) || StravaActivityTypes.isStravaBike(type, sportType)

    fun isBikeType(type: String, sportType: String? = null): Boolean =
        StravaActivityTypes.isStravaBike(type, sportType)

    fun parseStartMs(startDate: String?, startDateLocal: String? = null): Long? {
        for (raw in listOfNotNull(startDate, startDateLocal)) {
            if (raw.isBlank()) continue
            runCatching { return Instant.parse(raw.trim()).toEpochMilli() }
        }
        return null
    }

    fun effectiveMovingSec(activity: StravaActivityJson): Int {
        if (activity.movingTime > 0) return activity.movingTime
        if (activity.elapsedTime > 0) return activity.elapsedTime
        return 0
    }
}

object StravaPbCalculator {
    val runStandards = listOf(
        "1 km" to 1_000.0,
        "3 km" to 3_000.0,
        "5 km" to 5_000.0,
        "10 km" to 10_000.0,
        "12 km" to 12_000.0,
        "Half marathon" to 21_097.5,
        "Marathon" to 42_195.0,
    )
    val rideStandards = listOf(
        "10 km" to 10_000.0,
        "20 km" to 20_000.0,
        "40 km" to 40_000.0,
        "50 km" to 50_000.0,
        "100 km" to 100_000.0,
    )

    fun computeRuns(activities: List<StravaActivityJson>, syncedAtMs: Long): List<StravaPbRecord> =
        compute(activities, syncedAtMs, "RUN", runStandards) { StravaActivityTypes.isStravaRun(it.type, it.sportType) }

    fun computeRides(activities: List<StravaActivityJson>, syncedAtMs: Long): List<StravaPbRecord> =
        compute(activities, syncedAtMs, "RIDE", rideStandards) { StravaActivityTypes.isStravaBike(it.type, it.sportType) }

    fun compute(activities: List<StravaActivityJson>, syncedAtMs: Long): List<StravaPbRecord> =
        computeRuns(activities, syncedAtMs)

    private fun compute(
        activities: List<StravaActivityJson>,
        syncedAtMs: Long,
        activityKind: String,
        standards: List<Pair<String, Double>>,
        include: (StravaActivityJson) -> Boolean,
    ): List<StravaPbRecord> {
        val filtered = activities.filter(include)
        val out = mutableListOf<StravaPbRecord>()
        for ((label, targetM) in standards) {
            val low = targetM * 0.98
            val high = targetM * 1.12
            val exact = filtered
                .filter {
                    val moving = StravaActivitiesApi.effectiveMovingSec(it)
                    it.distance in low..high && moving > 0
                }
                .minByOrNull { StravaActivitiesApi.effectiveMovingSec(it) }
            val best = exact ?: filtered
                .filter {
                    val moving = StravaActivitiesApi.effectiveMovingSec(it)
                    it.distance >= low && moving > 0
                }
                .minByOrNull {
                    val moving = StravaActivitiesApi.effectiveMovingSec(it).toLong()
                    val scaled = (moving * (targetM / max(it.distance, 1.0))).toLong()
                    scaled
                }
            if (best == null) continue
            val moving = StravaActivitiesApi.effectiveMovingSec(best)
            val timeSec = if (best.distance < low || best.distance > high) {
                max((moving * (targetM / max(best.distance, 1.0))).toLong(), 1L)
            } else {
                max(moving.toLong(), 1L)
            }
            out += StravaPbRecord(
                activityKind = activityKind,
                label = label,
                distanceM = targetM,
                timeSec = timeSec,
                stravaActivityId = best.id,
                activityName = best.name,
                startDate = best.startDate,
                syncedAtMs = syncedAtMs,
            )
        }
        return out
    }
}
