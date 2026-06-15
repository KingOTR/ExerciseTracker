package com.example.rungps.sleep

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.repo.SleepRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object SleepSessionFinisher {
    const val SOURCE_OVERNIGHT = "rungps_overnight"

    suspend fun finishAndSave(
        context: Context,
        wakeMood: Int? = null,
        smartAlarmUsed: Boolean? = null,
        endTimeMs: Long? = null,
    ): SleepEntryEntity? = withContext(Dispatchers.IO) {
        if (!SleepOvernightStore.isActive(context)) return@withContext null
        val samples = SleepOvernightStore.loadSamples(context)
        if (samples.isEmpty()) return@withContext null

        SleepMlClassifier.ensureLoaded(context)
        val started = SleepOvernightStore.startedAtMs(context)
        val ended = endTimeMs ?: System.currentTimeMillis()
        val inBedMin = ((ended - started) / 60_000L).toInt().coerceAtLeast(1)
        val usedSmart = smartAlarmUsed ?: SleepOvernightStore.smartAlarm(context)
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

        val entry = SleepEntryEntity(
            startTimeMs = started,
            endTimeMs = ended,
            totalSleepMin = analysis.totalSleepMin.coerceAtLeast(1),
            deepSleepMin = analysis.deepSleepMin,
            lightSleepMin = analysis.lightSleepMin,
            remSleepMin = analysis.remSleepMin,
            sleepEfficiency = analysis.efficiency,
            sleepQuality = ((analysis.efficiency + (100 - analysis.restlessnessIndex)) / 2).coerceIn(0, 100),
            source = SOURCE_OVERNIGHT,
            notes = buildNotes(analysis, usedSmart, coverage.label, breathing, osaHint),
            wakeMood = wakeMood,
            snoreEvents = analysis.snoreEvents,
            awakeSleepMin = analysis.awakeSleepMin,
            restlessnessIndex = analysis.restlessnessIndex,
            smartAlarmUsed = usedSmart,
            timeToFallAsleepMin = analysis.timeToFallAsleepMin,
            hypnogramCompact = hypnogram,
            eventMarkersCompact = eventMarkers,
            stageConfidenceMean = stageConfidence,
            micCoverageRatio = coverage.coverageRatio,
            fusionSource = "mic_accel_ml",
            breathRateMean = breathMean,
            osaRiskHint = osaHint,
            sleepAnalyticsJson = analytics.toJson(),
        )

        val repo = SleepRepository(ExerciseTrackerDatabase.get(context).sleepDao())
        repo.saveEntry(entry)
        SleepOvernightStore.clearSession(context, savedSuccessfully = true)
        SleepListenService.stop(context)
        entry
    }

    private fun buildNotes(
        analysis: OvernightAnalysis,
        smartAlarm: Boolean,
        coverageLabel: String,
        breathing: SleepBreathingDisruptionAnalyzer.NightMetrics,
        osaHint: String,
    ): String {
        val parts = mutableListOf<String>()
        if (smartAlarm) parts += "Smart alarm"
        parts += coverageLabel
        if (osaHint == "elevated") parts += "Breathing disturbance hint elevated (not a diagnosis)"
        if (breathing.clusterCount > 0) {
            parts += "Breathing pauses: ${breathing.clusterCount} clusters"
        }
        if (analysis.qualityHint.isNotBlank()) parts += analysis.qualityHint
        if (analysis.sleepCycles > 0) parts += "~${analysis.sleepCycles} sleep cycles (est.)"
        if (analysis.snoreEvents > 0) parts += "Snore/noise events: ${analysis.snoreEvents}"
        parts += "Restlessness ${analysis.restlessnessIndex}/100"
        return parts.joinToString(" · ")
    }
}
