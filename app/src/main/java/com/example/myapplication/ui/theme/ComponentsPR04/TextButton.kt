package com.example.myapplication.ui.theme.ComponentsPR04

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColorTextBlue

@Composable
fun TextButton(text: String,onClick: () -> Unit,modifier: Modifier = Modifier, ) {
    Text(
        text=text,
        color = AccentColorTextBlue,
        modifier = modifier
            .background(Color.White)
            .clickable{onClick()},
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight(400)
    )
}

@Preview
@Composable
private fun TextButtonpPrev() {
    TextButton(text="Текст, на который можно нажать", onClick={})
}
