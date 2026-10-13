package com.example.coffeeapp.screen.cartscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.exp

@Preview(showBackground = true)
@Composable
fun CartScreenPaymentCard() {
    var expanded by remember { mutableStateOf(false) }
    var paymentMode by remember { mutableStateOf("Online Payment") }
    var totalPrice  by remember { mutableDoubleStateOf(169.0) }
    var paymentIcon by remember {
        mutableStateOf(Icons.Default.CreditCard)
    }

    val themeGreen = Color(0xFF00AF66)
    val buttonGreen = Color(0xFF008F55)
    val cardBackground = Color(0xFFFAF6FA)
    val primaryText = Color(0xFF26382D)
    val secondaryText = Color(0xFF6B776F)

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardBackground
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(44.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = paymentIcon,
                    contentDescription = "Payment method",
                    tint = themeGreen,
                    modifier = Modifier.size(28.dp)
                )

                Spacer(Modifier.width(12.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = paymentMode,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = primaryText
                    )

                    Text(
                        text = "₹$totalPrice",
                        fontSize = 13.sp,
                        color = secondaryText
                    )
                }

                Box {
                    IconButton(
                        onClick = { expanded = true }
                    ) {
                        Icon(
                            imageVector =
                                Icons.Default.KeyboardArrowDown,
                            contentDescription = "Select payment method",
                            tint = themeGreen
                        )
                    }

                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = {
                            expanded = false
                        },
                        modifier = Modifier
                            .width(180.dp)
                            .background(cardBackground),
                        offset = DpOffset(0.dp, 0.dp)
                    ) {
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = "Online Payment",
                                    color = primaryText
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.CreditCard,
                                    contentDescription = null,
                                    tint = themeGreen
                                )
                            },
                            onClick = {
                                expanded = false
                                paymentMode = "Online Payment"
                                paymentIcon = Icons.Default.CreditCard
                                totalPrice = totalPrice
                            }
                        )

                        HorizontalDivider(
                            modifier = Modifier.padding(horizontal = 12.dp),
                            color = Color(0xFFE5EAE5)
                        )

                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = "Cash on Delivery",
                                    color = primaryText
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Payments,
                                    contentDescription = null,
                                    tint = themeGreen
                                )
                            },
                            onClick = {
                                expanded = false
                                paymentMode = "Cash on Delivery"
                                paymentIcon = Icons.Default.Payments
                                totalPrice = totalPrice + 40.0
                            }
                        )
                    }
                }
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = buttonGreen,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Place Order",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

