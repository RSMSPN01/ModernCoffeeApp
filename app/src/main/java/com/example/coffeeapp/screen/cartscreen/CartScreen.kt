package com.example.coffeeapp.screen.cartscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.model.coffeeProducts
import com.example.coffeeapp.screen.ui_components.NavigationBarUI

@Preview
@Composable
fun CartScreen() {
    Scaffold(
        topBar = { CartScreenTopBar() },
        bottomBar = { NavigationBarUI() }
    ) { innerpadding ->
        Column(
            modifier = Modifier
                .padding(innerpadding)
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Deliver",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(8.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(coffeeProducts) { product ->
                    CartScreenCard(product.image, product.name, product.description)
                }
            }

            Spacer(Modifier.height(8.dp))

            Text(
                text = "Payment Summary",
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Price",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
                Text(
                    text = "₹ 123",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
            }
            Spacer(Modifier.height(4.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Delivery Fee",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp

                )
                Text(
                    text = "₹ 124",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
            }
            Spacer(Modifier.height(24.dp))
            CartScreenPaymentCard()
            Spacer(Modifier.height(12.dp))
        }
    }
}