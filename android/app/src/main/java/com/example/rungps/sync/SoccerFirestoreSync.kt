package com.example.rungps.sync

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.SoccerSessionEntity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

object SoccerFirestoreSync {
    private fun collection(uid: String) =
        FirebaseFirestore.getInstance().collection("users").document(uid).collection("soccer_sessions")

    suspend fun pullIntoRoom(context: Context): Int = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext 0
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val snap = collection(uid).get().await()
        var count = 0
        for (doc in snap.documents) {
            val localId = doc.getLong("localId") ?: doc.id.toLongOrNull() ?: continue
            dao.insertSoccerSession(
                SoccerSessionEntity(
                    id = localId,
                    kind = doc.getString("kind") ?: "TRAINING",
                    startTimeMs = doc.getLong("startTimeMs") ?: continue,
                    playMin = (doc.getLong("playMin") ?: 0L).toInt(),
                    intensity = (doc.getLong("intensity") ?: 5L).toInt(),
                    notes = doc.getString("notes"),
                    watchSessionId = doc.getLong("watchSessionId"),
                ),
            )
            count++
        }
        count
    }
}
