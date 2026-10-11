package com.example.coffeeapp.screen.ui_components

import android.icu.text.CaseMap
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun AddToCartAlert(
    show: Boolean,
    title: String,
    text: String,
    onDismiss: () -> Unit
) {
    if (show) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                Text(
                    text = title
                )
            },
            text = {
                Text(
                    text = text
                )
            },
            confirmButton = {
                TextButton(
                    onClick = onDismiss
                ) {
                    Text(
                        text = "OK"
                    )
                }
            }
        )
    }
}