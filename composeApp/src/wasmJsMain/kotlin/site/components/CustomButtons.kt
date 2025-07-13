package org.example.project.site.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun WhiteBorderTransparentButton(
    modifier: Modifier,
    text: String,
    shape: Shape = RoundedCornerShape(8.dp),
    borderStroke: BorderStroke = BorderStroke(width = 2.dp, color = Color.White),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    onClick: () -> Unit,
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        border = borderStroke,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Color.White,
        ),
        contentPadding = contentPadding
    ) {
        Text(text = text)
    }
}

@Composable
fun FilledButton(
    modifier: Modifier,
    text: String,
    shape: Shape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color(0xFF8014D2),
            contentColor = Color.White,
        ),
        contentPadding = contentPadding
    ) {
        Text(text = text)
    }
}