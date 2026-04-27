package com.example.myapplication.ui.theme.ComponentsPR09

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.MyThemePR07
import com.example.myapplication.ui.theme.TextPay

@Composable
fun Pay(modifier: Modifier = Modifier, back:() -> Unit) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier=modifier .height(62.dp))
        Text(
            text = "Оплата",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            lineHeight =28.sp
        )
        Spacer(modifier=modifier .height(64.dp))
        Image(
            modifier = modifier
                .padding(
                    start = 85.dp,
                    end = 86.dp,
                )
                .size(204.dp,201.dp),
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = "illustration image"
        )
        Spacer(modifier=modifier .height(31.dp))
        Text(
            text = "Ваш заказ успешно оплачен!",
            color = TextPay,
            fontSize=20.sp,
            lineHeight = 28.sp
        )
        Spacer(modifier=modifier .height(31.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = {  back()},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonColors(
                AccentColorPrimaryButton,
                AccentColorDisabledButtonText,
                AccentColorDisabledButton,
                AccentColorDisabledButton
            ),
        ) {
            Text(
                text = "Назад",
                color = Color.White,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview
@Composable
private fun PayPrev() {
    Pay(back = {})
}