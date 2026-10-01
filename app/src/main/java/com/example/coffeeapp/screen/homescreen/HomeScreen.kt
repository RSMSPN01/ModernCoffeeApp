package com.example.coffeeapp.screen.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.screen.ui_components.NavigationBarUI

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { NavigationBarUI() }
    ) { innerpadding ->
        val location = "Solan, Himachal Pradesh"

        // BackGround Color

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF2D6A4F),
                            Color(0xFF95D5B2)
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            // Text Field For Location

            Spacer(Modifier.height(15.dp))
            Text(
                text = "Location",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(6.dp))
            Row {
                Text(
                    text = location,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change Location"
                )
            }

            // Search Bar
            Spacer(Modifier.height(35.dp))
            SearchBar()


            // Promo Image
            Spacer(Modifier.height(25.dp))
            Image(
                painter = painterResource(R.drawable.promo_image),
                contentDescription = "Promotional Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(15.dp)),
                contentScale = ContentScale.Crop,
            )

            // Category List
            Spacer(Modifier.height(12.dp))
            HomeScreenCategory()

            // Coffee card Grid Ui
            Spacer(Modifier.height(12.dp))
            CoffeeCardGrid()

        }
    }
}