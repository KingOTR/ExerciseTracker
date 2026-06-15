package com.example.rungps.sleep

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

object SleepClipPlayer {
    private const val SAMPLE_RATE = 16_000
    @Volatile private var track: AudioTrack? = null

    suspend fun playPcmFile(file: File) = withContext(Dispatchers.IO) {
        stop()
        val pcm = file.readBytes()
        if (pcm.isEmpty()) return@withContext
        val attrs = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
            .build()
        val format = AudioFormat.Builder()
            .setSampleRate(SAMPLE_RATE)
            .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
            .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
            .build()
        val minBuf = AudioTrack.getMinBufferSize(SAMPLE_RATE, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT)
        val audioTrack = AudioTrack(attrs, format, minBuf.coerceAtLeast(pcm.size), AudioTrack.MODE_STATIC, 0)
        audioTrack.write(pcm, 0, pcm.size)
        track = audioTrack
        audioTrack.play()
    }

    fun stop() {
        track?.let {
            runCatching {
                if (it.playState == AudioTrack.PLAYSTATE_PLAYING) it.stop()
                it.release()
            }
        }
        track = null
    }

    val isPlaying: Boolean
        get() = track?.playState == AudioTrack.PLAYSTATE_PLAYING
}
