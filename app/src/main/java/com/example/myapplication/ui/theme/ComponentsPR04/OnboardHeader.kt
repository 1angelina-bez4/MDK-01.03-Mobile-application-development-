package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.TextColorGroup3

@Composable
fun OnboardHeader(text: String,modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = TextColorGroup3,
        textAlign = TextAlign.Center,
        modifier = modifier
            .background(Color.White),

        fontSize = 20.sp,
        lineHeight = 100.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
private fun OnboardHeaderPrev() {
    OnboardHeader("Заголовок")
}

