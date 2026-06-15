package com.example.rungps.strava

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.stravaSecureStore: DataStore<Preferences> by preferencesDataStore("strava_secure")

object StravaSecureStore {
    private val KEY_ACCESS = stringPreferencesKey("access_token")
    private val KEY_REFRESH = stringPreferencesKey("refresh_token")
    private val KEY_EXPIRES = stringPreferencesKey("expires_at_ms")

    suspend fun saveTokens(context: Context, access: String, refresh: String?, expiresAtMs: Long) {
        context.stravaSecureStore.edit { prefs ->
            prefs[KEY_ACCESS] = access
            refresh?.let { prefs[KEY_REFRESH] = it }
            prefs[KEY_EXPIRES] = expiresAtMs.toString()
        }
    }

    suspend fun accessToken(context: Context): String? =
        context.stravaSecureStore.data.map { it[KEY_ACCESS] }.first()

    suspend fun clear(context: Context) {
        context.stravaSecureStore.edit { it.clear() }
    }
}
