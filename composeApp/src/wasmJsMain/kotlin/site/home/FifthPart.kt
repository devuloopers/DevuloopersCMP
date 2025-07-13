package org.example.project.site.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.afterbottleimg
import devulooperscmp.composeapp.generated.resources.beforebottleimg
import org.example.project.site.values.RockSaltRegular
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun FifthPart(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "What We Offer", color = Color.White, fontSize = 36.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Tailored solutions to bring your ideas to life.",
            color = Color(0xFFCCC5C5),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(80.dp))
        ImagePart(modifier = Modifier)
    }
}

@Composable
private fun ImagePart(modifier: Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CustomImage(
            modifier = Modifier,
            text = "Before",
            res = Res.drawable.beforebottleimg,
            overlayColor = Color(0xFFCA430D)
        )
        Spacer(Modifier.width(30.dp))
        VerticalDivider(modifier = Modifier.height(300.dp), thickness = 1.dp, color = Color.White)
        Spacer(Modifier.width(30.dp))
        CustomImage(
            modifier = Modifier,
            text = "After",
            res = Res.drawable.afterbottleimg,
            overlayColor = Color(0xFF5B2B99)
        )
    }
}

@Composable
private fun CustomImage(modifier: Modifier, text: String, res: DrawableResource, overlayColor: Color) {
    Box(
        modifier = modifier
            .width(363.dp)
            .height(270.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {
        //original image
        Image(
            painter = painterResource(resource = res), // replace with your file name
            contentDescription = "Bottle",
            modifier = Modifier.fillMaxSize()
        )

        // Colored overlay
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = overlayColor.copy(alpha = 0.5f))
        )

        Text(
            text = text,
            color = Color.White,
            fontSize = 32.sp,
            fontFamily = RockSaltRegular(),
            fontWeight = FontWeight.Normal,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}