package com.example.rungps.sleep

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.ArrayDeque

object SleepOvernightStore {
    private const val PREFS = "sleep_overnight"
    private const val KEY_ACTIVE = "active"
    private const val KEY_STARTED = "started_ms"
    private const val KEY_ALARM_TARGET = "alarm_target_ms"
    private const val KEY_WINDOW_MIN = "window_min"
    private const val KEY_SMART = "smart_alarm"
    private const val KEY_BASELINE_AUDIO = "baseline_audio"
    private const val KEY_BASELINE_MOVE = "baseline_move"
    private const val KEY_LAST_STOP_REASON = "last_stop_reason"
    private const val KEY_LAST_HEALTH_MS = "last_health_ms"
    private const val KEY_LAST_HEALTH_NOTE = "last_health_note"
    private const val KEY_RECOVERABLE = "recoverable_stale"
    private const val KEY_ALARM_FIRED = "alarm_fired"
    private const val KEY_ALARM_FIRED_MS = "alarm_fired_ms"
    private const val KEY_GAP_MS = "mic_gap_ms"
    private const val KEY_GAP_COUNT = "mic_gap_count"
    private const val SAMPLES_FILE = "sleep_samples.json"
    private const val MAX_SAMPLES = 5760

    fun isActive(context: Context): Boolean = prefs(context).getBoolean(KEY_ACTIVE, false)

    fun isSessionValid(context: Context): Boolean {
        if (!isActive(context)) return false
        val started = startedAtMs(context)
        val alarm = alarmTargetMs(context)
        val now = System.currentTimeMillis()
        return started > 0 && alarm > 0 &&
            alarm >= started - 60_000 &&
            alarm <= now + 172_800_000 &&
            now - started <= 129_600_000 &&
            windowEndMs(context) >= now - 900_000
    }

    fun isRecoverableStale(context: Context): Boolean {
        if (!isActive(context) || isSessionValid(context)) return false
        return sampleCount(context) > 0 || prefs(context).getBoolean(KEY_RECOVERABLE, false)
    }

    fun clearSessionIfStale(context: Context): Boolean {
        if (!isActive(context) || isSessionValid(context)) return false
        if (sampleCount(context) > 0) {
            recordStopReason(context, "stale_session_recoverable")
            prefs(context).edit().putBoolean(KEY_RECOVERABLE, true).apply()
            return true
        }
        recordStopReason(context, "stale_session_cleared")
        clearSession(context, savedSuccessfully = false)
        return true
    }

    fun startSession(context: Context, alarmTargetMs: Long, windowMin: Int, smartAlarm: Boolean) {
        prefs(context).edit()
            .putBoolean(KEY_ACTIVE, true)
            .putLong(KEY_STARTED, System.currentTimeMillis())
            .putLong(KEY_ALARM_TARGET, alarmTargetMs)
            .putInt(KEY_WINDOW_MIN, windowMin.coerceIn(10, 45))
            .putBoolean(KEY_SMART, smartAlarm)
            .remove(KEY_BASELINE_AUDIO)
            .remove(KEY_BASELINE_MOVE)
            .putLong(KEY_GAP_MS, 0L)
            .putInt(KEY_GAP_COUNT, 0)
            .commit()
        atomicWrite(samplesFile(context), "")
        SleepAlarmAudit.clearForNewNight(context)
    }

    fun clearSession(context: Context, savedSuccessfully: Boolean) {
        val p = prefs(context)
        val started = p.getLong(KEY_STARTED, 0L)
        val stopReason = p.getString(KEY_LAST_STOP_REASON, null)
        val healthMs = p.getLong(KEY_LAST_HEALTH_MS, 0L)
        val healthNote = p.getString(KEY_LAST_HEALTH_NOTE, null)
        p.edit().clear().commit()
        val editor = prefs(context).edit()
        stopReason?.takeIf { it.isNotBlank() }?.let { editor.putString(KEY_LAST_STOP_REASON, it) }
        if (healthMs > 0) editor.putLong(KEY_LAST_HEALTH_MS, healthMs)
        healthNote?.takeIf { it.isNotBlank() }?.let { editor.putString(KEY_LAST_HEALTH_NOTE, it) }
        editor.commit()
        runCatching { samplesFile(context).delete() }
        if (!savedSuccessfully && started > 0) {
            // orphan clip cleanup deferred
        }
    }

