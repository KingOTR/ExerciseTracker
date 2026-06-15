package com.example.rungps.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class GymWidgetRefreshReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        GymWidgetUpdater.refreshAsync(context)
    }
}

class RideRunWidgetRefreshReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        RideRunWidgetUpdater.refreshAsync(context)
    }
}

class GymWidgetRestReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {}
}

class WidgetBootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        WidgetBootstrap.refreshAllAsync(context)
    }
}

class GymWidgetProvider : AppWidgetProvider() {
    override fun onEnabled(context: Context) {
        WidgetBootstrap.onWidgetEnabled(context)
    }

    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        runCatching { WidgetMinimalBind.bindGym(context, manager, ids) }
            .onFailure { Log.e("GymWidget", "onUpdate failed", it) }
    }
}

class RideRunWidgetProvider : AppWidgetProvider() {
    override fun onEnabled(context: Context) {
        WidgetBootstrap.onWidgetEnabled(context)
    }

    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        runCatching { WidgetMinimalBind.bindRideRun(context, manager, ids) }
            .onFailure { Log.e("RideRunWidget", "onUpdate failed", it) }
        RideRunWidgetUpdater.refreshAsync(context)
    }
}

class RecoveryWidgetProvider : AppWidgetProvider() {
    override fun onEnabled(context: Context) {
        WidgetBootstrap.onWidgetEnabled(context)
    }

    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        runCatching { WidgetMinimalBind.bindRecovery(context, manager, ids) }
            .onFailure { Log.e("RecoveryWidget", "onUpdate failed", it) }
    }
}
