package com.example.rungps.widget

import android.content.Context
import androidx.glance.appwidget.GlanceAppWidgetManager
import com.example.rungps.widget.glance.GymGlanceWidget
import com.example.rungps.widget.glance.RecoveryGlanceWidget
import com.example.rungps.widget.glance.RideRunGlanceWidget
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

object GlanceWidgetUpdater {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    fun refreshAllAsync(context: Context) {
        scope.launch {
            runCatching { refreshRideRun(context) }
            runCatching { refreshGym(context) }
            runCatching { refreshRecovery(context) }
        }
    }

    suspend fun refreshRideRun(context: Context) {
        val manager = GlanceAppWidgetManager(context.applicationContext)
        manager.getGlanceIds(RideRunGlanceWidget::class.java).forEach { id ->
            RideRunGlanceWidget().update(context.applicationContext, id)
        }
    }

    suspend fun refreshGym(context: Context) {
        val manager = GlanceAppWidgetManager(context.applicationContext)
        manager.getGlanceIds(GymGlanceWidget::class.java).forEach { id ->
            GymGlanceWidget().update(context.applicationContext, id)
        }
    }

    suspend fun refreshRecovery(context: Context) {
        val manager = GlanceAppWidgetManager(context.applicationContext)
        manager.getGlanceIds(RecoveryGlanceWidget::class.java).forEach { id ->
            RecoveryGlanceWidget().update(context.applicationContext, id)
        }
    }
}
