package com.example.rungps.ble.moyoung

object MoyoungHrParser {
    data class HrPoint(val offsetSec: Int, val bpm: Int)

    fun parse(payload: ByteArray): List<HrPoint> {
        if (payload.isEmpty()) return emptyList()
        var data = if (payload[0] == 5.toByte()) payload.copyOfRange(1, payload.size) else payload
        if (data.isEmpty()) return emptyList()

        if (data.size >= 3) {
            val count = data[1].toInt() and 0xFF
            if (count in 1..300 && data.size >= count + 2) {
                val bpms = (0 until count).mapNotNull { i ->
                    val bpm = data[i + 2].toInt() and 0xFF
                    if (bpm in 40..220) bpm else null
                }
                if (bpms.size >= maxOf(2, count / 3)) {
                    return bpms.mapIndexed { idx, bpm -> HrPoint(idx * 60, bpm) }
                }
            }
        }

        if (data.size >= 4 && data.size % 2 == 0) {
            val points = mutableListOf<HrPoint>()
            var i = 0
            while (i + 1 < data.size) {
                val offset = data[i].toInt() and 0xFF
                val bpm = data[i + 1].toInt() and 0xFF
                if (bpm in 40..220) points += HrPoint(offset * 60, bpm)
                i += 2
            }
            if (points.size >= 2) return points
        }

        val drop = if (data.size > 8) {
            val header = data[0].toInt() and 0xFF
            if (header in 0 until 64) 1 else 0
        } else {
            0
        }
        val bpms = data.drop(drop).map { it.toInt() and 0xFF }.filter { it in 40..220 }
        if (bpms.size >= 3) {
            return bpms.mapIndexed { idx, bpm -> HrPoint(idx * 60, bpm) }
        }
        return emptyList()
    }

    fun merge(chunks: List<List<HrPoint>>): List<HrPoint> {
        val merged = linkedMapOf<Int, Int>()
        chunks.flatten().forEach { pt -> merged[pt.offsetSec] = pt.bpm }
        return merged.entries.sortedBy { it.key }.map { HrPoint(it.key, it.value) }
    }
}
