package com.example.rungps.ble.moyoung

import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

object MoyoungWatchTime {
    private val watchTz: TimeZone = TimeZone.getTimeZone("GMT+8")

    fun watchEpochSecToLocalMs(watchEpochSec: Int): Long {
        val watchFmt = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").apply { timeZone = watchTz }
        val localFmt = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").apply { timeZone = TimeZone.getDefault() }
        val watchMs = watchEpochSec.toLong() * 1000L
        val parsed = localFmt.parse(watchFmt.format(Date(watchMs)))
        return parsed?.time ?: watchMs
    }

    fun localNowToWatchEpochSec(): Int {
        val localFmt = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").apply { timeZone = TimeZone.getDefault() }
        val watchFmt = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").apply { timeZone = watchTz }
        val parsed = watchFmt.parse(localFmt.format(Date()))
        return ((parsed?.time ?: System.currentTimeMillis()) / 1000L).toInt()
    }
}
