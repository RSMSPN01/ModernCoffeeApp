package com.example.coffeeapp.navigation

import com.example.coffeeapp.model.Product
import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {
    @Serializable
    object WelcomeScreen : NavRoutes()

    @Serializable
    object HomeScreen : NavRoutes()

    @Serializable
    data class DetailScreen(val productId: Int) : NavRoutes()

    @Serializable
    object CartScreen : NavRoutes()

    @Serializable
    object FavoriteScreen : NavRoutes()

    @Serializable

    object ProfileScreen : NavRoutes()
}