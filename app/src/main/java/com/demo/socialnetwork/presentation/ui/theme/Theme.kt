package com.demo.socialnetwork.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Green,
    primaryVariant = DarkGray,
    onBackground = TextWhite,
    onPrimary = DarkGray
)

@Composable
fun SocialNetworkTheme(
    content: @Composable() () -> Unit
) {

    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}