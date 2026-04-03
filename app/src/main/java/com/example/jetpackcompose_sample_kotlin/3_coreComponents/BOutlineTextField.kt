package com.example.jetpackcompose_sample_kotlin.`3_coreComponents`

import android.widget.ToggleButton
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_sample_kotlin.`2_fundamentalConcept`.ImageAccess

//Outline Text field is the Kind of the which is used to take the input from the user


//TextField with the input Value
@Composable
fun SampleOutlineTextField(){
    var toogle by rememberSaveable() {
        mutableStateOf(false)
    }
    Box(modifier = Modifier.fillMaxSize().background(if (toogle) Color.Red else Color.Blue),
        contentAlignment = Alignment.Center,) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var text by remember {
                mutableStateOf("")
            }
            var password by rememberSaveable() {
                mutableStateOf("")
            }


            val rainbowColors = listOf(
                Color.Red,
                Color.Gray,
                Color.Black,
                Color.Blue,
                Color.Green,
                Color.DarkGray
            )

            val brush = remember {
                Brush.linearGradient(colors = rainbowColors)
            }

            val Brush = remember {
                Brush.sweepGradient(colors = rainbowColors)
            }

            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                textStyle = TextStyle(brush = brush),
                label = {
                    Text("Enter the user name...")
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                textStyle = TextStyle(brush = Brush),
                label = {
                    Text("Enter the password field")
                },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

            )

            Switch(
                checked = toogle,
                onCheckedChange = {
                    toogle = it
                }

            )


        }
    }


}



// TextField with password

@Composable
fun PasswordField(){
    var password by rememberSaveable() {
        mutableStateOf("")
    }

    TextField(
        value = password,
        onValueChange = {
            password = it
        }
    )
}




@Preview(showSystemUi = true)
@Composable
fun TextPreview(){
    //StringResource()
    SampleOutlineTextField()
}