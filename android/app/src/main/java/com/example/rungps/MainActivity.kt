package com.example.rungps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rungps.spotify.SpotifyController
import com.example.rungps.strava.StravaOAuth
import com.example.rungps.strava.StravaRepository
import com.example.rungps.ui.main.HistoryTabContent
import com.example.rungps.ui.main.MapTabContent
import com.example.rungps.ui.main.RunTabContent
import com.example.rungps.ui.main.SoccerTabContent
import com.example.rungps.ui.navigation.AppDestination
import com.example.rungps.nfc.GymNfcController
import com.example.rungps.ui.gym.GymTabContent
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
                val mainViewModel: MainViewModel = viewModel()
                val navController = rememberNavController()
                val backStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = backStackEntry?.destination?.route

                val routes by mainViewModel.routes.collectAsState()
                val live by mainViewModel.trackingState.collectAsState()
                val stravaUploading by mainViewModel.stravaUploading.collectAsState()
                val stravaImporting by mainViewModel.stravaImporting.collectAsState()
                var syncingMoyoung by remember { mutableStateOf(false) }
                var selectedRunId by remember { mutableStateOf<Long?>(null) }
                var followRouteId by remember { mutableStateOf<Long?>(null) }
                var followRouteName by remember { mutableStateOf<String?>(null) }

                val openTab = intent?.getStringExtra("open_tab")
                if (openTab != null) {
                    val dest = when (openTab) {
                        "map" -> AppDestination.Map.route
                        "history" -> AppDestination.History.route
                        "gym" -> AppDestination.Gym.route
                        "recovery" -> AppDestination.Recovery.route
                        "sleep" -> AppDestination.Sleep.route
                        "soccer" -> AppDestination.Soccer.route
                        else -> AppDestination.Home.route
                    }
                    navController.navigate(dest) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                    intent.removeExtra("open_tab")
                }

                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            AppDestination.entries.forEach { destination ->
                                NavigationBarItem(
                                    selected = currentRoute == destination.route,
                                    onClick = {
                                        navController.navigate(destination.route) {
                                            popUpTo(navController.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    },
                                    icon = { Icon(destination.icon, contentDescription = destination.label) },
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
                                        val msg = runCatching {
                                            val workouts = mainViewModel.bleClient.fetchMoyoungWorkouts()
                                            "Imported ${workouts.size} Moyoung workouts"
                                        }.fold(
                                            onSuccess = { it },
                                            onFailure = { it.message ?: "Moyoung sync failed" },
                                        )
                                        syncingMoyoung = false
                                        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
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
                                        else -> AppDestination.Home.route
                                    }
                                    navController.navigate(route)
                                },
                                onUploadStrava = { runId ->
                                    mainViewModel.uploadRunToStrava(runId) { msg ->
                                        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
                                    }
                                },
                                stravaUploading = stravaUploading,
                            )
                        }
                        composable(AppDestination.Map.route) {
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
                        }
                        composable(AppDestination.History.route) {
                            HistoryTabContent(
                                runsViewModel = mainViewModel.runs,
                                onSelectRun = {
                                    selectedRunId = it
                                    navController.navigate(AppDestination.Home.route)
                                },
                                onImportStrava = {
                                    mainViewModel.importStravaHistory { msg ->
                                        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
                                    }
                                },
                                stravaImporting = stravaImporting,
                            )
                        }
                        composable(AppDestination.Gym.route) {
                            val gymViewModel: GymViewModel = viewModel()
                            GymTabContent(viewModel = gymViewModel, nfcController = gymNfcController)
                        }
                        composable(AppDestination.Recovery.route) {
                            RecoveryScreen()
                        }
                        composable(AppDestination.Sleep.route) {
                            SleepTabScreen()
                        }
                        composable(AppDestination.Soccer.route) {
                            SoccerTabContent(sessionsFlow = mainViewModel.soccerSessions)
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
