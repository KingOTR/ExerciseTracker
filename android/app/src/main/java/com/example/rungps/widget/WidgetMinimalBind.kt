package com.example.rungps.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.RemoteViews
import com.example.rungps.MainActivity
import com.example.rungps.tracking.TrackingActiveStore
import com.example.rungps.tracking.TrackingState
import com.example.rungps.ui.main.formatDistanceKm
import com.example.rungps.ui.main.formatElapsed
import com.exercisetracker.app.R

object WidgetMinimalBind {
    fun bindGym(context: Context, manager: AppWidgetManager, appWidgetIds: IntArray) {
        val views = RemoteViews(context.packageName, R.layout.widget_gym_host)
        views.setTextViewText(R.id.widget_title, context.getString(R.string.gym_widget_label))
        views.setTextViewText(R.id.widget_sub, context.getString(R.string.gym_widget_tap_hint))
        views.setViewVisibility(R.id.widget_badge, View.GONE)
        bindOpenIntent(context, views, "gym")
        updateAll(manager, appWidgetIds, views)
    }

    fun bindRideRun(context: Context, manager: AppWidgetManager, appWidgetIds: IntArray) {
        val views = RemoteViews(context.packageName, R.layout.widget_ride_run_host)
        val active = TrackingActiveStore.isActive(context)
        val live = TrackingState.state.value
        if (active && live.isRecording) {
            views.setViewVisibility(R.id.widget_recording_dot, View.VISIBLE)
            views.setTextViewText(R.id.widget_title, "Recording")
            views.setViewVisibility(R.id.widget_stats, View.VISIBLE)
            views.setTextViewText(R.id.widget_stats, formatDistanceKm(live.distanceM))
            views.setTextViewText(R.id.widget_sub, formatElapsed(live.elapsedMs))
            views.setTextViewText(R.id.widget_start_btn, "Open run")
        } else {
            views.setViewVisibility(R.id.widget_recording_dot, View.GONE)
            views.setTextViewText(R.id.widget_title, context.getString(R.string.ride_run_widget_label))
            views.setViewVisibility(R.id.widget_stats, View.GONE)
            views.setTextViewText(R.id.widget_sub, context.getString(R.string.ride_run_widget_tap_hint))
            views.setTextViewText(R.id.widget_start_btn, context.getString(R.string.ride_run_widget_quick_start))
        }
        bindOpenIntent(context, views, "home")
        updateAll(manager, appWidgetIds, views)
    }

    fun bindRecovery(context: Context, manager: AppWidgetManager, appWidgetIds: IntArray) {
        val views = RemoteViews(context.packageName, R.layout.widget_recovery_host)
        views.setTextViewText(R.id.widget_title, context.getString(R.string.recovery_widget_label))
        views.setTextViewText(R.id.widget_advice_line, context.getString(R.string.recovery_widget_default_advice))
        views.setTextViewText(R.id.widget_recovery_line, context.getString(R.string.recovery_widget_default_recovery))
        views.setTextViewText(R.id.widget_readiness_badge, "Ready")
        bindOpenIntent(context, views, "recovery")
        updateAll(manager, appWidgetIds, views)
    }

    private fun bindOpenIntent(context: Context, views: RemoteViews, tab: String) {
        val intent = Intent(context, MainActivity::class.java)
            .putExtra("open_tab", tab)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pending = PendingIntent.getActivity(
            context,
            tab.hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        views.setOnClickPendingIntent(R.id.widget_root, pending)
    }

    private fun updateAll(manager: AppWidgetManager, appWidgetIds: IntArray, views: RemoteViews) {
        appWidgetIds.forEach { id -> manager.updateAppWidget(id, views) }
    }

    fun requestUpdate(context: Context, providerClass: Class<*>) {
        val manager = AppWidgetManager.getInstance(context)
        val ids = manager.getAppWidgetIds(ComponentName(context, providerClass))
        if (ids.isEmpty()) return
        when (providerClass) {
            GymWidgetProvider::class.java -> bindGym(context, manager, ids)
            RideRunWidgetProvider::class.java -> bindRideRun(context, manager, ids)
            RecoveryWidgetProvider::class.java -> bindRecovery(context, manager, ids)
        }
    }
}
