package org.example.project.site

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*

import org.example.project.site.home.HomeScreen

@Composable
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}