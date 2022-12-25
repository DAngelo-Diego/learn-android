package com.example.learnandroid.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val lightBackgroundUp = Color(0xFFFFFFFF)
val lightBackgroundDown = Color(0xFFFFFFFF)

val darkBackgroundUp = Color(0xFF514646)
val darkBackgroundDown = Color(0xFF4B4141)

val splashFromDark = Color(0xFFFFFFFF)
val splashFromLight = Color(0xFF7A7979)

val splashFromDarkBtn = Color(0xFF7A7D85)
val splashFromLightBtn = Color(0xFFC4C4C4)

val splashFromTwiDark = Color(0xFFEEB14F)
val splashFromTwiLight = Color(0xFF6C63FF)

val titleOnLight = Color(0xFF637DFF)
val titleOnDark = Color(0xFFEEB14F)

val descriptionOnLightColor = Color(0xFF5F5F5F)
val descriptionOnDarkColor = Color(0xFFD7D7D7)

val Colors.welcomeScreenColor
    get() = if(isLight) lightBackgroundUp else darkBackgroundUp

val Colors.titleWelcomeColor
get() = if (isLight) titleOnLight else titleOnDark

val Colors.descriptionWelcomeColor
get() = if (isLight) descriptionOnLightColor else descriptionOnDarkColor

val Colors.activeColors
get() = if (isLight) titleOnLight else titleOnDark

val Colors.desactivedColor
get() = if (isLight) splashFromLightBtn else splashFromDarkBtn

val Colors.buttonColor
get() = if (isLight) titleOnLight else titleOnDark

val Colors.twiColor
get() = if (isLight) splashFromTwiLight else splashFromTwiDark
