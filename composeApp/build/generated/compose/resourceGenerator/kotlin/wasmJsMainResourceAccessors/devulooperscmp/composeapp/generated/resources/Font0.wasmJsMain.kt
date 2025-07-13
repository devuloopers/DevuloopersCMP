@file:OptIn(InternalResourceApi::class)

package devulooperscmp.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/devulooperscmp.composeapp.generated.resources/"

internal val Res.font.Nosifer_Regular: FontResource by lazy {
      FontResource("font:Nosifer_Regular", setOf(
        ResourceItem(setOf(), "${MD}font/Nosifer-Regular.ttf", -1, -1),
      ))
    }

internal val Res.font.RockSalt_Regular: FontResource by lazy {
      FontResource("font:RockSalt_Regular", setOf(
        ResourceItem(setOf(), "${MD}font/RockSalt-Regular.ttf", -1, -1),
      ))
    }

internal val Res.font.YsabeauSC_ExtraBold: FontResource by lazy {
      FontResource("font:YsabeauSC_ExtraBold", setOf(
        ResourceItem(setOf(), "${MD}font/YsabeauSC-ExtraBold.ttf", -1, -1),
      ))
    }

internal val Res.font.test: FontResource by lazy {
      FontResource("font:test", setOf(
        ResourceItem(setOf(), "${MD}font/test", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectWasmJsMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("Nosifer_Regular", Res.font.Nosifer_Regular)
  map.put("RockSalt_Regular", Res.font.RockSalt_Regular)
  map.put("YsabeauSC_ExtraBold", Res.font.YsabeauSC_ExtraBold)
  map.put("test", Res.font.test)
}
