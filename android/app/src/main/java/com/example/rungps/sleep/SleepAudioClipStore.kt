package com.example.rungps.sleep

import android.content.Context
import java.io.File

class SleepAudioClipStore(private val context: Context) {
    private val dir: File
        get() = File(context.filesDir, "sleep_clips").also { it.mkdirs() }

    fun clipPath(nightId: Long, eventIndex: Int): File =
        File(dir, "night_${nightId}_evt_${eventIndex}.pcm")

    fun hasClip(nightId: Long, eventIndex: Int): Boolean =
        clipPath(nightId, eventIndex).exists()

    fun saveClip(nightId: Long, eventIndex: Int, pcm: ByteArray) {
        clipPath(nightId, eventIndex).writeBytes(pcm)
    }

    fun listClips(nightId: Long): List<File> =
        dir.listFiles()?.filter { it.name.startsWith("night_${nightId}_") }?.sortedBy { it.name }
            ?: emptyList()

    fun deleteNightClips(nightId: Long) {
        listClips(nightId).forEach { it.delete() }
    }
}
