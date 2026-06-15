package com.example.rungps.widget

import android.content.Context

object WidgetBootstrap {
    fun onWidgetEnabled(context: Context) {
        refreshAllAsync(context)
    }

    fun refreshAllAsync(context: Context) {
        val appContext = context.applicationContext
        RideRunWidgetUpdater.refreshAsync(appContext)
        GymWidgetUpdater.refreshAsync(appContext)
        RecoveryWidgetUpdater.refreshAsync(appContext)
    }
}
