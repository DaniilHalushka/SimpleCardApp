package com.daniil.halushka.simplecard.presentation.navigation

import com.daniil.halushka.simplecard.R

sealed class ScreenRoutes(
    val screenType: String,
    val activeIcon: Int? = null,
    val inactiveIcon: Int? = null
    ){
    data object HomeScreen : ScreenRoutes(
        screenType = "Home",
        activeIcon = R.drawable.ic_active_home_screen,
        inactiveIcon = R.drawable.ic_inactive_home_screen
    )

    data object PhotoScreen : ScreenRoutes(
        screenType = "Photo"
    )
}
