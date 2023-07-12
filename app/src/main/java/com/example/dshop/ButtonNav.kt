package com.example.dshop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.dshop.ui.theme.Red_Light

@Composable
fun BottomNav() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),

        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Box(Modifier.wrapContentSize(Alignment.Center)) {
            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.home),
                contentDescription = null, // description for the icon, for accessibility purposes
                tint = Red_Light
            )
        }
        Box(Modifier.wrapContentSize(Alignment.Center)) {
            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.heart),
                contentDescription = null,
                tint = Red_Light
            )
        }

        Box(Modifier.wrapContentSize(Alignment.Center)) {
            Row(
                modifier = Modifier.padding(12.dp),

                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = null,
                    tint = Red_Light
                )


            }

        }

        Box(Modifier.wrapContentSize(Alignment.Center)) {

            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.buy),
                contentDescription = null,
                tint = Red_Light
            )
            Box(

            ) {
                Text(text = "2", color = Color(0xDEFFFFFF), textAlign = TextAlign.Center, modifier = Modifier.padding(4.dp).background(
                    Color(0xFFFF5524), shape = CircleShape
                ) )
            }

        }
        Box(Modifier.wrapContentSize(Alignment.Center)) {
            Icon(
                modifier = Modifier.padding(12.dp),
                painter = painterResource(id = R.drawable.mingcute_user_2_line),
                contentDescription = null,
                tint = Red_Light
            )
        }
    }
}