package com.example.dshop.screen.chooseScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dshop.R
import com.example.dshop.ui.theme.Redd
import com.example.dshop.ui.theme.seaBlue

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun OffersItems(navController: NavController) {
    Box(
        modifier = Modifier
            .size(height = 325.dp, width = 246.dp),
    ) {
        Card(
            modifier = Modifier
                .size(height = 325.dp, width = 193.dp),
            colors = CardDefaults.cardColors(seaBlue),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(2.dp),
            onClick = {   navController.navigate("detailsScreen")}
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
        Column(
            modifier = Modifier
                .align(Alignment.TopEnd)
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Image(
                modifier = Modifier
                    .size(150.dp),
                painter = painterResource(id = R.drawable._png),
                contentDescription = "card background",
                contentScale = ContentScale.Crop,
            )

        }

    }
}
