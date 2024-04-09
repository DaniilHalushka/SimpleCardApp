package com.daniil.halushka.simplecard.presentation.screen.elements.topBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daniil.halushka.simplecard.R

@Composable
fun CustomTopBar(
    title: String,
//    isNavigationExist: Boolean,
//    clickOnNavigationItem: () -> Unit = {}
) {
    val primaryColor = MaterialTheme.colorScheme.primary
    val contentColor = MaterialTheme.colorScheme.onPrimary

    val osvaldFontFamily = FontFamily(Font(R.font.oswald_light, FontWeight.Normal))

    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Box(
            modifier = Modifier
                .background(primaryColor),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .scale(0.6f),
                alignment = Alignment.Center,
                painter = painterResource(id = R.drawable.top_bar_image),
                contentDescription = stringResource(id = R.string.top_bar_image_description),
            )
            Text(
                text = stringResource(R.string.top_bar_logo_text),
                textAlign = TextAlign.Center,
                fontFamily = osvaldFontFamily,
                fontSize = 28.sp,
                color = contentColor,
            )
        }
        Box(
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(16.dp),
                )
        ) {
            TitleTopBar(title = title)
        }
    }
}