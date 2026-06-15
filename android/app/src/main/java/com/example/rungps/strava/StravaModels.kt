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
