package com.daniil.halushka.simplecard.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.daniil.halushka.simplecard.presentation.screen.elements.GridWithPhotos
import com.daniil.halushka.simplecard.presentation.screen.elements.topBar.CustomTopBar

@Composable
fun HomeScreen(
//    navigationController: NavController
) {
    val backgroundColor = MaterialTheme.colorScheme.onPrimary

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomTopBar(title = "Streets")
        GridWithPhotos()
    }
}