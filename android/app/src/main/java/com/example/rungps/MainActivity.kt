package com.example.rungps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rungps.nfc.GymNfcController
import com.example.rungps.spotify.SpotifyController
import com.example.rungps.strava.StravaOAuth
import com.example.rungps.strava.StravaRepository
import com.example.rungps.ui.components.AppScaffold
import com.example.rungps.ui.gym.GymTabContent
import com.example.rungps.ui.main.HistoryTabContent
import com.example.rungps.ui.main.MapTabContent
import com.example.rungps.ui.main.RunTabContent
import com.example.rungps.ui.main.SoccerTabContent
import com.example.rungps.ui.navigation.AppDestination
import com.example.rungps.ui.onboarding.OnboardingPreferences
import com.example.rungps.ui.onboarding.OnboardingScreen
import com.example.rungps.ui.screens.RecoveryScreen
import com.example.rungps.ui.sleep.SleepTabScreen
import com.example.rungps.ui.theme.ExerciseTrackerTheme
import com.example.rungps.ui.viewmodel.GymViewModel
import com.example.rungps.ui.viewmodel.MainViewModel
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private lateinit var gymNfcController: GymNfcController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gymNfcController = GymNfcController(this)
        gymNfcController.onCreateHandleIntent(intent)
        enableEdgeToEdge()
        handleDeepLinkIntent(intent)
        setContent {
            ExerciseTrackerTheme {
                var onboardingDone by remember {
                    mutableStateOf(OnboardingPreferences.isComplete(this@MainActivity))
                }
                if (!onboardingDone) {
                    OnboardingScreen(onComplete = { onboardingDone = true })
                    return@ExerciseTrackerTheme
                }
                val mainViewModel: MainViewModel = viewModel()
                val navController = rememberNavController()
                val backStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = backStackEntry?.destination?.route
                val snackbarHostState = remember { SnackbarHostState() }

                val routes by mainViewModel.routes.collectAsState()
                val live by mainViewModel.trackingState.collectAsState()
                val stravaUploading by mainViewModel.stravaUploading.collectAsState()
                val stravaImporting by mainViewModel.stravaImporting.collectAsState()
                var syncingMoyoung by remember { mutableStateOf(false) }
                var selectedRunId by remember { mutableStateOf<Long?>(null) }
                var followRouteId by remember { mutableStateOf<Long?>(null) }
                var followRouteName by remember { mutableStateOf<String?>(null) }
                var overlayRunId by remember { mutableStateOf<Long?>(null) }
                var visitedTabs by rememberSaveable { mutableStateOf(setOf(AppDestination.Home.route)) }

                overlayRunId?.let { runId ->
                    com.example.rungps.ui.run.RunOverlayExportDialog(
                        runId = runId,
                        onDismiss = { overlayRunId = null },
                    )
                }

                LaunchedEffect(currentRoute) {
                    currentRoute?.let { route -> visitedTabs = visitedTabs + route }
                }

                val openTab = intent?.getStringExtra("open_tab")
                if (openTab != null) {
                    val dest = when (openTab) {
                        "map" -> AppDestination.Map.route
                        "history" -> AppDestination.History.route
                        "gym" -> AppDestination.Gym.route
                        "recovery" -> AppDestination.Recovery.route
                        "sleep" -> AppDestination.Sleep.route
                        "soccer" -> AppDestination.Soccer.route
                        "home", "run" -> AppDestination.Home.route
                        else -> AppDestination.Home.route
                    }
                    visitedTabs = visitedTabs + dest
                    navController.navigate(dest) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                    intent.removeExtra("open_tab")
                }

                AppScaffold(
                    snackbarHostState = snackbarHostState,
                    uiEvents = mainViewModel.uiEvents,
                    bottomBar = {
                        NavigationBar {
                            val destinations = AppDestination.entries
                            destinations.forEachIndexed { index, destination ->
                                val selected = currentRoute == destination.route
                                val tabDesc = "${destination.label}, tab ${index + 1} of ${destinations.size}"
                                NavigationBarItem(
                                    selected = selected,
                                    onClick = {
                                        visitedTabs = visitedTabs + destination.route
                                        navController.navigate(destination.route) {
                                            popUpTo(navController.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    },
                                    icon = {
                                        Icon(
                                            destination.icon,
                                            contentDescription = null,
                                            modifier = Modifier.semantics {
                                                contentDescription = tabDesc
                                                stateDescription = if (selected) "Selected" else "Not selected"
                                            },
                                        )
                                    },
                                    label = { Text(destination.label) },
                                )
                            }
                        }
                    },
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = AppDestination.Home.route,
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        composable(AppDestination.Home.route) {
                            RunTabContent(
                                runsViewModel = mainViewModel.runs,
                                live = live,
                                routes = routes,
                                selectedRunId = selectedRunId,
                                bleClient = mainViewModel.bleClient,
                                syncingMoyoung = syncingMoyoung,
                                onSyncMoyoung = {
                                    syncingMoyoung = true
                                    lifecycleScope.launch {
                                        val result = runCatching {
                                            mainViewModel.bleClient.fetchMoyoungWorkouts()
                                        }
                                        syncingMoyoung = false
                                        result.fold(
                                            onSuccess = { workouts ->
                                                mainViewModel.showMessage("Imported ${workouts.size} Moyoung workouts")
                                            },
                                            onFailure = { err ->
                                                mainViewModel.showMessage(
                                                    err.message ?: "Moyoung sync failed",
                                                    retryLabel = "Retry",
                                                    onRetry = {
                                                        syncingMoyoung = true
                                                        lifecycleScope.launch {
                                                            val retry = runCatching {
                                                                mainViewModel.bleClient.fetchMoyoungWorkouts()
                                                            }
                                                            syncingMoyoung = false
                                                            retry.fold(
                                                                onSuccess = { w ->
                                                                    mainViewModel.showMessage("Imported ${w.size} Moyoung workouts")
                                                                },
                                                                onFailure = { e ->
                                                                    mainViewModel.showMessage(e.message ?: "Moyoung sync failed")
                                                                },
                                                            )
                                                        }
                                                    },
                                                )
                                            },
                                        )
                                    }
                                },
                                onCloseRun = { selectedRunId = null },
                                onSelectRun = { selectedRunId = it },
                                onStart = { mainViewModel.startRun() },
                                onStop = { mainViewModel.stopRun() },
                                onGoTab = { tab ->
                                    val route = when (tab) {
                                        "map" -> AppDestination.Map.route
                                        "history" -> AppDestination.History.route
                                        "gym" -> AppDestination.Gym.route
                                        "sleep" -> AppDestination.Sleep.route
                                        "recovery" -> AppDestination.Recovery.route
                                        else -> AppDestination.Home.route
                                    }
                                    visitedTabs = visitedTabs + route
                                    navController.navigate(route)
                                },
                                onUploadStrava = { runId ->
                                    mainViewModel.uploadRunToStrava(runId) { msg ->
                                        val failed = msg.contains("fail", ignoreCase = true)
                                        mainViewModel.showMessage(
                                            msg,
                                            retryLabel = if (failed) "Retry" else null,
                                            onRetry = if (failed) {
                                                { mainViewModel.uploadRunToStrava(runId) { m -> mainViewModel.showMessage(m) } }
                                            } else null,
                                        )
                                    }
                                },
                                onShareOnPhoto = { overlayRunId = it },
                                followRouteId = followRouteId,
                                followRouteName = followRouteName,
                                stravaUploading = stravaUploading,
                            )
                        }
                        composable(AppDestination.Map.route) {
                            if (AppDestination.Map.route in visitedTabs) {
                                MapTabContent(
                                    live = live,
                                    routes = routes,
                                    followRouteId = followRouteId,
                                    followRouteName = followRouteName,
                                    onSelectFollowRoute = { id, name ->
                                        followRouteId = id
                                        followRouteName = name
                                    },
                                )
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                        composable(AppDestination.History.route) {
                            if (AppDestination.History.route in visitedTabs) {
                                HistoryTabContent(
                                    runsViewModel = mainViewModel.runs,
                                    onSelectRun = {
                                        selectedRunId = it
                                        navController.navigate(AppDestination.Home.route)
                                    },
                                    onImportStrava = {
                                        mainViewModel.importStravaHistory { msg ->
                                            val failed = msg.contains("fail", ignoreCase = true)
                                            mainViewModel.showMessage(
                                                msg,
                                                retryLabel = if (failed) "Retry" else null,
                                                onRetry = if (failed) {
                                                    { mainViewModel.importStravaHistory { m -> mainViewModel.showMessage(m) } }
                                                } else null,
                                            )
                                        }
                                    },
                                    stravaImporting = stravaImporting,
                                )
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                        composable(AppDestination.Gym.route) {
                            if (AppDestination.Gym.route in visitedTabs) {
                                val gymViewModel: GymViewModel = viewModel()
                                GymTabContent(viewModel = gymViewModel, nfcController = gymNfcController)
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                        composable(AppDestination.Recovery.route) {
                            if (AppDestination.Recovery.route in visitedTabs) {
                                RecoveryScreen()
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                        composable(AppDestination.Sleep.route) {
                            if (AppDestination.Sleep.route in visitedTabs) {
                                SleepTabScreen()
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                        composable(AppDestination.Soccer.route) {
                            if (AppDestination.Soccer.route in visitedTabs) {
                                SoccerTabContent(sessionsFlow = mainViewModel.soccerSessions)
                            } else {
                                TabLoadingPlaceholder()
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (::gymNfcController.isInitialized) gymNfcController.onResume()
    }

    override fun onPause() {
        if (::gymNfcController.isInitialized) gymNfcController.onPause()
        super.onPause()
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        if (::gymNfcController.isInitialized) gymNfcController.onNewIntent(intent)
        handleDeepLinkIntent(intent)
    }

    private fun handleDeepLinkIntent(intent: Intent?) {
        val uri = intent?.data ?: return
        if (SpotifyController.handleCallbackUri(this, uri)) return
        handleStravaOAuthIntent(uri)
    }

    private fun handleStravaOAuthIntent(uri: Uri) {
        val isStrava = (uri.scheme == "http" && uri.host == "localhost" && uri.path?.contains("oauth") == true) ||
            (uri.scheme == "rungps" && uri.host == "strava")
        if (!isStrava) return
        val code = uri.getQueryParameter("code") ?: return
        StravaOAuth.markAuthCodePending(this, code)
        lifecycleScope.launch {
            runCatching {
                val repo = StravaRepository.get(this@MainActivity)
                val clientId = repo.clientId() ?: error("Set Strava Client ID in Settings")
                val secret = repo.clientSecret() ?: error("Set Strava Client Secret in Settings")
                val pending = StravaOAuth.consumePendingAuthCode(this@MainActivity) ?: code
                val tokens = StravaOAuth.exchangeCodeForTokens(clientId, secret, pending)
                repo.saveTokens(tokens)
            }.onSuccess {
                Toast.makeText(this@MainActivity, "Strava connected", Toast.LENGTH_LONG).show()
            }.onFailure {
                Toast.makeText(this@MainActivity, it.message ?: "Strava auth failed", Toast.LENGTH_LONG).show()
            }
        }
        intent?.data = null
    }
}

@androidx.compose.runtime.Composable
private fun TabLoadingPlaceholder() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
    }
}
