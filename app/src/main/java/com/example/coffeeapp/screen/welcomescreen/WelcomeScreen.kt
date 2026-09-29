package com.example.coffeeapp.screen.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.lightGreen


@Preview(showBackground = true)
@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.coffeewelcomescreen),
            contentDescription = "Welcome Screen Coffee Image",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.padding(top = 110.dp, start = 50.dp)
        ) {
            Text(
                text = "Welcome!",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray
            )

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 90.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Your perfect cup is just a tap away.",
                fontSize = 24.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(
                Modifier.height(16.dp)
            )
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = lightGreen.copy(0.5f)
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Get Started"
                )
            }
        }
    }
}