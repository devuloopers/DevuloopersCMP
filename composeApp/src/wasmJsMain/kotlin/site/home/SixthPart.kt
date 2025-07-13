package org.example.project.site.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.site.values.NosiferCaps

@Composable
fun SixthPart(modifier: Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        GradientText()
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "From Vision to Reality", color = Color.White, fontSize = 24.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "We help transform your product ideas into functional and aesthetically appealing solutions, taking care of everything from concept creation to prototyping.",
            color = Color(0xFFCCC5C5),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            BulletPointText(
                modifier = Modifier,
                text = "Product concept ideation"
            )
            Spacer(modifier = Modifier.width(20.dp))
            BulletPointText(
                modifier = Modifier,
                text = "3D prototyping"
            )
            Spacer(modifier = Modifier.width(20.dp))
            BulletPointText(
                modifier = Modifier,
                text = "Design validation and user feedback"
            )
        }
    }
}

@Composable
private fun GradientText() {
    var textSize by remember { mutableStateOf(IntSize.Zero) }
    val gradientBrush = Brush.linearGradient(
        0.0f to Color(0xFF8014D2),
        0.8f to Color(0xFF9A1C2C),
        1.0f to Color(0xFFEB91E5),
        start = Offset(0f, 0f),
        end = Offset(textSize.width.toFloat() * 0.77f, 0f)
    )

    Text(
        modifier = Modifier.onGloballyPositioned {
            textSize = it.size
        },
        text = "PRODUCT DESIGN",
        fontFamily = NosiferCaps(),
        fontSize = 86.sp,
        style = TextStyle(
            brush = gradientBrush
        )
    )
}

@Composable
private fun BulletPointText(modifier: Modifier, text: String) {
    Text(
        modifier = modifier,
        text = "• $text",
        color = Color.White,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
}