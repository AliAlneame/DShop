package com.example.dshop.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dshop.Greeting
import com.example.dshop.R
import com.example.dshop.ui.theme.DShopTheme
import com.example.dshop.ui.theme.Pink

@Composable
fun OnBoardingHomeScreen() {


}

@Composable
fun OnBoardingHomeScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink)
    ) {
        Image(
            painter = painterResource(id = R.drawable.dount),
            contentDescription = "Dount",
            modifier = Modifier
                .fillMaxHeight(0.6f)
                .fillMaxWidth(1.5f),
            contentScale = ContentScale.FillHeight

            )

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp),
                    text = "Gounts\nWith\nDonuts"
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp),
                    text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                    color = Color.White
                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 40.dp, start = 40.dp, bottom = 46.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    onClick = { /* Handle onClick here*/ }
                ) {
                    Text(
                        text = "Get Start",
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun onBordingScreenPreview() {
    DShopTheme {
        OnBoardingHomeScreenContent()
    }
}