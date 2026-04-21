package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AccentColorButtonText
import com.example.myapplication.ui.theme.AccentColorSecondaryButton
import com.example.myapplication.ui.theme.AccentColorSecondaryButtonText

@Composable
fun SecondaryButton(butttonText: String,onClick: () -> Unit,enabled:Boolean=true,modifier: Modifier = Modifier) {
    Button(
        onClick = {onClick()},
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, color =AccentColorSecondaryButton ),
        colors = ButtonColors(
            Color.White,
            AccentColorSecondaryButton,
            AccentColorSecondaryButton,
            AccentColorSecondaryButton
        ),
        modifier = modifier

            .width(335.dp)
            .height(56.dp)
    ) {
        Text(
            text = butttonText,
            color = AccentColorSecondaryButtonText
        )
    }
}

@Preview
@Composable
private fun SecondaryButtonPrev() {
    SecondaryButton("Еще одна кнопка",onClick ={},enabled = true)
}