package com.example.rungps.ble.moyoung

data class MoyoungWorkout(
    val watchId: Long,
    val trainingType: Int,
    val startEpochSec: Long,
    val durationSec: Int,
    val distanceM: Int,
    val calories: Int,
    val avgHr: Int?,
    val maxHr: Int?,
)

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
        if (payload.isEmpty() || payload[0] != 3.toByte()) return null
        if (payload.size >= 26) {
            parseOne(payload, 0, 26, true)?.let { return listOf(it) }
        }
        return null
    }

    private fun parseOne(data: ByteArray, offset: Int, entryLen: Int, protocolV2: Boolean): MoyoungWorkout? {
        if (offset + entryLen > data.size) return null
        val slice = data.copyOfRange(offset, offset + entryLen)
        val header = slice[0].toInt() and 0xFF
        if (header != 3 && header != 0) return null
        var idx = if (protocolV2) 2 else 1
        val watchId = if (protocolV2) {
            (slice.getOrNull(2)?.toLong() ?: 0) and 0xFF
        } else {
            (slice.getOrNull(idx++)?.toLong() ?: 0) and 0xFF
        }
        val trainingType = slice.getOrNull(idx++)?.toInt()?.and(0xFF) ?: return null
        val startEpochSec = readLeInt(slice, idx).also { idx += 4 }.toLong() and 0xFFFFFFFFL
        val durationSec = readLeShort(slice, idx).also { idx += 2 }
        val distanceM = readLeShort(slice, idx).also { idx += 2 }
        val calories = readLeShort(slice, idx).also { idx += 2 }
        if (durationSec <= 0) return null
        val avgHr = slice.getOrNull(idx++)?.toInt()?.and(0xFF)?.takeIf { it in 40..220 }
        val maxHr = slice.getOrNull(idx)?.toInt()?.and(0xFF)?.takeIf { it in 40..220 }
        return MoyoungWorkout(watchId, trainingType, startEpochSec, durationSec, distanceM, calories, avgHr, maxHr)
    }

    private fun readLeInt(data: ByteArray, offset: Int): Int {
        if (offset + 4 > data.size) return 0
        return (data[offset].toInt() and 0xFF) or
            ((data[offset + 1].toInt() and 0xFF) shl 8) or
            ((data[offset + 2].toInt() and 0xFF) shl 16) or
            ((data[offset + 3].toInt() and 0xFF) shl 24)
    }

    private fun readLeShort(data: ByteArray, offset: Int): Int {
        if (offset + 2 > data.size) return 0
        return (data[offset].toInt() and 0xFF) or ((data[offset + 1].toInt() and 0xFF) shl 8)
    }
}
