package com.example.coffeeapp.screen.profilescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeeapp.navigation.NavRoutes
import com.example.coffeeapp.screen.ui_components.NavigationBarUI
import com.example.coffeeapp.ui.theme.accentGreen
import com.example.coffeeapp.ui.theme.backgroundColor
import com.example.coffeeapp.ui.theme.cardGreen
import com.example.coffeeapp.ui.theme.primaryGreen
import com.example.coffeeapp.ui.theme.secondaryText
import com.example.coffeeapp.ui.theme.textColor

@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(
        topBar = { ProfileScreenTopBar() },
        bottomBar = { NavigationBarUI(navController, "Profile") }
    ) { innerpadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(innerpadding)
                .padding(horizontal = 16.dp)
        ) {

            Spacer(modifier = Modifier.height(32.dp))

            // Profile Picture
            Box(
                modifier = Modifier
                    .size(108.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(
                        color = cardGreen,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile picture",
                    tint = primaryGreen,
                    modifier = Modifier.size(58.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Name
            Text(
                text = "Praveen Kumar",
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                color = textColor,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Email
            Text(
                text = "praveenkumar.rsmspn@gmail.com",
                fontSize = 14.sp,
                color = secondaryText,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Address
            Text(
                text = "Address",
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                color = textColor
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Kangra,\nHimachal Pradesh\n1777033",
                fontSize = 14.sp,
                lineHeight = 21.sp,
                color = secondaryText
            )

            Spacer(modifier = Modifier.height(36.dp))

            // Navigation Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = cardGreen,
                        shape = RoundedCornerShape(18.dp)
                    )
                    .padding(vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate(NavRoutes.CartScreen) }
                        .padding(
                            horizontal = 18.dp,
                            vertical = 14.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Orders",
                        tint = accentGreen,
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Orders",
                        fontSize = 16.sp,
                        color = textColor
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate(NavRoutes.FavoriteScreen) }
                        .padding(
                            horizontal = 18.dp,
                            vertical = 14.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorites",
                        tint = accentGreen,
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Favorites",
                        fontSize = 16.sp,
                        color = textColor
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {}
                        .padding(
                            horizontal = 18.dp,
                            vertical = 14.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.WbSunny,
                        contentDescription = "Change Theme",
                        tint = accentGreen,
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Theme",
                        fontSize = 16.sp,
                        color = textColor
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {}
                        .padding(
                            horizontal = 18.dp,
                            vertical = 14.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Change Settings",
                        tint = accentGreen,
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Settings",
                        fontSize = 16.sp,
                        color = textColor
                    )
                }
            }
        }
    }

}
