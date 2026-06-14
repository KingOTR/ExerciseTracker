package com.example.rungps.media

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

class MediaSessionListenerService : NotificationListenerService() {
    override fun onListenerConnected() {}
    override fun onNotificationPosted(sbn: StatusBarNotification?) {}
}
