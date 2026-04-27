package com.example.myapplication.ui.theme.ComponentsPR10

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import kotlin.collections.mutableSetOf

//Класс содержащий объекты иконки
data class  Item(
    private val Index: Int,
    private val Icon: Int,
    private val title: String
)
@Composable
fun Menu(modifier: Modifier = Modifier) {

   // var selItem by remember { mutableSetOf("") }

    var ItemList = listOf(
        Item(0,R.drawable.tests,"Анализы" ),
        Item(1,R.drawable.doc,"Результаты" ),
        Item(2,R.drawable.massage,"Поддержка" ),
        Item(3,R.drawable.user,"Профиль" ),
    )
    NavigationBar(
        modifier = modifier
            .background(MyTheme.colors.white)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.tests),
                    contentDescription = null,
                )
            },
            label = {
                Text(
                    text = "Анализы",
                )
            },
            //поменять местами отображение
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = ColorItemIconMenuUnFoc,
                unselectedTextColor = ColorItemTextIcontextMenuUnFoc,
                selectedIconColor = ColorItemIconMenuFoc,
                selectedTextColor = ColorItemTextIcontextMenuFoc,
                indicatorColor = Color.Transparent
            )


        )
    }
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}