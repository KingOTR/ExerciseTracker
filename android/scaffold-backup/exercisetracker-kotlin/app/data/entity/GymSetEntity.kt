package com.exercisetracker.app.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "gym_sets",
    foreignKeys = [
        ForeignKey(
            entity = GymSessionEntity::class,
            parentColumns = ["id"],
            childColumns = ["sessionId"],
            onDelete = ForeignKey.CASCADE,
        ),
    ],
    indices = [Index("sessionId")],
)
data class GymSetEntity(
    @PrimaryKey(autoGenerate = true) val rowId: Long = 0,
    val sessionId: Long,
    val exerciseName: String,
    val setIndex: Int,
    val reps: Int? = null,
    val weightKg: Double? = null,
    val loggedAtMs: Long? = null,
)
