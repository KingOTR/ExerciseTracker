package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class SleepDebtTrackerTest {
    @Test
    fun emptyEntries_returnsZeroDebt() {
        val snap = SleepDebtTracker.analyze(emptyList())
        assertEquals(0, snap.nightsInWindow)
        assertTrue(snap.summary.contains("No sleep data"))
    }

    @Test
    fun partialWeek_computesDebt() {
        val entries = listOf(
            entry(420), entry(400),
        )
        val snap = SleepDebtTracker.analyze(entries, targetHoursPerNight = 8.0)
        assertEquals(2, snap.nightsInWindow)
        assertTrue(snap.debtHours > 0)
    }

    private fun entry(totalMin: Int) = SleepEntryEntity(
        startTimeMs = 1_700_000_000_000,
        endTimeMs = 1_700_000_000_000 + totalMin * 60_000L,
        totalSleepMin = totalMin,
    )
}

class SleepConsistencyScorerTest {
    @Test
    fun singleEntry_returnsZeroScore() {
        val result = SleepConsistencyScorer.score(
            listOf(SleepEntryEntity(startTimeMs = 1_700_000_000_000, endTimeMs = 1_700_003_600_000, totalSleepMin = 360)),
        )
        assertEquals(0, result.score)
    }
}

class SleepOvernightReconcilerTest {
    @Test
    fun reconcile_sparseTracking_rebuildsLabels() {
        val breakdown = SleepOvernightReconciler.StageBreakdown(
            totalSleepMin = 0, deepMin = 0, remMin = 0, lightMin = 0, awakeMin = 480, trackedMin = 10,
        )
        val (newBreakdown, labels) = SleepOvernightReconciler.reconcile(
            breakdown, emptyList(), emptyList(), inBedMin = 480,
        )
        assertTrue(labels.isNotEmpty())
        assertTrue(newBreakdown.totalSleepMin > 0)
    }
}

class SleepScoringTest {
    @Test
    fun goodNight_scoresHigh() {
        val score = SleepScoring.overallScore(
            SleepEntryEntity(
                startTimeMs = 0, endTimeMs = 28_800_000, totalSleepMin = 480,
                sleepEfficiency = 90, deepSleepMin = 90, remSleepMin = 90,
            ),
        )
        assertTrue(score >= 70)
    }
}

class SleepHypnogramEncoderTest {
    @Test
    fun encodeDecode_roundTrip() {
        val labels = listOf(SleepStageLabel.DEEP, SleepStageLabel.LIGHT, SleepStageLabel.REM)
        val encoded = SleepHypnogramEncoder.encode(labels, bucketsPerMinute = 1)
        val decoded = SleepHypnogramEncoder.decode(encoded)
        assertEquals(labels.size, decoded.size)
    }
}

class SleepSnoreMetricsTest {
    @Test
    fun emptySamples_zeroScore() {
        val metrics = SleepSnoreMetrics.analyze(emptyList(), trackedMinutes = 0)
        assertEquals(0, metrics.snoreScore)
    }

    @Test
    fun intensityFromLikelihood_epic() {
        assertEquals(3, SleepSnoreMetrics.intensityFromLikelihood(0.8f))
    }
}

class SleepBreathingDisruptionAnalyzerTest {
    @Test
    fun noSamples_returnsZeroClusters() {
        val result = SleepBreathingDisruptionAnalyzer.analyze(emptyList(), trackedMinutes = 0)
        assertEquals(0, result.clusterCount)
    }
}

class SleepMicCoverageTest {
    @Test
    fun fullInBed_goodLabel() {
        val snap = SleepMicCoverage.fromSamples(
            samples = List(360) { SleepTrackSample(elapsedMs = it * 10_000L, movement = 0.1f, audioLevel = 0.1f) },
            inBedMin = 60,
        )
        assertTrue(snap.coverageRatio > 0.5f)
    }
}

