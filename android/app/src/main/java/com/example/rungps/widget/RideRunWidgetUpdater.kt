package com.example.rungps.widget

import android.content.Context
import com.example.rungps.tracking.TrackingActiveStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

object RideRunWidgetUpdater {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    fun refreshAsync(context: Context) {
        scope.launch {
            runCatching {
                val appContext = context.applicationContext
                if (TrackingActiveStore.isActive(appContext)) {
                    // Widget layout refresh is wired when Glance providers are ported.
                }
            }
        }
    }
}
