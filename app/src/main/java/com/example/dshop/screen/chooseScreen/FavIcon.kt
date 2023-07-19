package com.example.dshop.screen.chooseScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dshop.R
import com.example.dshop.ui.theme.Redd

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavIcon(modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(top = 15.dp, start = 15.dp).size(35.dp),
        colors = CardDefaults.cardColors(White),
        shape = CircleShape,
        onClick = {}
    ) {
        Box(modifier = Modifier.fillMaxSize())
        {
            Icon(

                modifier = Modifier
                    .size(width = 20.dp, height = 18.35.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                contentDescription = "favourite",
                tint = Redd,
            )
        }
    }
}