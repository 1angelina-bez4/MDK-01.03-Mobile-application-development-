package com.example.myapplication.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


//Для  PR04

val AccentColor = Color(0xFF00FF1E)
val AccentColorGray = Color(0xFF939396)
val AccentColorTextBlue = Color(0xFF57A9FF)

val AccentColorButtonText = Color(0xFFFFFFFF)
val AccentColorPrimaryButton = Color(0xFF1A6FEE)

val AccentColorDisabledButtonText = Color(0xFFFFFFFF)
val  AccentColorDisabledButton = Color(0xFFC9D4FB)

val AccentColorSecondaryButtonText = Color(0xFF1A6FEE)
val AccentColorSecondaryButton = Color(0xFF1A6FEE)

val AccentColorTextInputunfoc = Color(0xFFF5F5F9)
val AccentColorTextInputBorderunfoc = Color(0xFFEBEBEB)
val AccentColorTextInputTextunfoc = Color(0xFF00000080)

val AccentColorTextInputfoc = Color(0xFFF5F5F9)
val AccentColorTextInputBorderfoc  = Color(0xFFB8C1CC)
val AccentColorTextInputTextfoc = Color(0xFF000000)

//Для PR05

val TextFieldColors = Color(0xFFF5F5F9)
val TextFieldColorsBorder = Color(0xFFEBEBEB)

val TextColor = Color(0xFF7E7E9A)
val ButtonColor = Color(0xFF1A6FEE)
val ButtonColorContent = Color(0xFFC9D4FB)

val ColorTextBottom = Color(0xFF939396)
val ColorBottomBorder = Color(0xFF1A6FEE)

//Для PR06
val TextColor2 = Color(0xFF57A9FF)
val TextColorGroup3 = Color(0xFF00B712)
val TextColorGroup3_text = Color(0xFF939396)

//Для PR07

data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val blacktext1: Color,
    val blacktext2: Color,
    val gray1: Color,
    val gray2: Color,
    val white: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        blacktext1 = Color.Unspecified,
        blacktext2 = Color.Unspecified,
        gray1 = Color.Unspecified,
        gray2 = Color.Unspecified,
        white = Color.Unspecified
    )
}