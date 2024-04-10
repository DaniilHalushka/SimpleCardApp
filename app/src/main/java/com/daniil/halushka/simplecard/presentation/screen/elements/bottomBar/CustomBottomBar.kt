package com.daniil.halushka.simplecard.presentation.screen.elements.bottomBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.daniil.halushka.simplecard.R

@Composable
fun CustomBottomBar() {
    val backgroundColor = MaterialTheme.colorScheme.background

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor),
            verticalAlignment = Alignment.Bottom
        ) {
            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                painter = painterResource(id = R.drawable.ic_inactive_settings),
                contentDescription = stringResource(id = R.string.bottom_bar_settings_image_description)
            )

            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                painter = painterResource(id = R.drawable.ic_inactive_expenses),
                contentDescription = stringResource(id = R.string.bottom_bar_settings_image_description)
            )

            Box(
                modifier = Modifier
                    .weight(1.1f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_active_home_screen),
                    contentDescription = stringResource(id = R.string.bottom_bar_settings_image_description),
                )
            }

            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                painter = painterResource(id = R.drawable.ic_inactive_moodboard),
                contentDescription = stringResource(id = R.string.bottom_bar_settings_image_description)
            )

            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                painter = painterResource(id = R.drawable.ic_active_location),
                contentDescription = stringResource(id = R.string.bottom_bar_settings_image_description)
            )
        }
    }
}