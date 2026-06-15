package com.example.rungps.tracking

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

enum class HudStatField(val label: String) {
    ELAPSED("Elapsed"),
    DISTANCE("Distance"),
    PACE("Pace"),
    SPEED("Speed"),
    STEPS("Steps"),
    HEART_RATE("Heart rate"),
    SPLITS("Splits"),
    LAP("Lap"),
}

private val Context.hudDataStore: DataStore<Preferences> by preferencesDataStore("recording_hud")
private val KEY_FIELDS = stringPreferencesKey("visible_fields")

object RecordingHudPreferences {
    private val defaultOrder = listOf(
        HudStatField.ELAPSED,
        HudStatField.DISTANCE,
        HudStatField.PACE,
        HudStatField.STEPS,
        HudStatField.HEART_RATE,
    )

    fun fieldsFlow(context: Context): Flow<List<HudStatField>> =
        context.hudDataStore.data.map { prefs ->
            val raw = prefs[KEY_FIELDS] ?: return@map defaultOrder
            raw.split(",").mapNotNull { name ->
                runCatching { HudStatField.valueOf(name) }.getOrNull()
            }.ifEmpty { defaultOrder }
        }

    suspend fun setFields(context: Context, fields: List<HudStatField>) {
        context.hudDataStore.edit {
            it[KEY_FIELDS] = fields.joinToString(",") { f -> f.name }
        }
    }

    fun toggleField(current: List<HudStatField>, field: HudStatField): List<HudStatField> =
        if (field in current) current - field else current + field
}
