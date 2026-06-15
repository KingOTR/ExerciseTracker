package com.example.rungps.diagnostics

import android.content.Context
import android.os.Build
import com.example.rungps.data.ExerciseTrackerDatabase
import org.json.JSONObject
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

object DiagnosticsExporter {
    fun exportAnonymizedBundle(context: Context): File {
        val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
        val sleepDao = ExerciseTrackerDatabase.get(context).sleepDao()
        val outDir = File(context.cacheDir, "diagnostics").also { it.mkdirs() }
        val zipFile = File(outDir, "diagnostics_${System.currentTimeMillis()}.zip")
        val meta = JSONObject().apply {
            put("appVersion", "0.7.93")
            put("versionCode", 107)
            put("isRebuiltPort", true)
            put("device", Build.MODEL)
            put("sdk", Build.VERSION.SDK_INT)
        }
        ZipOutputStream(zipFile.outputStream()).use { zip ->
            zip.putNextEntry(ZipEntry("meta.json"))
            zip.write(meta.toString(2).toByteArray())
            zip.closeEntry()
            zip.putNextEntry(ZipEntry("counts.json"))
            val counts = JSONObject().apply {
                put("runs", kotlinx.coroutines.runBlocking { dao.getAllRuns().size })
                put("gymSets", kotlinx.coroutines.runBlocking { dao.getAllGymSets().size })
                put("sleepNights", kotlinx.coroutines.runBlocking { sleepDao.recentEntries(100).size })
            }
            zip.write(counts.toString(2).toByteArray())
            zip.closeEntry()
        }
        return zipFile
    }
}
