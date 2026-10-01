package com.example.coffeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coffeeapp.screen.homescreen.HomeScreen
import com.example.coffeeapp.screen.homescreen.HomeScreenCategory
import com.example.coffeeapp.screen.welcomescreen.WelcomeScreen
import com.example.coffeeapp.ui.theme.CoffeeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeeAppTheme {
//                WelcomeScreen()
                HomeScreen()
            }
//            HomeScreenCategory()
        }
    }
}
