package org.example.project.site.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.uparrow
import org.jetbrains.compose.resources.painterResource

@Composable
fun ThirdPart(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Why Businesses Trust Devuloopers", color = Color.White, fontSize = 36.sp)
        Text(
            text = "We bring your ideas to life with efficiency, creativity, and precision. Here's what we've accomplished so far",
            color = Color.White,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(modifier = Modifier.fillMaxWidth(0.45f), horizontalArrangement = Arrangement.SpaceBetween) {
            DigitArrowText(modifier = Modifier, digit = "12", text = "Custom Projects\nDelivered")
            DigitArrowText(modifier = Modifier, digit = "40", text = "Happy Clients\nWorldwide")
            DigitArrowText(modifier = Modifier, digit = "08", text = "Industries\nServer")
        }
    }
}

@Composable
private fun DigitArrowText(modifier: Modifier, digit: String, text: String) {
    val colors = listOf(Color(0xFFEB91E5), Color(0xFF9747FF))
    Column(modifier = modifier) {
        Row {
            Text(
                text = digit,
                fontWeight = FontWeight.ExtraBold,
                style = TextStyle(brush = Brush.verticalGradient(colors = colors)),
                fontSize = 70.sp
            )
            Image(
                modifier = Modifier.size(35.dp).align(Alignment.Top),
                painter = painterResource(resource = Res.drawable.uparrow),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "UpArrow"
            )
        }
        Text(text = text, color = Color(0xFFCCC5C5), fontSize = 16.sp, textAlign = TextAlign.Center)
    }
}
