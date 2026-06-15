package com.example.rungps.ble.moyoung

object MoyoungSportLabels {
    fun label(sportType: Int): String = when (sportType) {
        1 -> "Walk"
        2 -> "Run"
        3 -> "Cycle"
        4 -> "Hike"
        5 -> "Swim"
        MoyoungConstants.TRAINING_TYPE_FOOTBALL -> "Football"
        7 -> "Basketball"
        8 -> "Tennis"
        9 -> "Yoga"
        10 -> "Dance"
        11 -> "Elliptical"
        12 -> "Rowing"
        MoyoungConstants.TRAINING_TYPE_FITNESS -> "Fitness"
        14 -> "Strength"
        15 -> "HIIT"
        16 -> "Climb"
        17 -> "Badminton"
        MoyoungConstants.TRAINING_TYPE_FREE_EXERCISE -> "Free exercise"
        else -> "Sport $sportType"
    }
}
