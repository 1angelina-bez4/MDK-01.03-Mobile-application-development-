package com.example.myapplication.ui.theme.ComponentsPR10

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.ColorItemIconMenuFoc
import com.example.myapplication.ui.theme.ColorItemIconMenuUnFoc
import com.example.myapplication.ui.theme.ColorItemTextIcontextMenuFoc
import com.example.myapplication.ui.theme.ColorItemTextIcontextMenuUnFoc
import com.example.myapplication.ui.theme.MyTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ColorFilter
import kotlin.collections.mutableSetOf

data class  BarItem(
    val index: Int,
    val icon: Int,
    val title: String
)

@Composable
fun Menu(modifier: Modifier = Modifier) {
    var selItem by remember { mutableStateOf(-1) }

    var ItemList = listOf(
        BarItem(0,R.drawable.tests,"Анализы" ),
        BarItem(1,R.drawable.result,"Результаты" ),
        BarItem(2,R.drawable.massage,"Поддержка" ),
        BarItem(3,R.drawable.profille,"Профиль" ),
    )


    NavigationBar(
        containerColor = MyTheme.colors.white
    ) {
        for (itemNavBar in ItemList) {
            NavigationBarItem(
                selected = itemNavBar.index == selItem,
                onClick = { selItem = itemNavBar.index},

                icon = {
                    Image(
                        imageVector = ImageVector.vectorResource(itemNavBar.icon),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(
                            //если иконка нажата, ставит цвет синий ( в фокусе)
                            if (  itemNavBar.index == selItem)
                                ColorItemIconMenuFoc
                            //иначе   меняет цвет на серый
                            else ColorItemIconMenuUnFoc
                        )
                    )
                },
                label = {
                    Text(
                        text = itemNavBar.title,
                    )
                },
                //меняет цвет текста
                colors = NavigationBarItemDefaults.colors(
                    unselectedTextColor = ColorItemTextIcontextMenuUnFoc,
                    selectedTextColor = ColorItemTextIcontextMenuFoc,
                    indicatorColor = Color.Transparent
                )

            )
        }
    }
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}