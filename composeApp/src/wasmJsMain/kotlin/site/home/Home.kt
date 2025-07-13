package org.example.project.site.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.galleryicon
import org.example.project.site.components.FilledButton
import org.example.project.site.components.WhiteBorderTransparentButton
import org.example.project.site.values.YsabeauSC
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.verticalScroll(rememberScrollState()).background(Color.Black)) {
        GradientBackground(Modifier.fillMaxWidth().height(800.dp))
        Column(
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 100.dp)
        ) {
            //part 1
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(resource = Res.drawable.galleryicon),
                        contentDescription = "DevuloopersIcon",
                        tint = Color.White
                    )
                }
                Navigation(modifier = Modifier)
                WhiteBorderTransparentButton(
                    modifier = Modifier,
                    borderStroke = BorderStroke(width = 1.dp, color = Color.White),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(horizontal = 50.dp, vertical = 10.dp),
                    text = "Book a Call"
                ) {

                }
            }
            Spacer(Modifier.height(80.dp))
            TextPart(modifier = Modifier)
            Spacer(Modifier.height(60.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Interior &\n\nArchitecture",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = YsabeauSC()
                )
                Text(
                    text = "Interior &\n\nArchitecture",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = YsabeauSC()
                )
                Text(
                    text = "Interior &\n\nArchitecture",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = YsabeauSC()
                )
                Text(
                    text = "Interior &\n\nArchitecture",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = YsabeauSC()
                )
            }
            //part 2
            Spacer(Modifier.height(80.dp))
            SecondPart(modifier = Modifier.fillMaxWidth())
            //part3
            Spacer(Modifier.height(80.dp))
            ThirdPart(modifier = Modifier.fillMaxWidth())
            //part4
            Spacer(Modifier.height(80.dp))
            FourthPart(modifier = Modifier.fillMaxWidth())
            //part5
            Spacer(Modifier.height(80.dp))
            FifthPart(modifier = Modifier.fillMaxWidth())
            //part6
            Spacer(Modifier.height(80.dp))
            SixthPart(modifier = Modifier.fillMaxWidth())
            //part7
            Spacer(Modifier.height(80.dp))
            SeventhPart(modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally))
        }
    }
}

@Composable
fun Navigation(modifier: Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Services", color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Projects", color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "About", color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Contact", color = Color.White)
    }
}

@Composable
fun TextPart(modifier: Modifier) {
    Column(
        modifier = modifier,
    ) {
        Text(text = "Transforming Ideas", fontSize = 64.sp, color = Color.White)
        Text(text = "Into Reality within your Budget", fontSize = 64.sp, color = Color.White)
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Struggling to hire the right team? or finding agencies too costly?",
            fontSize = 20.sp,
            color = Color.White
        )
        Text(
            text = "We bring your idea to life, professionally, quickly, and affordably...",
            fontSize = 20.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))
        FilledButton(
            modifier = Modifier,
            text = "Explore services",
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(horizontal = 40.dp, vertical = 10.dp),
        ) {

        }
    }
}

