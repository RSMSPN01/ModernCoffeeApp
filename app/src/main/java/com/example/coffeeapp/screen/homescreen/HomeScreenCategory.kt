package com.example.coffeeapp.screen.homescreen

import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun HomeScreenCategory() {
    var context = LocalContext.current
    // types (Data)

    var categories = listOf(
        "All Coffees",
        "Espresso",
        "Americano",
        "Ristretto",
        "Latte",
        "Cappuccino",
        "Flat White",
        "Mocha"
    )
    var currentSelected by rememberSaveable {mutableStateOf(categories[0]) }
    // UI

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        items(categories) { category ->
            // Category Ui
            // lambda function
            val onClick = {
                Toast.makeText(
                    context,
                    "${category} Selected",
                    LENGTH_SHORT
                ).show()
                currentSelected = category
            }
            CategoryUI(category, onClick,currentSelected)

        }
    }

}
