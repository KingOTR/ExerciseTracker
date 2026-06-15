package com.example.rungps.gym

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.example.rungps.data.ExerciseTrackerDatabase
import com.exercisetracker.app.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class GymActiveSessionForegroundService : Service() {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var pollJob: Job? = null
    private val mediaRecorder = GymSessionMediaRecorder()
    private var activeSessionId: Long = -1L

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val channelId = "gym_session"
        val nm = getSystemService(NotificationManager::class.java)
        nm.createNotificationChannel(
            NotificationChannel(channelId, "Gym session", NotificationManager.IMPORTANCE_LOW),
        )
        startForeground(
            1002,
            NotificationCompat.Builder(this, channelId)
                .setContentTitle("Gym session active")
                .setContentText("Logging sets and media playback")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build(),
        )
        val sessionId = intent?.getLongExtra(EXTRA_SESSION_ID, -1L) ?: -1L
        activeSessionId = sessionId
        if (sessionId > 0) startMediaCapture(sessionId)
        return START_STICKY
    }

    private fun startMediaCapture(sessionId: Long) {
        pollJob?.cancel()
        mediaRecorder.reset()
        val dao = ExerciseTrackerDatabase.get(this).exerciseTrackerDao()
        pollJob = scope.launch {
            while (isActive) {
                mediaRecorder.pollAndSave(sessionId, this@GymActiveSessionForegroundService, dao)
                delay(20_000)
            }
        }
    }

    override fun onDestroy() {
        if (activeSessionId > 0) {
            scope.launch {
                mediaRecorder.finalizeSession(
                    activeSessionId,
                    ExerciseTrackerDatabase.get(this@GymActiveSessionForegroundService).exerciseTrackerDao(),
                )
            }
        }
        pollJob?.cancel()
        scope.cancel()
        super.onDestroy()
    }

    companion object {
        const val EXTRA_SESSION_ID = "session_id"

        fun start(context: Context, sessionId: Long) {
            val intent = Intent(context, GymActiveSessionForegroundService::class.java)
                .putExtra(EXTRA_SESSION_ID, sessionId)
            context.startForegroundService(intent)
        }

        fun stop(context: Context) {
            context.stopService(Intent(context, GymActiveSessionForegroundService::class.java))
        }
    }
}
