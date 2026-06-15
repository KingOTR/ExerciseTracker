package com.example.rungps.coaching

import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SleepEntryEntity
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WeeklyCoachingSummaryTest {
    @Test
    fun generate_includesSections() {
        val text = WeeklyCoachingSummary.generate(
            WeeklyCoachingSummary.Input(
                runs = listOf(RunEntity(id = 1, startedAtMs = 0, totalDistanceM = 5000.0)),
                gymSets = listOf(GymSetEntity(sessionId = 1, exerciseName = "Squat", setIndex = 1, reps = 5, weightKg = 100.0, loggedAtMs = 0)),
                sleepEntries = listOf(
                    SleepEntryEntity(startTimeMs = 0, endTimeMs = 28_800_000, totalSleepMin = 420),
                ),
            ),
        )
        assertTrue(text.contains("Weekly recap"))
        assertTrue(text.contains("Running"))
    }
}

class AdaptiveGymDeloadTest {
    @Test
    fun lowRecovery_suggestsDeload() {
        val s = AdaptiveGymDeload.suggest(recoveryScore = 40, sleepDebtHours = 1.0, recentGymSetCount = 30)
        assertTrue(s.shouldDeload)
    }

    @Test
    fun healthy_noDeload() {
        val s = AdaptiveGymDeload.suggest(recoveryScore = 80, sleepDebtHours = 0.5, recentGymSetCount = 20)
        assertFalse(s.shouldDeload)
    }
}
