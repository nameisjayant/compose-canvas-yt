package com.nameisjayant.composecanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.nameisjayant.composecanvas.screens.CrossLineScreen
import com.nameisjayant.composecanvas.screens.DiagonalLineScreen
import com.nameisjayant.composecanvas.screens.DrawArcScreen
import com.nameisjayant.composecanvas.screens.DrawCircleScreen
import com.nameisjayant.composecanvas.screens.DrawLineScreen
import com.nameisjayant.composecanvas.screens.DrawOvalScreen
import com.nameisjayant.composecanvas.screens.DrawPointsScreen
import com.nameisjayant.composecanvas.screens.DrawTextScreen
import com.nameisjayant.composecanvas.screens.VerticalCenterLineScreen
import com.nameisjayant.composecanvas.ui.theme.ComposeCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DrawTextScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

}