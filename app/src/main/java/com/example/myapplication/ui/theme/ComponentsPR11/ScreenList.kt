package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScreenList(modifier: Modifier = Modifier) {
    var listCat = listOf("Популярные","Covid","Комплексные", "Избранные")


    val product  = listOf(
        Product("ПЦР-тест на определение РНК коронавируса стандартный",2,1800),
        Product("Клинический анализ крови с лейкоцитарной формулой",1,690),
        Product("Биохимический анализ крови, базовый",1,2440),
        Product("СОЭ (венозная кровь)",1,240)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                horizontal = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row(){
            CategoryList(categories=listCat)
        }
        Spacer(modifier= Modifier.height(24.dp))
        Column() {
            ListCard(listCard=product)
        }
    }




}

@Preview
@Composable
private fun ScreenListPrev() {
    ScreenList()
}