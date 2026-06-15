package com.example.rungps.sleep

data class OvernightAnalysis(
    val totalSleepMin: Int,
    val deepSleepMin: Int,
    val lightSleepMin: Int,
    val remSleepMin: Int,
    val awakeSleepMin: Int,
    val snoreEvents: Int,
    val restlessnessIndex: Int,
    val timeToFallAsleepMin: Int,
    val efficiency: Int,
    val sleepCycles: Int,
    val qualityHint: String,
)
