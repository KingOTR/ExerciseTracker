package com.example.rungps.sleep

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.exercisetracker.app.R

class SleepListenService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val channelId = "sleep_listen"
        val nm = getSystemService(NotificationManager::class.java)
        nm.createNotificationChannel(
            NotificationChannel(channelId, "Sleep tracking", NotificationManager.IMPORTANCE_LOW),
        )
        startForeground(
            1003,
            NotificationCompat.Builder(this, channelId)
                .setContentTitle("Sleep tracking")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build(),
        )
        return START_STICKY
    }

    companion object {
        fun isRunningInProcess(): Boolean = false
    }
}
