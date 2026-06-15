package com.example.rungps.strava

import kotlinx.serialization.json.Json
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import kotlin.math.max

object StravaUploadApi {
    private val json = Json { ignoreUnknownKeys = true }
    private val localFmt: DateTimeFormatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneId.systemDefault())

    fun createRunActivity(
        accessToken: String,
        name: String,
        startTimeMs: Long,
        elapsedSec: Int,
        distanceM: Double,
        description: String? = null,
        sportType: String = "Run",
    ): Long {
        val conn = (URL("https://www.strava.com/api/v3/activities").openConnection() as HttpURLConnection).apply {
            requestMethod = "POST"
            doOutput = true
            setRequestProperty("Authorization", "Bearer $accessToken")
            setRequestProperty("Content-Type", "application/json")
        }
        val startLocal = localFmt.format(Instant.ofEpochMilli(startTimeMs))
        val sb = StringBuilder()
            .append("{\"name\":\"").append(escapeJson(name))
            .append("\",\"type\":\"").append(escapeJson(sportType))
            .append("\",\"sport_type\":\"").append(escapeJson(sportType))
            .append("\",\"start_date_local\":\"").append(startLocal)
            .append("\",\"elapsed_time\":").append(max(elapsedSec, 1))
            .append(",\"distance\":").append(max(distanceM, 0.0))
        if (!description.isNullOrBlank()) {
            sb.append(",\"description\":\"").append(escapeJson(description)).append("\"")
        }
        sb.append("}")
        OutputStreamWriter(conn.outputStream, Charsets.UTF_8).use { it.write(sb.toString()) }
        val code = conn.responseCode
        val stream = if (code in 200..299) conn.inputStream else conn.errorStream
        val text = stream?.let { BufferedReader(InputStreamReader(it, Charsets.UTF_8)).readText() } ?: ""
        if (code !in 200..299) throw IllegalStateException("Strava upload failed $code: $text")
        return json.decodeFromString(StravaCreatedActivity.serializer(), text).id
    }

    private fun escapeJson(s: String): String =
        s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n")
}
