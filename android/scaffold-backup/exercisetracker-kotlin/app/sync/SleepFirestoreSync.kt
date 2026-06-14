package com.exercisetracker.app.sync

import android.content.Context
import com.exercisetracker.app.data.ExerciseTrackerDatabase
import com.exercisetracker.app.data.entity.SleepRecordEntity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

object SleepFirestoreSync {
    private fun collection(uid: String) =
        FirebaseFirestore.getInstance().collection("users").document(uid).collection("sleep_entries")

    suspend fun pullIntoRoom(context: Context): Int = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext 0
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val snap = collection(uid).get().await()
        var count = 0
        for (doc in snap.documents) {
            dao.insertSleepRecord(
                SleepRecordEntity(
                    startTimeMs = doc.getLong("startTimeMs") ?: continue,
                    endTimeMs = doc.getLong("endTimeMs") ?: continue,
                    totalSleepMin = (doc.getLong("totalSleepMin") ?: 0L).toInt(),
                    sleepEfficiency = doc.getLong("sleepEfficiency")?.toInt(),
                    sleepQuality = doc.getLong("sleepQuality")?.toInt(),
                    source = doc.getString("source"),
                ),
            )
            count++
        }
        count
    }
}
