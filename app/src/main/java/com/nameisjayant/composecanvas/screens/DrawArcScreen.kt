package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun DrawArcScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawArc(
            color = Color.Red,
            startAngle = 0f, // 3'0 clock
            sweepAngle = 180f,
            useCenter = false,
            topLeft = Offset(canvasWidth/4,canvasHeight/4),
            size = Size(200.dp.toPx(),200.dp.toPx()),
            style = Stroke(10f)
        )
    }

}