package com.exercisetracker.app.sync

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

/** Pull-only stub — recovery events are computed client-side in the original app. */
object RecoveryFirestoreSync {
    private fun collection(uid: String) =
        FirebaseFirestore.getInstance().collection("users").document(uid).collection("recovery_events")

    suspend fun pullIntoRoom(context: Context): Int = withContext(Dispatchers.IO) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@withContext 0
        collection(uid).get().await().size()
    }
}
