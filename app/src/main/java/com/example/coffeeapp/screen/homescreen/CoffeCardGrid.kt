package com.example.coffeeapp.screen.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffeeapp.model.coffeeProducts


@Composable
fun CoffeeCardGrid(
    innerpadding: PaddingValues,
    navController: NavController,
    topContent: @Composable () -> Unit
) {

    // Coffe Card Grid Ui
    LazyVerticalGrid(
        modifier = Modifier
            .padding(innerpadding)
            .padding(horizontal = 16.dp),
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item(
            span = { GridItemSpan(maxLineSpan) }
        ) {
            topContent()
        }
        items(coffeeProducts) { product ->
            CoffeeCardUI(product, navController)
        }
    }

}