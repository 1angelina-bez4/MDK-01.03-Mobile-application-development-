package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.layout.Spacer
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
import com.example.myapplication.ui.theme.ComponentsPR04.DisabledButton

@Composable
fun ListCard(modifier: Modifier = Modifier,
             listCard: List<Product>) {

    LazyColumn()
    {
        items(listCard)
        {listCard ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                Title = listCard.Title,
                Day = listCard.Day,
                Summa = listCard.Summa,
                )
            DisabledButton(
                modifier=modifier
                    .width(96.dp)
                    .height(40.dp)
                    .padding(
                    ),


                butttonText = "Добавить",
                onClick = {},
                enabled = true,
                textSize = 14
            )
        }

    }
}

@Preview
@Composable
private fun ListCardPrev() {
    ListCard(listCard= listOf())
}