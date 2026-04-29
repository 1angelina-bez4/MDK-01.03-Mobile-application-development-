package com.example.myapplication.ui.theme.ComponentsPR11

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.RadioButtonDefaults.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ColorLazyRowButton
import com.example.myapplication.ui.theme.ColorLazyRowButtonText
import com.example.myapplication.ui.theme.ComponentsPR04.DisabledButton

@Composable
fun CategoryList(modifier: Modifier = Modifier,
        categories: List<String>) {
   LazyRow(
       horizontalArrangement = Arrangement.spacedBy(20.dp)
   )
    {
       items(categories) { category ->
           DisabledButton(
               modifier =modifier
                   .height(50.dp)
                   .width(145.dp)
                   .padding(

                   ),
               butttonText =category ,
               onClick = {},
                enabled = true,
               textSize=14
           )
       }
   }
}

@Preview
@Composable
private fun CategoryListPrev() {
    CategoryList(categories=listOf())
}