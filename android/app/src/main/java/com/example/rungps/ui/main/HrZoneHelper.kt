package com.example.rungps.ui.main

import androidx.compose.ui.graphics.Color

object HrZoneHelper {
    fun maxHr(ageYears: Int?): Int = 220 - (ageYears ?: 35)

    fun zoneIndex(bpm: Int, maxHr: Int): Int {
        val pct = bpm.toDouble() / maxHr.coerceAtLeast(120)
        return when {
            pct < 0.60 -> 1
            pct < 0.70 -> 2
            pct < 0.80 -> 3
            pct < 0.90 -> 4
            else -> 5
        }
    }

    fun zoneLabel(bpm: Int, maxHr: Int = 190): String {
        return when (zoneIndex(bpm, maxHr)) {
            1 -> "Z1 Easy"
            2 -> "Z2 Aerobic"
            3 -> "Z3 Tempo"
            4 -> "Z4 Threshold"
            else -> "Z5 Max"
        }
    }

    fun zoneColor(bpm: Int, maxHr: Int = 190): Color {
        return when (zoneIndex(bpm, maxHr)) {
            1 -> Color(0xFF64B5F6)
            2 -> Color(0xFF4CAF50)
            3 -> Color(0xFFFFEB3B)
            4 -> Color(0xFFFF9800)
            else -> Color(0xFFF44336)
        }
    }
}
