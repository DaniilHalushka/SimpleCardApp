package com.daniil.halushka.simplecard.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.daniil.halushka.simplecard.presentation.screen.home.HomeScreen
import com.daniil.halushka.simplecard.presentation.screen.photo.PhotoScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            ScreenRoutes.HomeScreen.screenType
        ) {
            HomeScreen()
        }
        composable(
            ScreenRoutes.PhotoScreen.screenType
        ) {
            PhotoScreen()
        }
    }
}