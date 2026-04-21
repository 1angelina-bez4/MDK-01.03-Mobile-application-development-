package com.example.myapplication.ui.theme.ComponentsPR05

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.ButtonColor
import com.example.myapplication.ui.theme.ButtonColorContent
import com.example.myapplication.ui.theme.ColorBottomBorder
import com.example.myapplication.ui.theme.ColorTextBottom
import com.example.myapplication.ui.theme.TextColor
import com.example.myapplication.ui.theme.TextFieldColors
import com.example.myapplication.ui.theme.TextFieldColorsBorder

@Composable
fun Screen(modifier: Modifier = Modifier) {
    var emailText by remember { mutableStateOf("") }

    var isButtonEnabled = emailText.isNotEmpty()

    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(
                start = 21.dp,
                end = 22.dp,
                top = 101.dp,
                bottom  = 620.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
        text = "Добро пожаловать!",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 28.sp
    )
        Spacer(modifier=modifier.height(23.dp))
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 15.sp,
            lineHeight = 20.sp
        )
        Spacer(modifier=modifier.height(70.dp))

    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                start = 20.dp,
                end = 20.dp,
                top = 262.dp,
                bottom  = 478.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    { Text(
        text = "Вход по E-mail",
        textAlign = TextAlign.Left,
        fontSize = 14.sp,
        color = TextColor,
        modifier=modifier
            .fillMaxWidth(),
        lineHeight = 20.sp
    )

        OutlinedTextField(
            value = emailText,
            onValueChange = {emailText = it},
            colors =  OutlinedTextFieldDefaults.colors(
                focusedContainerColor = TextFieldColors,
                unfocusedContainerColor = TextFieldColors,
                unfocusedBorderColor = TextFieldColorsBorder,
                focusedBorderColor =  TextFieldColorsBorder
            ),

            placeholder = {
                Text(
                    text = "example@mail.ru",
                    color = Color.Gray
                )
            },

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth(),)

        Spacer(modifier=modifier.height(32.dp))

    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                start = 20.dp,
                end = 20.dp,
                top = 366.dp,
                bottom  = 390.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            modifier= Modifier
                .fillMaxWidth()
                .width(335.dp)
                .height(56.dp),
            onClick = { Log.d("MyLog", "Введенный email: $emailText")},
            enabled = isButtonEnabled,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonColors(
                AccentColorPrimaryButton,
                AccentColorDisabledButtonText,
                AccentColorDisabledButton,
                AccentColorDisabledButton
            ),

            ) {
            Text(
                text="Далее",
                color = Color.White,
                fontSize = 17.sp,
                modifier=modifier,
                lineHeight = 24.sp
            )
        }
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                start = 19.dp,
                end = 21.dp,
                top = 660.dp,
                bottom  = 56.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text="Или войдите с помощью",
            color = ColorTextBottom,
            fontSize = 17.sp,
            modifier=modifier,
            lineHeight = 24.sp
        )
        Spacer(modifier=modifier.height(32.dp))
        Button(
            modifier= Modifier
                .fillMaxWidth()
                .width(335.dp)
                .height(56.dp),
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color =ColorBottomBorder ),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),

            ) {
            Text(
                text="Войти с Яндекс",
                color = ColorBottomBorder,
                fontSize = 17.sp,
                modifier=modifier,
                lineHeight = 24.sp

            )
        }
    }

}

@Preview
@Composable
private fun ScreenPrev() {
    Screen()
}