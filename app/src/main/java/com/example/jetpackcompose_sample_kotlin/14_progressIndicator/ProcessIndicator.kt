package com.example.jetpackcompose_sample_kotlin.`14_progressIndicator`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//since everything in the kotlin is the immutable state so to make it mutable we use the mutableStateOf


@Composable
fun CircularIndicatorEx(){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var loading by remember {
            mutableStateOf(false)

        }

        Button(onClick = {
            loading = true
        }, enabled = !loading) {
            Text("start Loading.....")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (!loading) return CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )

    }


}




@Preview(showSystemUi = true)
@Composable
fun CircularIndicatorExPreview(){
    CircularIndicatorEx()
}