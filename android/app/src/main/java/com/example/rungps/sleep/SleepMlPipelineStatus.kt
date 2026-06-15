package com.example.rungps.sleep

import android.content.Context

object SleepMlPipelineStatus {
    data class Status(
        val yamnetLoaded: Boolean,
        val stagingV2Loaded: Boolean,
        val mlpLoaded: Boolean,
        val sampleRateHz: Int,
        val eventMode: String,
        val stagingMode: String,
    )

    fun load(context: Context): Status {
        SleepMlClassifier.ensureLoaded(context)
        val mlpLoaded = SleepMlClassifier.isLoaded()
        val stagingRunner = SleepTfliteRunner(SleepTfliteRunner.ASSET_STAGING_V2)
        stagingRunner.ensureLoaded(context)
        val stagingV2Loaded = stagingRunner.isLoaded
        val yamnetRunner = SleepTfliteRunner(SleepTfliteRunner.ASSET_YAMNET)
        yamnetRunner.ensureLoaded(context)
        val yamnetLoaded = yamnetRunner.isLoaded
        val eventMode = if (yamnetLoaded) "YAMNet TFLite" else "Bedside heuristics (snore/talk/cough/noise)"
        val stagingMode = when {
            stagingV2Loaded -> "Mel epoch TFLite"
            mlpLoaded -> "Distilled MLP + Mel features"
            else -> "Rule-based staging"
        }
        return Status(
            yamnetLoaded = yamnetLoaded,
            stagingV2Loaded = stagingV2Loaded,
            mlpLoaded = mlpLoaded,
            sampleRateHz = SleepAudioConstants.SAMPLE_RATE_V2,
            eventMode = eventMode,
            stagingMode = stagingMode,
        )
    }

    fun summaryLine(status: Status): String =
        "${status.eventMode} · ${status.stagingMode} @ ${status.sampleRateHz / 1000} kHz"
}
