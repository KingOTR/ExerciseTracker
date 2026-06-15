package com.example.rungps.sleep

object SleepSonarBeta {
    const val ENABLED_PREF = "sleep_sonar_beta_enabled"
    var enabled: Boolean = false

    data class RangeSample(val distanceM: Float, val timestampMs: Long, val confidence: Float)

    fun isSupported(): Boolean = false // Experimental; requires hardware ranging APIs
}

object SleepSonarProbe {
    fun probe(): String = "Sonar beta unavailable on this device build."
}
