package com.example.jetpackcompose_sample_kotlin.`3_coreComponents`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose_sample_kotlin.R

@Composable
fun imageFile(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        
        val rainbowColor = listOf(
            Color.Red,
            Color.DarkGray,
            Color.Gray,
            Color.Green,
            Color.Black,
            Color.Yellow,
            Color.Cyan,
            Color.LightGray
        )
        val brush = remember {
            Brush.sweepGradient(rainbowColor)
        }

        val boarderWidth = 4.dp
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(300.dp).clip(CircleShape).border(BorderStroke(boarderWidth, brush = brush)),
            alignment = Alignment.Center,
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply {
                    setToSaturation(0f)
                }
            ),

            painter = painterResource(R.drawable.img),
            contentDescription = "Image"
        )

    }

}











@Preview(showSystemUi = true)
@Composable
fun ImagePreview(){
    imageFile()
}