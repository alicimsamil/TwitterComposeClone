package com.alicimsamil.twittercomposeclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(

    primary = TwitterBlue,
    primaryVariant = TwitterBlueVariant,
    secondary = TwitterLightGray,
    background = TwitterBlack,
    surface = TwitterBlack,
    onPrimary = TwitterWhite,
    onSecondary = TwitterDarkGray,
    onBackground = TwitterWhite,
    onSurface = TwitterWhite

)

private val LightColorPalette = lightColors(

    primary = TwitterBlue,
    primaryVariant = TwitterBlueVariant,
    secondary = TwitterLightGray,
    background = TwitterWhite,
    surface = TwitterWhite,
    onPrimary = TwitterWhite,
    onSecondary = TwitterDarkGray,
    onBackground = TwitterBlack,
    onSurface = TwitterBlack

)

@Composable
fun TwitterComposeCloneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}