package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun DrawCircleScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawCircle(
            color = Color.Red,
            radius = 100.dp.toPx(),
            center = Offset(canvasWidth/2,canvasHeight/2),
            alpha = 0.5f,
            style = Stroke(
                width = 50f,
                pathEffect = PathEffect.dashPathEffect(
                    floatArrayOf(10f,20f),0f
                )
            )
        )

    }

}