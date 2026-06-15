package com.example.rungps.ui.main

fun formatElapsed(ms: Long): String {
    val totalSec = (ms / 1000).coerceAtLeast(0)
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    return if (h > 0) "%d:%02d:%02d".format(h, m, s) else "%02d:%02d".format(m, s)
}

fun formatPace(secPerKm: Double): String {
    if (secPerKm <= 0 || secPerKm.isInfinite() || secPerKm.isNaN()) return "—"
    val m = (secPerKm / 60).toInt()
    val s = (secPerKm % 60).toInt()
    return "%d:%02d /km".format(m, s)
}

fun formatDistanceKm(meters: Double): String = "%.2f km".format(meters / 1000.0)

fun formatSteps(steps: Long): String = "%,d steps".format(steps)
