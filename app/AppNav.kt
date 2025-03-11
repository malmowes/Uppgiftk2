package com.example.colorapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.colorapp.model.ColorType
import com.example.colorapp.ui.ColorScreen
import com.example.colorapp.ui.StartScreen

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(
                onRedClick = { navController.navigate("colorScreen/RED") },
                onGreenClick = { navController.navigate("colorScreen/GREEN") }
            )
        }
        composable("colorScreen/{color}") { backStackEntry ->
            val color = backStackEntry.arguments?.getString("color")?.let { ColorType.valueOf(it) }
            if (color != null) {
                ColorScreen(color)
            }
        }
    }
}
