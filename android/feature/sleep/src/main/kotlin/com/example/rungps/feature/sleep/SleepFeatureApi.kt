package com.example.rungps.feature.sleep

import com.example.rungps.domain.SleepNightRepository

/**
 * Sleep feature module API stub — UI remains in :app for now.
 */
interface SleepFeatureApi {
    val repository: SleepNightRepository
}

class SleepFeatureStub(
    override val repository: SleepNightRepository,
) : SleepFeatureApi
