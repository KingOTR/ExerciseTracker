package com.example.rungps.tracking

import android.content.Context
import com.example.rungps.data.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.math.abs

object RecordingHrBridge {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var appContext: Context? = null
    @Volatile var activeRunId: Long? = null
        private set
    private var lastSavedMs = 0L
    private var lastBpm: Int? = null

    fun init(context: Context) {
        appContext = context.applicationContext
    }

    fun onRunStarted(runId: Long) {
        activeRunId = runId
        lastSavedMs = 0L
        lastBpm = null
    }

    fun onRunStopped() {
        activeRunId = null
        lastSavedMs = 0L
        lastBpm = null
    }

    fun offerSample(bpm: Int, timeMs: Long = System.currentTimeMillis()) {
        if (bpm !in 40..220) return
        val runId = activeRunId ?: return
        val context = appContext ?: return
        val previous = lastBpm
        if (previous != null && abs(bpm - previous) < 3 && timeMs - lastSavedMs < 4500L) return
        lastSavedMs = timeMs
        lastBpm = bpm
        scope.launch {
            runCatching {
                Repository.get(context).insertRunHrSample(runId, timeMs, bpm)
            }
        }
    }
}
