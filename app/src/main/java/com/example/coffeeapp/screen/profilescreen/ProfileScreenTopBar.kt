package com.example.coffeeapp.screen.profilescreen

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.navigation.NavRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ProfileScreenTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Profile",
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