package com.example.jetpackcompose_sample_kotlin.`3_coreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview


//This is the function for the selectable text
@Composable
fun ParcelSelectableText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        SelectionContainer() {
            Column() {
                Text("This is selectable text")
                Text("This is one two")
                Text("This is the second Text")
                Text("This is the 3rd Text")
                DisableSelection {
                    Text("This is not selectable one")
                    Text("This is also..")
                    Text("This is unslectable text")
                }

            }
        }
    }
}


//How to attach the link with text

@Composable
fun AnnotatedStringWithListenerSample(){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        val uriHandler = LocalUriHandler.current

        Text(
            buildAnnotatedString {
                append("better app faster with")
                val link = LinkAnnotation.Url(
                    "https://github.com/rea-cruitment/property-list-android-anjali-singh/blob/Anjali_testcode/README.md",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )

                )
                {
                    val uri = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(uri)
                }

                withLink(link){
                    append("with jetpack compose")
                }
            }
        )

    }



}



@Preview(showBackground = true)
@Composable
fun SelectionText(){
    //ParcelSelectableText()
    AnnotatedStringWithListenerSample()
}