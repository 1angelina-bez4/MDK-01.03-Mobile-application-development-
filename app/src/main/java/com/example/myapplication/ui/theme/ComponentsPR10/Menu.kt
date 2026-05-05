package com.example.myapplication.ui.theme.ComponentsPR10

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.ColorItemIconMenuFoc
import com.example.myapplication.ui.theme.ColorItemIconMenuUnFoc
import com.example.myapplication.ui.theme.ColorItemTextIcontextMenuFoc
import com.example.myapplication.ui.theme.ColorItemTextIcontextMenuUnFoc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.myapplication.ui.theme.MyTheme

data class BarItem(
    val index: Int,
    val icon: Int,
    val title: String,
)

@Composable
fun Menu(
    modifier: Modifier = Modifier,
    onMenuClick: (String) -> Unit = {}  // Только колбэк
) {
    var selItem by remember { mutableStateOf(-1) }

    var ItemList = listOf(
        BarItem(0, R.drawable.tests, "Анализы"),
        BarItem(1, R.drawable.result, "Результаты"),
        BarItem(2, R.drawable.massage, "Поддержка"),
        BarItem(3, R.drawable.profille, "Профиль"),
    )

    NavigationBar(
        containerColor = MyTheme.colors.white
    ) {
        for (itemNavBar in ItemList) {
            NavigationBarItem(
                selected = itemNavBar.index == selItem,
                onClick = {
                    selItem = itemNavBar.index
                    onMenuClick(itemNavBar.title)  // Вызываем колбэк
                },
                icon = {
                    Image(
                        imageVector = ImageVector.vectorResource(itemNavBar.icon),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(
                            if (itemNavBar.index == selItem)
                                ColorItemIconMenuFoc
                            else ColorItemIconMenuUnFoc
                        )
                    )
                },
                label = {
                    Text(
                        text = itemNavBar.title,
                        fontSize = 12.sp
                    )
                },
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