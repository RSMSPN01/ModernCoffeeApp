package com.example.coffeeapp.screen.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun CategoryUI(category1: String, onClick: () -> Unit, currentSelected: String) {
    val isSelected = category1 == currentSelected
    val boxColor = if (isSelected) {
        Color(0xFF4F8768)
    } else {
        Color(0xFF5F9F7D).copy(0.8f)
    }
    val textColor = if (isSelected) {
        Color(0xFFFFFFFF)
    } else {
        Color(0xFFF5F7F5)
    }
    Box(
        modifier = Modifier
            .padding(end = 4.dp)
            .background(
                color = boxColor,
                shape = RoundedCornerShape(8.dp)
            )
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = category1,
            color = textColor,
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 7.dp
            ),
            fontWeight = FontWeight.SemiBold
        )
    }
}