package com.example.coffeeapp.screen.favoritescreen

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun FavoriteScreenTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Favorites",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            )

        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF47745F),
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )
    )
}