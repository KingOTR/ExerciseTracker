package com.example.rungps.sync

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

data class GymConflict(
    val sessionId: Long,
    val localUpdatedMs: Long,
    val remoteUpdatedMs: Long,
)

object ConflictDetector {
    private const val PREFS = "cloud_sync"

    suspend fun detectGymConflicts(context: Context): List<GymConflict> = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext emptyList()
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val localSessions = dao.observeGymSessions().first()
        val remoteDocs = FirebaseFirestore.getInstance()
            .collection("users").document(uid).collection("gym_sessions")
            .get().await()
        val conflicts = mutableListOf<GymConflict>()
        for (session in localSessions) {
            val localUpdated = prefs.getLong("gym_local_updated_${session.id}", session.startedAtMs)
            val remote = remoteDocs.documents.find {
                it.getLong("localId") == session.id || it.id == session.id.toString()
            } ?: continue
            val remoteUpdated = remote.getLong("updatedAtMs") ?: continue
            if (kotlin.math.abs(localUpdated - remoteUpdated) > 5_000L) {
                conflicts += GymConflict(session.id, localUpdated, remoteUpdated)
            }
        }
        conflicts
    }

    suspend fun mergeKeepLocal(context: Context, sessionId: Long) {
        GymFirestoreSync.pushFinishedSession(context, sessionId)
        CloudSyncManager.touchGymSession(context, sessionId)
    }

    suspend fun mergeKeepRemote(context: Context, sessionId: Long) {
        GymFirestoreSync.pullIntoRoom(context)
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
            .remove("gym_local_updated_$sessionId")
            .apply()
    }
}
