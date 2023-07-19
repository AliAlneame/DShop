package com.example.dshop.screen.chooseScreen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dshop.R
import com.example.dshop.ui.theme.Black
import com.example.dshop.ui.theme.Redd
import com.example.dshop.ui.theme.Typography
import com.example.dshop.ui.theme.White


@Composable
fun DonutsItem(navController: NavController,image: Painter = painterResource(id = R.drawable.d2), onClick: ()-> Unit, name: String= "Chocolate Cherry", price: Int =22 ,) {
    Box {
        Column(
            modifier = Modifier
                .width(138.dp)
                .height(111.dp)
                .shadow(
                    shape = RoundedCornerShape(
                        topEnd = 20.dp,
                        topStart = 20.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp
                    ), elevation = 2.dp
                )
                .background(White)
                .align(Alignment.BottomCenter).clickable(
                    interactionSource = CreateMutableInteractionSource(),
                    indication = CreateIndication(),
                    onClick = {  navController.navigate("detailsScreen")  }
                ),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = name,
                style = Typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
            )

        }
        Text(
            text = "$${price}",
            color = Redd,
            style = Typography.bodySmall,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter)
        )

        Image(
            painter = image,
            contentDescription ="donut",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(bottom = 60.dp)
                .size(100.dp)
        )
    }
}
@Composable
fun CreateMutableInteractionSource(): MutableInteractionSource = remember {
    MutableInteractionSource()
}

@Composable
fun CreateIndication(
    bounded: Boolean = true, color: Color = Black
) = rememberRipple(bounded = bounded, color = color)
