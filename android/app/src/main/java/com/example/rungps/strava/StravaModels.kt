package com.example.rungps.strava

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StravaTokenResponse(
    @SerialName("access_token") val accessToken: String,
    @SerialName("refresh_token") val refreshToken: String? = null,
    @SerialName("expires_at") val expiresAt: Long? = null,
    @SerialName("expires_in") val expiresIn: Int? = null,
    val scope: String? = null,
)

@Serializable
data class StravaCreatedActivity(
    val id: Long,
    val name: String? = null,
)

@Serializable
data class StravaActivityJson(
    val id: Long,
    val name: String? = null,
    val distance: Double = 0.0,
    @SerialName("moving_time") val movingTime: Int = 0,
    @SerialName("elapsed_time") val elapsedTime: Int = 0,
    val type: String = "",
    @SerialName("sport_type") val sportType: String? = null,
    @SerialName("start_date") val startDate: String? = null,
    @SerialName("start_date_local") val startDateLocal: String? = null,
)

@Serializable
data class StravaPbRecord(
    val activityKind: String,
    val label: String,
    val distanceM: Double,
    val timeSec: Long,
    val stravaActivityId: Long,
    val activityName: String? = null,
    val startDate: String? = null,
    val syncedAtMs: Long,
)
