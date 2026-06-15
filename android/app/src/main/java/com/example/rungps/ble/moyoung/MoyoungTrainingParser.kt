package com.example.rungps.ble.moyoung

import java.nio.ByteBuffer
import java.nio.ByteOrder

object MoyoungTrainingParser {
    fun parseAll(data: ByteArray): List<MoyoungWorkout> {
        if (data.isEmpty()) return emptyList()
        parseDetailPacket(data)?.let { if (it.isNotEmpty()) return it }

        val entryLen = when {
            data.size % 26 == 0 -> 26
            data.size % 24 == 0 -> 24
            else -> return emptyList()
        }
        val protocolV2 = entryLen == 26
        val out = mutableListOf<MoyoungWorkout>()
        var offset = 0
        while (offset + entryLen <= data.size) {
            parseOne(data, offset, entryLen, protocolV2)?.let { out += it }
            offset += entryLen
        }
        return out
    }

    fun parseDetailPacket(payload: ByteArray): List<MoyoungWorkout>? {
        if (payload.isEmpty() || payload[0] != MoyoungConstants.WORKOUT_DETAIL_RESPONSE) return null
        parseOne(payload, 0, 26, true)?.let { return listOf(it) }
        if (payload.size >= 2) {
            val inner = payload.copyOfRange(1, payload.size)
            if (inner.size in 22..28) {
                val padded = ByteArray(26)
                padded[0] = MoyoungConstants.WORKOUT_DETAIL_RESPONSE
                System.arraycopy(inner, 0, padded, 2, minOf(inner.size, 24))
                parseOne(padded, 0, 26, true)?.let { return listOf(it) }
            }
            if (inner.size >= 22) {
                val legacy = ByteArray(24)
                System.arraycopy(inner, 0, legacy, 0, minOf(inner.size, 24))
                parseOne(legacy, 0, 24, false)?.let { return listOf(it) }
            }
        }
        return null
    }

    private fun parseOne(data: ByteArray, offset: Int, entryLen: Int, protocolV2: Boolean): MoyoungWorkout? {
        if (offset + entryLen > data.size) return null
        val slice = data.copyOfRange(offset, offset + entryLen)
        if (slice.all { it == 0.toByte() }) return null

        val buffer = ByteBuffer.wrap(slice).order(ByteOrder.LITTLE_ENDIAN)
        if (protocolV2) {
            buffer.get()
            buffer.get()
        }
        val startEpoch = buffer.int
        val endEpoch = buffer.int
        var activeSec = buffer.short.toInt() and 0xFFFF
        val avgHr = if (protocolV2) (buffer.get().toInt() and 0xFF).takeIf { it in 40..220 } else {
            buffer.get()
            null
        }
        val sportType = buffer.get().toInt() and 0xFF
        val steps = buffer.int
        val distanceM = buffer.int
        val calories = if (protocolV2) buffer.int else buffer.short.toInt() and 0xFFFF

        if (startEpoch <= 0 && activeSec <= 0 && endEpoch <= 0) return null
        if (activeSec <= 0) {
            activeSec = maxOf(endEpoch - startEpoch, 0)
            if (activeSec <= 0) return null
        } else if (activeSec in 1..600 && endEpoch - startEpoch > activeSec * 45) {
            activeSec *= 60
        }

        val startMs = if (startEpoch > 0) {
            MoyoungWatchTime.watchEpochSecToLocalMs(startEpoch)
        } else {
            System.currentTimeMillis() - activeSec * 1000L
        }
        val endMs = when {
            endEpoch > startEpoch && endEpoch > 0 -> MoyoungWatchTime.watchEpochSecToLocalMs(endEpoch)
            startEpoch > 0 -> MoyoungWatchTime.watchEpochSecToLocalMs(startEpoch + activeSec)
            else -> startMs + activeSec * 1000L
        }
        return MoyoungWorkout(startMs, endMs, activeSec, sportType, avgHr, steps, distanceM, calories)
    }
}
