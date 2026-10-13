package com.example.coffeeapp.screen.detailscreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.coffeeCream
import com.example.coffeeapp.ui.theme.coffeeGreen
import com.example.coffeeapp.ui.theme.coffeeGreenLight
import com.example.coffeeapp.ui.theme.coffeeText


@Composable
fun DetailScreenUi(product: Product, navController: NavHostController) {
    var coffeeType by remember { mutableStateOf("S") }

    Scaffold(
        containerColor = coffeeCream,
        topBar = {
            DetailScreenTopBar(navController)
        },
        bottomBar = {
            DetailScreenBottomBar(product.price)
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {

            Spacer(Modifier.height(16.dp))

            Image(
                painter = painterResource(product.image),
                contentDescription = "Coffee Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.height(16.dp))

            Text(
                text = product.name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = coffeeText
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "Ice / Hot",
                fontWeight = FontWeight.SemiBold,
                color = coffeeGreen
            )

            Spacer(Modifier.height(16.dp))

            HorizontalDivider(
                color = coffeeGreenLight.copy(alpha = 0.5f)
            )

            Spacer(Modifier.height(16.dp))

            Text(
                text = "Description",
                fontWeight = FontWeight.Bold,
                color = coffeeText
            )

            Spacer(Modifier.height(4.dp))

            Text(
                text = product.description,
                fontSize = 12.sp,
                color = Color.DarkGray
            )

            Spacer(Modifier.height(16.dp))

            Text(
                text = "Size",
                fontWeight = FontWeight.Bold,
                color = coffeeText
            )

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                listOf("S", "M", "L").forEach { size ->

                    val isSelected = coffeeType == size

                    Button(
                        onClick = {
                            coffeeType = size
                        },
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) {
                                coffeeGreen
                            } else {
                                coffeeCream
                            },
                            contentColor = if (isSelected) {
                                Color.White
                            } else {
                                coffeeGreen
                            }
                        ),
                        border = if (isSelected) {
                            null
                        } else {
                            BorderStroke(1.dp, coffeeGreenLight)
                        }
                    ) {
                        Text(
                            text = size,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))
        }
    }
}

