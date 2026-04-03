package com.example.jetpackcompose_sample_kotlin.`4_layoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Modifier are available in all the composable function like text, bottom, column, row, box image etc, it is generally used to modify the height width etc

@Composable
fun ModifierExample(){

    Box(modifier = Modifier.fillMaxWidth()
        .background(Color.Blue)
        .height(300.dp),
        contentAlignment = Alignment.Center) {
        Text("Hello Anjali", modifier = Modifier.background(Color.Yellow))
    }

}






@Preview(showSystemUi = true)
@Composable
fun ModifierPreview(){
    ModifierExample()
}