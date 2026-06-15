package com.example.rungps.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.rungps.data.entity.GearEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface GearDao {
    @Query("SELECT * FROM gear_items ORDER BY createdAtMs DESC")
    fun allFlow(): Flow<List<GearEntity>>

    @Query("SELECT * FROM gear_items WHERE isRetired = 0 ORDER BY name")
    fun activeFlow(): Flow<List<GearEntity>>

    @Query("SELECT * FROM gear_items WHERE id = :id LIMIT 1")
    suspend fun byId(id: Long): GearEntity?

    @Query("SELECT * FROM gear_items WHERE isDefaultForRun = 1 AND isRetired = 0 LIMIT 1")
    suspend fun defaultForRun(): GearEntity?

    @Query("SELECT * FROM gear_items WHERE isDefaultForRide = 1 AND isRetired = 0 LIMIT 1")
    suspend fun defaultForRide(): GearEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(gear: GearEntity): Long

    @Update
    suspend fun update(gear: GearEntity)

    @Query("UPDATE gear_items SET isRetired = 1 WHERE id = :id")
    suspend fun retire(id: Long)

    @Query("UPDATE gear_items SET isDefaultForRun = 0")
    suspend fun clearDefaultRun()

    @Query("UPDATE gear_items SET isDefaultForRide = 0")
    suspend fun clearDefaultRide()

    @Query("UPDATE gear_items SET isDefaultForRun = 1 WHERE id = :id")
    suspend fun setDefaultRun(id: Long)

    @Query("UPDATE gear_items SET isDefaultForRide = 1 WHERE id = :id")
    suspend fun setDefaultRide(id: Long)

    suspend fun setAsDefaultForRun(id: Long) {
        clearDefaultRun()
        setDefaultRun(id)
    }

    suspend fun setAsDefaultForRide(id: Long) {
        clearDefaultRide()
        setDefaultRide(id)
    }
}