    fun startedAtMs(context: Context): Long = prefs(context).getLong(KEY_STARTED, 0L)

    fun alarmTargetMs(context: Context): Long = prefs(context).getLong(KEY_ALARM_TARGET, 0L)

    fun windowMin(context: Context): Int = prefs(context).getInt(KEY_WINDOW_MIN, 30)

    fun smartAlarm(context: Context): Boolean = prefs(context).getBoolean(KEY_SMART, true)

    fun windowStartMs(context: Context): Long =
        (alarmTargetMs(context) - windowMin(context) * 60_000L).coerceAtLeast(startedAtMs(context))

    fun windowEndMs(context: Context): Long = alarmTargetMs(context) + windowMin(context) * 60_000L

    fun baselineAudioRms(context: Context): Float = prefs(context).getFloat(KEY_BASELINE_AUDIO, 200f)

    fun baselineMovement(context: Context): Float = prefs(context).getFloat(KEY_BASELINE_MOVE, 0.25f)

    fun setBaselines(context: Context, rawAudioRms: Float, movementIndex: Float) {
        prefs(context).edit()
            .putFloat(KEY_BASELINE_AUDIO, rawAudioRms.coerceAtLeast(50f))
            .putFloat(KEY_BASELINE_MOVE, movementIndex.coerceAtLeast(0.05f))
            .apply()
    }

    fun recordStopReason(context: Context, reason: String) {
        prefs(context).edit()
            .putString(KEY_LAST_STOP_REASON, reason.take(200))
            .putLong(KEY_LAST_HEALTH_MS, System.currentTimeMillis())
            .apply()
    }

    fun recordHealth(context: Context, note: String) {
        prefs(context).edit()
            .putString(KEY_LAST_HEALTH_NOTE, note.take(400))
            .putLong(KEY_LAST_HEALTH_MS, System.currentTimeMillis())
            .apply()
    }

    fun recordAlarmFired(context: Context) {
        prefs(context).edit()
            .putBoolean(KEY_ALARM_FIRED, true)
            .putLong(KEY_ALARM_FIRED_MS, System.currentTimeMillis())
            .apply()
    }

    fun alarmFired(context: Context): Boolean = prefs(context).getBoolean(KEY_ALARM_FIRED, false)

    fun recordMicGap(context: Context, gapMs: Long) {
        if (gapMs <= 0) return
        val p = prefs(context)
        p.edit()
            .putLong(KEY_GAP_MS, p.getLong(KEY_GAP_MS, 0L) + gapMs)
            .putInt(KEY_GAP_COUNT, p.getInt(KEY_GAP_COUNT, 0) + 1)
            .apply()
    }

    fun lastStopReason(context: Context): String? =
        prefs(context).getString(KEY_LAST_STOP_REASON, null)?.takeIf { it.isNotBlank() }

    fun lastHealthNote(context: Context): String? =
        prefs(context).getString(KEY_LAST_HEALTH_NOTE, null)?.takeIf { it.isNotBlank() }

    fun sampleCount(context: Context): Int = loadSamples(context).size

    fun loadSamples(context: Context): List<SleepTrackSample> = loadSamplesLenient(context)

    fun loadRecentSamples(context: Context, maxSamples: Int = 360): List<SleepTrackSample> {
        val all = loadSamples(context)
        return if (all.size <= maxSamples) all else all.takeLast(maxSamples)
    }

    fun appendSample(context: Context, sample: SleepTrackSample) {
        val list = loadSamples(context).toMutableList()
        list.add(sample)
        if (list.size > MAX_SAMPLES) {
            list.subList(0, list.size - MAX_SAMPLES).clear()
        }
        saveSamplesAtomic(samplesFile(context), list)
    }

