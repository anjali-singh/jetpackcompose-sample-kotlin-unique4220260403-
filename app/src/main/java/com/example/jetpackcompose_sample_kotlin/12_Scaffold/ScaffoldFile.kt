package com.example.jetpackcompose_sample_kotlin.`12_Scaffold`

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


//Scaffold is the builtin ui template with topbar, buttomBar and one floating button

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var press by remember {
        mutableStateOf(0)
    }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
                scrolledContainerColor = MaterialTheme.colorScheme.surface,
                navigationIconContentColor = MaterialTheme.colorScheme.secondary,
                actionIconContentColor = MaterialTheme.colorScheme.background
            ),
            title = {
                Text("Scaffold Example")
            }
        )
    },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary

            )
            {
                Text(
                    text = "Bottom Bar",
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center
                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    press++
                }
            ){
                Text("I have clicked $press times")
            }

        }



    ) { paddingValues ->
        Text(
            text = "Content of the screen",
            modifier = Modifier.padding(paddingValues).background(Color.Blue).fillMaxSize()
        )

    }

}



@Preview(showSystemUi = true)
@Composable
fun GreetingBoxExample(){
    ScaffoldExample()
}
