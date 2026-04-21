package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColorGray

@Composable
fun OnboardDescription(text: String,modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = AccentColorGray,
        fontStyle = FontStyle.Normal,
        modifier = modifier
            .background(Color.White)
            .width(width = 64.dp)
            .height(height = 20.dp),
        //fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight(400)
    )
}

@Preview
@Composable
private fun OnboardDescriptionPrev() {
    OnboardDescription("Описание")
}