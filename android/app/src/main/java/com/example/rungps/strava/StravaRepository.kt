package com.example.rungps.strava

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

class StravaRepository private constructor(context: Context) {
    private val prefs = EncryptedSharedPreferences.create(
        context,
        "strava_secure",
        MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(),
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
    )

    fun clientId(): String? = prefs.getString(KEY_CLIENT_ID, null)?.takeIf { it.isNotBlank() }
    fun clientSecret(): String? = prefs.getString(KEY_CLIENT_SECRET, null)?.takeIf { it.isNotBlank() }
    fun accessToken(): String? = prefs.getString(KEY_ACCESS_TOKEN, null)?.takeIf { it.isNotBlank() }
    fun refreshToken(): String? = prefs.getString(KEY_REFRESH_TOKEN, null)?.takeIf { it.isNotBlank() }
    fun expiresAtMs(): Long = prefs.getLong(KEY_EXPIRES_AT_MS, 0L)

    fun saveCredentials(clientId: String, clientSecret: String) {
        prefs.edit()
            .putString(KEY_CLIENT_ID, clientId.trim())
            .putString(KEY_CLIENT_SECRET, clientSecret.trim())
            .apply()
    }

    fun saveTokens(response: StravaTokenResponse) {
        val expiresAt = response.expiresAt?.times(1000L)
            ?: response.expiresIn?.let { System.currentTimeMillis() + it * 1000L }
            ?: 0L
        prefs.edit()
            .putString(KEY_ACCESS_TOKEN, response.accessToken)
            .putString(KEY_REFRESH_TOKEN, response.refreshToken)
            .putLong(KEY_EXPIRES_AT_MS, expiresAt)
            .apply()
    }

    fun clearTokens() {
        prefs.edit()
            .remove(KEY_ACCESS_TOKEN)
            .remove(KEY_REFRESH_TOKEN)
            .remove(KEY_EXPIRES_AT_MS)
            .apply()
    }

    fun isLinked(): Boolean = accessToken() != null

    suspend fun obtainAccessToken(): String {
        val existing = accessToken()
        val expires = expiresAtMs()
        if (existing != null && expires > System.currentTimeMillis() + 60_000L) return existing
        val refresh = refreshToken() ?: throw IllegalStateException("Connect Strava first.")
        val id = clientId() ?: throw IllegalStateException("Strava client ID missing.")
        val secret = clientSecret() ?: throw IllegalStateException("Strava client secret missing.")
        val refreshed = StravaOAuth.refreshAccessToken(id, secret, refresh)
        saveTokens(refreshed)
        return refreshed.accessToken
    }

    companion object {
        private const val KEY_CLIENT_ID = "client_id"
        private const val KEY_CLIENT_SECRET = "client_secret"
        private const val KEY_ACCESS_TOKEN = "access_token"
        private const val KEY_REFRESH_TOKEN = "refresh_token"
        private const val KEY_EXPIRES_AT_MS = "expires_at_ms"

        @Volatile
        private var instance: StravaRepository? = null

        fun get(context: Context): StravaRepository =
            instance ?: synchronized(this) {
                instance ?: StravaRepository(context.applicationContext).also { instance = it }
            }
    }
}
