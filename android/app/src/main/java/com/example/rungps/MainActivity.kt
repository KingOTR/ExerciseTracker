package com.example.rungps

import android.os.Bundle
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rungps.ui.main.HistoryTabContent
import com.example.rungps.ui.main.MapTabContent
import com.example.rungps.ui.main.RunTabContent
import com.example.rungps.ui.main.SoccerTabContent
import com.example.rungps.ui.navigation.AppDestination
import com.example.rungps.ui.screens.GymScreen
import com.example.rungps.ui.screens.RecoveryScreen
import com.example.rungps.ui.sleep.SleepTabScreen
import com.example.rungps.ui.theme.ExerciseTrackerTheme
import com.example.rungps.ui.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseTrackerTheme {
                val mainViewModel: MainViewModel = viewModel()
                val navController = rememberNavController()
                val backStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = backStackEntry?.destination?.route

                val routes by mainViewModel.routes.collectAsState()
                val live by mainViewModel.trackingState.collectAsState()
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
                            )
                        }
                        composable(AppDestination.Gym.route) {
                            GymScreen()
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
}
