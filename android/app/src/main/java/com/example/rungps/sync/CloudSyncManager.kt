package com.example.rungps.sync

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Orchestrates bidirectional Firestore sync — ported from
 * `com.example.rungps.sync.CloudSyncManager`.
 */
object CloudSyncManager {
    private const val PREFS = "cloud_sync"
    private const val KEY_LAST_SYNC = "last_cloud_sync_ms"

    fun lastSyncMs(context: Context): Long =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getLong(KEY_LAST_SYNC, 0L)

    fun touchGymSession(context: Context, sessionId: Long) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putLong("gym_local_updated_$sessionId", System.currentTimeMillis())
            .apply()
    }

    suspend fun syncAll(context: Context): CloudSyncResult = withContext(Dispatchers.IO) {
        val user = FirebaseAuth.getInstance().currentUser
            ?: return@withContext CloudSyncResult(errors = listOf("Not signed in"))
        val errors = mutableListOf<String>()
        var gym = 0
        var runs = 0
        var soccer = 0
        var sleep = 0
        var recovery = 0

        runCatching { gym = GymFirestoreSync.pullIntoRoom(context) }
            .onFailure { errors += "gym: ${it.message}" }
        runCatching { runs = RunFirestoreSync.pullIntoRoom(context) }
            .onFailure { errors += "runs: ${it.message}" }
        runCatching { soccer = SoccerFirestoreSync.pullIntoRoom(context) }
            .onFailure { errors += "soccer: ${it.message}" }
        runCatching { sleep = SleepFirestoreSync.pullIntoRoom(context) }
            .onFailure { errors += "sleep: ${it.message}" }
        runCatching { recovery = RecoveryFirestoreSync.pullIntoRoom(context) }
            .onFailure { errors += "recovery: ${it.message}" }

        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putLong(KEY_LAST_SYNC, System.currentTimeMillis())
            .apply()

        CloudSyncResult(
            gymPulled = gym,
            runsPulled = runs,
            soccerPulled = soccer,
            sleepPulled = sleep,
            recoveryPulled = recovery,
            errors = errors,
        )
    }
}
