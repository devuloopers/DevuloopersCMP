package org.example.project.site.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.brainicon
import devulooperscmp.composeapp.generated.resources.puzzleicon
import devulooperscmp.composeapp.generated.resources.timeicon
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun SecondPart(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Build Fast & Validate your Idea",
            fontWeight = FontWeight.Normal,
            fontSize = 36.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.fillMaxWidth(0.7f),
            text = HomeTextContents.TEXT1,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            CardStyle(
                modifier = Modifier.weight(1f),
                res = Res.drawable.brainicon,
                cardHeadText = "Expert Team",
                cardDescText = "Our skilled professionals specialize in everything from UI/UX design and development to architectural rendering, ensuring top-tier results."
            )
            CardStyle(
                modifier = Modifier.weight(1f),
                res = Res.drawable.puzzleicon,
                cardHeadText = "End-to-End-Solutions",
                cardDescText = "We handle every stage of your project — from ideation to execution — delivering innovative, scalable, and impactful solutions"
            )
            CardStyle(
                modifier = Modifier.weight(1f),
                res = Res.drawable.timeicon,
                cardHeadText = "Affordable & Timely Delivery",
                cardDescText = "Get high-quality results without breaking the bank. We deliver on time, every time, so you can launch with confidence."
            )
        }
    }
}

@Composable
private fun CardStyle(modifier: Modifier, res: DrawableResource, cardHeadText: String, cardDescText: String) {
    val colors = listOf(Color(0xFFEB91E5), Color(0xFF9747FF))
    val shape = RoundedCornerShape(20.dp)
    Box(
        modifier = modifier
            .clip(shape = shape)
            .border(
                width = 1.dp,
                brush = Brush.verticalGradient(colors = colors),
                shape = shape
            )
            .padding(50.dp),
    ) {
        Column(modifier = Modifier) {
            Image(
                modifier = Modifier.size(45.dp).clip(shape = CircleShape).background(color = Color(0xFF373535))
                    .padding(10.dp),
                painter = painterResource(resource = res),
                colorFilter = ColorFilter.tint(color = Color.White),
                contentDescription = "CardIcon"
            )
            Spacer(Modifier.height(10.dp))
            Text(
                text = cardHeadText,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Start
            )
            Spacer(Modifier.height(10.dp))
            Text(
                text = cardDescText,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = Color(0xFFCCC5C5),
                textAlign = TextAlign.Start
            )
        }
    }
}