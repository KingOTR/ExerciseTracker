package com.example.rungps.export

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import androidx.core.content.FileProvider
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object RunOverlayShare {
    data class SaveResult(val uri: Uri?, val error: String?)

    fun sharePng(context: Context, bitmap: Bitmap, chooserTitle: String = "Share run image") {
        val file = writeCachePng(context, bitmap) ?: return
        val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "image/png"
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        context.startActivity(Intent.createChooser(intent, chooserTitle))
    }

    fun saveToGallery(context: Context, bitmap: Bitmap): SaveResult {
        val name = "ExerciseTracker-${SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(Date())}.png"
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, name)
            put(MediaStore.Images.Media.MIME_TYPE, "image/png")
            put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/ExerciseTracker")
            put(MediaStore.Images.Media.IS_PENDING, 1)
        }
        val uri = context.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
            ?: return SaveResult(null, "Could not create gallery file")
        return try {
            context.contentResolver.openOutputStream(uri)?.use { stream ->
                check(bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream))
            } ?: error("Could not open gallery stream")
            val done = ContentValues().apply { put(MediaStore.Images.Media.IS_PENDING, 0) }
            context.contentResolver.update(uri, done, null, null)
            SaveResult(uri, null)
        } catch (e: Exception) {
            runCatching { context.contentResolver.delete(uri, null, null) }
            SaveResult(null, e.message ?: "Save failed")
        }
    }

    fun writeCachePng(context: Context, bitmap: Bitmap): File? {
        val dir = File(context.cacheDir, "shares").also { it.mkdirs() }
        val file = File(dir, "run-overlay-${System.currentTimeMillis()}.png")
        return try {
            FileOutputStream(file).use { bitmap.compress(Bitmap.CompressFormat.PNG, 100, it) }
            file
        } catch (_: Exception) {
            null
        }
    }

    fun pngBytes(bitmap: Bitmap): ByteArray {
        val out = ByteArrayOutputStream()
        check(bitmap.compress(Bitmap.CompressFormat.PNG, 100, out))
        return out.toByteArray()
    }
}
