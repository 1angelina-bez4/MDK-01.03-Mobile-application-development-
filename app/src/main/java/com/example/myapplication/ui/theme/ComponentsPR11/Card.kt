package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.ColorCard
import com.example.myapplication.ui.theme.ComponentsPR04.DisabledButton
import com.example.myapplication.ui.theme.MyTheme

@Composable
fun Card(modifier: Modifier = Modifier,
         Title: String, Day: Int,
         Summa: Int) {
    Column(
        modifier = modifier
            .background(ColorCard)
            .fillMaxWidth()
            .padding(
                start  = 20.dp,
                end = 20.dp,
                 top=140.dp,
                bottom = 512.dp),
    )
    {
        Text(
            text = Title

        )
        Spacer(modifier= Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    vertical = 16.dp
                )
        ) {
            Column() {
                Text(
                    text = "$Day день"
                )
                Spacer(modifier= Modifier.height(4.dp))
                Text(
                    text = "$Summa ₽"
                )

            }
            Spacer(modifier= Modifier.width(151.dp))
            DisabledButton(
                modifier=modifier
                    .width(96.dp)
                    .height(40.dp)
                    .padding(
                    ),


                butttonText = "Добавить",
                onClick = {},
                enabled = true,
                textSize = 14,
                textlineHeight = 20,
                containerColor = AccentColorPrimaryButton,
                contentColor = AccentColorDisabledButtonText,
                discontainerColor = AccentColorDisabledButton,
                discontentColor =AccentColorDisabledButton,
                colorText = MyTheme.colors.white
            )

        }

    }
}

@Preview
@Composable
private fun CardPrev() {
    Card(Title="Title",Day=2, Summa = 1600)
}