package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun DrawRectangleScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawRect(
            color = Color.Red,
            size = Size(canvasWidth, canvasHeight / 4),
            topLeft = Offset(0f, canvasHeight / 3),
            style = Stroke(
                width = 10f,
                pathEffect = PathEffect.dashPathEffect(
                    floatArrayOf(10f, 10f), 0f
                )
            )
        )
    }

}

@Composable
fun DrawRoundRectangleScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier
        .padding(horizontal = 20.dp)
        .fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawRoundRect(
            color = Color.Red,
            size = Size(canvasWidth, canvasHeight / 4),
            topLeft = Offset(0f, canvasHeight / 3),
            cornerRadius = CornerRadius(16.dp.toPx())
        )
    }

}