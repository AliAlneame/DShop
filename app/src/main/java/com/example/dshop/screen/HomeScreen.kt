package com.example.dshop.screen

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dshop.Greeting
import com.example.dshop.R
import com.example.dshop.Screen
import com.example.dshop.ui.theme.DShopTheme
import com.example.dshop.ui.theme.Pink

import com.example.dshop.ui.theme.Red_Light
import com.example.dshop.ui.theme.Redd
import com.example.dshop.ui.theme.Typography

@Composable
fun OnBoardingHomeScreen(navController: NavController) {
    OnBoardingHomeScreenContent(navController)
}

@Composable
fun OnBoardingHomeScreenContent( navController: NavController) {

    val infiniteTransition = rememberInfiniteTransition()
    val imagePosition by infiniteTransition.animateFloat (
        initialValue = 0f,
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )
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
                .fillMaxWidth(1.5f)
                .offset(y = imagePosition.dp),
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

                    text = stringResource(R.string.gounts_with_donuts),
                    style = Typography .titleLarge,
                    color =  Redd
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 40.dp, start = 40.dp,top = 19.dp),
                    text = stringResource(R.string.Descrption),
                    style = Typography .bodyLarge,
                    color = Red_Light
                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 40.dp, start = 40.dp, bottom = 46.dp, top = 40.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    onClick = { navController.navigate(Screen.ChooseScreen.route) }
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 10.dp),
                        text = stringResource(R.string.get_start),
                        style =  Typography.titleSmall,
                        color = Color.Black
                    )
                }
            }
        }
    }
}


//@Preview
//@Composable
//fun onBordingScreenPreview() {
//    DShopTheme {
//        OnBoardingHomeScreenContent()
//    }
//}