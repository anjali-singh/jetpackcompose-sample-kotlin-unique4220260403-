package com.example.jetpackcompose_sample_kotlin.`4_layoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Lazy Column

@Composable
fun LazyColumnExample(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy column prepared for the list")

        LazyColumn(
            modifier = Modifier.fillMaxWidth().height(200.dp)
                .background(color = Color.Green)
        ) {
            items(100){index ->
                Text(
                    text = "item $index in lazy Column",
                    modifier = Modifier.fillMaxWidth().background(Color.Gray)
                )

            }
        }
    }
}


//Lazy Row in jetpack Compose
@Composable
fun LazyRowExample(){
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center

    ) {
        Text("Lazy column prepared for the list")

        LazyRow(
            modifier = Modifier.height(500.dp)
                .background(color = Color.Green)
        ) {
            items(100){index ->
                Text(
                    text = "item $index in lazy Column",
                    modifier = Modifier.fillMaxWidth().background(Color.Gray)
                )

            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun LazyColumnPreview(){
    //LazyColumnExample()
    LazyRowExample()
}
