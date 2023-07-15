package com.example.dshop

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dshop.screen.OnBoardingHomeScreen
import com.example.dshop.screen.chooseScreen.chooseScreen
import com.example.dshop.screen.detailsScreen.DetailsContent
import com.example.dshop.screen.detailsScreen.detailsScreen

@Composable
fun DshopNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) { OnBoardingHomeScreen(navController) }
        composable(Screen.DetailsScreen.route) { detailsScreen(navController) }
        composable(Screen.ChooseScreen.route) { chooseScreen(navController) }


    }
}





