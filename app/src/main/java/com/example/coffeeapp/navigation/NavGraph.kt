package com.example.coffeeapp.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coffeeapp.model.coffeeProducts
import com.example.coffeeapp.screen.cartscreen.CartScreen
import com.example.coffeeapp.screen.detailscreen.DetailScreenUi
import com.example.coffeeapp.screen.favoritescreen.FavoriteScreen
import com.example.coffeeapp.screen.homescreen.HomeScreen
import com.example.coffeeapp.screen.profilescreen.ProfileScreen
import com.example.coffeeapp.screen.welcomescreen.WelcomeScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoutes.WelcomeScreen
    ) {
        composable <NavRoutes.WelcomeScreen>{
            WelcomeScreen(navController)
        }
        composable <NavRoutes.HomeScreen>{
            HomeScreen(navController)
        }
        composable <NavRoutes.DetailScreen>{ backStackEntry ->
            val route =
                backStackEntry.toRoute<NavRoutes.DetailScreen>()

            val product = coffeeProducts.find {
                it.id == route.productId
            }

            if (product != null) {
                DetailScreenUi(
                    product = product,
                    navController = navController
                )
            } else {
                Text("Coffee not found")
            }
        }
        composable < NavRoutes.CartScreen>{
            CartScreen(navController)
        }
        composable < NavRoutes.FavoriteScreen>{
            FavoriteScreen(navController)
        }
        composable < NavRoutes.ProfileScreen>{
            ProfileScreen(navController)
        }
        }
    }