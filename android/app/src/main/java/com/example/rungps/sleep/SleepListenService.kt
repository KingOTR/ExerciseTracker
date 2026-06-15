package com.example.rungps.sleep

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder
import android.os.Build
import android.os.IBinder
import android.os.PowerManager
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.example.rungps.MainActivity
import com.exercisetracker.app.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime
import kotlin.math.sqrt

class SleepListenService : Service(), SensorEventListener {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var sampleJob: Job? = null
    private var audioJob: Job? = null
    private var healthJob: Job? = null
    private var sensorManager: SensorManager? = null
    private var audioRecord: AudioRecord? = null
    private var wakeLock: PowerManager.WakeLock? = null
    private val accelWindow = SleepAccelWindow()
    private val rmsBucket = mutableListOf<Float>()
    private val partialMels = mutableListOf<FloatArray>()
    private var pcmRing = SleepPcmRingBuffer(20, SAMPLE_RATE)
    private var emptyReadStreak = 0
    private var alarmTriggered = false
    private var wakeWindowAnnounced = false
    private var bucketCount = 0
    private var lastAccelMag = 0f
    private var highMoveStreak = 0
    private var awayFromBedNotified = false
    private var micFailStreak = 0
    private var lastBucketElapsedMs = 0L
    private var lastClipAtMs = 0L
    private var clipsThisNight = 0

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        runningFlag = true
        sensorManager = getSystemService(SensorManager::class.java)
        sensorManager?.registerListener(
            this,
            sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_NORMAL,
        )
        wakeLock = (getSystemService(PowerManager::class.java)).newWakeLock(
            PowerManager.PARTIAL_WAKE_LOCK,
            "ExerciseTracker:SleepListen",
        ).apply {
            setReferenceCounted(false)
            acquire(12 * 60 * 60 * 1000L)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_STOP -> {
                SleepOvernightStore.recordStopReason(this, "user_stop")
                SleepAlarmScheduler.cancelAll(this)
                stopCapture()
                stopSelf()
                return START_NOT_STICKY
            }
            ACTION_START -> {
                val alarmTarget = intent.getLongExtra(EXTRA_ALARM_TARGET_MS, 0L)
                val windowMin = intent.getIntExtra(EXTRA_WINDOW_MIN, 30)
                val smart = intent.getBooleanExtra(EXTRA_SMART_ALARM, true)
                SleepOvernightStore.clearSessionIfStale(this)
                if (SleepOvernightStore.isRecoverableStale(this)) {
                    SleepOvernightStore.recordHealth(this, "start_blocked_recoverable")
                    stopCapture()
                    stopSelf()
                    return START_NOT_STICKY
                }
                if (alarmTarget > 0) {
                    val resume = SleepOvernightStore.isActive(this) &&
                        SleepOvernightStore.isSessionValid(this) &&
                        kotlin.math.abs(SleepOvernightStore.alarmTargetMs(this) - alarmTarget) <= 60_000
                    if (!resume) {
                        SleepOvernightStore.startSession(this, alarmTarget, windowMin, smart)
                        SleepOvernightStore.recordHealth(this, "session_started")
                    } else {
                        SleepOvernightStore.recordHealth(this, "session_resumed")
                    }
                    SleepAlarmPreferences.setLastAlarmTargetMs(this, alarmTarget)
                }
                if (SleepOvernightStore.isActive(this)) {
                    SleepAlarmScheduler.ensureScheduled(this)
                }
            }
        }

        SleepOvernightStore.clearSessionIfStale(this)
        if (!SleepOvernightStore.isActive(this)) {
            SleepOvernightStore.recordStopReason(this, "no_active_session")
            stopCapture()
            stopSelf()
            return START_NOT_STICKY
        }
        if (SleepOvernightStore.isRecoverableStale(this)) {
            SleepOvernightStore.recordStopReason(this, "recoverable_stale_session")
            stopCapture()
            stopSelf()
            return START_NOT_STICKY
        }
        if (!SleepOvernightStore.isSessionValid(this)) {
            SleepOvernightStore.recordStopReason(this, "invalid_session")
            stopCapture()
            stopSelf()
            return START_NOT_STICKY
        }