    private fun loadSamplesLenient(context: Context): List<SleepTrackSample> {
        val file = samplesFile(context)
        if (!file.exists() || file.length() == 0L) return emptyList()
        return runCatching {
            val first = FileInputStream(file).use { it.read() }
            if (first == '['.code) {
                val text = file.readText()
                val arr = JSONArray(text)
                (0 until arr.length()).mapNotNull { i ->
                    runCatching { parseSample(arr.getJSONObject(i)) }.getOrNull()
                }
            } else {
                BufferedReader(InputStreamReader(FileInputStream(file))).useLines { lines ->
                    lines.mapNotNull { line ->
                        val trimmed = line.trim()
                        if (trimmed.isEmpty()) null
                        else runCatching { parseSample(JSONObject(trimmed)) }.getOrNull()
                    }.toList()
                }
            }
        }.getOrDefault(emptyList())
    }

    private fun saveSamplesAtomic(file: File, samples: List<SleepTrackSample>) {
        val content = samples.joinToString("\n") { sampleToJson(it).toString() }
        atomicWrite(file, content)
    }

    private fun parseSample(o: JSONObject): SleepTrackSample {
        val mel = o.optJSONArray("mel")?.let { arr ->
            FloatArray(arr.length()) { i -> arr.getDouble(i).toFloat() }
        }
        return SleepTrackSample(
            elapsedMs = o.getLong("e"),
            movement = o.getDouble("m").toFloat(),
            audioLevel = o.getDouble("a").toFloat(),
            breathRateBpm = o.optDouble("br", 0.0).toFloat(),
            breathRegularity = o.optDouble("breg", 0.0).toFloat(),
            quietFraction = o.optDouble("qf", 0.0).toFloat(),
            snoreLikelihood = o.optDouble("sn", 0.0).toFloat(),
            movementVariance = o.optDouble("mv", 0.0).toFloat(),
            melCompact = mel,
            asleepProb = o.optDouble("aslp").takeIf { !it.isNaN() }?.toFloat(),
            stageConfidence = o.optDouble("conf").takeIf { !it.isNaN() }?.toFloat(),
            lightSleepProb = o.optDouble("light").takeIf { !it.isNaN() }?.toFloat(),
            eventTag = o.optString("tag", null),
            snoreIntensity = o.optInt("si").takeIf { o.has("si") },
            audioQualityOk = o.optBoolean("aq").takeIf { o.has("aq") },
            noiseTag = o.optString("noise", null),
            breathPause = o.optBoolean("bp").takeIf { o.has("bp") },
            sonarMotion = o.optDouble("sonar").takeIf { !it.isNaN() }?.toFloat(),
        )
    }

    private fun sampleToJson(s: SleepTrackSample): JSONObject = JSONObject().apply {
        put("e", s.elapsedMs)
        put("m", s.movement)
        put("a", s.audioLevel)
        put("br", s.breathRateBpm)
        put("breg", s.breathRegularity)
        put("qf", s.quietFraction)
        put("sn", s.snoreLikelihood)
        put("mv", s.movementVariance)
        s.asleepProb?.let { put("aslp", it) }
        s.stageConfidence?.let { put("conf", it) }
        s.lightSleepProb?.let { put("light", it) }
        s.eventTag?.let { put("tag", it) }
        s.snoreIntensity?.let { put("si", it) }
        s.audioQualityOk?.let { put("aq", it) }
        s.noiseTag?.let { put("noise", it) }
        s.breathPause?.let { put("bp", it) }
        s.sonarMotion?.let { put("sonar", it) }
        s.melCompact?.let { mel ->
            put("mel", JSONArray().apply { mel.forEach { v -> put(v) } })
        }
    }

    private fun atomicWrite(file: File, content: String) {
        val tmp = File(file.parentFile, "${file.name}.tmp")
        tmp.writeText(content)
        if (file.exists()) file.delete()
        tmp.renameTo(file)
    }

    private fun samplesFile(context: Context): File =
        File(context.filesDir, SAMPLES_FILE)

    private fun prefs(context: Context) =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
}
