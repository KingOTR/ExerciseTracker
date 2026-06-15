package com.example.rungps.ble.moyoung

class MoyoungPacketIn {
    private var packet: ByteArray? = null
    private var position = 0

    fun reset() {
        packet = null
        position = 0
    }

    fun putFragment(fragment: ByteArray): Boolean {
        if (packet == null) {
            val length = parsePacketLength(fragment)
            if (length < 0) return false
            packet = ByteArray(length)
            position = 0
        }
        val buf = packet ?: return false
        val copyLen = minOf(fragment.size, buf.size - position)
        System.arraycopy(fragment, 0, buf, position, copyLen)
        position += copyLen
        return position >= buf.size
    }

    fun completePacket(): ByteArray? {
        val buf = packet ?: return null
        return if (position >= buf.size) buf else null
    }

    companion object {
        fun parsePacket(packet: ByteArray): Pair<Byte, ByteArray>? {
            val length = parsePacketLength(packet)
            if (length < 0 || length != packet.size) return null
            val cmd = packet[4]
            return cmd to packet.copyOfRange(5, packet.size)
        }

        private fun parsePacketLength(fragment: ByteArray): Int {
            if (fragment.size < 4) return -1
            if (fragment[0] != 0xFE.toByte() || fragment[1] != 0xEA.toByte()) return -1
            val header = fragment[2].toInt() and 0xFF
            val extra = if (header == 16) 0 else {
                if (header < 32) return -1
                header - 32
            }
            return (extra shl 8) or (fragment[3].toInt() and 0xFF)
        }
    }
}

object MoyoungPacketOut {
    fun buildPacket(mtu: Int, packetType: Byte, payload: ByteArray): ByteArray {
        val length = payload.size + 5
        val packet = ByteArray(length)
        packet[0] = 0xFE.toByte()
        packet[1] = 0xEA.toByte()
        packet[2] = if (mtu == 20) 16 else (((length shr 8) + 32) and 0xFF).toByte()
        packet[3] = (length and 0xFF).toByte()
        packet[4] = packetType
        System.arraycopy(payload, 0, packet, 5, payload.size)
        return packet
    }

    fun fragments(packet: ByteArray, mtu: Int): List<ByteArray> {
        val out = mutableListOf<ByteArray>()
        var offset = 0
        while (offset < packet.size) {
            val end = minOf(offset + mtu, packet.size)
            out += packet.copyOfRange(offset, end)
            offset = end
        }
        return out
    }
}
