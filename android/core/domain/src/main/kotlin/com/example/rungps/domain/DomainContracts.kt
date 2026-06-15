package com.example.rungps.domain

/**
 * Shared domain contracts for modular feature boundaries.
 * Implementation lives in :app until :core:data is extracted.
 */
interface SleepNightRepository {
    suspend fun nightCount(): Int
}

interface GymSessionRepository {
    suspend fun sessionCount(): Int
}

interface RunRepository {
    suspend fun runCount(): Int
}
