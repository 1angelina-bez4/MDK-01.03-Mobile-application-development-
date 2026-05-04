package com.example.myapplication.ui.theme.ComponentsPR11

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.ColorCard
import com.example.myapplication.ui.theme.ColorCardFon
import com.example.myapplication.ui.theme.ComponentsPR04.DisabledButton
import com.example.myapplication.ui.theme.MyTheme

@Composable
fun Card(modifier: Modifier = Modifier,
         Title: String, Day: Int,
         Summa: Int,
         buttonWidth: Dp = 96.dp) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(
                width = 2.dp,
                color = ColorCard,
                shape = RoundedCornerShape(12.dp)
            ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = ColorCardFon
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = Title,
                    fontSize =  16.sp,
                    lineHeight = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()

                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Text(
                            text = "$Day день",
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "$Summa ₽",
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))
                    DisabledButton(
                        modifier = Modifier
                            .width(buttonWidth)
                            .height(40.dp),
                        butttonText = "Добавить",
                        onClick = {},
                        enabled = true,
                        textSize = 10,
                        textlineHeight = 20,
                        containerColor = AccentColorPrimaryButton,
                        contentColor = AccentColorDisabledButtonText,
                        discontainerColor = AccentColorDisabledButton,
                        discontentColor = AccentColorDisabledButton,
                        colorText = MyTheme.colors.white
                    )

                }
            }

    }
}

@Preview
@Composable
private fun CardPrev() {
    Card(Title="Title",Day=2, Summa = 1600,buttonWidth=96.dp)
}