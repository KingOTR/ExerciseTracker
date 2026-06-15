package com.example.rungps.sleep

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.Build
import android.os.IBinder
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.core.app.NotificationCompat
import com.exercisetracker.app.R

class SleepAlarmSoundService : Service() {
    private var ringing = false

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_STOP -> {
                stopRinging()
                stopForeground(STOP_FOREGROUND_REMOVE)
                stopSelf()
            }
            ACTION_START -> startRinging()
        }
        return START_NOT_STICKY
    }

    private fun startRinging() {
        if (ringing) return
        ringing = true
        globalRinging = true
        ensureChannel()
        val dismiss = PendingIntent.getBroadcast(
            this,
            1,
            Intent(this, SleepAlarmReceiver::class.java).setAction(SleepAlarmReceiver.ACTION_DISMISS),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = NotificationCompat.Builder(this, CHANNEL_ALARM)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Wake up")
            .setContentText("Tap dismiss to stop alarm")
            .setCategory(NotificationCompat.CATEGORY_ALARM)
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setOngoing(true)
            .addAction(0, "Dismiss", dismiss)
            .setFullScreenIntent(
                PendingIntent.getActivity(
                    this,
                    2,
                    Intent(this, SleepAlarmActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK),
                    PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
                ),
                true,
            )
            .build()
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(NOTIFICATION_ID, notification, android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK)
        } else {
            startForeground(NOTIFICATION_ID, notification)
        }
        val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
            ?: RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        ringtone = RingtoneManager.getRingtone(this, uri)?.apply {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                audioAttributes = AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ALARM)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
            }
            play()
        }
        getSystemService(Vibrator::class.java)?.let { v ->
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                v.vibrate(VibrationEffect.createWaveform(longArrayOf(0, 500, 500), 0))
            } else {
                @Suppress("DEPRECATION")
                v.vibrate(longArrayOf(0, 500, 500), 0)
            }
        }
    }

    private fun stopRinging() {
        ringing = false
        globalRinging = false
        ringtone?.stop()
        ringtone = null
        getSystemService(Vibrator::class.java)?.cancel()
    }

    override fun onDestroy() {
        stopRinging()
        super.onDestroy()
    }

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        getSystemService(NotificationManager::class.java)?.createNotificationChannel(
            NotificationChannel(CHANNEL_ALARM, "Sleep alarm", NotificationManager.IMPORTANCE_HIGH).apply {
                setBypassDnd(true)
                lockscreenVisibility = Notification.VISIBILITY_PUBLIC
            },
        )
    }

    companion object {
        const val ACTION_START = "com.example.rungps.sleep.ALARM_SOUND_START"
        const val ACTION_STOP = "com.example.rungps.sleep.ALARM_SOUND_STOP"
        const val CHANNEL_ALARM = "sleep_alarm_sound"
        private const val NOTIFICATION_ID = 7101

        @Volatile
        private var globalRinging = false

        @Volatile
        private var ringtone: android.media.Ringtone? = null

        fun requestStop(context: Context) {
            context.startService(
                Intent(context, SleepAlarmSoundService::class.java).setAction(ACTION_STOP),
            )
        }

        fun isRinging(): Boolean = globalRinging
    }
}
