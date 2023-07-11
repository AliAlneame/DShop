package com.example.dshop.screen.detailsScreen

data class DetailsUIState(
    val imageId: Int = 0,
    val name: String = "",
    val details: String = "",
    val price: Int = 0,
    var quantity: Int = 1,
    var isFavorite: Boolean = false
)