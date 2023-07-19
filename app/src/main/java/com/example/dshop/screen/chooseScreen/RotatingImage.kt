package com.example.dshop.screen.chooseScreen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun RotatingImage(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
) {
    val rotation = remember { Animatable(initialValue = 0f) }

    LaunchedEffect(key1 = rotation) {
        rotation.animateTo(
            targetValue = 360f,
            animationSpec = tween(
                durationMillis = 10000,
                easing = LinearEasing
            )
        )
    }

    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier.rotate(rotation.value)
    )
}