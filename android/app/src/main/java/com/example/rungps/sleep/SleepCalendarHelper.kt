package com.example.rungps.sleep

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.CalendarContract
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

object SleepCalendarHelper {
    fun nextCalendarEventEndMs(context: Context, afterMs: Long = System.currentTimeMillis()): Long? {
        val uri = CalendarContract.Instances.CONTENT_URI.buildUpon()
            .appendPath(afterMs.toString())
            .appendPath((afterMs + 86_400_000L * 2).toString())
            .build()
        return runCatching {
            context.contentResolver.query(
                uri,
                arrayOf(CalendarContract.Instances.END),
                null,
                null,
                "${CalendarContract.Instances.BEGIN} ASC",
            )?.use { cursor ->
                if (cursor.moveToFirst()) cursor.getLong(0) else null
            }
        }.getOrNull()
    }

    fun openCalendarEvent(context: Context, eventId: Long) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("content://com.android.calendar/events/$eventId")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        runCatching { context.startActivity(intent) }
    }
}

object GoogleCalendarLink {
    fun wakePlannerUrl(wakeTimeMs: Long, zone: ZoneId = ZoneId.systemDefault()): String {
        val zdt = Instant.ofEpochMilli(wakeTimeMs).atZone(zone)
        val text = "Wake · Exercise Tracker"
        return "https://calendar.google.com/calendar/render?action=TEMPLATE" +
            "&text=${Uri.encode(text)}" +
            "&dates=${formatGcal(zdt)}/${formatGcal(zdt.plusMinutes(15))}"
    }

    private fun formatGcal(zdt: ZonedDateTime): String =
        zdt.format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss"))
}

object SleepWakePlanner {
    data class Plan(
        val targetWakeMs: Long,
        val smartWindowStartMs: Long,
        val smartWindowEndMs: Long,
        val calendarConflictMs: Long?,
        val recommendation: String,
    )

    fun plan(
        alarmMs: Long,
        windowMin: Int = 30,
        calendarConflictMs: Long? = null,
    ): Plan {
        val start = alarmMs - windowMin * 60_000L
        val rec = when {
            calendarConflictMs != null && calendarConflictMs < alarmMs + 30 * 60_000 ->
                "Calendar event before alarm — consider waking ${windowMin}m earlier."
            else -> "Smart alarm window: ${windowMin}m before target wake."
        }
        return Plan(alarmMs, start, alarmMs, calendarConflictMs, rec)
    }
}
