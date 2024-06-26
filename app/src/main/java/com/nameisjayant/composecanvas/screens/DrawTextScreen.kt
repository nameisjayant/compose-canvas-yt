package com.nameisjayant.composecanvas.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer


@Composable
fun DrawTextScreen(modifier: Modifier = Modifier) {

    val textMeasure = rememberTextMeasurer()
    val text = "Hello World!"
    val textLayoutMeasure = remember(text) {
        textMeasure.measure(text)
    }

    Canvas(modifier = modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawCircle(
            color = Color.Red
        )

        drawText(
            text = "Hello World!",
            textMeasurer = textMeasure,
            topLeft = Offset(
                x = canvasWidth / 2 - textLayoutMeasure.size.width / 2,
                y = canvasHeight / 2 - textLayoutMeasure.size.height / 2
            )
        )
    }

}