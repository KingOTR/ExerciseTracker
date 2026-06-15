package com.example.rungps.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rungps.data.entity.TrainingPlanProgressEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TrainingPlanDao {
    @Query("SELECT * FROM training_plan_progress WHERE id = 1 LIMIT 1")
    fun progressFlow(): Flow<TrainingPlanProgressEntity?>

    @Query("SELECT * FROM training_plan_progress WHERE id = 1 LIMIT 1")
    suspend fun progressOnce(): TrainingPlanProgressEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(entity: TrainingPlanProgressEntity)

    @Query("DELETE FROM training_plan_progress")
    suspend fun clearAll()
}
