package com.daniil.halushka.simplecard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.daniil.halushka.simplecard.presentation.navigation.NavigationGraph
import com.daniil.halushka.simplecard.presentation.navigation.ScreenRoutes
import com.daniil.halushka.simplecard.presentation.screen.elements.bottomBar.CustomBottomBar
import com.daniil.halushka.simplecard.ui.theme.SimpleCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCardTheme {
                SimpleCardApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SimpleCardApp() {
    val navigationController = rememberNavController()
    val navigationBackStackEntry by navigationController.currentBackStackEntryAsState()
    val screenRouteNavigation = navigationBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            CustomBottomBar()
        }
    ) {
        NavigationGraph(
            navController = navigationController,
            startDestination = ScreenRoutes.HomeScreen.screenType
        )
    }

}