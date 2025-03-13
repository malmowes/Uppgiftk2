package com.example.uppgift2k



import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNav(navController: NavHostController, colorModel: ColorModel) {
    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(
                colorModel = colorModel,
                onRedClick = { navController.navigate("colorScreen/RED") },
                onGreenClick = { navController.navigate("colorScreen/GREEN") }
            )
        }
        composable("colorScreen/{color}") { backStackEntry ->
            val colorType = backStackEntry.arguments?.getString("color")?.let {
                runCatching { ColorModel.ColorType.valueOf(it) }.getOrNull()
            }

            if (colorType != null) {
                ColorScreen(colorModel = colorModel, colorType = colorType)
            }
        }
    }
}
