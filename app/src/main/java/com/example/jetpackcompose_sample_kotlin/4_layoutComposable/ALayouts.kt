package com.example.jetpackcompose_sample_kotlin.`4_layoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//Layouts is generally used to ui design part 1. Box, 2.Column, 3. Row
//Column allows you to place the children in the vertical sequence

@Composable
fun ColumnExample(){
    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color.Green)
        .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("text one")
        Text("text Two")
        Text("text Three")
        Text("text Four")
        Text("text Five")
    }
}



@Composable
fun RowExample(){
    Row(modifier = Modifier.fillMaxSize()
        .background(color = Color.Red)
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Text("text one")
        Text("text Two")
        Text("text Three")
        Text("text Four")
        Text("text Five")
    }
}



//3rd layout

@Composable
fun BoxExample(){
    Box(modifier = Modifier.size(500.dp).background(color = Color.Blue),
        contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.size(200.dp).background(color = Color.Red)) {

        }
    }
}


//Constraint Layout
// When necessary then only we can use it is more complex and powerful it is also loss the memory

@Composable
fun ConstraintLayoutExample(){
    Column() {
        ConstraintLayout(modifier = Modifier.fillMaxWidth()
            .height(150.dp)
            .background(color = Color.DarkGray)) {
            
            val (text1, text2,text3) = createRefs()
            Text("Bottom Left",
                modifier = Modifier.constrainAs(text1){
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                })

            Text("Centre Left",
                modifier = Modifier.constrainAs(text2){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

            Text("Top Right",
                modifier = Modifier.constrainAs(text3){
                    top.linkTo(parent.top)
                    end.linkTo(parent.end, margin = 8.dp)
                })

        }
    }
}


//Best Practice
//Nested box will cause the memory link

@Preview(showSystemUi = true)
@Composable
fun ColumnPreview(){
    //ColumnExample()
    //RowExample()
    //BoxExample()
    ConstraintLayoutExample()
}