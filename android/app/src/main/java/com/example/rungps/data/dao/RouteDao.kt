package com.example.rungps.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.data.entity.RoutePointEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RouteDao {
    @Query("SELECT * FROM routes ORDER BY createdAtMs DESC")
    fun routesFlow(): Flow<List<RouteEntity>>

    @Query("SELECT * FROM routes ORDER BY createdAtMs DESC")
    suspend fun allRoutes(): List<RouteEntity>

    @Query("SELECT * FROM routes WHERE id = :id LIMIT 1")
    suspend fun routeById(id: Long): RouteEntity?

    @Query("SELECT * FROM route_points WHERE routeId = :routeId ORDER BY idx")
    suspend fun pointsForRoute(routeId: Long): List<RoutePointEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoute(route: RouteEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoutePoints(points: List<RoutePointEntity>)

    @Query("DELETE FROM routes WHERE id = :routeId")
    suspend fun deleteRoute(routeId: Long)

    @Transaction
    suspend fun saveRoute(
        name: String,
        createdAtMs: Long,
        distanceM: Double,
        latLon: List<Pair<Double, Double>>,
        remoteId: String? = null,
        dedupeKey: String? = null,
    ): Long {
        val routeId = insertRoute(
            RouteEntity(
                name = name,
                createdAtMs = createdAtMs,
                distanceM = distanceM,
                remoteId = remoteId,
                dedupeKey = dedupeKey,
            ),
        )
        if (latLon.isNotEmpty()) {
            insertRoutePoints(
                latLon.mapIndexed { idx, (lat, lon) ->
                    RoutePointEntity(routeId = routeId, idx = idx, lat = lat, lon = lon)
                },
            )
        }
        return routeId
    }
}
