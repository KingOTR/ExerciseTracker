package com.example.rungps.tracking

object ActivityTypes {
    const val RUN = "RUN"
    const val BIKE = "BIKE"

    fun isBike(type: String?): Boolean = type == BIKE

    fun label(type: String?): String = if (isBike(type)) "Ride" else "Run"

    fun labelPlural(type: String?): String = if (isBike(type)) "Rides" else "Runs"

    fun recoveryKind(type: String?): String = if (isBike(type)) BIKE else RUN
}
