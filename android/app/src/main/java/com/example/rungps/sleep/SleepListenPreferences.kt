package com.example.rungps.sleep

import android.content.Context

object SleepListenPreferences {
    private const val PREFS = "sleep_listen"
    private const val KEY_INTEREST = "mic_sleep_interest"
    private const val KEY_SAVE_CLIPS = "mic_sleep_save_clips"
    private const val KEY_SLEPT_ALONE = "slept_alone"
    private const val KEY_SONAR_BETA = "sonar_beta"
    private const val KEY_HIGH_FIDELITY = "high_fidelity_audio"

    fun isInterested(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_INTEREST, false)

    fun setInterested(context: Context, interested: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_INTEREST, interested).apply()
    }

    fun saveSoundClips(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_SAVE_CLIPS, false)

    fun setSaveSoundClips(context: Context, enabled: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_SAVE_CLIPS, enabled).apply()
    }

    fun sleptAlone(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_SLEPT_ALONE, true)

    fun setSleptAlone(context: Context, alone: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putBoolean(KEY_SLEPT_ALONE, alone).apply()
    }

    fun sonarBetaEnabled(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_SONAR_BETA, false)

    fun highFidelityAudio(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_HIGH_FIDELITY, false)
}
