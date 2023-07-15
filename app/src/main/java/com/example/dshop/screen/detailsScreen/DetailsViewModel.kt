package com.example.dshop.screen.detailsScreen

import android.util.Log
import com.example.dshop.BaseViewModel
import com.example.dshop.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : BaseViewModel<DetailsUIState>(DetailsUIState()) {

    init {
        _state.update {
            it.copy(
                imageId = R.drawable.baseline_arrow_back_ios_new_24,
                name = "strawberry_wheel",
                details = "about_gonut",
                price = 5,
                quantity = 1,
                isFavorite = false
            )
        }
    }

    fun increaseQuantity() {
        Log.d("alllllllli","it")
        _state.update { currentState ->
            currentState.copy(quantity = currentState.quantity + 1, price = (currentState.price + 5) )
        }
    }

    fun decreaseQuantity() {
        _state.update { currentState ->
            if (currentState.quantity > 1) {
                currentState.copy(quantity = currentState.quantity - 1, price = (currentState.price - 5) )
            } else currentState
        }
    }

    fun toggleFavorite() {
        _state.update { currentState ->
            currentState.copy(isFavorite = !currentState.isFavorite)
        }
    }
}