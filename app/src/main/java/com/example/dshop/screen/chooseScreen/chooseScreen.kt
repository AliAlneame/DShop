package com.example.dshop.screen.chooseScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.dshop.BottomNav
import com.example.dshop.R
import com.example.dshop.screen.detailsScreen.detailsScreen
import com.example.dshop.ui.theme.Red_Light
import com.example.dshop.ui.theme.Redd
import com.example.dshop.ui.theme.Typography
import com.example.dshop.ui.theme.seaBlue

@Composable
fun chooseScreen(
    viewModel: chooseViewModel = hiltViewModel()

) {
    val state by viewModel.state.collectAsState()
    chooseContent(state, viewModel)

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun chooseContent(state: chooseUIState, viewModel: chooseViewModel) {
    Scaffold(bottomBar = { BottomNav() }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column {

                Row(
                    Modifier.padding(start = 36.dp, top = 81.dp, end = 40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Let’s Gonuts!",
                        style = Typography.titleMedium,
                        color = Redd
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Card(
                        modifier = Modifier
                            .size(45.dp),
                        colors = CardDefaults.cardColors(Red_Light),
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(2.dp),
                        onClick = { viewModel }
                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Icon(
                                modifier = Modifier.align(Alignment.Center),
                                painter = painterResource(id = R.drawable.baseline_search_24),
                                contentDescription = "search",
                                tint = Redd
                            )
                        }
                    }
                }

                Text(
                    modifier = Modifier
                        .padding(start = 36.dp),
                    text = "Order your favourite donuts from here",
                    fontSize = 14.sp
                )

                Text(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 54.dp),
                    text = "Today Offers",
                    fontSize = 20.sp
                )

                LazyRow(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 25.dp, end = 36.dp),
                    horizontalArrangement = Arrangement.spacedBy(32.dp)
                )
                {
                    items(5) { // use your actual list size

                        Box(  modifier = Modifier
                            .size(height = 325.dp, width = 246.dp),) {
                            Card(
                                modifier = Modifier
                                    .size(height = 325.dp, width = 193.dp),
                                colors = CardDefaults.cardColors(seaBlue),
                                shape = RoundedCornerShape(12.dp),
                                elevation = CardDefaults.cardElevation(2.dp),
                                onClick = { /*viewModel logic*/ }
                            ) {
                                Box(modifier = Modifier.fillMaxSize()) {

                                    Box(
                                        modifier = Modifier
                                            .padding(start = 15.dp, top = 15.dp)
                                            .size(35.dp)
                                            .background(
                                                Color.White,
                                                RoundedCornerShape(32.dp)
                                            ),
                                    )
                                    {
                                        Icon(
                                            modifier = Modifier.align(Alignment.Center),
                                            painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                                            contentDescription = "search",
                                            tint = Redd
                                        )
                                    }
                                }
                            }
                            Image(
                                modifier = Modifier
                                    .size(237.dp)
                                    .align(Alignment.CenterEnd),


                                painter = painterResource(id = R.drawable.sdount2),
                                contentDescription = "card background",
                                contentScale = ContentScale.Crop,
                            )
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
        }
    }
}

@Preview
@Composable
fun choosePreview() {
    chooseScreen()
}
