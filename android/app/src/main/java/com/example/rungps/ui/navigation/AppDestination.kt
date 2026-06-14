package com.example.rungps.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.SportsSoccer
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppDestination(
    val route: String,
    val label: String,
    val icon: ImageVector,
) {
    Home("home", "Home", Icons.Default.Home),
    Map("map", "Map", Icons.Default.Map),
    History("history", "History", Icons.Default.History),
    Gym("gym", "Gym", Icons.Default.FitnessCenter),
    Recovery("recovery", "Recovery", Icons.Default.SelfImprovement),
    Sleep("sleep", "Sleep", Icons.Default.Bedtime),
    Soccer("soccer", "Soccer", Icons.Default.SportsSoccer),
}
