package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun DrawPointsScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawPoints(
            points = listOf(
                Offset(
                    canvasWidth / 2, 30.dp.toPx()
                ),
                Offset(canvasWidth / 4, canvasHeight / 4),
                Offset(canvasWidth / 2, canvasHeight / 2),
                Offset(canvasWidth/4,canvasHeight)
            ),
            pointMode = PointMode.Points,
            color = Color.Red,
            strokeWidth = 50f,
            cap = StrokeCap.Round
        )
    }

}