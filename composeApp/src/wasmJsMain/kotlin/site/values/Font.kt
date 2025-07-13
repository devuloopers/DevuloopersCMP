package org.example.project.site.values

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import devulooperscmp.composeapp.generated.resources.Nosifer_Regular
import devulooperscmp.composeapp.generated.resources.Res
import devulooperscmp.composeapp.generated.resources.RockSalt_Regular
import devulooperscmp.composeapp.generated.resources.YsabeauSC_ExtraBold
import devulooperscmp.composeapp.generated.resources.test
import org.jetbrains.compose.resources.Font

@Composable
fun YsabeauSC(): FontFamily  = FontFamily(
    Font(resource = Res.font.YsabeauSC_ExtraBold, weight = FontWeight.ExtraBold)
)

@Composable
fun RockSaltRegular(): FontFamily  = FontFamily(
    Font(resource = Res.font.RockSalt_Regular, weight = FontWeight.Normal)
)

@Composable
fun NosiferCaps(): FontFamily  = FontFamily(
    Font(resource = Res.font.Nosifer_Regular, weight = FontWeight.Normal)
)