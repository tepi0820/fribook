package jp.co.tepi.fribook.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = PRIMARY_COLOR,
    primaryVariant = PRIMARY_DARK_COLOR,
    secondary = SECONDARY_COLOR,
    secondaryVariant = SECONDARY_DARK_COLOR
)

private val LightColorPalette = lightColors(
    primary = PRIMARY_LIGHT_COLOR,
    primaryVariant = PRIMARY_DARK_COLOR,
    secondary = SECONDARY_LIGHT_COLOR,
    secondaryVariant = SECONDARY_DARK_COLOR
)

@Composable
fun FriendsChildNameTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
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