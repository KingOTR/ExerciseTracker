package com.example.rungps.gym

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.exercisetracker.app.R

class GymActiveSessionForegroundService : Service() {
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
                .setSmallIcon(R.mipmap.ic_launcher)
                .build(),
        )
        return START_STICKY
    }
}
