package com.example.rungps.sleep

import android.content.Context
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.repo.SleepRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.math.roundToInt

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

        val started = SleepOvernightStore.startedAtMs(context)
        val ended = endTimeMs ?: System.currentTimeMillis()
        val inBedMin = ((ended - started) / 60_000L).toInt().coerceAtLeast(1)
        val usedSmart = smartAlarmUsed ?: SleepOvernightStore.smartAlarm(context)
        val analysis = SleepPhaseAnalyzer.analyze(samples, inBedMin, context)
        val notes = buildNotes(analysis, usedSmart)

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
            notes = notes,
            wakeMood = wakeMood,
            snoreEvents = analysis.snoreEvents,
            awakeSleepMin = analysis.awakeSleepMin,
            restlessnessIndex = analysis.restlessnessIndex,
            smartAlarmUsed = usedSmart,
            timeToFallAsleepMin = analysis.timeToFallAsleepMin,
            stageConfidenceMean = samples.mapNotNull { it.stageConfidence }.average()
                .takeIf { !it.isNaN() }?.toFloat(),
            micCoverageRatio = samples.count { it.audioLevel > 0.05f }.toFloat() / samples.size,
            fusionSource = "mic_accel",
            breathRateMean = samples.map { it.breathRateBpm }.filter { it > 0f }
                .average().takeIf { !it.isNaN() }?.toFloat(),
        )

        val repo = SleepRepository(ExerciseTrackerDatabase.get(context).sleepDao())
        repo.saveEntry(entry)
        SleepOvernightStore.clearSession(context, savedSuccessfully = true)
        SleepListenService.stop(context)
        entry
    }

    private fun buildNotes(analysis: OvernightAnalysis, smartAlarm: Boolean): String {
        val parts = mutableListOf<String>()
        if (smartAlarm) parts += "Smart alarm"
        if (analysis.qualityHint.isNotBlank()) parts += analysis.qualityHint
        if (analysis.sleepCycles > 0) parts += "~${analysis.sleepCycles} sleep cycles (est.)"
        if (analysis.snoreEvents > 0) parts += "Snore/noise events: ${analysis.snoreEvents}"
        parts += "Restlessness ${analysis.restlessnessIndex}/100"
        return parts.joinToString(" · ")
    }
}
