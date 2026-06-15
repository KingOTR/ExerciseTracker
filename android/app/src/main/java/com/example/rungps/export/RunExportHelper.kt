package com.example.rungps.export

import android.content.Context
import android.content.Intent
import androidx.core.content.FileProvider
import com.example.rungps.data.ExerciseTrackerDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

object RunExportHelper {
    suspend fun exportGpx(context: Context, runId: Long): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
            val run = dao.runById(runId) ?: error("Run not found")
            val points = dao.pointsForRun(runId)
            val gpx = GpxExporter.export(run, points)
            val dir = File(context.cacheDir, "exports").also { it.mkdirs() }
            val file = File(dir, "run_${runId}.gpx")
            file.writeText(gpx)
            file
        }
    }

    suspend fun exportTcx(context: Context, runId: Long): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
            val run = dao.runById(runId) ?: error("Run not found")
            val points = dao.pointsForRun(runId)
            val tcx = TcxExporter.export(run, points)
            val dir = File(context.cacheDir, "exports").also { it.mkdirs() }
            val file = File(dir, "run_${runId}.tcx")
            file.writeText(tcx)
            file
        }
    }

    fun shareFile(context: Context, file: File, mimeType: String) {
        val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = mimeType
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        context.startActivity(Intent.createChooser(intent, "Share export"))
    }
}
