package com.example.rungps.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gear_items")
data class GearEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val gearType: String,
    val name: String,
    val brand: String? = null,
    val model: String? = null,
    val purchaseDateMs: Long? = null,
    val startingOdometerKm: Double = 0.0,
    val notes: String? = null,
    val isRetired: Boolean = false,
    val isDefaultForRun: Boolean = false,
    val isDefaultForRide: Boolean = false,
    val photoUri: String? = null,
    val parentGearId: Long? = null,
    val createdAtMs: Long = System.currentTimeMillis(),
)
