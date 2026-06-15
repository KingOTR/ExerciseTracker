package com.example.rungps.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.Flow

@Composable
fun AppScaffold(
    snackbarHostState: SnackbarHostState,
    uiEvents: Flow<UiEvent>,
    modifier: Modifier = Modifier,
    bottomBar: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit,
) {
    LaunchedEffect(uiEvents) {
        uiEvents.collect { event ->
            when (event) {
                is UiEvent.Message -> {
                    val result = snackbarHostState.showSnackbar(
                        message = event.text,
                        actionLabel = event.actionLabel,
                    )
                    if (result == SnackbarResult.ActionPerformed) {
                        event.onAction?.invoke()
                    }
                }
            }
        }
    }
    Scaffold(
        modifier = modifier,
        bottomBar = bottomBar,
        snackbarHost = { SnackbarHost(snackbarHostState) },
        content = content,
    )
}
