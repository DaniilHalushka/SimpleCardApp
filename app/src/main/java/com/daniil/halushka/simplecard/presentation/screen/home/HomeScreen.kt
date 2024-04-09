package com.daniil.halushka.simplecard.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.daniil.halushka.simplecard.R
import com.daniil.halushka.simplecard.presentation.screen.elements.topBar.CustomTopBar

@Composable
fun HomeScreen(
//    navigationController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomTopBar(title = R.string.top_bar_location_text.toString())
    }
}