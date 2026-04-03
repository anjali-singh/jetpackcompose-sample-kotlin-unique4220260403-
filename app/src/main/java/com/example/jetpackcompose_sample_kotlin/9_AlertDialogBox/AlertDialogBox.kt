package com.example.jetpackcompose_sample_kotlin.`9_AlertDialogBox`

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.jetpackcompose_sample_kotlin.R

@Composable
fun DialogWithImage(
){
    val context = LocalContext.current
    Dialog(onDismissRequest = {

    }) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .padding(16.dp),
            shape = RoundedCornerShape(16.dp)) {

            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "Person image",
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(200.dp)
            )

            Text("Confirm", modifier = Modifier.padding(16.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                TextButton(
                    onClick = {
                        Toast.makeText(context, "We can perform multiple operations", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Dismiss")
                }
            }

        }
    }

}

@Composable
fun CustomToggleButton(){
    var value by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier.fillMaxSize().background(if (value) Color.Green else Color.Red),
        contentAlignment = Alignment.Center){
        Switch(
            checked = value,
            onCheckedChange = {
                value = it
            }
        )
    }
}



@Composable
fun LoginPageDesign(){
    var value by remember {
        mutableStateOf("")
    }

    var text by remember {
        mutableStateOf("")
    }

    var button by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = value,
                onValueChange = {
                    value =  it
                },
                label = {
                    Text("Enter the username")
                }

            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = {
                    Text("Enter the password")
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = {
                button = button
            }) {
                Text("SignIn")
            }

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun DialogPreview(){
    //CustomToggleButton()
    //DialogWithImage()
    //LoginPageDesign()
    DialogWithImage()
}
