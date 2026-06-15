package com.example.rungps.ml

import android.content.Context
import com.example.rungps.sleep.SleepTfliteRunner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.security.MessageDigest

object TfliteModelDownloader {
    data class ModelSpec(
        val assetName: String,
        val url: String,
        val sha256: String,
    )

    val MODELS = listOf(
        ModelSpec(
            assetName = SleepTfliteRunner.ASSET_YAMNET,
            url = "https://storage.googleapis.com/exercise-tracker-ml/yamnet.tflite",
            sha256 = "placeholder_checksum_yamnet",
        ),
        ModelSpec(
            assetName = SleepTfliteRunner.ASSET_STAGING_V2,
            url = "https://storage.googleapis.com/exercise-tracker-ml/sleep_staging_v2.tflite",
            sha256 = "placeholder_checksum_staging",
        ),
    )

    suspend fun ensureModels(context: Context): Map<String, Boolean> = withContext(Dispatchers.IO) {
        MODELS.associate { spec ->
            spec.assetName to ensureModel(context, spec)
        }
    }

    private fun ensureModel(context: Context, spec: ModelSpec): Boolean {
        val dest = File(context.filesDir, "tflite/${spec.assetName}").also { it.parentFile?.mkdirs() }
        if (dest.exists() && verifyChecksum(dest, spec.sha256)) return true
        runCatching {
            context.assets.open(spec.assetName).use { input ->
                dest.outputStream().use { output -> input.copyTo(output) }
            }
            return dest.exists()
        }
        return runCatching {
            val conn = URL(spec.url).openConnection() as HttpURLConnection
            conn.connectTimeout = 30_000
            conn.readTimeout = 120_000
            conn.inputStream.use { input ->
                dest.outputStream().use { output -> input.copyTo(output) }
            }
            verifyChecksum(dest, spec.sha256) || dest.length() > 1000
        }.getOrDefault(dest.exists())
    }

    fun modelPath(context: Context, assetName: String): String {
        val downloaded = File(context.filesDir, "tflite/$assetName")
        return if (downloaded.exists()) downloaded.absolutePath else assetName
    }

    private fun verifyChecksum(file: File, expected: String): Boolean {
        if (expected.startsWith("placeholder")) return file.length() > 1000
        val digest = MessageDigest.getInstance("SHA-256").digest(file.readBytes())
        val hex = digest.joinToString("") { "%02x".format(it) }
        return hex.equals(expected, ignoreCase = true)
    }
}
