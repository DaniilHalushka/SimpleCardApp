package com.daniil.halushka.simplecard.presentation.screen.elements.topBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daniil.halushka.simplecard.R

@Composable
fun TitleTopBar(
    title: String,
) {
    val backgroundColor = MaterialTheme.colorScheme.background
    val primaryColor = MaterialTheme.colorScheme.primary
    val blackColor = MaterialTheme.colorScheme.onSecondary

    val ubuntuFontFamily = FontFamily(Font(R.font.ubuntu_regular, FontWeight.Normal))

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(backgroundColor),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(primaryColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontFamily = ubuntuFontFamily,
                color = blackColor
            )
        }
    }
}