package com.example.rungps.tracking

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.location.Location
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.HandlerThread
import android.os.IBinder
import android.os.Looper
import android.os.PowerManager
import android.os.SystemClock
import android.os.VibrationEffect
import android.os.Vibrator
import android.speech.tts.TextToSpeech
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.example.rungps.MainActivity
import com.example.rungps.data.Repository
import com.example.rungps.intervals.Cue
import com.example.rungps.intervals.WorkoutEngine
import com.example.rungps.intervals.WorkoutPlan
import com.example.rungps.intervals.WorkoutPlanResolver
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.sync.RunFirestoreSync
import com.example.rungps.widget.RideRunWidgetUpdater
import com.exercisetracker.app.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.Locale

class TrackingService : Service() {
    private val serviceJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Default + serviceJob)
    private val locationMutex = Mutex()
    private val client: FusedLocationProviderClient by lazy { LocationServices.getFusedLocationProviderClient(this) }
    private val repo: Repository by lazy { Repository.get(this) }
    private val nm: NotificationManager by lazy { getSystemService(NotificationManager::class.java) }

    private var isRunning = false
    private var runId: Long? = null
    private var startedAtMs = 0L
    private var pausedAccumMs = 0L
    private var pauseStartedAtMs: Long? = null
    private var totalDistanceM = 0.0
    private var nextKmBeepAtM = 1000.0
    private var tts: TextToSpeech? = null
    private var tone: ToneGenerator? = null
    private var vibrator: Vibrator? = null
    private var currentPlanType: String? = null
    private var currentTimeSession: String? = null
    private var currentActivityType = ActivityTypes.RUN
    private var autoPauseEnabled = true
    private var vibrationEnabled = true
    private var voiceAlertsEnabled = true
    private var beepEnabled = true
    private var nextTimeAnnounceAtMs = 600_000L
    private var batteryMode = BATTERY_NORMAL
    private var smoothGps = true
    private var isAutoPaused = false
    private var manualPaused = false
    private var lastMoveAtMs = 0L
    private var lastLoc: Location? = null
    private var lastGoodLoc: Location? = null
    private var lastSmoothed: Location? = null
    private var lastPointTimeMs = 0L
    private var lastNotificationAtMs = 0L
    private var lastGpsAtMs = 0L
    private var lastGoodGpsAtMs = 0L
    private var splitCount = 0
    private var splitStartElapsedMs = 0L
    private var lastSplitMs: Long? = null
    private var lapCount = 0
    private var lapStartElapsedMs = 0L
    private var lastLapMs: Long? = null
    private var lapStartDistanceM = 0.0
    private var hazardCount = 0
    private var sensorManager: SensorManager? = null
    private var stepCounterSensor: Sensor? = null
    private var stepBase: Float? = null
    private var totalSteps = 0L
    private var stepsAtLastPoint = 0L
    private var poorGpsStreak = 0
    private var wasInPoorGps = false
    private var lastGoodSpeedMps = 0.0
    private var kmBeepCount = 0
    private var lowBatteryAlerted = false
    private var wakeLock: PowerManager.WakeLock? = null
    private var lastLocationRequest: LocationRequest? = null
    private var locationThread: HandlerThread? = null
    private var locationLooper: Looper? = null
    private var clockJob: Job? = null
    private var healthJob: Job? = null
    private var targetPaceSecPerKm: Int? = null
    private var goalDistanceM: Double? = null
    private var goalTimeMs: Long? = null
    private var engine: WorkoutEngine? = null
    private var activePlan: WorkoutPlan? = null
    private var currentSegmentLabel: String? = null
    private var segmentCount: Int? = null
    private var lastWorkoutProgress: com.example.rungps.intervals.WorkoutProgress? = null

    private val stepListener = object : SensorEventListener {
        override fun onSensorChanged(event: SensorEvent) {
            val raw = event.values.firstOrNull() ?: return
            val base = stepBase
            if (base == null) {
                stepBase = raw
                totalSteps = 0L
            } else {
                val delta = (raw - base).toLong()
                if (delta >= 0) totalSteps = delta
            }
        }

        override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) = Unit
    }

    private val callback = object : LocationCallback() {
        override fun onLocationResult(result: LocationResult) {
            result.locations.forEach { handleLocation(it) }
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return try {
            when (intent?.action) {
                ACTION_START -> start(intent)
                ACTION_STOP -> stop()
                ACTION_TOGGLE_PAUSE -> toggleManualPause()
                ACTION_LAP -> markLap()
                ACTION_MARK_HAZARD -> markHazard()
                ACTION_REASSERT -> reassertRecording()
                null -> {
                    if (!isRunning && TrackingActiveStore.isActive(this)) {
                        scope.launch { recoverRecordingIfPossible() }
                    }
                }
            }
            START_STICKY
        } catch (_: Exception) {
            START_STICKY
        }
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        if (isRunning || TrackingActiveStore.isActive(this)) {
            runCatching {
                ContextCompat.startForegroundService(
                    this,
                    Intent(this, TrackingService::class.java).setAction(ACTION_REASSERT),
                )
            }
        }
        super.onTaskRemoved(rootIntent)
    }

    override fun onDestroy() {
        if (isRunning || TrackingActiveStore.isActive(this)) {
            runCatching {
                ContextCompat.startForegroundService(
                    this,
                    Intent(this, TrackingService::class.java).setAction(ACTION_REASSERT),
                )
            }
        }
        stopLocationThread()
        clockJob?.cancel()
        healthJob?.cancel()
        runCatching { wakeLock?.release() }
        wakeLock = null
        super.onDestroy()
    }

    private fun start(intent: Intent) {
        if (isRunning) return

        currentActivityType = intent.getStringExtra(EXTRA_ACTIVITY_TYPE) ?: ActivityTypes.RUN
        autoPauseEnabled = intent.getBooleanExtra(EXTRA_AUTO_PAUSE, true)
        vibrationEnabled = intent.getBooleanExtra(EXTRA_VIBRATION, true)
        voiceAlertsEnabled = intent.getBooleanExtra(EXTRA_VOICE_ALERTS, true)
        beepEnabled = intent.getBooleanExtra(EXTRA_BEEP_CUES, true)
        batteryMode = intent.getStringExtra(EXTRA_BATTERY_MODE) ?: BATTERY_NORMAL
        smoothGps = intent.getBooleanExtra(EXTRA_SMOOTH_GPS, true)
        currentPlanType = intent.getStringExtra(EXTRA_PLAN_TYPE)
        currentTimeSession = intent.getStringExtra(EXTRA_TIME_SESSION)
        targetPaceSecPerKm = intent.getIntExtra(EXTRA_TARGET_PACE_SEC_PER_KM, -1).takeIf { it > 0 }
        goalDistanceM = intent.getDoubleExtra(EXTRA_GOAL_DISTANCE_M, -1.0).takeIf { it > 0.0 }
        goalTimeMs = intent.getLongExtra(EXTRA_GOAL_TIME_MS, -1L).takeIf { it > 0L }
        val planJson = intent.getStringExtra(EXTRA_PLAN_JSON)
        val resolvedPlan = WorkoutPlanResolver.resolve(currentPlanType, planJson, currentTimeSession)
        activePlan = resolvedPlan
        engine = resolvedPlan?.let { WorkoutEngine(it) }
        segmentCount = resolvedPlan?.segments?.size
        currentSegmentLabel = resolvedPlan?.segments?.firstOrNull()?.label
        lastWorkoutProgress = null

        startedAtMs = System.currentTimeMillis()
        lastMoveAtMs = startedAtMs
        isRunning = true
        manualPaused = false
        isAutoPaused = false
        pausedAccumMs = 0L
        pauseStartedAtMs = null
        totalDistanceM = 0.0
        nextKmBeepAtM = 1000.0
        splitCount = 0
        splitStartElapsedMs = 0L
        lastSplitMs = null
        lapCount = 0
        lapStartElapsedMs = 0L
        lapStartDistanceM = 0.0
        hazardCount = 0
        totalSteps = 0L
        stepBase = null
        nextTimeAnnounceAtMs = 600_000L
        lastLoc = null
        lastGoodLoc = null
        lastSmoothed = null

        tone = runCatching { ToneGenerator(AudioManager.STREAM_ALARM, 80) }.getOrNull()
        vibrator = getSystemService(Vibrator::class.java)
        sensorManager = getSystemService(SensorManager::class.java)
        stepCounterSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        stepCounterSensor?.let { sensorManager?.registerListener(stepListener, it, SensorManager.SENSOR_DELAY_NORMAL) }

        if (voiceAlertsEnabled) {
            tts = TextToSpeech(this) { status ->
                if (status == TextToSpeech.SUCCESS) {
                    tts?.let(RunTtsEngine::configure)
                    if (voiceAlertsEnabled) speak(RunVoiceAnnouncer.activityStarted(ActivityTypes.isBike(currentActivityType)))
                }
            }
        }

        promoteToForeground("Starting GPS…")
        renewWakeLock()
        startLocationUpdates()
        startRecordingClock()
        startRecordingHealth()
        publishState()

        scope.launch {
            val id = repo.startRun(startedAtMs, currentActivityType)
            runId = id
            TrackingActiveStore.markActive(this@TrackingService, id, startedAtMs, currentActivityType)
            RecordingHrBridge.onRunStarted(id)
            RideRunWidgetUpdater.refreshAsync(this@TrackingService)
            engine?.start(0L, 0.0)?.let { emitCues(it) }
        }
    }

    private suspend fun recoverRecordingIfPossible() {
        val storedId = TrackingActiveStore.runId(this) ?: return
        val storedStart = TrackingActiveStore.startedAtMs(this)
        if (storedStart <= 0L) return
        runId = storedId
        startedAtMs = storedStart
        isRunning = true
        totalDistanceM = TrackingActiveStore.liveDistanceM(this)
        currentActivityType = TrackingActiveStore.liveActivityType(this)
        promoteToForeground("Recording — recovered")
        renewWakeLock()
        startLocationUpdates()
        startRecordingClock()
        startRecordingHealth()
        TrackingState.patch { current ->
            current.copy(
                isRecording = true,
                startedAtMs = startedAtMs,
                elapsedMs = activeElapsedMs(),
                distanceM = totalDistanceM,
                steps = totalSteps,
                planType = currentPlanType,
                isAutoPaused = isAutoPaused,
                isPaused = manualPaused || isAutoPaused,
            )
        }
    }

    private fun stop() {
        if (!isRunning) {
            stopSelf()
            return
        }
        isRunning = false
        if (voiceAlertsEnabled) {
            speak(RunVoiceAnnouncer.activityStopped(ActivityTypes.isBike(currentActivityType)))
        }
        client.removeLocationUpdates(callback)
        runCatching { sensorManager?.unregisterListener(stepListener) }
        val ended = System.currentTimeMillis()
        val duration = (ended - startedAtMs).coerceAtLeast(0L)
        val id = runId
        scope.launch {
            if (id != null) {
                repo.finishRun(
                    runId = id,
                    endedAtMs = ended,
                    totalDistanceM = totalDistanceM,
                    totalDurationMs = duration,
                    totalSteps = totalSteps,
                    planType = currentPlanType,
                    timeSession = currentTimeSession,
                )
                if (repo.runExists(id)) {
                    runCatching { RunFirestoreSync.pushFinishedRun(this@TrackingService, id) }
                    repo.runById(id)?.let { run ->
                        runCatching { com.example.rungps.health.HealthConnectWriteback.maybePushRun(this@TrackingService, run) }
                    }
                }
            }
            RecordingHrBridge.onRunStopped()
            TrackingActiveStore.clear(this@TrackingService)
            TrackingState.update(
                TrackingUiState(
                    isRecording = false,
                    lastFinishedRunId = id,
                    lastFinishedAtMs = ended,
                ),
            )
            RideRunWidgetUpdater.refreshAsync(this@TrackingService)
            stopSelf()
        }
    }

    private fun reassertRecording() {
        if (!isRunning && TrackingActiveStore.isActive(this)) {
            scope.launch { recoverRecordingIfPossible() }
            return
        }
        if (isRunning) {
            promoteToForeground("Recording — screen off OK")
            renewWakeLock()
            runCatching {
                client.removeLocationUpdates(callback)
                startLocationUpdates()
            }
        }
    }

    private fun buildLocationRequest(): LocationRequest {
        val (priority, intervalMs, minDistance) = when (batteryMode) {
            BATTERY_RACE -> Triple(Priority.PRIORITY_HIGH_ACCURACY, 750L, 0.8f)
            BATTERY_SAVE -> Triple(Priority.PRIORITY_BALANCED_POWER_ACCURACY, 3000L, 5.0f)
            else -> Triple(Priority.PRIORITY_HIGH_ACCURACY, 1000L, 1.0f)
        }
        return LocationRequest.Builder(priority, intervalMs)
            .setMinUpdateIntervalMillis(intervalMs / 2)
            .setMinUpdateDistanceMeters(minDistance)
            .setMaxUpdateDelayMillis(0L)
            .setWaitForAccurateLocation(false)
            .build()
    }

    private fun ensureLocationLooper(): Looper {
        locationLooper?.let { return it }
        val thread = HandlerThread("RunGPS-Location").also { it.start() }
        locationThread = thread
        locationLooper = thread.looper
        return thread.looper
    }

    private fun stopLocationThread() {
        runCatching { client.removeLocationUpdates(callback) }
        locationThread?.quitSafely()
        locationThread = null
        locationLooper = null
    }

    private fun startLocationUpdates() {
        val request = lastLocationRequest ?: buildLocationRequest().also { lastLocationRequest = it }
        runCatching {
            client.requestLocationUpdates(request, callback, ensureLocationLooper())
        }
    }

    private fun ensureLocationUpdatesIfStale() {
        if (System.currentTimeMillis() - lastGpsAtMs < 90_000L) return
        runCatching {
            client.removeLocationUpdates(callback)
            startLocationUpdates()
        }
    }

    private fun startRecordingClock() {
        clockJob?.cancel()
        clockJob = scope.launch {
            while (isActive && isRunning) {
                delay(1000L)
                if (!isRunning) break
                val elapsed = activeElapsedMs()
                TrackingState.patch { current ->
                    if (!current.isRecording) return@patch current
                    current.copy(
                        elapsedMs = elapsed,
                        isAutoPaused = isAutoPaused,
                        isPaused = manualPaused || isAutoPaused,
                        currentSplitElapsedMs = (elapsed - splitStartElapsedMs).coerceAtLeast(0L),
                    )
                }
                maybeAnnounceElapsed(elapsed)
                tickWorkoutEngine(elapsed, totalDistanceM)
            }
        }
    }

    private fun startRecordingHealth() {
        healthJob?.cancel()
        healthJob = scope.launch {
            while (isActive && isRunning) {
                delay(HEALTH_INTERVAL_MS)
                if (!isRunning) break
                ensureLocationUpdatesIfStale()
            }
        }
    }

    private fun handleLocation(location: Location) {
        val id = runId ?: return
        lastGpsAtMs = System.currentTimeMillis()
        val accuracy = location.accuracy
        if (accuracy.isInfinite() || accuracy.isNaN() || accuracy > 120f) return
        if (accuracy <= 28f) lastGoodGpsAtMs = System.currentTimeMillis()
        scope.launch { processLocation(id, location, accuracy) }
    }

    private suspend fun processLocation(runId: Long, location: Location, accuracy: Float) {
        locationMutex.withLock {
            if (!isRunning || manualPaused || isAutoPaused) return
            val now = System.currentTimeMillis()
            val mapLoc = if (smoothGps) smoothLocation(location) else location
            val prev = lastLoc
            var deltaM = 0.0
            var speedMps = 0.0
            if (prev != null) {
                val dtMs = (mapLoc.time - prev.time).coerceAtLeast(1L)
                deltaM = prev.distanceTo(mapLoc).toDouble()
                speedMps = deltaM / (dtMs / 1000.0)
                if (deltaM < 0.5 || speedMps > 15.0) {
                    deltaM = 0.0
                }
            }
            if (deltaM > 0.0) {
                lastMoveAtMs = now
                lastGoodSpeedMps = speedMps
                setAutoPaused(false)
            } else if (autoPauseEnabled && now - lastMoveAtMs > AUTO_PAUSE_MS) {
                setAutoPaused(true)
            }

            val prevTotal = totalDistanceM
            if (deltaM > 0.0) {
                totalDistanceM += deltaM
                lastLoc = mapLoc
                lastGoodLoc = mapLoc
                lastPointTimeMs = mapLoc.time
                repo.insertPoint(
                    PointEntity(
                        runId = runId,
                        timeMs = mapLoc.time,
                        lat = mapLoc.latitude,
                        lon = mapLoc.longitude,
                        accuracyM = accuracy,
                        eleM = mapLoc.altitude.takeIf { mapLoc.hasAltitude() },
                        distanceFromPrevM = deltaM,
                    ),
                )
                while (totalDistanceM >= nextKmBeepAtM) {
                    val splitDuration = activeElapsedMs(now) - splitStartElapsedMs
                    splitCount++
                    kmBeepCount++
                    lastSplitMs = splitDuration
                    announceKm(kmBeepCount, splitDuration)
                    repo.insertRunSplit(
                        runId = runId,
                        kind = "KM",
                        idx = kmBeepCount,
                        elapsedEndMs = activeElapsedMs(now),
                        durationMs = splitDuration,
                        distanceM = 1000.0,
                    )
                    splitStartElapsedMs = activeElapsedMs(now)
                    nextKmBeepAtM += 1000.0
                }
            }

            tickWorkoutEngine(activeElapsedMs(now), totalDistanceM)
            publishState()
            if (now - lastNotificationAtMs >= 2000L) {
                lastNotificationAtMs = now
                updateNotification(activeElapsedMs(now), totalDistanceM, currentSegmentLabel)
            }
        }
    }

    private fun tickWorkoutEngine(elapsedMs: Long, distanceM: Double) {
        val workoutEngine = engine ?: return
        val (progress, cues) = workoutEngine.onUpdate(elapsedMs, distanceM)
        lastWorkoutProgress = progress
        currentSegmentLabel = activePlan?.segments?.getOrNull(progress.segmentIndex)?.label
        if (cues.isNotEmpty()) emitCues(cues)
    }

    private fun smoothLocation(location: Location): Location {
        val prev = lastSmoothed ?: lastGoodLoc
        if (prev == null || !smoothGps) {
            lastSmoothed = location
            return location
        }
        val blended = Location(location).apply {
            latitude = (prev.latitude + location.latitude) / 2.0
            longitude = (prev.longitude + location.longitude) / 2.0
        }
        lastSmoothed = blended
        return blended
    }

    private fun activeElapsedMs(nowMs: Long = System.currentTimeMillis()): Long {
        val gross = (nowMs - startedAtMs).coerceAtLeast(0L)
        val pauseNow = pauseStartedAtMs?.let { (nowMs - it).coerceAtLeast(0L) } ?: 0L
        return (gross - pausedAccumMs - pauseNow).coerceAtLeast(0L)
    }

    private fun setAutoPaused(paused: Boolean) {
        if (!autoPauseEnabled || manualPaused || paused == isAutoPaused) return
        isAutoPaused = paused
        val now = System.currentTimeMillis()
        if (paused) {
            pauseStartedAtMs = now
            if (voiceAlertsEnabled) speak(RunVoiceAnnouncer.paused()) else if (vibrationEnabled) vibrateShort()
        } else {
            pauseStartedAtMs?.let { pauseStartedAtMs -> pausedAccumMs += (now - pauseStartedAtMs).coerceAtLeast(0L) }
            pauseStartedAtMs = null
            if (voiceAlertsEnabled) speak(RunVoiceAnnouncer.resumed()) else if (vibrationEnabled) vibrateShort()
        }
    }

    private fun toggleManualPause() {
        if (!isRunning) return
        manualPaused = !manualPaused
        val now = System.currentTimeMillis()
        if (manualPaused) {
            pauseStartedAtMs = now
            isAutoPaused = true
            if (voiceAlertsEnabled) speak(RunVoiceAnnouncer.paused()) else if (vibrationEnabled) vibrateShort()
        } else {
            pauseStartedAtMs?.let { pauseStartedAtMs -> pausedAccumMs += (now - pauseStartedAtMs).coerceAtLeast(0L) }
            pauseStartedAtMs = null
            isAutoPaused = false
            lastMoveAtMs = now
            if (voiceAlertsEnabled) speak(RunVoiceAnnouncer.resumed()) else if (vibrationEnabled) vibrateShort()
        }
        publishState()
        updateNotification(activeElapsedMs(now), totalDistanceM, currentSegmentLabel)
    }

    private fun markLap() {
        if (!isRunning) return
        val elapsed = activeElapsedMs()
        lapCount++
        val lapMs = elapsed - lapStartElapsedMs
        lapStartElapsedMs = elapsed
        lastLapMs = lapMs
        val lapDistance = (totalDistanceM - lapStartDistanceM).coerceAtLeast(0.0)
        lapStartDistanceM = totalDistanceM
        runId?.let { id ->
            scope.launch {
                runCatching {
                    repo.insertRunSplit(id, "LAP", lapCount, elapsed, lapMs, lapDistance)
                }
            }
        }
        if (vibrationEnabled) vibrateShort()
        publishState()
    }

    private fun markHazard() {
        if (!isRunning) return
        val elapsed = activeElapsedMs()
        hazardCount++
        runId?.let { id ->
            scope.launch {
                runCatching {
                    repo.insertRunSplit(id, "HAZARD", hazardCount, elapsed, elapsed, totalDistanceM)
                }
            }
        }
        if (vibrationEnabled) vibrateLong()
    }

    private fun speak(text: String) {
        tts?.speak(text, TextToSpeech.QUEUE_ADD, null, "voice-${SystemClock.elapsedRealtime()}")
    }

    private fun announceKm(km: Int, splitDurationMs: Long) {
        when {
            voiceAlertsEnabled -> speak(RunVoiceAnnouncer.kilometerSplit(km, splitDurationMs, ActivityTypes.isBike(currentActivityType)))
            beepEnabled -> beepKm()
            vibrationEnabled -> vibrateLong()
        }
    }

    private fun maybeAnnounceElapsed(elapsedMs: Long) {
        if (!voiceAlertsEnabled) return
        while (elapsedMs >= nextTimeAnnounceAtMs) {
            speak(RunVoiceAnnouncer.elapsedTime(nextTimeAnnounceAtMs, ActivityTypes.isBike(currentActivityType)))
            nextTimeAnnounceAtMs += 600_000L
        }
    }

    private fun beepKm() {
        if (!beepEnabled && !vibrationEnabled) return
        if (beepEnabled) {
            ensureAlarmMaxVolume()
            tone?.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 450)
        }
        if (vibrationEnabled) vibrateLong()
    }

    private fun emitCues(cues: List<Cue>) {
        if (tts == null && !beepEnabled && !vibrationEnabled) return
        for (cue in cues) {
            when (cue) {
                is Cue.Speak -> if (voiceAlertsEnabled) speak(cue.text)
                is Cue.Beep -> if (beepEnabled || vibrationEnabled) {
                    when (cue.pattern) {
                        Cue.Beep.Pattern.Short -> beepShort()
                        Cue.Beep.Pattern.Long -> beepLong()
                        Cue.Beep.Pattern.IntervalEndOne -> beepBurst(1)
                        Cue.Beep.Pattern.IntervalEndTwo -> beepBurst(2)
                        Cue.Beep.Pattern.IntervalEndThree -> beepBurst(3)
                        Cue.Beep.Pattern.IntervalStartThree -> beepBurst(3)
                        Cue.Beep.Pattern.IntervalStartTwo -> beepBurst(2)
                        Cue.Beep.Pattern.IntervalStartOne -> beepBurst(1)
                    }
                }
            }
        }
    }

    private fun beepShort() {
        if (!beepEnabled && !vibrationEnabled) return
        if (beepEnabled) {
            ensureAlarmMaxVolume()
            tone?.startTone(ToneGenerator.TONE_PROP_BEEP, 180)
        }
        if (vibrationEnabled) vibrateShort()
    }

    private fun beepLong() {
        if (!beepEnabled && !vibrationEnabled) return
        if (beepEnabled) {
            ensureAlarmMaxVolume()
            tone?.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 260)
        }
        if (vibrationEnabled) vibrateLong()
    }

    private fun beepBurst(count: Int) {
        if (!beepEnabled && !vibrationEnabled) return
        ensureAlarmMaxVolume()
        scope.launch {
            repeat(count.coerceAtLeast(1)) {
                if (beepEnabled) tone?.startTone(ToneGenerator.TONE_PROP_BEEP, 120)
                if (vibrationEnabled) vibrateShort()
                delay(200L)
            }
        }
    }

    private fun ensureAlarmMaxVolume() {
        runCatching {
            val audio = getSystemService(AudioManager::class.java)
            val max = audio.getStreamMaxVolume(AudioManager.STREAM_ALARM)
            if (max > 0) audio.setStreamVolume(AudioManager.STREAM_ALARM, max, 0)
        }
    }

    private fun vibrateShort() {
        vibrator?.takeIf { it.hasVibrator() }?.vibrate(VibrationEffect.createOneShot(40L, VibrationEffect.DEFAULT_AMPLITUDE))
    }

    private fun vibrateLong() {
        vibrator?.takeIf { it.hasVibrator() }?.vibrate(VibrationEffect.createOneShot(90L, VibrationEffect.DEFAULT_AMPLITUDE))
    }

    private fun publishState() {
        val elapsed = activeElapsedMs()
        val paused = manualPaused || isAutoPaused
        val workoutProgress = lastWorkoutProgress
        TrackingState.update(
            TrackingUiState(
                isRecording = isRunning,
                startedAtMs = startedAtMs,
                elapsedMs = elapsed,
                distanceM = totalDistanceM,
                steps = totalSteps,
                lastLat = lastLoc?.latitude,
                lastLon = lastLoc?.longitude,
                planType = currentPlanType,
                segmentLabel = currentSegmentLabel,
                segmentIndex = workoutProgress?.segmentIndex,
                segmentCount = segmentCount,
                segmentElapsedMs = workoutProgress?.segmentElapsedMs,
                segmentRemainingMs = workoutProgress?.segmentRemainingMs,
                segmentDistanceM = workoutProgress?.segmentDistanceM,
                segmentRemainingM = workoutProgress?.segmentRemainingM,
                workoutFinished = workoutProgress?.finished,
                isAutoPaused = isAutoPaused,
                isPaused = paused,
                currentSplitElapsedMs = (elapsed - splitStartElapsedMs).coerceAtLeast(0L),
                targetPaceSecPerKm = targetPaceSecPerKm,
                goalDistanceM = goalDistanceM,
                goalTimeMs = goalTimeMs,
                splitCount = splitCount,
                lastSplitMs = lastSplitMs,
                lapCount = lapCount,
                lastLapMs = lastLapMs,
                hrBpm = com.example.rungps.ble.BleClient.get(this).status.value.latestHrBpm,
                hasGpsFix = lastGoodGpsAtMs > 0 && System.currentTimeMillis() - lastGoodGpsAtMs < 15_000L,
            ),
        )
    }

    private fun updateNotification(elapsedMs: Long, distanceM: Double, segLabel: String?) {
        val km = distanceM / 1000.0
        val paceOrSpeed = if (km >= 0.01) {
            val secPerKm = elapsedMs / 1000.0 / km
            if (ActivityTypes.isBike(currentActivityType)) {
                String.format(Locale.US, "%.1f km/h", (3600.0 / secPerKm.coerceAtLeast(1.0)))
            } else {
                formatPaceLocal(secPerKm)
            }
        } else {
            "—"
        }
        val segmentSuffix = segLabel?.let { " • $it" } ?: ""
        val pauseSuffix = if (isAutoPaused) " • AUTO-PAUSED" else ""
        val text = String.format(
            Locale.US,
            "%.2f km • %s • %s%s%s",
            km,
            formatElapsedLocal(elapsedMs),
            paceOrSpeed,
            segmentSuffix,
            pauseSuffix,
        )
        TrackingActiveStore.updateLiveStats(
            this,
            distanceM,
            currentActivityType,
            manualPaused || isAutoPaused,
        )
        nm.notify(NOTIF_ID, buildNotification(text))
        RideRunWidgetUpdater.refreshAsync(this)
    }

    private fun promoteToForeground(text: String) {
        ensureChannel()
        val notification = buildNotification(text)
        runCatching {
            startForeground(NOTIF_ID, notification, ServiceInfoCompatType())
        }.onFailure {
            startForeground(NOTIF_ID, notification)
        }
    }

    private fun ServiceInfoCompatType(): Int =
        if (android.os.Build.VERSION.SDK_INT >= 29) android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_LOCATION else 0

    private fun buildNotification(text: String): Notification {
        ensureChannel()
        val openIntent = Intent(this, MainActivity::class.java).apply {
            putExtra("open_tab", "run")
            addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        val openPending = PendingIntent.getActivity(this, 0, openIntent, pendingFlags())
        val stopPending = PendingIntent.getService(
            this,
            1,
            Intent(this, TrackingService::class.java).setAction(ACTION_STOP),
            pendingFlags(),
        )
        val lapPending = PendingIntent.getService(
            this,
            2,
            Intent(this, TrackingService::class.java).setAction(ACTION_LAP),
            pendingFlags(),
        )
        val pausePending = PendingIntent.getService(
            this,
            3,
            Intent(this, TrackingService::class.java).setAction(ACTION_TOGGLE_PAUSE),
            pendingFlags(),
        )
        val hazardPending = PendingIntent.getService(
            this,
            4,
            Intent(this, TrackingService::class.java).setAction(ACTION_MARK_HAZARD),
            pendingFlags(),
        )
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Run recording")
            .setContentText(text)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setOngoing(true)
            .setContentIntent(openPending)
            .setFullScreenIntent(openPending, true)
            .addAction(0, "Lap", lapPending)
            .addAction(0, if (manualPaused) "Resume" else "Pause", pausePending)
            .addAction(0, "Hazard", hazardPending)
            .addAction(0, "Stop", stopPending)
            .setOnlyAlertOnce(true)
            .setCategory(NotificationCompat.CATEGORY_WORKOUT)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setStyle(NotificationCompat.BigTextStyle().bigText(text))
            .setSubText("Tap to open live stats on lock screen")
            .build()
    }

    private fun pendingFlags(): Int =
        PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE

    private fun ensureChannel() {
        if (nm.getNotificationChannel(CHANNEL_ID) != null) return
        nm.createNotificationChannel(
            NotificationChannel(CHANNEL_ID, "GPS tracking", NotificationManager.IMPORTANCE_LOW),
        )
    }

    private fun renewWakeLock() {
        runCatching {
            val held = wakeLock?.isHeld == true
            if (!held) {
                wakeLock?.release()
                val pm = getSystemService(PowerManager::class.java)
                wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "RunGPS:Tracking").apply {
                    setReferenceCounted(false)
                    acquire(12 * 60 * 60 * 1000L)
                }
            }
        }
    }

    private fun formatElapsedLocal(ms: Long): String {
        val totalSec = (ms / 1000).coerceAtLeast(0)
        return String.format(
            Locale.US,
            "%d:%02d:%02d",
            totalSec / 3600,
            (totalSec % 3600) / 60,
            totalSec % 60,
        )
    }

    private fun formatPaceLocal(secondsPerKm: Double): String {
        val sec = secondsPerKm.coerceAtLeast(0.0)
        val minutes = (sec / 60.0).toInt()
        val seconds = kotlin.math.abs((sec - minutes * 60).toInt())
        return String.format(Locale.US, "%d:%02d /km", minutes, seconds)
    }

    companion object {
        const val ACTION_START = "com.example.rungps.tracking.START"
        const val ACTION_STOP = "com.example.rungps.tracking.STOP"
        const val ACTION_TOGGLE_PAUSE = "com.example.rungps.tracking.TOGGLE_PAUSE"
        const val ACTION_LAP = "com.example.rungps.tracking.LAP"
        const val ACTION_MARK_HAZARD = "com.example.rungps.tracking.MARK_HAZARD"
        const val ACTION_REASSERT = "com.example.rungps.tracking.REASSERT"

        const val EXTRA_ACTIVITY_TYPE = "activityType"
        const val EXTRA_AUTO_PAUSE = "autoPause"
        const val EXTRA_BATTERY_MODE = "batteryMode"
        const val EXTRA_BEEP_CUES = "beepCues"
        const val EXTRA_GOAL_DISTANCE_M = "goalDistanceM"
        const val EXTRA_GOAL_TIME_MS = "goalTimeMs"
        const val EXTRA_PLAN_JSON = "planJson"
        const val EXTRA_PLAN_TYPE = "planType"
        const val EXTRA_SMOOTH_GPS = "smoothGps"
        const val EXTRA_TARGET_PACE_SEC_PER_KM = "targetPaceSecPerKm"
        const val EXTRA_TIME_SESSION = "timeSession"
        const val EXTRA_VIBRATION = "vibration"
        const val EXTRA_VOICE_ALERTS = "voiceAlerts"

        const val BATTERY_NORMAL = "normal"
        const val BATTERY_RACE = "race"
        const val BATTERY_SAVE = "save"
        const val PLAN_FREE_RUN = "free"
        const val PLAN_CUSTOM = "custom"
        const val PLAN_DISTANCE_INTERVALS = "distanceIntervals"
        const val PLAN_TIME_INTERVALS = "timeIntervals"
        const val TIME_SESSION_1 = "s1"
        const val TIME_SESSION_2 = "s2"
        const val TIME_SESSION_3 = "s3"

        private const val CHANNEL_ID = "tracking"
        private const val NOTIF_ID = 1001
        private const val HEALTH_INTERVAL_MS = 60_000L
        private const val AUTO_PAUSE_MS = 8_000L
    }
}
