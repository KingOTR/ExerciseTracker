package com.example.rungps.tracking

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.asin
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

object GeoMath {
    fun haversineM(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val r = 6_371_000.0
        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)
        val a = sin(dLat / 2).pow(2) +
            cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) * sin(dLon / 2).pow(2)
        return 2 * r * asin(sqrt(a))
    }
}

class TrackingGeoMathTest {
    @Test
    fun haversine_oneDegreeApprox111km() {
        val d = GeoMath.haversineM(0.0, 0.0, 1.0, 0.0)
        assertEquals(111_000.0, d, 5_000.0)
    }

    @Test
    fun haversine_samePoint_zero() {
        assertEquals(0.0, GeoMath.haversineM(-33.8, 151.2, -33.8, 151.2), 0.1)
    }
}

class TrackingUiStateTest {
    @Test
    fun defaults_notRecording() {
        val state = TrackingUiState()
        assertEquals(false, state.isRecording)
        assertEquals(0.0, state.distanceM, 0.01)
    }
}
