package com.example.uppgift2k

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorScreen(colorModel: ColorModel, colorType: ColorModel.ColorType) { // Use the correct parameter type
    val color = when (colorType) {  // Correctly using colorType
        ColorModel.ColorType.RED -> Color.Red
        ColorModel.ColorType.GREEN -> Color.Green
    }

    val mathtotal by colorModel.mathtotal.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
        .background(Color(0xFFADD8E6)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$mathtotal",
            fontSize = 70.sp,

        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color)
        )
    }
}
