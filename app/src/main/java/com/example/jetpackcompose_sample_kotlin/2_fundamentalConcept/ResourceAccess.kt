package com.example.jetpackcompose_sample_kotlin.`2_fundamentalConcept`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose_sample_kotlin.R


//ContentAligment will decide in which place we can keep the things either we want to put in centre,bottom

@Composable
fun StringResource(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){

        Text(
            text = stringResource(R.string.anjali_app),
            color = colorResource(R.color.orange)
        )

    }
}



@Composable
fun ImageAccess(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Image(painter = painterResource(R.drawable.image), contentDescription = "anjali")
    }
}




@Preview(showSystemUi = true)
@Composable
fun ColorPreview(){
    //StringResource()
    ImageAccess()
}