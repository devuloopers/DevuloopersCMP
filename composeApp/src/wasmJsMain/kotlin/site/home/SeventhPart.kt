package org.example.project.site.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.mobileui
import org.jetbrains.compose.resources.painterResource

@Composable
fun SeventhPart(modifier: Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "UI / UX & Graphics Designing",
            color = Color.White,
            fontSize = 36.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(80.dp))
        TextAndPhoneLayout(modifier = Modifier)
    }
}

@Composable
private fun TextAndPhoneLayout(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Description text positioned to the right
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(0.45f)) // Space for mobile image
                Text(
                    modifier = Modifier.weight(0.35f),
                    text = "Design is not just how it looks, but how it works. We ensure every click feels right and every visual tells your brand's story.",
                    color = Color(0xFFCCC5C5),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.weight(0.2f))
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Purple rounded section with services
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color(0xFFA08EC6),
                        shape = RoundedCornerShape(40.dp)
                    )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.weight(0.3f))
                    Row(modifier = Modifier.weight(0.7f)) {
                        RoundedBoxText(
                            modifier = Modifier.widthIn(min = 150.dp, max = 240.dp),
                            headText = "UI/UX Design Services",
                            bulletStrings = listOf(
                                "User Research & Strategy.",
                                "Wireframing & Interactive Prototypes.",
                                "Pixel-Perfect, Mobile-First Designs."
                            )
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        RoundedBoxText(
                            modifier = Modifier.widthIn(min = 150.dp, max = 240.dp),
                            headText = "Graphics Design Services",
                            bulletStrings = listOf(
                                "Brand Identity & Logo Creation.",
                                "Marketing Collaterals (Brochures, Flyers, Banners).",
                                "Custom Graphics & Motion Animations."
                            )
                        )
                    }
                }
            }
        }
        // Mobile image
        Image(
            modifier = Modifier
                .width(240.dp)
                .aspectRatio(9 / 16f)
                .padding(start = 20.dp)
                .align(Alignment.TopStart),
            painter = painterResource(resource = Res.drawable.mobileui),
            contentDescription = "MobileUI",
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
private fun RoundedBoxText(modifier: Modifier, headText: String, bulletStrings: List<String>) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = headText,
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        BulletList(items = bulletStrings)
    }
}

@Composable
private fun BulletList(
    items: List<String>,
    bullet: String = "•",
    bulletIndent: Float = 20f
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items.forEach { item ->
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = ParagraphStyle(
                            textIndent = TextIndent(restLine = bulletIndent.sp)
                        )
                    ) {
                        append("$bullet ")
                        append(item)
                    }
                },
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}