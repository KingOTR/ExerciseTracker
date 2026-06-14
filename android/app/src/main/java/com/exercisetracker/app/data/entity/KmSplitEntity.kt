package com.exercisetracker.app.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "km_splits",
    foreignKeys = [
        ForeignKey(
            entity = RunEntity::class,
            parentColumns = ["id"],
            childColumns = ["runId"],
            onDelete = ForeignKey.CASCADE,
        ),
    ],
    indices = [Index("runId")],
)
data class KmSplitEntity(
    @PrimaryKey(autoGenerate = true) val rowId: Long = 0,
    val runId: Long,
    val kind: String,
    val idx: Int,
    val durationMs: Long,
    val distanceM: Double,
)
