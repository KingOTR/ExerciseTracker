package com.example.rungps.sleep

import com.example.rungps.data.entity.SleepEntryEntity

object SleepOsaRiskScorer {
    enum class Tier { LOW, ELEVATED, INSUFFICIENT_DATA }

    data class Result(val tier: Tier, val nightsUsed: Int, val summaryLine: String)

    fun scoreRecentNights(entries: List<SleepEntryEntity>, sleptAlone: Boolean): Result {
        val overnight = entries
            .filter { it.source == SleepSessionFinisher.SOURCE_OVERNIGHT || it.source == "rungps_overnight" }
            .sortedByDescending { it.endTimeMs }
            .take(14)
        val qualified = overnight.filter { entry ->
            (entry.micCoverageRatio ?: 0f) >= 0.85f &&
                !entry.sleepAnalyticsJson.isNullOrBlank()
        }
        if (!sleptAlone || qualified.size < 3) {
            val msg = when {
                !sleptAlone -> "Need slept-alone nights with strong mic coverage (partner bed not scored)."
                qualified.size < 3 -> "Need ≥3 nights with ≥85% mic coverage."
                else -> "Not enough data."
            }
            return Result(Tier.INSUFFICIENT_DATA, qualified.size, msg)
        }
        val nights = qualified.take(maxOf(3, 3))
        var elevatedCount = 0
        for (entry in nights) {
            val analytics = SleepAnalyticsCompact.parse(entry.sleepAnalyticsJson)
            val snorePerHour = analytics?.snore?.snoresPerHour ?: 0f
            val disruptions = analytics?.breathing?.disruptionsPerHour ?: 0f
            val pauseMin = analytics?.breathing?.breathPauseMinutes ?: 0
            if (entry.osaRiskHint == "elevated" ||
                snorePerHour >= 8f ||
                disruptions >= 3f ||
                pauseMin >= 5
            ) {
                elevatedCount++
            }
        }
        val tier = if (elevatedCount >= 2) Tier.ELEVATED else Tier.LOW
        val summary = when (tier) {
            Tier.LOW -> "Low breathing-disturbance pattern over ${nights.size} nights (wellness hint only)."
            Tier.ELEVATED -> "Elevated breathing-disturbance pattern over ${nights.size} nights — consider talking to a clinician."
            Tier.INSUFFICIENT_DATA -> "Insufficient data."
        }
        return Result(tier, nights.size, summary)
    }

    fun exportSummary(result: Result): String =
        "OSA wellness screening: ${result.tier.name} (${result.nightsUsed} nights). ${result.summaryLine} Not a medical diagnosis or AHI estimate."
}
