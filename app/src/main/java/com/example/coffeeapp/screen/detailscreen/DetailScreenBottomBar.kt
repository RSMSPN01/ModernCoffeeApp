package com.example.coffeeapp.screen.detailscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.screen.ui_components.AddToCartAlert

@Composable
fun DetailScreenBottomBar(price: Double) {

    BottomAppBar(
        containerColor = Color(0xFFF7F1E8),
        contentColor = Color(0xFF252525),
        tonalElevation = 4.dp
    ) {
        var showMessage by remember { mutableStateOf(false) }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Price",
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp,
                    color = Color(0xFF6B6B6B)
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = "₹ $price",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF47745F)
                )
            }

            Spacer(Modifier.width(6.dp))

            Button(
                onClick = { showMessage = true },
                modifier = Modifier
                    .width(200.dp)
                    .height(47.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF47745F),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Add To Cart",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
        }
        AddToCartAlert(
            show = showMessage,
            title = "Added to Cart",
            text = "Item is added to your cart",
            onDismiss = { showMessage = false }
        )
    }
}

