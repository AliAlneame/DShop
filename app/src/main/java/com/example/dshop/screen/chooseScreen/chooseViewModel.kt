package com.example.dshop.screen.chooseScreen

import com.example.dshop.BaseViewModel
import com.example.dshop.screen.detailsScreen.DetailsUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class chooseViewModel  @Inject constructor() : BaseViewModel<chooseUIState>(chooseUIState()) {}