package com.example.rungps.sync

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.util.UUID

object ShareLinkRepository {
    private const val WEB_BASE = "https://exercise-tracker-2936d.web.app/share"

    suspend fun createShareLink(
        context: Context,
        scope: String = "week",
        resourceId: String? = null,
    ): Result<String> = withContext(Dispatchers.IO) {
        runCatching {
            val uid = FirebaseAuth.getInstance().currentUser?.uid
                ?: error("Sign in to create share links")
            val token = UUID.randomUUID().toString().replace("-", "").take(16)
            val doc = mapOf(
                "ownerUid" to uid,
                "scope" to scope,
                "resourceId" to (resourceId ?: "latest"),
                "createdAtMs" to System.currentTimeMillis(),
                "expiresAtMs" to System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000,
            )
            FirebaseFirestore.getInstance()
                .collection("share_links")
                .document(token)
                .set(doc)
                .await()
            "$WEB_BASE/$token"
        }
    }
}
