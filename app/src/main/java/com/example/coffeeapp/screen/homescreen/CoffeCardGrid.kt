package com.example.coffeeapp.screen.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product


@Composable
fun CoffeeCardGrid(
    innerpadding: PaddingValues,
    topContent: @Composable () -> Unit
) {
    // with local data
    val products = listOf(
        Product(
            id = 1,
            name = "Espresso",
            price = 350.0,
            description = "Rich and bold espresso with a smooth finish.",
            image = R.drawable.espresso
        ),
        Product(
            id = 2,
            name = "Americano",
            price = 400.0,
            description = "Espresso combined with hot water for a smooth, balanced taste.",
            image = R.drawable.americano
        ),
        Product(
            id = 3,
            name = "Cappuccino",
            price = 450.0,
            description = "A classic combination of espresso, steamed milk and silky foam.",
            image = R.drawable.cappuccino
        ),
        Product(
            id = 4,
            name = "Latte",
            price = 475.0,
            description = "Smooth espresso blended with creamy steamed milk.",
            image = R.drawable.latte
        ),
        Product(
            id = 5,
            name = "Mocha",
            price = 500.0,
            description = "Espresso, chocolate and steamed milk with a rich chocolate finish.",
            image = R.drawable.mocha
        ),
        Product(
            id = 6,
            name = "Flat White",
            price = 475.0,
            description = "Velvety steamed milk combined with rich espresso.",
            image = R.drawable.flat_white
        ),
        Product(
            id = 7,
            name = "Ristretto",
            price = 375.0,
            description = "A concentrated espresso with an intense and smooth flavor.",
            image = R.drawable.ristretto
        ),
        Product(
            id = 8,
            name = "Caramel Latte",
            price = 525.0,
            description = "Creamy latte finished with a subtle caramel sweetness.",
            image = R.drawable.caramel_latte
        )
    )
    // Coffe Card Grid Ui
    LazyVerticalGrid(
        modifier = Modifier.padding(innerpadding),
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item(
            span = { GridItemSpan(maxLineSpan) }
        ) {
            topContent()
        }
        items(products) { product ->
            CoffeeCardUI(product)
        }
    }
    
}