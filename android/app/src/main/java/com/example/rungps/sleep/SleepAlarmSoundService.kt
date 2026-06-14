package com.example.rungps.sleep

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder

class SleepAlarmSoundService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) stopSelf()
        return START_NOT_STICKY
    }

    companion object {
        const val ACTION_STOP = "com.example.rungps.sleep.ALARM_SOUND_STOP"
        fun requestStop(context: Context) {
            context.startService(Intent(context, SleepAlarmSoundService::class.java).setAction(ACTION_STOP))
        }
        fun isRinging(): Boolean = false
    }
}
