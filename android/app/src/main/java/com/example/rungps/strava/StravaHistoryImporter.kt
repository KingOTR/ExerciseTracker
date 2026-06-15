package com.example.rungps.strava

import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.repo.RunRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object StravaHistoryImporter {
    enum class Outcome { IMPORTED, SKIPPED_LINKED, SKIPPED_EXISTS, SKIPPED_DUPLICATE, REJECTED }

    fun isImportable(activity: StravaActivityJson): Boolean =
        StravaActivitiesApi.isTrainingActivityType(activity.type, activity.sportType) &&
            StravaActivitiesApi.effectiveMovingSec(activity) > 0

    suspend fun importActivity(
        runRepo: RunRepository,
        activity: StravaActivityJson,
        linkedIds: Set<Long>,
        localRuns: List<RunEntity>,
        onImported: suspend (RunEntity) -> Unit = {},
    ): Pair<Outcome, Boolean> = withContext(Dispatchers.IO) {
        if (activity.id in linkedIds) return@withContext Outcome.SKIPPED_LINKED to false
        if (!isImportable(activity)) return@withContext Outcome.REJECTED to false

        val startMs = StravaActivitiesApi.parseStartMs(activity.startDate, activity.startDateLocal)
            ?: return@withContext Outcome.REJECTED to false
        val movingSec = StravaActivitiesApi.effectiveMovingSec(activity)
        val endMs = startMs + movingSec * 1000L
        val duplicate = localRuns.any {
            it.stravaImportId == activity.id ||
                (kotlin.math.abs(it.startedAtMs - startMs) < 120_000L &&
                    kotlin.math.abs(it.totalDistanceM - activity.distance) < 50.0)
        }
        if (duplicate) return@withContext Outcome.SKIPPED_DUPLICATE to false

        val existing = localRuns.firstOrNull {
            it.startedAtMs == startMs && it.totalDistanceM == activity.distance
        }
        if (existing != null) return@withContext Outcome.SKIPPED_EXISTS to false

        val isBike = StravaActivityTypes.isStravaBike(activity.type, activity.sportType)
        val run = RunEntity(
            startedAtMs = startMs,
            endedAtMs = endMs,
            totalDistanceM = activity.distance,
            totalDurationMs = movingSec * 1000L,
            activityType = if (isBike) "BIKE" else "RUN",
            stravaImportId = activity.id,
            title = activity.name,
        )
        val id = runRepo.insert(run.copy(id = 0))
        onImported(run.copy(id = id))
        Outcome.IMPORTED to isBike
    }
}

object StravaPhotoUpload {
  suspend fun uploadOverlayPhoto(
      accessToken: String,
      activityId: Long,
      jpegBytes: ByteArray,
      caption: String? = null,
  ): Boolean = withContext(Dispatchers.IO) {
      runCatching {
          val boundary = "----ExerciseTracker${System.currentTimeMillis()}"
          val url = java.net.URL("https://www.strava.com/api/v3/activities/$activityId/photos")
          val conn = (url.openConnection() as java.net.HttpURLConnection).apply {
              requestMethod = "POST"
              doOutput = true
              setRequestProperty("Authorization", "Bearer $accessToken")
              setRequestProperty("Content-Type", "multipart/form-data; boundary=$boundary")
          }
          conn.outputStream.use { out ->
              fun writeLine(line: String) = out.write("$line\r\n".toByteArray())
              writeLine("--$boundary")
              writeLine("Content-Disposition: form-data; name=\"file\"; filename=\"overlay.jpg\"")
              writeLine("Content-Type: image/jpeg")
              writeLine("")
              out.write(jpegBytes)
              writeLine("")
              if (!caption.isNullOrBlank()) {
                  writeLine("--$boundary")
                  writeLine("Content-Disposition: form-data; name=\"caption\"")
                  writeLine("")
                  writeLine(caption)
              }
              writeLine("--$boundary--")
          }
          conn.responseCode in 200..299
      }.getOrDefault(false)
  }
}
