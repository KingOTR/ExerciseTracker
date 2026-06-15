package com.example.rungps.widget

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

object GymWidgetUpdater {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    fun refreshAsync(context: Context) {
        scope.launch {
            runCatching { GlanceWidgetUpdater.refreshGym(context.applicationContext) }
        }
    }
}
