package com.example.jetpackcompose_sample_kotlin.`10_FloatingButton`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ExtendedFloatingActionButtonEx(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {

        val context = LocalContext.current

        ExtendedFloatingActionButton(
            onClick = {
                Toast.makeText(context,"anjali", Toast.LENGTH_SHORT).show()
            },
//        modifier = TODO(),
//        shape = TODO(),
//        containerColor = TODO(),
//        contentColor = TODO(),
//        elevation = TODO(),
//        interactionSource = TODO(),
            content = {
                Text("This is floating button")
            }
        )

    }


}




@Composable
@Preview(showSystemUi = true)
fun ExtendedFloatingActionButtonExPreview(){
    ExtendedFloatingActionButtonEx()
}