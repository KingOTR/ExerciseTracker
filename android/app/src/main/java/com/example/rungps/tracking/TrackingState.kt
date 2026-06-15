package com.example.rungps.tracking

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object TrackingState {
    private val _state = MutableStateFlow(TrackingUiState())
    val state: StateFlow<TrackingUiState> = _state.asStateFlow()

    fun update(newState: TrackingUiState) {
        _state.value = newState
    }

    fun patch(transform: (TrackingUiState) -> TrackingUiState) {
        _state.value = transform(_state.value)
    }
}
