package org.example.project.site.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.browser.window
import org.w3c.dom.events.Event

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GradientBackground(modifier: Modifier) {
    BoxWithConstraints(
        modifier = modifier.fillMaxWidth().heightIn(800.dp)
    ) {
        val density = LocalDensity.current
        val widthPx = with(density) { maxWidth.toPx() }
        val heightPx = with(density) { maxHeight.toPx() }

        val centerX = widthPx * 0.7f
        val centerY = heightPx * 0f
        val radius = widthPx * 0.52f

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color(0xFF6A2C70),
                            Color(0xFF5A2465),
                            Color(0xFF4A1A4A),
                            Color(0xFF3A123A),
                            Color(0xFF2A0A2A),
                            Color(0xFF1A0A1A),
                            Color(0xFF0D050D),
                            Color.Black
                        ),
                        center = Offset(centerX, centerY),
                        radius = radius
                    )
                )
        )
    }
}

data class ScreenSizeInfo(val hPX: Int, val wPX: Int, val hDP: Dp, val wDP: Dp)

@Composable
fun getAvailableScreenSizeInfo(): ScreenSizeInfo {
    val density = LocalDensity.current

    // Get screen dimensions in pixels from the browser window
    val widthPx = window.innerWidth
    val heightPx = window.innerHeight

    // Convert pixels to DP using the current density
    val widthDp = with(density) { widthPx.dp }
    val heightDp = with(density) { heightPx.dp }

    return ScreenSizeInfo(
        hPX = heightPx,
        wPX = widthPx,
        hDP = heightDp,
        wDP = widthDp
    )
}