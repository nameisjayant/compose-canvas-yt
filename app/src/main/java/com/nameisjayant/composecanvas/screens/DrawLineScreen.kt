package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp


@Composable
fun DrawLineScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset(x= 0.dp.toPx(),y=canvasHeight/2),
            end = Offset(x= canvasWidth,y=canvasHeight/2),
            strokeWidth = 10f,
            cap = StrokeCap.Round,
//            alpha = 0.1f,
//            pathEffect = PathEffect.dashPathEffect(
//                intervals = floatArrayOf(10f,30f), phase = 10f
//            )
            pathEffect = PathEffect.chainPathEffect(
                inner = PathEffect.dashPathEffect(
                intervals = floatArrayOf(10f,30f), phase = 10f
            ),
                outer = PathEffect.cornerPathEffect(20f)
            )
        )
    }
}

@Composable
fun DiagonalLineScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset.Zero,
            end = Offset(x=canvasWidth,canvasHeight),
            strokeWidth = 10f,
        )
    }
}


@Composable
fun VerticalCenterLineScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset(x=canvasWidth/2,0f),
            end = Offset(x=canvasWidth/2,canvasHeight),
            strokeWidth = 10f,
        )
    }
}

@Composable
fun CrossLineScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset(x=canvasWidth/2,0f),
            end = Offset(x=canvasWidth/2,canvasHeight),
            strokeWidth = 10f,
        )

        drawLine(
            color = Color.Red,
            start = Offset(x= 0.dp.toPx(),y=canvasHeight/2),
            end = Offset(x= canvasWidth,y=canvasHeight/2),
            strokeWidth = 10f,
        )
    }
}


