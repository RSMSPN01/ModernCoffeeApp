package com.example.coffeeapp.screen.ui_components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun NavigationBarUI() {

    val items = listOf(
        NavItems("Home", Icons.Default.Home),
        NavItems("Cart", Icons.Default.ShoppingCart),
        NavItems("Liked", Icons.Default.Favorite),
        NavItems("Profile", Icons.Default.Person),
    )

    NavigationBar(
        containerColor = Color(0xFFF8F3EC),
        tonalElevation = 0.dp
    ) {

        items.forEach { item ->

            NavigationBarItem(
                selected = true,
                onClick = {},
                icon = {
                    Icon(
                        imageVector = item.icons,
                        contentDescription = item.title,
                        tint = Color(0xFF4F4A45)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = Color(0xFF6B625B)
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
    var icons: ImageVector
)
