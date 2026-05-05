package com.example.myapplication.ui.theme.ComponentsPR09

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.BACKGROUND_All
import com.example.myapplication.ui.theme.ColorTextComentary
import com.example.myapplication.ui.theme.ColorTextPromo
import com.example.myapplication.ui.theme.TextColor
import com.example.myapplication.ui.theme.TextFieldColors
import com.example.myapplication.ui.theme.TextFieldColorsBorder

@Composable
fun Order(modifier: Modifier = Modifier, back: () -> Unit, navigateToOrder: () -> Unit) {
    //For Address
    var AddressText by remember { mutableStateOf("") }
    //For Phone
    var PhoneText by remember { mutableStateOf("") }

    //For Commentary
    var CommentaryText by remember { mutableStateOf("") }

    val EnabledTextField = AddressText.isNotEmpty() &&
                            PhoneText.isNotEmpty() &&
                             CommentaryText.isNotEmpty()
    Column(
        modifier=modifier
            .background(BACKGROUND_All)
            .fillMaxSize()
            .padding(
                horizontal = 20.dp
            ),
        horizontalAlignment = Alignment.Start,

    ) {
            Spacer(modifier=modifier.height(60.dp))
            Image(
                modifier=modifier
                    .size(32.dp,32.dp)
                    .clickable{back()},
                painter = painterResource(id = R.drawable.back),
                contentDescription = "back image"
            )
            Spacer(modifier=modifier.height(24.dp))
            Text(
                text = "Оформление заказа",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 28.sp,
                textAlign = TextAlign.Left
            )

            Spacer(modifier=modifier.height(32.dp))

            Image(
                modifier=modifier
                    .size(51.dp,20.dp),
                painter = painterResource(id = R.drawable.tittle),
                contentDescription = "back image"
            )
            Spacer(modifier=modifier.height(4.dp))

            OutlinedTextField(
                value = AddressText,
                onValueChange = {AddressText=it},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = TextFieldColors,
                    unfocusedContainerColor = TextFieldColors,
                    unfocusedBorderColor = TextFieldColorsBorder,
                    focusedBorderColor = TextFieldColorsBorder
                ),
                        placeholder = {
                    Text(
                        text = "Введите ваш адрес",
                        color = Color.Gray
                    )
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier=modifier.height(12.dp))
            Image(
                modifier=modifier
                    .size(68.dp,20.dp),
                painter = painterResource(id = R.drawable.tittle__1_),
                contentDescription = "back image"
            )
            Spacer(modifier=modifier.height(4.dp))

            OutlinedTextField(
                value = PhoneText,
                onValueChange = {PhoneText=it},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = TextFieldColors,
                    unfocusedContainerColor = TextFieldColors,
                    unfocusedBorderColor = TextFieldColorsBorder,
                    focusedBorderColor = TextFieldColorsBorder
                ),
                placeholder = {
                    Text(
                        text = "Введите ваш номер телефона",
                        color = Color.Gray
                    )
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            )
        Spacer(modifier=modifier.height(12.dp))


        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        {
            Text(
                text = "Комментарий",
                textAlign = TextAlign.Left,
                fontSize = 14.sp,
                color = ColorTextComentary,
                lineHeight = 20.sp
            )
            Spacer(modifier=modifier.width(221.dp))
            Image(
                modifier=modifier
                    .size(68.dp,20.dp),
                painter = painterResource(id = R.drawable.male),
                contentDescription = "back image"
            )
        }

        Spacer(modifier=modifier.height(4.dp))

        OutlinedTextField(
            value = CommentaryText,
            onValueChange = {CommentaryText=it},
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = TextFieldColors,
                unfocusedContainerColor = TextFieldColors,
                unfocusedBorderColor = TextFieldColorsBorder,
                focusedBorderColor = TextFieldColorsBorder
            ),
            placeholder = {
                Text(
                    text = "Можете оставить свои пожелания",
                    color = Color.Gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .size(335.dp,157.dp)
        )
        Spacer(modifier=modifier.height(143.dp))

        Text(
            text = "Промокод",
            textAlign = TextAlign.Left,
            fontSize = 14.sp,
            color = ColorTextPromo,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    end = 221.dp
                ),
            lineHeight = 20.sp
        )

        Spacer(modifier=modifier.height(15.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = { Log.d("MyLog", "Введенный email: $AddressText")
                        navigateToOrder()},
            enabled = EnabledTextField,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonColors(
                AccentColorPrimaryButton,
                AccentColorDisabledButtonText,
                AccentColorDisabledButton,
                AccentColorDisabledButton
            ),
        ) {
            Text(
                text = "Заказать",
                color = Color.White,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview
@Composable
private fun OrderPrev() {
   Order(back = {}, navigateToOrder = {})
}