        SleepAlarmScheduler.ensureScheduled(this)
        if (!hasRecordAudio()) {
            SleepOvernightStore.recordHealth(this, "waiting_for_record_audio")
            updateNotification("Microphone required — grant RECORD_AUDIO for overnight tracking")
            if (!promoteToForeground("Sleep tracking — mic permission needed")) {
                SleepOvernightStore.recordStopReason(this, "fgs_without_mic_denied")
            }
            return START_STICKY
        }
        if (!promoteToForeground("Listening for sleep…")) {
            SleepOvernightStore.recordStopReason(this, "fgs_promote_failed")
            SleepOvernightStore.recordHealth(this, "retrying_fgs")
            scope.launch {
                delay(2_000)
                if (promoteToForeground("Listening for sleep…")) startContinuousCapture()
            }
            return START_STICKY
        }
        startContinuousCapture()
        SleepAlarmScheduler.scheduleSamplesWatchdog(this)
        return START_STICKY
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        if (SleepOvernightStore.isActive(this)) {
            SleepAlarmScheduler.scheduleImmediateKeepAlive(this)
            resumeIfSessionActive(applicationContext)
        }
        super.onTaskRemoved(rootIntent)
    }

    override fun onDestroy() {
        if (SleepOvernightStore.isActive(this)) {
            if (SleepOvernightStore.isRecoverableStale(this)) {
                SleepOvernightStore.recordStopReason(this, "service_destroyed_recoverable")
            } else if (SleepOvernightStore.isSessionValid(this)) {
                SleepOvernightStore.recordMicGap(this, BUCKET_MS)
                SleepOvernightStore.recordStopReason(this, "service_destroyed")
                SleepAlarmScheduler.ensureScheduled(applicationContext)
                SleepAlarmScheduler.scheduleImmediateKeepAlive(applicationContext)
                resumeIfSessionActive(applicationContext)
            }
        }
        stopCapture()
        scope.cancel()
        sensorManager?.unregisterListener(this)
        runCatching { wakeLock?.release() }
        wakeLock = null
        runningFlag = false
        super.onDestroy()
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null) return
        val x = event.values[0]
        val y = event.values[1]
        val z = event.values[2]
        val mag = sqrt(x * x + y * y + z * z)
        lastAccelMag = mag
        accelWindow.add(System.currentTimeMillis(), mag)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) = Unit

    private fun hasRecordAudio(): Boolean =
        ContextCompat.checkSelfPermission(this, android.Manifest.permission.RECORD_AUDIO) ==
            android.content.pm.PackageManager.PERMISSION_GRANTED

    private fun promoteToForeground(text: String): Boolean {
        val notification = buildNotification(text)
        return try {
            if (Build.VERSION.SDK_INT >= 34) {
                val type = if (hasRecordAudio()) {
                    ServiceInfo.FOREGROUND_SERVICE_TYPE_MICROPHONE
                } else {
                    ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE
                }
                startForeground(NOTIFICATION_ID, notification, type)
            } else if (Build.VERSION.SDK_INT >= 29 && hasRecordAudio()) {
                startForeground(
                    NOTIFICATION_ID,
                    notification,
                    ServiceInfo.FOREGROUND_SERVICE_TYPE_MICROPHONE,
                )
            } else {
                startForeground(NOTIFICATION_ID, notification)
            }
            true
        } catch (_: SecurityException) {
            false
        }
    }

    private fun startContinuousCapture() {
        stopCapture()
        rmsBucket.clear()
        partialMels.clear()
        emptyReadStreak = 0
        pcmRing = SleepPcmRingBuffer(20, SAMPLE_RATE)
        lastClipAtMs = 0L
        clipsThisNight = 0
        lastBucketElapsedMs = 0L
        bucketCount = 0
        alarmTriggered = false
        wakeWindowAnnounced = false
        if (!startAudioRecord()) {
            SleepOvernightStore.recordHealth(this, "mic_init_failed")
            updateNotification("Mic unavailable — retrying…")
            scope.launch {
                delay(5_000)
                restartAudioCapture()
            }
        }
        audioJob = scope.launch { audioReadLoop() }
        sampleJob = scope.launch { bucketLoop() }
        startHealthMonitor()
    }

    private fun startHealthMonitor() {
        healthJob?.cancel()
        healthJob = scope.launch {
            while (isActive) {
                delay(HEALTH_INTERVAL_MS)
                renewWakeLockIfNeeded()
                if (SleepOvernightStore.isActive(this@SleepListenService)) {
                    SleepOvernightStore.recordHealth(this@SleepListenService, "heartbeat")
                }
            }
        }
    }

    private fun startAudioRecord(): Boolean {
        if (!hasRecordAudio()) return false
        val minBuf = AudioRecord.getMinBufferSize(
            SAMPLE_RATE,
            AudioFormat.CHANNEL_IN_MONO,
            AudioFormat.ENCODING_PCM_16BIT,
        )
        if (minBuf <= 0) return false
        val sources = listOf(
            MediaRecorder.AudioSource.UNPROCESSED,
            MediaRecorder.AudioSource.MIC,
        )
        for (source in sources) {
            val record = runCatching {
                AudioRecord(source, SAMPLE_RATE, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT, minBuf * 4)
            }.getOrNull() ?: continue
            if (record.state != AudioRecord.STATE_INITIALIZED) {
                record.release()
                continue
            }
            runCatching {
                record.startRecording()
                audioRecord = record
                SleepOvernightStore.recordHealth(this, "mic_started")
                return true
            }.onFailure { record.release() }
        }
        return false
    }

    private suspend fun audioReadLoop() {
        val buffer = ShortArray(SAMPLE_RATE / 2)
        val pcmBytes = ByteArray(buffer.size * 2)
        while (scope.isActive) {
            val record = audioRecord
            if (record == null) {
                delay(AUDIO_READ_MS)
                continue
            }
            val read = record.read(buffer, 0, buffer.size)
            if (read <= 0) {
                emptyReadStreak++
                if (emptyReadStreak >= 6) restartAudioCapture()
                delay(AUDIO_READ_MS)
                continue
            }
            emptyReadStreak = 0
            val rms = SleepAudioAnalyzer.rmsFromPcm(buffer, read)
            rmsBucket.add(rms)
            for (i in 0 until read) {
                val v = buffer[i].toInt()
                pcmBytes[i * 2] = (v and 0xFF).toByte()
                pcmBytes[i * 2 + 1] = ((v shr 8) and 0xFF).toByte()
            }
            pcmRing.appendPcm(pcmBytes, 0, read * 2)
            delay(AUDIO_READ_MS)
        }
    }

    private suspend fun bucketLoop() {
        while (scope.isActive) {
            delay(BUCKET_MS)
            if (!SleepOvernightStore.isActive(this)) continue
            val started = SleepOvernightStore.startedAtMs(this)
            val elapsed = (System.currentTimeMillis() - started).coerceAtLeast(0L)
            val accel = accelWindow.snapshot()
            val baselineAudio = SleepOvernightStore.baselineAudioRms(this)
            val baselineMove = SleepOvernightStore.baselineMovement(this)
            val pcmBytes = pcmRing.tailPcmBytes(SAMPLE_RATE * 2 * (BUCKET_MS / 1000).toInt())
            val recent = SleepOvernightStore.loadRecentSamples(this, 120)
            val features = SleepAudioFeaturePipeline.analyzeBucket(
                context = this,
                rmsSeries = rmsBucket.toList(),
                baselineRms = baselineAudio,
                pcm16le = pcmBytes,
                sampleRate = SAMPLE_RATE,
                movement = (accel.activityIndex / baselineMove.coerceAtLeast(0.05f)).coerceIn(0f, 3f),
                recentSamples = recent,
                bucketIndex = bucketCount,
            )
            rmsBucket.clear()
            partialMels += features.melPartial
            val movement = (accel.activityIndex / baselineMove.coerceAtLeast(0.05f)).coerceIn(0f, 3f)
            var melCompact: FloatArray? = null
            if (partialMels.size >= SleepAudioConstants.EPOCH_BUCKETS) {
                val epoch = SleepAudioFeaturePipeline.buildEpoch(
                    this,
                    partialMels.toList(),
                    recent + SleepTrackSample(
                        elapsedMs = elapsed,
                        movement = movement,
                        audioLevel = features.window.rms,
                    ),
                    bucketCount,
                )
                melCompact = epoch.melCompact
                partialMels.clear()
            }
            val sample = SleepTrackSample(
                elapsedMs = elapsed,
                movement = movement,
                audioLevel = features.window.rms,
                breathRateBpm = features.window.breathRateBpm,
                breathRegularity = features.window.breathRegularity,
                quietFraction = features.window.quietFraction,
                snoreLikelihood = features.window.snoreLikelihood,
                movementVariance = accel.variance,
                melCompact = melCompact,
                asleepProb = features.asleepProb,
                stageConfidence = features.stageConfidence,
                lightSleepProb = features.lightSleepProb,
                eventTag = features.eventTag,
                snoreIntensity = features.snoreIntensity,
                audioQualityOk = features.audioQualityOk,
                noiseTag = features.noiseTag,
                breathPause = features.breathPause,
                sonarMotion = features.sonarMotion,
            )
            SleepOvernightStore.appendSample(this, sample)
            maybeSaveDisturbanceClip(features.eventTag, features.snoreIntensity, pcmBytes, elapsed)
            bucketCount++
            if (bucketCount == CALIBRATION_BUCKETS) {
                val avgRms = features.window.rms * baselineAudio
                SleepOvernightStore.setBaselines(this, avgRms.coerceAtLeast(50f), movement.coerceAtLeast(0.05f))
            }
            checkAwayFromBed()
            checkSmartAlarm()
            lastBucketElapsedMs = elapsed
        }
    }

    private fun isTalkBucket(f: SleepAudioAnalyzer.WindowFeatures): Boolean =
        f.breathRateBpm > 0f && (f.rms >= 1.85f || (f.rms >= 1.55f && f.quietFraction <= 0.14f))

    private fun isNoiseDisturbanceBucket(f: SleepAudioAnalyzer.WindowFeatures): Boolean =
        f.snoreLikelihood < 0.2f && f.rms >= 2.2f && f.quietFraction <= 0.2f

    private fun maybeSaveDisturbanceClip(eventTag: String?, snoreIntensity: Int, pcmBytes: ByteArray, elapsed: Long) {
        val disturbing = eventTag in setOf("snore", "talk", "cough", "noise") || snoreIntensity >= 1
        if (!disturbing || pcmBytes.isEmpty()) return
        val now = System.currentTimeMillis()
        if (now - lastClipAtMs < 30_000L || clipsThisNight >= 12) return
        val nightId = SleepOvernightStore.startedAtMs(this)
        if (nightId <= 0L) return
        SleepAudioClipStore(this).saveClip(nightId, clipsThisNight, pcmBytes)
        clipsThisNight++
        lastClipAtMs = now
    }

    private fun checkAwayFromBed() {
        if (awayFromBedNotified) return
        if (System.currentTimeMillis() < SleepOvernightStore.windowStartMs(this)) return
        val recent = SleepOvernightStore.loadRecentSamples(this, 3)
        if (recent.isEmpty()) return
        val avgMove = recent.map { it.movement }.average().toFloat()
        highMoveStreak = if (avgMove >= 1.35f) highMoveStreak + 1 else 0
        if (highMoveStreak >= 120) {
            awayFromBedNotified = true
            updateNotification("Still tracking — tap Save night if you're up")
        }
    }

    private fun checkSmartAlarm() {
        if (alarmTriggered || !SleepOvernightStore.isSessionValid(this)) return
        val started = SleepOvernightStore.startedAtMs(this)
        val now = System.currentTimeMillis()
        if (now - started < MIN_TRACK_MS_BEFORE_ALARM) return
        val alarmTarget = SleepOvernightStore.alarmTargetMs(this)
        val windowStart = SleepOvernightStore.windowStartMs(this)
        val windowEnd = SleepOvernightStore.windowEndMs(this)
        val smart = SleepOvernightStore.smartAlarm(this)
        if (alarmTarget < started || windowEnd < started + 60_000) return
        if (now >= windowStart && !wakeWindowAnnounced) {
            wakeWindowAnnounced = true
            updateNotification(
                if (smart) "Wake-up window active — finding light sleep"
                else "Wake-up window active — alarm at set time",
            )
        }
        var fireAt = alarmTarget
        if (smart) {
            if (now < windowStart) return
            val samples = SleepOvernightStore.loadSamples(this)
            val idx = SleepPhaseAnalyzer.bestWakeIndex(
                samples,
                (windowStart - started).coerceAtLeast(0L),
                (windowEnd - started).coerceAtLeast(0L),
                this,
            )
            if (idx in samples.indices) fireAt = started + samples[idx].elapsedMs
        } else if (now < alarmTarget && now < windowEnd) {
            return
        }
        if (now >= fireAt || now >= windowEnd) {
            fireAlarm(smart, maxOf(now, fireAt))
        }
    }

    private fun fireAlarm(smart: Boolean, wakeAtMs: Long) {
        if (alarmTriggered) return
        alarmTriggered = true
        SleepOvernightStore.recordStopReason(this, if (smart) "smart_alarm_fired" else "fixed_alarm_fired")
        SleepOvernightStore.recordAlarmFired(this)
        SleepAlarmAudit.recordFired(this, SleepAlarmAudit.FirePath.SERVICE_SMART)
        SleepWakeRecap.recordSmartWake(this, wakeAtMs, smart)
        SleepAlarmScheduler.scheduleImmediate(this)
        updateNotification(if (smart) "Wake up — smart alarm" else "Wake up — alarm")
        startService(
            Intent(this, SleepAlarmSoundService::class.java).setAction(SleepAlarmSoundService.ACTION_START),
        )
        startActivity(
            Intent(this, SleepAlarmActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
        )
    }

    private fun restartAudioCapture() {
        runCatching {
            audioRecord?.stop()
            audioRecord?.release()
        }
        audioRecord = null
        SleepOvernightStore.recordHealth(this, "mic_restart")
        if (startAudioRecord()) {
            updateNotification("Mic restarted — still tracking")
            if (audioJob?.isActive != true) audioJob = scope.launch { audioReadLoop() }
        } else {
            micFailStreak++
            updateNotification("Mic lost — retrying…")
            scope.launch {
                delay(10_000)
                restartAudioCapture()
            }
        }
    }

    private fun renewWakeLockIfNeeded() {
        val lock = wakeLock ?: return
        if (!lock.isHeld) runCatching { lock.acquire(12 * 60 * 60 * 1000L) }
    }

    private fun stopCapture() {
        sampleJob?.cancel()
        audioJob?.cancel()
        healthJob?.cancel()
        sampleJob = null
        audioJob = null
        healthJob = null
        runCatching {
            audioRecord?.stop()
            audioRecord?.release()
        }
        audioRecord = null
        rmsBucket.clear()
    }

    private fun buildNotification(text: String): Notification {
        ensureChannel()
        val openSleep = PendingIntent.getActivity(
            this,
            0,
            Intent(this, MainActivity::class.java).putExtra("open_tab", "sleep"),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val saveNight = PendingIntent.getActivity(
            this,
            1,
            Intent(this, MainActivity::class.java)
                .putExtra("open_tab", "sleep")
                .putExtra("sleep_wake_prompt", true),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Exercise Tracker sleep tracking")
            .setContentText(text)
            .setContentIntent(openSleep)
            .addAction(0, "Save night", saveNight)
            .setOngoing(true)
            .setCategory(NotificationCompat.CATEGORY_ALARM)
            .build()
    }

    private fun updateNotification(text: String) {
        getSystemService(NotificationManager::class.java)
            ?.notify(NOTIFICATION_ID, buildNotification(text))
    }

    private fun ensureChannel() {
        val nm = getSystemService(NotificationManager::class.java) ?: return
        nm.createNotificationChannel(
            NotificationChannel(CHANNEL_ID, "Sleep tracking", NotificationManager.IMPORTANCE_LOW).apply {
                description = "Overnight microphone and movement analysis"
            },
        )
    }

    companion object {
        const val ACTION_START = "com.example.rungps.sleep.START"
        const val ACTION_STOP = "com.example.rungps.sleep.STOP"
        const val EXTRA_ALARM_TARGET_MS = "alarm_target_ms"
        const val EXTRA_WINDOW_MIN = "window_min"
        const val EXTRA_SMART_ALARM = "smart_alarm"
        private const val CHANNEL_ID = "sleep_listen"
        private const val NOTIFICATION_ID = 7102
        private const val BUCKET_MS = SleepAudioConstants.BUCKET_MS
        private const val AUDIO_READ_MS = 500L
        private const val CALIBRATION_BUCKETS = 6
        private const val HEALTH_INTERVAL_MS = 20_000L
        private const val MIN_TRACK_MS_BEFORE_ALARM = 300_000L
        private val SAMPLE_RATE = SleepAudioConstants.SAMPLE_RATE_V2

        @Volatile
        private var runningFlag = false

        fun isRunningInProcess(): Boolean = runningFlag

        fun start(context: Context, alarmTargetMs: Long, windowMin: Int, smartAlarm: Boolean) {
            val intent = Intent(context, SleepListenService::class.java).apply {
                action = ACTION_START
                putExtra(EXTRA_ALARM_TARGET_MS, alarmTargetMs)
                putExtra(EXTRA_WINDOW_MIN, windowMin)
                putExtra(EXTRA_SMART_ALARM, smartAlarm)
            }
            ContextCompat.startForegroundService(context, intent)
        }

        fun stop(context: Context) {
            context.startService(
                Intent(context, SleepListenService::class.java).setAction(ACTION_STOP),
            )
        }

        fun resumeIfSessionActive(context: Context) {
            if (!SleepOvernightStore.isActive(context) || !SleepOvernightStore.isSessionValid(context)) return
            if (isRunningInProcess()) return
            val intent = Intent(context, SleepListenService::class.java).apply {
                action = ACTION_START
                putExtra(EXTRA_ALARM_TARGET_MS, SleepOvernightStore.alarmTargetMs(context))
                putExtra(EXTRA_WINDOW_MIN, SleepOvernightStore.windowMin(context))
                putExtra(EXTRA_SMART_ALARM, SleepOvernightStore.smartAlarm(context))
            }
            ContextCompat.startForegroundService(context, intent)
        }

        fun computeAlarmTargetMs(hour: Int, minute: Int, zone: ZoneId = ZoneId.systemDefault()): Long {
            var target = ZonedDateTime.now(zone).with(LocalTime.of(hour, minute))
            if (!target.isAfter(ZonedDateTime.now(zone))) target = target.plusDays(1)
            return target.toInstant().toEpochMilli()
        }
    }
}
