package com.example.myapplication.ui.theme.ComponentsPR06

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.LatoFontFamily
import com.example.myapplication.ui.theme.TextColor2
import com.example.myapplication.ui.theme.TextColorGroup3
import com.example.myapplication.ui.theme.TextColorGroup3_text

//1 функция
//и 5 параметров
//для демонтрации  вызвать функцию с разными параметрами
@Composable
fun Onboard1(
    modifier: Modifier = Modifier,
    textUp: String,
    textCenterTitle:String,
    textCenter:String,
    imageTopResId: Int,
    imageBottomResId: Int )
{
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(
                horizontal = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = textUp,
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 0.dp,
                    end = 243.dp,
                    top = 49.dp,
                    bottom = 739.dp),
            fontSize = 20.sp,
            fontFamily = LatoFontFamily,
            color = TextColor2,

            lineHeight = 20.sp,
            textAlign = TextAlign.Left
        )}
    Image(
        modifier = modifier
            .padding(
                start = 208.dp,
                end = 0.dp,
                top = 49.dp,
                bottom = 599.89.dp
            ),
        painter = painterResource(id = R.drawable.shape),
        contentDescription = "Top image"
    )
    Spacer(modifier = modifier.height(60.89.dp))
    Text(
        text = textCenterTitle,
        fontSize = 20.sp,
        fontFamily = LatoFontFamily,
        color = TextColorGroup3,
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(
                start = 73.dp,
                end = 88.dp,
                top = 273.dp,
                bottom = 466.dp
            )
            .width(83.dp)
            .height(24.dp),
        lineHeight = 20.sp
    )
    Spacer(modifier = modifier.height(29.dp))
    Text(
        text = textCenter,
        fontSize = 14.sp,
        fontFamily = LatoFontFamily,
        color = TextColorGroup3_text,
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(
                start = 73.dp,
                end = 88.dp,
                top = 329.dp,
                bottom = 466.dp
            )
            .width(214.dp)
            .height(20.dp),
        lineHeight = 20.sp
    )

    Image(
        modifier = modifier
            .padding(
                start = 159.dp,
                end = 158.dp,
                top = 406.dp,
                bottom = 391.71.dp
            ),
        painter = painterResource(id = imageTopResId),
        contentDescription = "Bottom  image"
    )
    Image(
        modifier = modifier
            .padding(
                start = 9.dp,
                end = 7.dp,
                top = 489.dp,
                bottom = 54.dp
            )
            .size(359.dp, 269.dp),
        painter = painterResource(id = imageBottomResId),
        contentDescription = "illustration image"
    )
}

@Preview
@Composable
private fun Onboard1Prev1() {
    Onboard1(
        textUp="Далее",
        textCenterTitle="Анализы",
        textCenter="Экспресс сбор и получение проб",
        imageTopResId = R.drawable.group_2,
        imageBottomResId = R.drawable.illustration)
}


@Preview
@Composable
private fun Onboard1Prev2() {
    Onboard1(
        textUp = "Далее",
        textCenterTitle = "Уведомления",
        textCenter = "Вы быстро узнаете о результатах",
        imageTopResId = R.drawable.image5,
        imageBottomResId = R.drawable.__2022_09_17__19_21_1
    )
}

@Preview(showBackground = true, name = "Onboard Screen 3")
@Composable
private fun Onboard1Prev3() {
    Onboard1(
        textUp = "Завершить",
        textCenterTitle = "Мониторинг",
        textCenter = "Наши врачи всегда наблюдают за вашими показателями здоровья",
        imageTopResId = R.drawable.group,
        imageBottomResId = R.drawable._30_1)
}