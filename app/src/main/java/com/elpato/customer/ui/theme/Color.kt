package com.elpato.customer.ui.theme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple900 = Color(0xFF1A0033); val Purple800 = Color(0xFF2D0066); val Purple700 = Color(0xFF400099)
val Purple600 = Color(0xFF5300CC); val Purple500 = Color(0xFF6600FF); val Purple400 = Color(0xFF8033FF)
val Purple300 = Color(0xFF9966FF); val Purple200 = Color(0xFFB399FF); val Purple100 = Color(0xFFCCCCFF)
val Purple50  = Color(0xFFE6E6FF)
val Yellow500 = Color(0xFFFFC107); val Yellow400 = Color(0xFFFFD54F); val Yellow600 = Color(0xFFFFA000)
val White = Color.White; val Black = Color.Black; val Grey50 = Color(0xFFF5F5F5); val Grey100 = Color(0xFFEEEEEE)
val Grey200 = Color(0xFFE0E0E0); val Grey300 = Color(0xFFBDBDBD); val Grey500 = Color(0xFF9E9E9E)
val Grey700 = Color(0xFF616161); val Grey900 = Color(0xFF212121)
val SuccessGreen = Color(0xFF2E7D32); val ErrorRed = Color(0xFFC62828)

private val LightColorScheme = ColorScheme(primary = Purple600, onPrimary = White, primaryContainer = Purple100, onPrimaryContainer = Purple900, secondary = Yellow500, onSecondary = Black, secondaryContainer = Yellow500.copy(alpha = 0.1f), onSecondaryContainer = Grey900, surface = White, onSurface = Grey900, outline = Grey300, error = ErrorRed)

@Composable fun ElPatoTheme(darkTheme: Boolean = false, content: @Composable () -> Unit) { MaterialTheme(colorScheme = LightColorScheme, typography = Typography, shapes = Shapes, content = content) }

object Gradients {
    val PrimaryToWhite = Brush.verticalGradient(0f to Purple600, 0.3f to Purple400, 0.6f to Purple100, 1f to White)
    val AppBar = Brush.horizontalGradient(Purple700, Purple600, Purple500)
    val Card = Brush.verticalGradient(0f to White, 1f to Purple50)
    val YellowAccent = Brush.horizontalGradient(Yellow600, Yellow500, Yellow400)
}

val Typography = androidx.compose.material3.Typography(
    displayLarge = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, fontSize = 57.sp),
    headlineLarge = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, fontSize = 32.sp),
    titleLarge = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold, fontSize = 22.sp),
    bodyLarge = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Normal, fontSize = 16.sp),
    labelLarge = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold, fontSize = 14.sp)
)

val Shapes = androidx.compose.material3.Shapes(
    small = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
    medium = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
    large = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    extraLarge = androidx.compose.foundation.shape.RoundedCornerShape(24.dp)
)
