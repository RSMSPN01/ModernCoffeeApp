package com.example.coffeeapp.screen.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.model.Product

@Composable
fun CoffeeCardUI(product: Product) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .background(
                color = Color(0xFF466653),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            painter = painterResource(product.image),
            contentDescription = "null",
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .padding(5.dp)
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        IconButton(
            onClick = {},
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color(0xFF6F9F83),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .padding(top = 12.dp, end = 12.dp)
                .size(height = 20.dp, width = 30.dp)
                .align(Alignment.TopEnd).
            alpha(0.8f)

        ) {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Add Button",
                Modifier.size(15.dp)
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 5.dp, end = 5.dp, bottom = 6.dp)
        ) {
            Text(
                text = product.name,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFF5F7F5)
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = product.description,
                fontSize = 12.sp,
                color = Color(0xFFD5E1DA),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "₹${product.price}",
                    fontWeight = FontWeight.SemiBold
                )
                IconButton(
                    onClick = {},
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color(0xFFDCEBE2),
                        contentColor = Color(0xFF466653)
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.size(35.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Button"
                    )
                }
            }

        }
    }
}