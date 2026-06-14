package com.exercisetracker.app.sync

import android.content.Context
import com.exercisetracker.app.data.ExerciseTrackerDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

object GymFirestoreSync {
    private fun sessionsCollection(uid: String) =
        FirebaseFirestore.getInstance().collection("users").document(uid).collection("gym_sessions")

    suspend fun pushFinishedSession(context: Context, localSessionId: Long) = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val session = dao.observeGymSessions().first().find { it.id == localSessionId }
        val sets = dao.observeGymSets(localSessionId).first()
        if (session == null) return@withContext
        val doc = mapOf(
            "localId" to session.id,
            "startedAtMs" to session.startedAtMs,
            "endedAtMs" to session.endedAtMs,
            "freeDay" to session.freeDay,
            "sets" to sets.map { set ->
                mapOf(
                    "exerciseName" to set.exerciseName,
                    "setIndex" to set.setIndex,
                    "reps" to set.reps,
                    "weightKg" to set.weightKg,
                    "loggedAtMs" to set.loggedAtMs,
                )
            },
            "updatedAtMs" to System.currentTimeMillis(),
        )
        sessionsCollection(uid).document(session.id.toString()).set(doc, SetOptions.merge()).await()
    }

    suspend fun pullIntoRoom(context: Context): Int = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext 0
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val snap = sessionsCollection(uid).get().await()
        var count = 0
        for (doc in snap.documents) {
            val startedAtMs = doc.getLong("startedAtMs") ?: continue
            val localId = doc.getLong("localId") ?: doc.id.toLongOrNull() ?: continue
            dao.insertGymSession(
                com.exercisetracker.app.data.entity.GymSessionEntity(
                    id = localId,
                    startedAtMs = startedAtMs,
                    endedAtMs = doc.getLong("endedAtMs"),
                    freeDay = doc.getBoolean("freeDay") ?: false,
                ),
            )
            @Suppress("UNCHECKED_CAST")
            val sets = doc.get("sets") as? List<Map<String, Any?>> ?: emptyList()
            dao.insertGymSets(
                sets.mapNotNull { row ->
                    val name = row["exerciseName"] as? String ?: return@mapNotNull null
                    val idx = (row["setIndex"] as? Number)?.toInt() ?: return@mapNotNull null
                    com.exercisetracker.app.data.entity.GymSetEntity(
                        sessionId = localId,
                        exerciseName = name,
                        setIndex = idx,
                        reps = (row["reps"] as? Number)?.toInt(),
                        weightKg = (row["weightKg"] as? Number)?.toDouble(),
                        loggedAtMs = (row["loggedAtMs"] as? Number)?.toLong(),
                    )
                },
            )
            count++
        }
        count
    }
}
