package com.example.dshop

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dshop.ui.theme.Red_Light

@Composable
fun BackButton(navController: NavController) {
    IconButton(
        modifier = Modifier.padding(top = 45.dp, start = 32.dp),
        onClick = { navController.navigateUp()}
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
            contentDescription = "back button",
            tint = Red_Light
        )
    }
}