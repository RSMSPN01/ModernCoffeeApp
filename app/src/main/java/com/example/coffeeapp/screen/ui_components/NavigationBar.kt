package com.example.coffeeapp.screen.ui_components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.coffeeapp.navigation.NavRoutes


@Composable
fun NavigationBarUI(navController: NavHostController, page: String) {

    val items = listOf(
        NavItems("Home", Icons.Default.Home, NavRoutes.HomeScreen),
        NavItems("Cart", Icons.Default.ShoppingCart, NavRoutes.CartScreen),
        NavItems("Liked", Icons.Default.Favorite, NavRoutes.FavoriteScreen),
        NavItems("Profile", Icons.Default.Person, NavRoutes.ProfileScreen),
    )

    NavigationBar(
        containerColor = Color(0xFFF8F3EC),
        tonalElevation = 0.dp
    ) {

        items.forEach { item ->

            NavigationBarItem(
                selected = page == item.title,
                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(NavRoutes.HomeScreen) {
                            // It will not save the previous state of profile screen or else it is causing a loop
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true

                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icons,
                        contentDescription = item.title,
                    )
                },
                label = {
                    Text(
                        text = item.title,
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color(0xFFDDEBDD),
                    selectedIconColor = Color(0xFF3F6B4A),
                    selectedTextColor = Color(0xFF3F6B4A),
                    unselectedIconColor = Color(0xFF6B625B),
                    unselectedTextColor = Color(0xFF6B625B)
                )
            )
        }
    }
}

data class NavItems(
    var title: String,
    var icons: ImageVector,
    var routes: NavRoutes
)
