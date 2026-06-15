package com.example.rungps.health

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.health.connect.client.HealthConnectClient
import androidx.health.connect.client.PermissionController
import androidx.health.connect.client.permission.HealthPermission
import androidx.health.connect.client.records.DistanceRecord
import androidx.health.connect.client.records.ExerciseSessionRecord
import androidx.health.connect.client.records.SleepSessionRecord
import androidx.health.connect.client.records.StepsRecord
import androidx.health.connect.client.request.ReadRecordsRequest
import androidx.health.connect.client.time.TimeRangeFilter
import androidx.health.connect.client.units.Length
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.sleep.SleepHypnogramEncoder
import com.example.rungps.sleep.SleepStageLabel
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset

class HealthConnectManager(private val context: Context) {
    private val clientOrNull: HealthConnectClient? by lazy {
        if (!isReady()) return@lazy null
        runCatching { HealthConnectClient.getOrCreate(context) }.getOrNull()
    }

    val stepsReadPermissions = setOf(HealthPermission.getReadPermission(StepsRecord::class))
    val backupWritePermissions = setOf(
        HealthPermission.getWritePermission(StepsRecord::class),
        HealthPermission.getWritePermission(ExerciseSessionRecord::class),
        HealthPermission.getWritePermission(DistanceRecord::class),
    )
    val sleepWritePermissions = setOf(HealthPermission.getWritePermission(SleepSessionRecord::class))
    val sleepReadPermissions = setOf(HealthPermission.getReadPermission(SleepSessionRecord::class))
    val allRequestedPermissions = stepsReadPermissions + backupWritePermissions + sleepWritePermissions + sleepReadPermissions

    fun getSdkStatus(): Int = HealthConnectClient.getSdkStatus(context)

    fun isReady(): Boolean = getSdkStatus() == HealthConnectClient.SDK_AVAILABLE

    fun isAvailable(): Boolean = clientOrNull != null

    fun statusMessage(): String = when (getSdkStatus()) {
        HealthConnectClient.SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED ->
            "Install or update the Health Connect app from Google."
        HealthConnectClient.SDK_AVAILABLE -> "Health Connect is available."
        else -> "Health Connect is not available on this Android profile or OS version."
    }

    fun openHealthConnectApp(): Intent =
        HealthConnectClient.getHealthConnectManageDataIntent(context)

    fun openHealthConnectPlayStore(): Intent = runCatching {
        Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.google.android.apps.healthdata"))
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }.getOrElse {
        Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.healthdata"))
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }

    fun permissionController(): PermissionController? = clientOrNull?.permissionController

    suspend fun hasStepsReadPermission(): Boolean {
        val controller = permissionController() ?: return false
        val granted = controller.getGrantedPermissions()
        return granted.containsAll(stepsReadPermissions)
    }

    suspend fun hasBackupWritePermissions(): Boolean {
        val controller = permissionController() ?: return false
        val granted = controller.getGrantedPermissions()
        return granted.containsAll(backupWritePermissions)
    }

    suspend fun hasSleepWritePermission(): Boolean {
        val controller = permissionController() ?: return false
        val granted = controller.getGrantedPermissions()
        return granted.containsAll(sleepWritePermissions)
    }

    data class SleepWindow(val startMs: Long, val endMs: Long, val totalSleepMin: Int)

    suspend fun readSleepSessions(daysBack: Int = 7, zoneId: ZoneId = ZoneId.systemDefault()): List<SleepWindow> {
        val client = clientOrNull ?: return emptyList()
        val end = Instant.now()
        val start = end.minusSeconds(daysBack.toLong() * 86_400L)
        val response = client.readRecords(
            ReadRecordsRequest(
                recordType = SleepSessionRecord::class,
                timeRangeFilter = TimeRangeFilter.between(start, end),
            ),
        )
        return response.records.map { record ->
            val durationMin = java.time.Duration.between(record.startTime, record.endTime).toMinutes().toInt()
            SleepWindow(
                startMs = record.startTime.toEpochMilli(),
                endMs = record.endTime.toEpochMilli(),
                totalSleepMin = durationMin.coerceAtLeast(0),
            )
        }
    }

