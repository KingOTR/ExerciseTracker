package com.example.rungps.sync

/**
 * Firestore collection paths recovered from decompiled v0.7.93
 * (`com.example.rungps.sync.*FirestoreSync`).
 */
object FirestorePaths {
    const val USERS = "users"

    fun gymSessions(uid: String) = "$USERS/$uid/gym_sessions"
    fun runs(uid: String) = "$USERS/$uid/runs"
    fun sleepEntries(uid: String) = "$USERS/$uid/sleep_entries"
    fun soccerSessions(uid: String) = "$USERS/$uid/soccer_sessions"
    fun recoveryEvents(uid: String) = "$USERS/$uid/recovery_events"
    fun dailySteps(uid: String) = "$USERS/$uid/daily_steps"
    fun savedRoutes(uid: String) = "$USERS/$uid/saved_routes"
    fun stravaPbs(uid: String) = "$USERS/$uid/strava_pbs"
    fun exerciseMuscleTags(uid: String) = "$USERS/$uid/gym_config/exercise_muscle_tags"
    fun activeSplit(uid: String) = "$USERS/$uid/gym_config/active_split"
    fun stravaMeta(uid: String) = "$USERS/$uid/meta/strava"
    fun bodyProfile(uid: String) = "$USERS/$uid/prefs/body_profile"
}
