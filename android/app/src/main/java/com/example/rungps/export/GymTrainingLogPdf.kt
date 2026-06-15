package com.example.rungps.export

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.pdf.PdfDocument
import com.example.rungps.data.ExerciseTrackerDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import java.io.File
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.YearMonth

object GymTrainingLogPdf {
    private val dateFmt = DateTimeFormatter.ofPattern("d MMM yyyy HH:mm").withZone(ZoneId.systemDefault())

    suspend fun exportMonthlyLog(context: Context, month: YearMonth = YearMonth.now()): Result<File> =
        withContext(Dispatchers.IO) {
            runCatching {
                val dao = ExerciseTrackerDatabase.get(context).exerciseTrackerDao()
                val runs = dao.observeRuns().first()
                val gymSessions = dao.observeGymSessions().first()
                val startMs = month.atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()
                val endMs = month.plusMonths(1).atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()
                val monthRuns = runs.filter { it.startedAtMs in startMs until endMs }
                val monthGym = gymSessions.filter { it.startedAtMs in startMs until endMs }

                val doc = PdfDocument()
                val pageInfo = PdfDocument.PageInfo.Builder(595, 842, 1).create()
                val page = doc.startPage(pageInfo)
                val canvas: Canvas = page.canvas
                val titlePaint = Paint().apply {
                    textSize = 18f
                    typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                    isAntiAlias = true
                }
                val bodyPaint = Paint().apply {
                    textSize = 11f
                    isAntiAlias = true
                }
                var y = 40f
                canvas.drawText("Training log — ${month.month} ${month.year}", 40f, y, titlePaint)
                y += 28f
                canvas.drawText("Runs (${monthRuns.size})", 40f, y, titlePaint)
                y += 18f
                monthRuns.take(20).forEach { run ->
                    val line = "${dateFmt.format(Instant.ofEpochMilli(run.startedAtMs))} · " +
                        "${"%.2f".format(run.totalDistanceM / 1000.0)} km · ${run.totalDurationMs / 60_000}m"
                    canvas.drawText(line, 48f, y, bodyPaint)
                    y += 14f
                    if (y > 780f) return@forEach
                }
                y += 12f
                canvas.drawText("Gym sessions (${monthGym.size})", 40f, y, titlePaint)
                y += 18f
                monthGym.take(15).forEach { session ->
                    val sets = dao.observeGymSets(session.id).first()
                    canvas.drawText(
                        "${dateFmt.format(Instant.ofEpochMilli(session.startedAtMs))} · ${sets.size} sets",
                        48f, y, bodyPaint,
                    )
                    y += 14f
                    sets.take(8).forEach { set ->
                        val detail = "  ${set.exerciseName}: ${set.reps ?: "—"} × ${set.weightKg ?: "—"} kg"
                        canvas.drawText(detail, 56f, y, bodyPaint)
                        y += 12f
                    }
                    y += 6f
                    if (y > 780f) return@forEach
                }
                doc.finishPage(page)
                val dir = File(context.cacheDir, "exports").also { it.mkdirs() }
                val file = File(dir, "training_log_${month}.pdf")
                file.outputStream().use { doc.writeTo(it) }
                doc.close()
                file
            }
        }
}