    suspend fun backupSleepSession(entry: SleepEntryEntity): Boolean {
        val client = clientOrNull ?: return false
        if (!hasSleepWritePermission()) return false
        val zone = ZoneId.systemDefault()
        val start = Instant.ofEpochMilli(entry.startTimeMs)
        val end = Instant.ofEpochMilli(entry.endTimeMs)
        val startOffset = zone.rules.getOffset(start)
        val endOffset = zone.rules.getOffset(end)
        val stages = hypnogramStagesForWriteback(entry)
        val session = SleepSessionRecord(
            startTime = start,
            startZoneOffset = startOffset,
            endTime = end,
            endZoneOffset = endOffset,
            title = "Exercise Tracker sleep",
            stages = stages,
        )
        return runCatching {
            client.insertRecords(listOf(session))
            true
        }.getOrDefault(false)
    }

    private fun hypnogramStagesForWriteback(entry: SleepEntryEntity): List<SleepSessionRecord.Stage> {
        val compact = entry.hypnogramCompact ?: return emptyList()
        val labels = SleepHypnogramEncoder.decode(compact)
        if (labels.isEmpty()) return emptyList()
        val stages = mutableListOf<SleepSessionRecord.Stage>()
        var i = 0
        while (i < labels.size) {
            val label = labels[i]
            var j = i + 1
            while (j < labels.size && labels[j] == label) j++
            val stageStart = Instant.ofEpochMilli(entry.startTimeMs + i * 60_000L)
            val stageEnd = Instant.ofEpochMilli(entry.startTimeMs + j * 60_000L)
            val stageType = when (label) {
                SleepStageLabel.AWAKE -> 7
                SleepStageLabel.DEEP -> 5
                SleepStageLabel.REM -> 6
                else -> 4
            }
            stages.add(SleepSessionRecord.Stage(stageStart, stageEnd, stageType))
            i = j
        }
        return stages
    }

    suspend fun readStepsForDay(date: LocalDate, zoneId: ZoneId = ZoneId.systemDefault()): Long? {
        val client = clientOrNull ?: return null
        val start = date.atStartOfDay(zoneId).toInstant()
        val end = date.plusDays(1).atStartOfDay(zoneId).toInstant()
        val response = client.readRecords(
            ReadRecordsRequest(
                recordType = StepsRecord::class,
                timeRangeFilter = TimeRangeFilter.between(start, end),
            ),
        )
        return response.records.sumOf { it.count }.takeIf { it > 0 }
    }

    suspend fun backupRunToHealthConnect(
        runId: Long,
        startTime: Instant,
        endTime: Instant,
        distanceMeters: Double,
        steps: Long,
        activityType: String,
    ): Boolean {
        val client = clientOrNull ?: return false
        if (!hasBackupWritePermissions()) return false
        val exerciseType = when (activityType.uppercase()) {
            "BIKE", "RIDE" -> ExerciseSessionRecord.EXERCISE_TYPE_BIKING
            else -> ExerciseSessionRecord.EXERCISE_TYPE_RUNNING
        }
        val zone = ZoneId.systemDefault()
        val startOffset = zone.rules.getOffset(startTime)
        val endOffset = zone.rules.getOffset(endTime)
        val session = ExerciseSessionRecord(
            startTime = startTime,
            startZoneOffset = startOffset,
            endTime = endTime,
            endZoneOffset = endOffset,
            exerciseType = exerciseType,
            title = "Exercise Tracker run #$runId",
        )
        val records = buildList {
            add(session)
            if (steps > 0) {
                add(
                    StepsRecord(
                        startTime = startTime,
                        startZoneOffset = startOffset,
                        endTime = endTime,
                        endZoneOffset = endOffset,
                        count = steps,
                    ),
                )
            }
            if (distanceMeters > 0) {
                add(
                    DistanceRecord(
                        startTime = startTime,
                        startZoneOffset = startOffset,
                        endTime = endTime,
                        endZoneOffset = endOffset,
                        distance = Length.meters(distanceMeters),
                    ),
                )
            }
        }
        return runCatching {
            client.insertRecords(records)
            true
        }.getOrDefault(false)
    }
}
