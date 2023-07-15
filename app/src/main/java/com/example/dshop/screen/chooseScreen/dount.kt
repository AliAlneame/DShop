package com.example.dshop.screen.chooseScreen

import android.graphics.drawable.Icon
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
import androidx.compose.material3.Text
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
  fun DonutItems(navController: NavController) {
    Box(
        modifier = Modifier
            .size(height = 167.dp, width = 138.dp),
    ) {
        Card(modifier = Modifier
            .size(height = 111.dp, width = 138.dp)
            .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomEnd = 10.dp,
                bottomStart = 10.dp
            ),
            elevation = CardDefaults.cardElevation(2.dp),
            onClick = {  navController.navigate("detailsScreen")  }
        ) {
            Spacer(modifier = Modifier.height(48.dp))
            Text(text = "Cherry", modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "$22", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
        Image(
            modifier = Modifier
                .size(104.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(id = R.drawable.d2),
            contentDescription = "card background",
            contentScale = ContentScale.Crop,
        )


    }
}
