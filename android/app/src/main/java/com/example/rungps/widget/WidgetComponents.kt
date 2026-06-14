package com.example.rungps.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.exercisetracker.app.R

class GymWidgetRefreshReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {}
}

class RideRunWidgetRefreshReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {}
}

class GymWidgetRestReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {}
}

class WidgetBootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {}
}

abstract class BaseWidgetProvider(private val layoutId: Int) : AppWidgetProvider() {
    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        ids.forEach { id ->
            manager.updateAppWidget(id, RemoteViews(context.packageName, layoutId))
        }
    }
}

class GymWidgetProvider : BaseWidgetProvider(R.layout.widget_gym_initial)
class RideRunWidgetProvider : BaseWidgetProvider(R.layout.widget_ride_run_initial)
class RecoveryWidgetProvider : BaseWidgetProvider(R.layout.widget_recovery_initial)
