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
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rungps.ui.navigation.AppDestination
import com.example.rungps.ui.screens.DataScreen
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

                val gymSessions by mainViewModel.gymSessions.collectAsState()
                val runs by mainViewModel.runs.runs.collectAsState()

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
                            DataScreen(
                                title = "Home",
                                description = "GPS runs, BLE watch, today's steps",
                                stats = listOf("Runs in DB: ${runs.size}", "Gym sessions: ${gymSessions.size}"),
                                onSync = { mainViewModel.syncCloud() },
                            )
                        }
                        composable(AppDestination.Map.route) {
                            DataScreen("Map", "Offline MapLibre regions and route planning")
                        }
                        composable(AppDestination.History.route) {
                            DataScreen(
                                title = "History",
                                description = "Past runs, splits, Strava PB import",
                                stats = runs.take(5).map { "${it.activityType} · ${(it.distanceM / 1000).format(1)} km" },
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
                            DataScreen("Soccer", "Matches, training, watch sync")
                        }
                    }
                }
            }
        }
    }
}

private fun Double.format(digits: Int) = "%.${digits}f".format(this)
