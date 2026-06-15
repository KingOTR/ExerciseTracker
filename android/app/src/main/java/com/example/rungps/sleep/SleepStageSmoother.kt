package com.example.rungps.sleep

object SleepStageSmoother {
    fun smooth(labels: List<SleepStageLabel>): List<SleepStageLabel> {
        if (labels.size <= 2) return labels
        return labels.indices.map { i ->
            val window = when (i) {
                0 -> listOf(labels[0], labels[1])
                labels.lastIndex -> listOf(labels[i - 1], labels[i])
                else -> listOf(labels[i - 1], labels[i], labels[i + 1])
            }
            window.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key ?: labels[i]
        }
    }
}
