package com.example.rungps.strava

import java.util.Locale

object StravaActivityTypes {
    enum class Kind { RUN, BIKE, OTHER }

    private val runTypes = setOf(
        "run", "running", "trailrun", "trail_run", "trailrunning", "virtualrun", "virtual_run",
        "indoorrun", "indoor_run", "treadmill", "track", "jog", "roadrun", "road_run", "parkrun", "park_run",
    )
    private val bikeTypes = setOf(
        "ride", "virtualride", "ebikeride", "mountainbikeride", "gravelride", "emountainbikeride", "handcycle",
    )

    fun isRunType(type: String): Boolean = type.trim().lowercase(Locale.ROOT) in runTypes
    fun isBikeType(type: String): Boolean = type.trim().lowercase(Locale.ROOT) in bikeTypes
    fun isTrainingType(type: String): Boolean = isRunType(type) || isBikeType(type)

    fun isStravaRun(type: String, sportType: String? = null): Boolean = classify(type, sportType) == Kind.RUN
    fun isStravaBike(type: String, sportType: String? = null): Boolean = classify(type, sportType) == Kind.BIKE

    fun classify(type: String, sportType: String? = null): Kind {
        val sport = sportType?.trim().orEmpty()
        if (sport.isNotEmpty()) {
            if (isBikeType(sport)) return Kind.BIKE
            if (isRunType(sport)) return Kind.RUN
        }
        return when {
            isBikeType(type) -> Kind.BIKE
            isRunType(type) -> Kind.RUN
            else -> Kind.OTHER
        }
    }

    fun gpxUploadActivityType(isBike: Boolean): String = if (isBike) "ride" else "run"
    fun createActivitySportType(isBike: Boolean): String = if (isBike) "Ride" else "Run"
}
