package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Card(modifier: Modifier = Modifier,
         Title: String, Day: Int,
         Summa: Int) {
    Column()
    {
        Text(
            text = Title
        )
        Text(
            text = "$Day день"
        )
        Text(
            text = "$Summa"
        )
    }
}

@Preview
@Composable
private fun CardPrev() {
    Card(Title="Title",Day=2, Summa = 1600)
}