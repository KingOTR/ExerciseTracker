package com.example.rungps.sleep

import android.content.Context
import org.tensorflow.lite.Interpreter
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.FileChannel

class SleepTfliteRunner(private val assetName: String) {
    private var interpreter: Interpreter? = null
    private var inputShape = IntArray(0)
    private var outputShape = IntArray(0)

    val isLoaded: Boolean get() = interpreter != null

    fun ensureLoaded(context: Context): Boolean {
        if (interpreter != null) return true
        return runCatching {
            val buffer = loadModelFile(context, assetName)
            val interp = Interpreter(buffer)
            interpreter = interp
            inputShape = interp.getInputTensor(0).shape()
            outputShape = interp.getOutputTensor(0).shape()
            true
        }.getOrDefault(false)
    }

    fun run(input: FloatArray): FloatArray? {
        val interp = interpreter ?: return null
        val inputSize = inputShape.fold(1, Int::times)
        val outputSize = outputShape.fold(1, Int::times)
        if (input.size < inputSize) return null
        val inBuf = ByteBuffer.allocateDirect(inputSize * 4).order(ByteOrder.nativeOrder())
        for (i in 0 until inputSize) inBuf.putFloat(input[i])
        val outBuf = ByteBuffer.allocateDirect(outputSize * 4).order(ByteOrder.nativeOrder())
        interp.run(inBuf.rewind(), outBuf)
        outBuf.rewind()
        return FloatArray(outputSize) { outBuf.float }
    }

    fun close() {
        interpreter?.close()
        interpreter = null
    }

    private fun loadModelFile(context: Context, name: String): java.nio.MappedByteBuffer {
        val afd = context.assets.openFd(name)
        afd.createInputStream().use { stream ->
            val channel = stream.channel
            return channel.map(FileChannel.MapMode.READ_ONLY, afd.startOffset, afd.declaredLength)
        }
    }

    companion object {
        const val ASSET_STAGING_V2 = "sleep_staging_v2.tflite"
        const val ASSET_YAMNET = "yamnet.tflite"
    }
}
