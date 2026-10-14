package com.example.coffeeapp.screen.favoritescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.coffeeapp.model.coffeeProductsCompressed
import com.example.coffeeapp.screen.ui_components.NavigationBarUI


@Composable
fun FavoriteScreen(navController: NavHostController) {
    Scaffold(
        topBar = { FavoriteScreenTopBar() },
        bottomBar = { NavigationBarUI(navController, "Liked") }
    ) { innerpadding ->
        var coffeeProductsCompressed by remember { mutableStateOf(coffeeProductsCompressed) }
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(16.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(coffeeProductsCompressed) { product ->
                    FavoriteScreenCard(
                        product.image,
                        product.name,
                        product.description,
                        { coffeeProductsCompressed = coffeeProductsCompressed - product })
                }

            }
        }
    }
}