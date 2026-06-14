package com.exercisetracker.app.domain.muscle

/**
 * Computes per-muscle training volume from sets using EMG-based load percentages.
 *
 * Volume formula: weightKg × reps × (percent / 100)
 * Sources: shared/muscles/README.md
 */
class MuscleLoadCalculator(
    private val taxonomy: MuscleTaxonomy,
) {
    companion object {
        const val DEFAULT_BODYWEIGHT_KG = 65.0
        const val PERCENT_TOLERANCE = 2
    }

    fun setVolume(weightKg: Double?, reps: Int?): Double {
        val weight = weightKg ?: DEFAULT_BODYWEIGHT_KG
        val repCount = reps ?: 0
        return weight * repCount
    }

    fun distributeLoad(
        totalVolume: Double,
        loads: List<MuscleLoad>,
    ): List<MuscleVolumeEntry> {
        if (totalVolume <= 0.0 || loads.isEmpty()) return emptyList()
        val normalized = normalizeLoads(loads)
        return normalized.mapNotNull { load ->
            val muscle = taxonomy.muscleById[load.muscleId] ?: return@mapNotNull null
            MuscleVolumeEntry(
                muscleId = muscle.id,
                label = muscle.label,
                groupId = muscle.groupId,
                regionId = muscle.regionId,
                volume = totalVolume * load.percent / 100.0,
            )
        }
    }

    fun breakdownForSet(
        exerciseName: String,
        loads: List<MuscleLoad>,
        weightKg: Double?,
        reps: Int?,
        resolved: Boolean,
    ): SetMuscleBreakdown {
        val volume = setVolume(weightKg, reps)
        return SetMuscleBreakdown(
            exerciseName = exerciseName,
            setVolume = volume,
            entries = distributeLoad(volume, loads),
            resolved = resolved,
        )
    }

    fun aggregateVolumes(entries: List<MuscleVolumeEntry>): Map<String, Double> =
        entries.groupBy { it.muscleId }.mapValues { (_, values) -> values.sumOf { it.volume } }

    fun aggregateByGroup(entries: List<MuscleVolumeEntry>): Map<String, Double> =
        entries.groupBy { it.groupId }.mapValues { (_, values) -> values.sumOf { it.volume } }

    fun aggregateByRegion(entries: List<MuscleVolumeEntry>): Map<String, Double> =
        entries.groupBy { it.regionId }.mapValues { (_, values) -> values.sumOf { it.volume } }

    fun normalizeLoads(loads: List<MuscleLoad>): List<MuscleLoad> {
        if (loads.isEmpty()) return emptyList()
        val total = loads.sumOf { it.percent }
        if (total == 0) return loads
        if (kotlin.math.abs(total - 100) <= PERCENT_TOLERANCE) {
            return loads
        }
        return loads.map { load ->
            load.copy(percent = (load.percent * 100.0 / total).toInt())
        }.let { adjusted ->
            val drift = 100 - adjusted.sumOf { it.percent }
            if (drift == 0 || adjusted.isEmpty()) adjusted
            else adjusted.mapIndexed { index, load ->
                if (index == 0) load.copy(percent = load.percent + drift) else load
            }
        }
    }

    fun validateLoadsSum(loads: List<MuscleLoad>): Boolean {
        val total = loads.sumOf { it.percent }
        return kotlin.math.abs(total - 100) <= PERCENT_TOLERANCE
    }
}
