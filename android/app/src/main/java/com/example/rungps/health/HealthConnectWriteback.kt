package com.example.rungps.health

import android.content.Context
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SleepEntryEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.Instant

object HealthConnectWriteback {
    private fun autoBackupEnabled(context: Context): Boolean =
        context.getSharedPreferences("settings", Context.MODE_PRIVATE)
            .getBoolean("healthConnectAutoBackup", false)

    suspend fun maybePushSleep(context: Context, entry: SleepEntryEntity) {
        withContext(Dispatchers.IO) {
            if (!autoBackupEnabled(context)) return@withContext
            val hc = HealthConnectManager(context.applicationContext)
            if (!hc.isAvailable()) return@withContext
            if (!hc.hasSleepWritePermission()) return@withContext
            hc.backupSleepSession(entry)
        }
    }

    suspend fun maybePushRun(context: Context, run: RunEntity) {
        withContext(Dispatchers.IO) {
            if (!autoBackupEnabled(context)) return@withContext
            val hc = HealthConnectManager(context.applicationContext)
            if (!hc.isAvailable()) return@withContext
            if (!hc.hasBackupWritePermissions()) return@withContext
            val endMs = run.endedAtMs ?: return@withContext
            hc.backupRunToHealthConnect(
                runId = run.id,
                startTime = Instant.ofEpochMilli(run.startedAtMs),
                endTime = Instant.ofEpochMilli(endMs),
                distanceMeters = run.totalDistanceM,
                steps = run.totalSteps,
                activityType = run.activityType,
            )
        }
    }
}
