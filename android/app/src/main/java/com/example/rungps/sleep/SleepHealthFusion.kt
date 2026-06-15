package com.example.rungps.sleep

import android.content.Context
import com.example.rungps.health.HealthConnectManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object SleepHealthFusion {
    data class FusedNight(
        val analysis: OvernightAnalysis,
        val hypnogramCompact: String?,
        val eventMarkersCompact: String?,
        val fusionNote: String?,
        val fusedWithHc: Boolean,
        val stageConfidenceMean: Float? = null,
        val micCoverageRatio: Float? = null,
        val fusionSource: String = "mic_accel_ml",
        val breathRateMean: Float? = null,
        val osaRiskHint: String? = null,
        val sleepAnalyticsJson: String? = null,
    )

    suspend fun finishMicNight(
        context: Context,
        samples: List<SleepTrackSample>,
        startedMs: Long,
        endedMs: Long,
        smartAlarmUsed: Boolean,
    ): FusedNight = withContext(Dispatchers.Default) {
        SleepMlClassifier.ensureLoaded(context)
        val inBedMin = ((endedMs - startedMs) / 60_000L).toInt().coerceAtLeast(1)
        val (gapMs, gapCount) = SleepMicCoverage.detectGaps(samples)
        val coverage = SleepMicCoverage.fromSamples(samples, inBedMin, gapMs, gapCount)
        val trackedMin = coverage.trackedMin.coerceAtLeast(1)
        val analysis = SleepPhaseAnalyzer.analyze(samples, inBedMin, context)
        val labels = SleepStageInference.stageLabels(samples, context)
        val hypnogram = SleepHypnogramEncoder.encodeForInBed(labels, inBedMin)
        val eventMarkers = SleepEventMarkersEncoder.encodeFromSamples(samples, inBedMin)
        val breathing = SleepBreathingDisruptionAnalyzer.analyze(samples, trackedMin)
        val osaHint = when {
            breathing.disruptionsPerHour >= 3f || breathing.breathPauseMinutes >= 5 -> "elevated"
            else -> "low"
        }
        val analytics = SleepAnalyticsCompact.fromSamples(samples, trackedMin, osaHint)
        val stageConfidence = samples.mapNotNull { it.stageConfidence }.average()
            .takeIf { !it.isNaN() }?.toFloat()
        val breathMean = samples.map { it.breathRateBpm }.filter { it > 0f }
            .average().takeIf { !it.isNaN() }?.toFloat()

        var fusionNote: String? = null
        var fusedWithHc = false
        var fusionSource = "mic_accel_ml"
        val hc = HealthConnectManager(context)
        if (hc.isAvailable()) {
            val hcSessions = hc.readSleepSessions(daysBack = 2)
            val overlapping = hcSessions.firstOrNull { window ->
                window.startMs < endedMs && window.endMs > startedMs
            }
            if (overlapping != null) {
                fusedWithHc = true
                fusionSource = "mic_accel_ml+hc"
                fusionNote = "Fused with Health Connect sleep (${overlapping.totalSleepMin} min tracked)."
            }
        }

        FusedNight(
            analysis = analysis,
            hypnogramCompact = hypnogram,
            eventMarkersCompact = eventMarkers,
            fusionNote = fusionNote,
            fusedWithHc = fusedWithHc,
            stageConfidenceMean = stageConfidence,
            micCoverageRatio = coverage.coverageRatio,
            fusionSource = fusionSource,
            breathRateMean = breathMean,
            osaRiskHint = osaHint,
            sleepAnalyticsJson = analytics.toJson(),
        )
    }
}
