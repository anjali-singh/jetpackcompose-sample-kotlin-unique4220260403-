package com.example.jetpackcompose_sample_kotlin.`3_coreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {

        Text(
            text = "Hello Jetpack Compose",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(shadow = Shadow(color = Color.Blue, blurRadius = 3.0f))
        )
    }


}



@Composable
fun colorFulText(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        val rainbowColor = listOf(
            Color.Blue,
            Color.Red,
            Color.Green,
            Color.DarkGray,
            Color.Gray,
            Color.Black
        )


        Text(
            buildAnnotatedString {
                append("do not allow people to dim your shine \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColor
                        )
                    )
                )
                {
                    append("because we are blinded. ")
                }

                append("\n tell them to put some sunglasses ")
            }
        )

    }


}



// if we want to make your text scroablle then we can use the basicMarque with the help of modifier
// if the text is so long the we can use the overFlow with eclipse overFlow.Ellipse represent the Three dots
@Composable
fun BasicMarqueText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){

        Text("Hey this anjali experimenting with the jetpack compose",
            modifier = Modifier.basicMarquee(),
            fontSize = 30.sp)

    }
}


// This will represent the text with the three dots

@Composable
fun ScroableText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Text("Hello Java by Anjali Singh".repeat(50),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold)
    }
}




@Preview(showSystemUi = true)
@Composable
fun TextDesign(){
   // SimpleText()
    //colorFulText()
    ScroableText()
    //BasicMarqueText()
}