class SleepWakePlannerTest {
    @Test
    fun plan_hasSmartWindow() {
        val alarm = System.currentTimeMillis() + 3_600_000
        val plan = SleepWakePlanner.plan(alarm, windowMin = 30)
        assertTrue(plan.smartWindowStartMs < plan.targetWakeMs)
    }
}

class SleepCycleCsvImporterTest {
    @Test
    fun parseEmpty_returnsEmpty() {
        assertTrue(SleepCycleCsvImporter.parseCsv("").isEmpty())
    }
}

class SleepTrendAnalysisTest {
    @Test
    fun emptyTrend() {
        assertTrue(SleepTrendAnalysis.weekTrend(emptyList()).contains("No trend"))
    }
}

class SleepScienceTest {
    @Test
    fun deepTip_notBlank() {
        assertTrue(SleepScience.tipForStage(SleepStageLabel.DEEP).isNotBlank())
    }
}

class SleepMlPipelineStatusTest {
    @Test
    fun summaryLine_formats() {
        val status = SleepMlPipelineStatus.Status(
            yamnetLoaded = false, stagingV2Loaded = false, mlpLoaded = true,
            sampleRateHz = 16000, eventMode = "Heuristics", stagingMode = "MLP",
        )
        assertTrue(SleepMlPipelineStatus.summaryLine(status).contains("MLP"))
    }
}

class SleepTfliteRunnerTest {
    @Test
    fun assetNames() {
        assertEquals("yamnet.tflite", SleepTfliteRunner.ASSET_YAMNET)
        assertEquals("sleep_staging_v2.tflite", SleepTfliteRunner.ASSET_STAGING_V2)
    }
}

class SleepNightAnalyticsTest {
    @Test
    fun analyze_returnsReport() {
        val report = SleepNightAnalytics.analyze(
            SleepEntryEntity(
                startTimeMs = 0, endTimeMs = 28_800_000, totalSleepMin = 400,
                sleepEfficiency = 85, snoreEvents = 15,
            ),
        )
        assertTrue(report.flags.isNotEmpty())
    }
}

class SleepStageLabelTest {
    @Test
    fun fourStages() {
        assertEquals(4, SleepStageLabel.entries.size)
    }
}

class SleepFeatureEncoderTest {
    @Test
    fun calmness_inRange() {
        val sample = SleepTrackSample(elapsedMs = 0, movement = 0.2f, audioLevel = 0.3f)
        val c = SleepFeatureEncoder.calmness(sample)
        assertTrue(c in 0f..1f)
    }
}

class SleepAudioConstantsTest {
    @Test
    fun bucketMsPositive() {
        assertTrue(SleepAudioConstants.BUCKET_MS > 0)
    }
}

class SleepOvernightReconcilerMetricsTest {
    @Test
    fun preferGoodNight_moreDeep() {
        val labels = SleepOvernightReconciler.reconcile(
            SleepOvernightReconciler.StageBreakdown(0, 0, 0, 0, 480, 5),
            emptyList(), emptyList(), 120,
        ).second
        assertTrue(labels.any { it == SleepStageLabel.DEEP })
    }
}

class SleepDebtTrackerDefaultsTest {
    @Test
    fun defaultTarget_isEightHours() {
        assertEquals(8.0, SleepDebtTracker.DEFAULT_TARGET_HOURS, 0.01)
    }
}

class SleepConsistencyVarianceTest {
    @Test
    fun twoSimilarNights_reasonableScore() {
        val entries = listOf(
            SleepEntryEntity(startTimeMs = 1_700_000_000_000, endTimeMs = 1_700_003_600_000, totalSleepMin = 420),
            SleepEntryEntity(startTimeMs = 1_700_086_400_000, endTimeMs = 1_700_090_000_000, totalSleepMin = 430),
        )
        val result = SleepConsistencyScorer.score(entries)
        assertTrue(result.score >= 0)
    }
}
