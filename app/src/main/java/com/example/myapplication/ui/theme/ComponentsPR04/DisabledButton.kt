package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.ColorLazyRowButton
import com.example.myapplication.ui.theme.ColorLazyRowButtonText

@Composable
fun DisabledButton(
    butttonText: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {onClick()},
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonColors(
//            AccentColorPrimaryButton,
//            AccentColorDisabledButtonText,
//            AccentColorDisabledButton,
//            AccentColorDisabledButton
            ColorLazyRowButton,
            ColorLazyRowButtonText,
            ColorLazyRowButton,
            ColorLazyRowButton
            ),
        modifier = modifier

            .width(335.dp)
            .height(56.dp)
    ) {
        Text(
            text = butttonText,
            color = ColorLazyRowButtonText
        )
    }
}

@Preview
@Composable
private fun DisabledButtonPrev() {
    DisabledButton("Кнопка", onClick ={})
}