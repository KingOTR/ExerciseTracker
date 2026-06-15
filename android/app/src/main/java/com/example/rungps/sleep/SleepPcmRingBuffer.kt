package com.example.rungps.sleep

class SleepPcmRingBuffer(
    private val maxSeconds: Int,
    sampleRate: Int,
) {
    private val capacityBytes = maxSeconds * sampleRate * 2
    private val buffer = ByteArray(capacityBytes)
    private var writePos = 0
    private var filled = 0

    fun clear() {
        writePos = 0
        filled = 0
    }

    fun appendPcm(data: ByteArray, offset: Int, length: Int) {
        var remaining = length
        var src = offset
        while (remaining > 0) {
            val space = capacityBytes - writePos
            val chunk = minOf(remaining, space)
            System.arraycopy(data, src, buffer, writePos, chunk)
            writePos = (writePos + chunk) % capacityBytes
            filled = minOf(filled + chunk, capacityBytes)
            remaining -= chunk
            src += chunk
        }
    }

    fun tailPcmBytes(maxBytes: Int): ByteArray {
        val size = minOf(filled, maxBytes)
        val out = ByteArray(size)
        var start = writePos - size
        if (start < 0) start += capacityBytes
        if (start + size <= capacityBytes) {
            System.arraycopy(buffer, start, out, 0, size)
        } else {
            val first = capacityBytes - start
            System.arraycopy(buffer, start, out, 0, first)
            System.arraycopy(buffer, 0, out, first, size - first)
        }
        return out
    }
}
