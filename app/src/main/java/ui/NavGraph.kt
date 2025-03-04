package ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycityapp.MyCityAppScreen
import com.example.mycityapp.R

// Brett Sullivan - Sullbret@oregonstate.edu
// CS 492 - Mobile App Development - My City App
// 2-10-2025

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MyCityAppScreen(navController)
        }
        composable("recommendations/{categoryName}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
            RecommendationListScreen(navController, categoryName)
        }
        composable("detail/{placeName}/{placeAddress}/{placeDescription}/{imageResId}") { backStackEntry ->
            val placeName = backStackEntry.arguments?.getString("placeName") ?: ""
            val placeAddress = backStackEntry.arguments?.getString("placeAddress") ?: ""
            val placeDescription = backStackEntry.arguments?.getString("placeDescription") ?: ""
            val imageResId = backStackEntry.arguments?.getString("imageResId")?.toInt() ?: R.drawable.ic_launcher_background

            RecommendationDetailScreen(navController, placeName, placeAddress, placeDescription, imageResId)
        }
    }
}





