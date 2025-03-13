package com.example.uppgift2k

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.runtime.collectAsState


@Composable
fun StartScreen(
    colorModel: ColorModel,
    onRedClick: () -> Unit,
    onGreenClick: () -> Unit
) {
    val mathtotal by colorModel.mathtotal.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFADD8E6)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$mathtotal", fontSize = 70.sp)


        Button(
            onClick = { colorModel.add(1) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.Black
            ),
            shape = RectangleShape,
            modifier = Modifier
                .padding(20.dp)
                .width(100.dp)
                .height(60.dp)
        ) {
            Text("PLUS")
        }


        Button(
            onClick = { onRedClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Black
            ),
            shape = RectangleShape,
            modifier = Modifier
                .padding(20.dp)
                .width(100.dp)
                .height(60.dp)
        ) {
            Text("RÖD")
        }


        Button(
            onClick = { onGreenClick() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.Black
            ),
            shape = RectangleShape,
            modifier = Modifier
                .padding(20.dp)
                .width(100.dp)
                .height(60.dp)
        ) {
            Text("GRÖN")
        }
    }
}
