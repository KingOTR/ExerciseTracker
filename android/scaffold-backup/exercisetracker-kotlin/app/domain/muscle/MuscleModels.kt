package com.exercisetracker.app.domain.muscle

data class MuscleLoad(
    val muscleId: String,
    val percent: Int,
)

data class MuscleDefinition(
    val id: String,
    val label: String,
    val groupId: String,
    val regionId: String,
    val atlasIds: List<String> = emptyList(),
)

data class MuscleGroupDefinition(
    val id: String,
    val label: String,
    val regionId: String,
)

data class RegionDefinition(
    val id: String,
    val label: String,
)

data class PatternTemplate(
    val id: String,
    val label: String,
    val loads: List<MuscleLoad>,
)

data class ExerciseMapping(
    val name: String,
    val normalizedName: String,
    val aliases: List<String>,
    val loads: List<MuscleLoad>,
    val sources: List<String> = emptyList(),
)

data class CardioActivityMapping(
    val id: String,
    val label: String,
    val aliases: List<String>,
    val unit: CardioUnit,
    val baseLoadPerUnit: Double,
    val intensityScale: Boolean = false,
    val loads: List<MuscleLoad>,
    val sources: List<String> = emptyList(),
)

enum class CardioUnit {
    PER_KM,
    PER_MINUTE,
    PER_1000_STEPS,
}

data class MuscleTaxonomy(
    val regions: List<RegionDefinition>,
    val groups: List<MuscleGroupDefinition>,
    val muscles: List<MuscleDefinition>,
    val patternTemplates: List<PatternTemplate>,
) {
    val muscleById: Map<String, MuscleDefinition> by lazy { muscles.associateBy { it.id } }
    val groupById: Map<String, MuscleGroupDefinition> by lazy { groups.associateBy { it.id } }
}

data class ExerciseMuscleDatabase(
    val exercises: List<ExerciseMapping>,
) {
    val byNormalizedName: Map<String, ExerciseMapping> by lazy {
        buildMap {
            exercises.forEach { exercise ->
                put(exercise.normalizedName, exercise)
                exercise.aliases.forEach { alias -> put(normalizeExerciseName(alias), exercise) }
            }
        }
    }
}

data class CardioMuscleDatabase(
    val activities: List<CardioActivityMapping>,
    val recoveryWindows: RecoveryWindows,
) {
    val byId: Map<String, CardioActivityMapping> by lazy { activities.associateBy { it.id } }
}

data class RecoveryWindows(
    val gymDays: Int,
    val cardioDays: Int,
    val stepDays: Int,
)

data class MuscleVolumeEntry(
    val muscleId: String,
    val label: String,
    val groupId: String,
    val regionId: String,
    val volume: Double,
)

data class SetMuscleBreakdown(
    val exerciseName: String,
    val setVolume: Double,
    val entries: List<MuscleVolumeEntry>,
    val resolved: Boolean,
)

data class RecoveryMuscleScore(
    val muscleId: String,
    val label: String,
    val groupId: String,
    val regionId: String,
    val gymLoad: Double,
    val cardioLoad: Double,
    val totalLoad: Double,
    val fatiguePercent: Double,
)

fun normalizeExerciseName(name: String): String =
    name.trim().lowercase().replace(Regex("[^a-z0-9]+"), " ").trim()
