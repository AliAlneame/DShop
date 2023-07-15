package com.example.dshop

sealed class Screen(val route: String) {
    object HomeScreen : Screen("HomeScreen")
    object DetailsScreen : Screen("detailsScreen")
    object ChooseScreen : Screen("chooseScreen")
}