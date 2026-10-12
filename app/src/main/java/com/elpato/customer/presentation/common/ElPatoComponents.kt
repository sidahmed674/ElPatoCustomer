package com.elpato.customer.presentation.common
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elpato.customer.ui.theme.ElPatoIcons
import com.elpato.customer.ui.theme.Gradients
import com.elpato.customer.ui.theme.Purple600
import com.elpato.customer.ui.theme.White
import com.elpato.customer.ui.theme.Yellow500

@Composable fun ElPatoButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier, enabled: Boolean = true, loading: Boolean = false, icon: androidx.compose.ui.graphics.vector.ImageVector? = null, style: ButtonStyle = ButtonStyle.Primary) {
    val colors = when(style) {
        ButtonStyle.Primary -> ButtonDefaults.buttonColors(containerColor = Purple600, contentColor = White, disabledContainerColor = Purple600.copy(alpha = 0.4f))
        ButtonStyle.YellowAccent -> ButtonDefaults.buttonColors(containerColor = Yellow500, contentColor = Color.Black, disabledContainerColor = Yellow500.copy(alpha = 0.4f))
        ButtonStyle.Outline -> ButtonDefaults.outlinedButtonColors(containerColor = White, contentColor = Purple600, borderColor = Purple600)
        else -> ButtonDefaults.textButtonColors(contentColor = Purple600)
    }
    Button(onClick = onClick, modifier = modifier.fillMaxWidth().height(56.dp), enabled = enabled && !loading, colors = colors, shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            if (loading) CircularProgressIndicator(color = if(style == ButtonStyle.YellowAccent) Color.Black else White, modifier = Modifier.size(24.dp)) else {
                icon?.let { Icon(it, contentDescription = null, modifier = Modifier.size(20.dp)); Spacer(Modifier.width(8.dp)) }
                Text(text = text, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }
    }
}
enum class ButtonStyle { Primary, YellowAccent, Outline, Text }

@Composable fun ElPatoCard(modifier: Modifier = Modifier, elevation: androidx.compose.material3.CardElevation = androidx.compose.material3.CardDefaults.cardElevation(defaultElevation = 4.dp), onClick: (() -> Unit)? = null, content: @Composable () -> Unit) {
    Card(modifier = modifier.fillMaxWidth().background(Gradients.Card).then(if(onClick != null) Modifier.fillMaxWidth().clickable(onClick = onClick).combinedClickable(onClick = onClick) else Modifier), colors = CardDefaults.cardColors(containerColor = Color.Transparent), elevation = elevation, shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp), content = content)
}

@Composable fun ElPatoTopAppBar(title: String, showBack: Boolean = true, onBack: (() -> Unit)? = null, actions: @Composable RowScope.() -> Unit = {}) {
    androidx.compose.material3.TopAppBar(modifier = Modifier, title = { Text(text = title, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = White) }, navigationIcon = { if(showBack) IconButton(onClick = { onBack?.invoke() }) { Icon(ElPatoIcons.ChevronLeft, contentDescription = "Back", tint = White, modifier = Modifier.padding(8.dp)) } }, actions = actions, colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent, titleContentColor = White), scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()) {
        Box(modifier = Modifier.fillMaxWidth().height(120.dp).background(Gradients.AppBar)) {}
    }
}
