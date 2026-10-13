package com.example.coffeeapp.screen.cartscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeeapp.model.coffeeProducts
import com.example.coffeeapp.screen.ui_components.NavigationBarUI

@Composable
fun CartScreen(navController: NavHostController) {
    Scaffold(
        topBar = { CartScreenTopBar() },
        bottomBar = { NavigationBarUI(navController, "Cart") }
    ) { innerpadding ->
        var paymentMode by remember {
            mutableStateOf("Online Payment")
        }
        val deliveryCharges =
            if (paymentMode == "Cash on Delivery") 40.0 else 0.0
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
                    text = "₹ 169",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
            }
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Delivery Fee",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp

                )
                Text(
                    text = "₹ $deliveryCharges",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
            }
            Spacer(Modifier.height(24.dp))
            CartScreenPaymentCard(deliveryCharges, onPaymentModeChange = { newMode ->
                paymentMode = newMode
            }, paymentMode)
            Spacer(Modifier.height(12.dp))
        }
    }
}