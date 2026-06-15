package com.example.rungps.ble.moyoung

data class MoyoungWorkout(
    val startTimeMs: Long,
    val endTimeMs: Long,
    val activeSeconds: Int,
    val sportType: Int,
    val avgHeartRate: Int? = null,
    val steps: Int = 0,
    val distanceM: Int = 0,
    val calories: Int = 0,
    val hrSeries: List<MoyoungHrParser.HrPoint> = emptyList(),
) {
    val durationMin: Int get() = maxOf(activeSeconds / 60, 1)
    val isSoccerLike: Boolean
        get() = sportType == MoyoungConstants.TRAINING_TYPE_FOOTBALL ||
            sportType == MoyoungConstants.TRAINING_TYPE_FITNESS ||
            sportType == MoyoungConstants.TRAINING_TYPE_FREE_EXERCISE
    val dedupeId: Long get() = (startTimeMs xor endTimeMs) xor (sportType.toLong() * 1_000_003L)
}
