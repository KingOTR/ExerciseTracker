package com.example.rungps.sync

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repo.RunRepository
import com.example.rungps.strava.StravaActivitiesApi
import com.example.rungps.strava.StravaHistoryImporter
import com.example.rungps.strava.StravaPbCalculator
import com.example.rungps.strava.StravaPbRecord
import com.example.rungps.strava.StravaRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.tasks.await

data class StravaHistorySyncResult(
    val imported: Int = 0,
    val skipped: Int = 0,
    val pbs: List<StravaPbRecord> = emptyList(),
    val message: String = "",
)

object StravaHistorySync {
    suspend fun importRecent(context: Context, daysBack: Int = 90): StravaHistorySyncResult {
        val repo = StravaRepository.get(context)
        if (!repo.isLinked()) return StravaHistorySyncResult(message = "Connect Strava first")
        val token = repo.obtainAccessToken()
        val sinceMs = System.currentTimeMillis() - daysBack * 86_400_000L
        val activities = StravaActivitiesApi.fetchTrainingActivitiesSince(token, sinceMs)
        val db = ExerciseTrackerDatabase.get(context)
        val runRepo = RunRepository(db.exerciseTrackerDao())
        val localRuns = runRepo.allRuns()
        val linkedIds = localRuns.mapNotNull { it.stravaImportId }.toSet()
        var imported = 0
        var skipped = 0
        for (activity in activities) {
            val (outcome, _) = StravaHistoryImporter.importActivity(runRepo, activity, linkedIds, localRuns)
            when (outcome) {
                StravaHistoryImporter.Outcome.IMPORTED -> imported++
                else -> skipped++
            }
        }
        val syncedAt = System.currentTimeMillis()
        val pbs = StravaPbCalculator.compute(activities, syncedAt)
        pushPbsToFirestore(pbs)
        return StravaHistorySyncResult(
            imported = imported,
            skipped = skipped,
            pbs = pbs,
            message = "Imported $imported Strava activities (${pbs.size} PB rows)",
        )
    }

    private suspend fun pushPbsToFirestore(pbs: List<StravaPbRecord>) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return
        val batch = FirebaseFirestore.getInstance().batch()
        val col = FirebaseFirestore.getInstance().collection(FirestorePaths.stravaPbs(uid))
        pbs.forEach { pb ->
            val doc = col.document("${pb.activityKind}_${pb.label.replace(" ", "_")}")
            batch.set(
                doc,
                mapOf(
                    "activityKind" to pb.activityKind,
                    "label" to pb.label,
                    "distanceM" to pb.distanceM,
                    "timeSec" to pb.timeSec,
                    "stravaActivityId" to pb.stravaActivityId,
                    "activityName" to pb.activityName,
                    "startDate" to pb.startDate,
                    "syncedAtMs" to pb.syncedAtMs,
                ),
                SetOptions.merge(),
            )
        }
        batch.commit().await()
        FirebaseFirestore.getInstance()
            .document(FirestorePaths.stravaMeta(uid))
            .set(mapOf("lastPbSyncMs" to System.currentTimeMillis()), SetOptions.merge())
            .await()
    }
}
