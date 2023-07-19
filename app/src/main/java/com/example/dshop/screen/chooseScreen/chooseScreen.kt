package com.example.dshop.screen.chooseScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.dshop.BottomNav
import com.example.dshop.R
import com.example.dshop.screen.detailsScreen.detailsScreen
import com.example.dshop.ui.theme.Grey
import com.example.dshop.ui.theme.Pink
import com.example.dshop.ui.theme.Red_Light
import com.example.dshop.ui.theme.Redd
import com.example.dshop.ui.theme.Typography
import com.example.dshop.ui.theme.White_Light
import com.example.dshop.ui.theme.seaBlue

@Composable
fun chooseScreen(navController: NavController, viewModel: chooseViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    chooseContent(state, viewModel,navController)

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun chooseContent(state: chooseUIState, viewModel: chooseViewModel,navController: NavController) {
    Scaffold(bottomBar = { BottomNav() }) {

            Column (modifier = Modifier
                .fillMaxSize()
                .background(White_Light)){

                Row(

                    Modifier
                        .fillMaxWidth()
                        .padding(top = 60.dp, end = 40.dp, start = 40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {


                    Text(
                        text = "Let’s Gonuts!",
                        style = Typography.titleMedium,
                        color = Redd
                    )
                        Text(
                            text = "order your favourite donuts from here",
                            style = Typography.bodySmall,
                            color = Grey
                        )
                    }

                    FirstCard(

                        icon = painterResource(id = R.drawable.baseline_search_24),
                        onClick = {},
                        cardBackGroundColor = Pink,
                        navController =  navController,
                    )
                }


                Text(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 54.dp),
                    text = "Today Offers",
                    fontSize = 20.sp
                )

                LazyRow(
                    modifier = Modifier.padding(top = 20.dp),
                    contentPadding = PaddingValues(start = 40.dp)
                )
                {
                    items(5) {

                        OffersItems(
                            navController=navController,
                            onClick = {viewModel }

                        )
                    }
                }
                Text(
                    text = "Donuts",
                    style = Typography.titleSmall,
                    modifier = Modifier.padding(start = 40.dp, top = 40.dp)
                )
                LazyRow(
                    modifier = Modifier.padding(top = 20.dp),
                    contentPadding = PaddingValues(horizontal = 40.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)

                ) {
                    items(5) {
                        DonutsItem(  navController=navController,
                            onClick = {viewModel }
                        )

                    }
                }
            }
        }

        Text(
            modifier = Modifier
                .padding(start = 36.dp, top = 46.dp),
            text = "Donuts",
            fontSize = 20.sp
        )
    }



