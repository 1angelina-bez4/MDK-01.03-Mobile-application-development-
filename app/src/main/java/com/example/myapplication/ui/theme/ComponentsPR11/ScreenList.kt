package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Menu
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ComponentsPR10.Menu
import com.google.android.gms.analytics.ecommerce.Product

@Composable
fun ScreenList(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {}
) {
    BackHandler {
        onBack()
    }

    var listCat = listOf("Популярные", "Covid", "Комплексные", "Избранные")

    val product = listOf(
        Product("ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
        Product("Клинический анализ крови с лейкоцитарной формулой", 1, 690),
        Product("Биохимический анализ крови, базовый", 1, 2440),
        Product("СОЭ (венозная кровь)", 1, 240),
        Product("ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
        Product("Клинический анализ крови с лейкоцитарной формулой", 1, 690),
        Product("Биохимический анализ крови, базовый", 1, 2440),
        Product("СОЭ (венозная кровь)", 1, 240)
    )
    var showAnalizi by remember { mutableStateOf(false) }


        Scaffold(
            bottomBar = {
                Menu(
                    onMenuClick = { menuTitle ->
                        if (menuTitle == "Анализы") {
                            showAnalizi = true
                        }
                        else{
                                onBack()
                        }
                    }
                )
            }
        ) { contentPadding ->
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(contentPadding)
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(68.dp))
                Row {
                    CategoryList(categories = listCat)
                }
                Spacer(modifier = Modifier.height(24.dp))
                Column {
                    ListCard(listCard = product)
                }
            }
        }
    //}
}

@Preview
@Composable
private fun ScreenListPrev() {
    ScreenList()
}