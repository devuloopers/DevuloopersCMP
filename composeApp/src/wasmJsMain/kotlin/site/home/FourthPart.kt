package org.example.project.site.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.fireicon
import devulooperscmp.composeapp.generated.resources.rocketicon
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun FourthPart(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Why 4-8 Weeks?", color = Color.White, fontSize = 36.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Launch Your Product or Idea in Just 4 to 6 Weeks",
            color = Color(0xFFCCC5C5),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            modifier = Modifier.fillMaxWidth(0.9f),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextContent(
                modifier = Modifier.weight(1f),
                headText = "4-6 weeks isn't just fast—it’s strategic.",
                textDesc = "We don’t just rush through the process; we’ve perfected a framework that delivers exceptional results within this timeline. It’s been tried and tested by industry leaders, ensuring you get a polished product without unnecessary delays.",
                icon = Res.drawable.rocketicon
            )
            Spacer(Modifier.fillMaxWidth(0.15f))
            TextContent(
                modifier = Modifier.weight(1f),
                headText = "Why 4-6 Weeks Works for Us.",
                textDesc = "Through experience, we’ve discovered that 4-6 weeks is the perfect balance between speed and quality. It’s enough time to build a well-designed, functional product while staying agile and responsive to your needs.",
                icon = Res.drawable.fireicon
            )
        }
    }
}

@Composable
private fun TextContent(modifier: Modifier, headText: String, textDesc: String, icon: DrawableResource) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = headText,
            color = Color.White,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = textDesc,
            color = Color(0xFFCCC5C5),
            fontFamily = FontFamily.Default,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(15.dp))
        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(resource = icon),
            contentDescription = "Emojis",
        )
    }
}