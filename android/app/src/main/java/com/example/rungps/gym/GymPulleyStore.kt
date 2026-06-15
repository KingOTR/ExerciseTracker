package com.example.rungps.gym

import android.content.Context

enum class GymPulleyConfig(
    val id: String,
    val label: String,
    val effectiveRatio: Float,
    val hint: String,
) {
    NONE("none", "Normal stack", 1f, "No cable pulley — pin ≈ load"),
    TOP("top", "Top pulley", 1f, "Pin ≈ stack load"),
    BOTTOM("bottom", "Bottom pulley", 0.5f, "Pin ≈ half effective load"),
    LOW("low", "Low pulley", 0.67f, "Pin ≈ 67% effective load"),
    DOUBLE("double", "Double cable", 2f, "Pin ≈ 2× effective load"),
    ;

    companion object {
        fun byId(id: String): GymPulleyConfig =
            entries.firstOrNull { it.id == id } ?: NONE
    }
}

data class GymPulleySelection(val configs: Set<GymPulleyConfig> = setOf(GymPulleyConfig.NONE)) {
    val isEmpty: Boolean get() = configs.isEmpty() || configs.all { it == GymPulleyConfig.NONE }

    val effectiveRatio: Float
        get() {
            val active = configs.filter { it != GymPulleyConfig.NONE }
            if (active.isEmpty()) return 1f
            return active.fold(1f) { acc, c -> acc * c.effectiveRatio }.coerceIn(0.2f, 4f)
        }

    fun label(): String {
        if (isEmpty) return GymPulleyConfig.NONE.label
        if (configs.size == 1) return configs.first().label
        return configs.filter { it != GymPulleyConfig.NONE }.joinToString(" + ") { it.label }
    }

    companion object {
        val NONE = GymPulleySelection(setOf(GymPulleyConfig.NONE))

        fun fromIds(ids: String?): GymPulleySelection {
            if (ids.isNullOrBlank() || ids == GymPulleyConfig.NONE.id) return NONE
            val parsed = ids.split(',').map { it.trim() }.filter { it.isNotEmpty() && it != GymPulleyConfig.NONE.id }
                .map { GymPulleyConfig.byId(it) }
                .toSet()
            return if (parsed.isEmpty()) NONE else GymPulleySelection(parsed)
        }

        fun toIds(selection: GymPulleySelection): String {
            val active = selection.configs.filter { it != GymPulleyConfig.NONE }
            return if (active.isEmpty()) GymPulleyConfig.NONE.id else active.joinToString(",") { it.id }
        }
    }
}

object GymPulleyStore {
    private const val PREFS = "gym_pulley"

    fun allConfigs(): List<GymPulleyConfig> = GymPulleyConfig.entries.filter { it != GymPulleyConfig.NONE }

    fun loadSessionSelection(context: Context, sessionId: Long): GymPulleySelection {
        val raw = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getString("session_$sessionId", null)
        return GymPulleySelection.fromIds(raw)
    }

    fun saveSessionSelection(context: Context, sessionId: Long, selection: GymPulleySelection) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString("session_$sessionId", GymPulleySelection.toIds(selection))
            .apply()
    }

    fun pinKgPreview(pinKg: Double?, selection: GymPulleySelection): Double? {
        pinKg ?: return null
        return pinKg * selection.effectiveRatio
    }
}
