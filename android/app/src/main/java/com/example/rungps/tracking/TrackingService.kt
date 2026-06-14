package com.example.rungps.tracking

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.exercisetracker.app.R

class TrackingService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val channelId = "tracking"
        val nm = getSystemService(NotificationManager::class.java)
        nm.createNotificationChannel(
            NotificationChannel(channelId, "GPS tracking", NotificationManager.IMPORTANCE_LOW),
        )
        val notification: Notification = NotificationCompat.Builder(this, channelId)
            .setContentTitle("Exercise Tracker")
            .setContentText("Run tracking")
            .setSmallIcon(R.mipmap.ic_launcher)
            .build()
        startForeground(1001, notification)
        return START_STICKY
    }
}
