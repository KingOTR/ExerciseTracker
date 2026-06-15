package com.example.rungps.sync

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.RunEntity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

object RunFirestoreSync {
    private fun runsCollection(uid: String) =
        FirebaseFirestore.getInstance().collection("users").document(uid).collection("runs")

    suspend fun pushFinishedRun(context: Context, localRunId: Long) = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val run = dao.observeRuns().first().find { it.id == localRunId } ?: return@withContext
        val splits = dao.observeKmSplits(localRunId).first()
        val doc = mapOf(
            "localId" to run.id,
            "startedAtMs" to run.startedAtMs,
            "endedAtMs" to run.endedAtMs,
            "distanceM" to run.totalDistanceM,
            "durationMs" to run.totalDurationMs,
            "activityType" to run.activityType,
            "kmSplits" to splits.map { s ->
                mapOf("kind" to s.kind, "idx" to s.idx, "durationMs" to s.durationMs, "distanceM" to s.distanceM)
            },
            "updatedAtMs" to System.currentTimeMillis(),
        )
        runsCollection(uid).document(run.id.toString()).set(doc, SetOptions.merge()).await()
    }

    suspend fun pullIntoRoom(context: Context): Int = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext 0
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val snap = runsCollection(uid).get().await()
        var count = 0
        for (doc in snap.documents) {
            val localId = doc.getLong("localId") ?: doc.id.toLongOrNull() ?: continue
            dao.insertRun(
                RunEntity(
                    id = localId,
                    startedAtMs = doc.getLong("startedAtMs") ?: continue,
                    endedAtMs = doc.getLong("endedAtMs"),
                    totalDistanceM = doc.getDouble("distanceM") ?: 0.0,
                    totalDurationMs = doc.getLong("durationMs") ?: 0L,
                    activityType = doc.getString("activityType") ?: "RUN",
                ),
            )
            @Suppress("UNCHECKED_CAST")
            val splits = doc.get("kmSplits") as? List<Map<String, Any?>> ?: emptyList()
            dao.insertKmSplits(
                splits.mapNotNull { row ->
                    val idx = (row["idx"] as? Number)?.toInt() ?: return@mapNotNull null
                    com.example.rungps.data.entity.KmSplitEntity(
                        runId = localId,
                        kind = row["kind"] as? String ?: "KM",
                        idx = idx,
                        durationMs = (row["durationMs"] as? Number)?.toLong() ?: 0L,
                        distanceM = (row["distanceM"] as? Number)?.toDouble() ?: 0.0,
                    )
                },
            )
            count++
        }
        count
    }
}
