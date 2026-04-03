package com.example.jetpackcompose_sample_kotlin.`3_coreComponents`

import android.service.autofill.OnClickAction
import android.text.Layout
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

//Filled Button for primary action like save and submit

@Composable
fun FilledButton(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        val context = LocalContext.current
        Button(onClick = {
            Toast.makeText(context, "button is clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text("Filled Button")
        }

    }

}

//Tonal Button is generally used for the add to cart

@Composable
fun FilledTonalButton(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        val context = LocalContext.current
        FilledTonalButton(
            colors = ButtonColors(contentColor = Color.Red, disabledContentColor = Color.Yellow, containerColor = Color.White, disabledContainerColor = Color.DarkGray),
            onClick = {
                Toast.makeText(context, "Filled Tonal Button", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Tonal button")
        }
    }
}

//Outlined Button we will use for the cancel and back button press
@Composable
fun OutlinedButton() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        OutlinedButton(onClick = {
            Toast.makeText(context,"Outlined button", Toast.LENGTH_SHORT).show()
        }) {
            Text("Outlined Button")
        }
    }
}


//Elevated Button
@Composable
fun ElevatedButton(){
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        ElevatedButton(onClick = {
            Toast.makeText(context,"Hello elevated button", Toast.LENGTH_SHORT).show()
        }) { }
    }

}


@Preview(showSystemUi = true)
@Composable
fun PreviewButton(){
    FilledButton()
}

