package com.example.jetpackcompose_sample_kotlin.`2_fundamentalConcept`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BasicFunction(){
    Text("Hello Jetpack compose!")
}







@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    BasicFunction()
}