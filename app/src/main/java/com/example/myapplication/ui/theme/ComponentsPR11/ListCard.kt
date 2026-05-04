package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColorDisabledButton
import com.example.myapplication.ui.theme.AccentColorDisabledButtonText
import com.example.myapplication.ui.theme.AccentColorPrimaryButton
import com.example.myapplication.ui.theme.ColorLazyRowButton
import com.example.myapplication.ui.theme.ColorLazyRowButtonText
import com.example.myapplication.ui.theme.ComponentsPR04.DisabledButton
import com.example.myapplication.ui.theme.MyTheme

@Composable
fun ListCard(modifier: Modifier = Modifier,
             listCard: List<Product>) {

    LazyColumn(modifier = Modifier
        .fillMaxWidth(),)
    {
        items(listCard)
        {listCard ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                Title = listCard.Title,
                Day = listCard.Day,
                Summa = listCard.Summa,
                buttonWidth = 96.dp
            )

        }

    }
}

@Preview
@Composable
private fun ListCardPrev() {
    ListCard(listCard= listOf(      Product("ПЦР-тест на определение РНК коронавируса стандартный",2,1800),
        Product("Клинический анализ крови с лейкоцитарной формулой",1,690),
        Product("Биохимический анализ крови, базовый",1,2440),
        Product("СОЭ (венозная кровь)",1,240)))
}