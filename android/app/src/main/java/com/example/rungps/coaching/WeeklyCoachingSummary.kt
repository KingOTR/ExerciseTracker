package com.example.rungps.coaching

import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.sleep.SleepDebtTracker
import com.example.rungps.sleep.SleepScoring

object WeeklyCoachingSummary {
    data class Input(
        val runs: List<RunEntity>,
        val gymSets: List<GymSetEntity>,
        val sleepEntries: List<SleepEntryEntity>,
        val recoveryScore: Int? = null,
    )

    fun generate(input: Input): String {
        val runKm = input.runs.sumOf { it.totalDistanceM } / 1000.0
        val runCount = input.runs.size
        val gymSets = input.gymSets.size
        val sleepDebt = SleepDebtTracker.analyze(input.sleepEntries)
        val avgSleepScore = if (input.sleepEntries.isEmpty()) null else
            input.sleepEntries.map { SleepScoring.overallScore(it) }.average()
        val sb = StringBuilder()
        sb.append("Weekly recap\n\n")
        sb.append("Running: $runCount sessions, ${"%.1f".format(runKm)} km total.\n")
        sb.append("Gym: $gymSets sets logged.\n")
        sb.append("Sleep: ${sleepDebt.summary}\n")
        avgSleepScore?.let { sb.append("Average sleep score: ${it.toInt()}/100.\n") }
        input.recoveryScore?.let { sb.append("Recovery load: $it% — adjust intensity if below 60.\n") }
        when {
            sleepDebt.debtHours > 2 && runKm > 30 ->
                sb.append("\nCoaching tip: High volume with sleep debt — prioritize an extra rest day.")
            gymSets > 40 && sleepDebt.avgHours7d < 7 ->
                sb.append("\nCoaching tip: Strong gym week; protect sleep to support adaptation.")
            runCount == 0 && gymSets == 0 ->
                sb.append("\nCoaching tip: Light week — good time for mobility or a short easy run.")
            else ->
                sb.append("\nCoaching tip: Balanced week. Keep consistent bed/wake times.")
        }
        return sb.toString()
    }
}

object AdaptiveGymDeload {
    data class Suggestion(val shouldDeload: Boolean, val reason: String, val volumeMultiplier: Double)

    fun suggest(recoveryScore: Int?, sleepDebtHours: Double, recentGymSetCount: Int): Suggestion {
        val lowRecovery = (recoveryScore ?: 100) < 55
        val highDebt = sleepDebtHours > 3
        val heavyWeek = recentGymSetCount > 50
        return when {
            lowRecovery && highDebt ->
                Suggestion(true, "Low recovery and sleep debt — deload recommended.", 0.6)
            lowRecovery ->
                Suggestion(true, "Recovery score low — reduce volume ~40%.", 0.6)
            highDebt ->
                Suggestion(true, "Sleep debt elevated — lighter gym session advised.", 0.75)
            heavyWeek && highDebt ->
                Suggestion(true, "Heavy gym week with poor sleep — deload.", 0.65)
            else -> Suggestion(false, "Training load looks sustainable.", 1.0)
        }
    }
}
