package com.example.dshop.screen.detailsScreen

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dshop.BackButton
import com.example.dshop.R
import com.example.dshop.ui.theme.Grey
import com.example.dshop.ui.theme.Pink
import com.example.dshop.ui.theme.Red_Light
import com.example.dshop.ui.theme.Typography

@Composable
fun detailsScreen (
    viewModel: DetailsViewModel = hiltViewModel()

){
    val state by viewModel.state.collectAsState()
    DetailsContent(state, viewModel)

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsContent(state: DetailsUIState, viewModel: DetailsViewModel) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink)
    ) {

        val (bottomSheet, mainImage, iconFav) = createRefs()
        val infiniteTransition = rememberInfiniteTransition()
        val angle by infiniteTransition.animateFloat(
            initialValue = 0F,
            targetValue = 360F,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            )
        )

        BackButton()

        Image(
            painter = painterResource(id = R.drawable.image_11),
            contentDescription = "donut",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
                .rotate(angle)
                .constrainAs(mainImage){
                    top.linkTo(parent.top,28.dp)
                }
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                .background(White)
                .constrainAs(bottomSheet) {
                    bottom.linkTo(parent.bottom)
                },
        ) {

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 35.dp),
                text = stringResource(R.string.strawberry_wheel),
                style = Typography.titleMedium,
                color = Red
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 33.dp),
                text = stringResource(R.string.about_gonut),
                style = Typography.bodyLarge,
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 16.dp),
                text = stringResource(R.string.details),
                style = Typography.bodySmall
            )

            Text(
                modifier = Modifier.padding(start = 40.dp, top = 26.dp),
                text = stringResource(R.string.quantity),
                style = Typography.bodyLarge,
            )

            Row(modifier = Modifier.padding(start = 40.dp, top = 19.dp)) {

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = { viewModel.decreaseQuantity() }
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                    {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "-",
                            style = Typography.labelLarge,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(White),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                    {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = state.quantity.toString(),
                            style = Typography.labelMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Card(modifier = Modifier
                    .padding(end = 20.dp)
                    .size(45.dp),
                    colors = CardDefaults.cardColors(Black),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(2.dp),
                    onClick = { viewModel.increaseQuantity() }
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                    {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "+",
                            style = Typography.labelLarge,
                            textAlign = TextAlign.Center,
                            color = White
                        )
                    }
                }
            }


            Row(
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .padding(end = 10.dp)
                ) {
                    Text(
                        text = "£${state.price}",
                        style = Typography.titleMedium
                    )
                }

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Red),
                    onClick = {}
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 10.dp),
                        text = "Add to Cart",
                        color = White,
                        style = Typography.titleSmall
                    )
                }
            }
        }



        Card(modifier = Modifier
            .size(45.dp)
            .constrainAs(iconFav) {
                top.linkTo(bottomSheet.top)
                bottom.linkTo(bottomSheet.top)
                end.linkTo(parent.end, 33.dp)
            },
            colors = CardDefaults.cardColors(White),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(2.dp),
            onClick = { viewModel.toggleFavorite() }

        ) {
            Box(modifier = Modifier.fillMaxSize())
            {
                Icon(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(
                        id = if (state.isFavorite) R.drawable.baseline_favorite_24 else R.drawable.baseline_favorite_border_24 // <-- Change icon depending on favourite status
                    ),
                    contentDescription = "favourite",
                    tint = Red
                )
            }
        }


    }
}

@Preview
@Composable
fun DetailsScreenPreview() {
    detailsScreen()
}