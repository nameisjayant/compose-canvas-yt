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
fun DrawOvalScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawOval(
            color = Color.Red,
            size = Size(200.dp.toPx(), 300.dp.toPx()),
            topLeft = Offset(canvasWidth / 3, canvasHeight / 2),
            style = Stroke(
                width = 10f
            )
        )
    }

}