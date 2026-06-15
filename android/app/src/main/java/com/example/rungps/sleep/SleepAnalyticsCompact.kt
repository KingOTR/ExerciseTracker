package com.example.rungps.sleep

import org.json.JSONObject

data class SleepAnalyticsCompact(
    val snore: SleepSnoreMetrics.NightMetrics? = null,
    val breathing: SleepBreathingDisruptionAnalyzer.NightMetrics? = null,
    val quality: SleepAudioQualityClassifier.NightSummary? = null,
    val osaTier: String? = null,
) {
    fun toJson(): String {
        val json = JSONObject()
        snore?.let {
            json.put("snore", JSONObject().apply {
                put("iph", it.snoresPerHour)
                put("pct", it.percentNightSnoring)
                put("light", it.lightMinutes)
                put("loud", it.loudMinutes)
                put("epic", it.epicMinutes)
                put("score", it.snoreScore)
            })
        }
        breathing?.let {
            json.put("breath", JSONObject().apply {
                put("iph", it.disruptionsPerHour)
                put("clusters", it.clusterCount)
                put("longest", it.longestPauseSec)
                put("recovery", it.recoveryBreaths)
                put("pauseMin", it.breathPauseMinutes)
            })
        }
        quality?.let {
            json.put("quality", JSONObject().apply {
                put("pass", it.passRatio)
                put("reliable", it.reliable)
                it.dominantNoise?.let { noise -> put("noise", noise) }
            })
        }
        osaTier?.let { json.put("osaTier", it) }
        val text = json.toString()
        return if (text.isBlank() || text == "{}") "{}" else text
    }

    companion object {
        fun parse(json: String?): SleepAnalyticsCompact? {
            if (json.isNullOrBlank()) return null
            return runCatching {
                val root = JSONObject(json)
                val snoreObj = root.optJSONObject("snore")
                val snore = snoreObj?.let {
                    SleepSnoreMetrics.NightMetrics(
                        snoresPerHour = it.optDouble("iph", 0.0).toFloat(),
                        percentNightSnoring = it.optDouble("pct", 0.0).toFloat(),
                        lightMinutes = it.optInt("light", 0),
                        loudMinutes = it.optInt("loud", 0),
                        epicMinutes = it.optInt("epic", 0),
                        snoreScore = it.optInt("score", 0),
                    )
                }
                val breathObj = root.optJSONObject("breath")
                val breathing = breathObj?.let {
                    SleepBreathingDisruptionAnalyzer.NightMetrics(
                        disruptionsPerHour = it.optDouble("iph", 0.0).toFloat(),
                        clusterCount = it.optInt("clusters", 0),
                        longestPauseSec = it.optInt("longest", 0),
                        recoveryBreaths = it.optInt("recovery", 0),
                        breathPauseMinutes = it.optInt("pauseMin", 0),
                    )
                }
                val qualityObj = root.optJSONObject("quality")
                val quality = qualityObj?.let {
                    val noise = it.optString("noise", "").takeIf { n -> n.isNotBlank() }
                    SleepAudioQualityClassifier.NightSummary(
                        passRatio = it.optDouble("pass", 0.0).toFloat(),
                        reliable = it.optBoolean("reliable", false),
                        dominantNoise = noise,
                    )
                }
                val tier = root.optString("osaTier", "").takeIf { it.isNotBlank() }
                SleepAnalyticsCompact(snore, breathing, quality, tier)
            }.getOrNull()
        }

        fun fromSamples(
            samples: List<SleepTrackSample>,
            trackedMinutes: Int,
            osaTier: String? = null,
        ): SleepAnalyticsCompact = SleepAnalyticsCompact(
            snore = SleepSnoreMetrics.analyze(samples, trackedMinutes),
            breathing = SleepBreathingDisruptionAnalyzer.analyze(samples, trackedMinutes),
            quality = SleepAudioQualityClassifier.summarize(samples),
            osaTier = osaTier,
        )
    }
}
