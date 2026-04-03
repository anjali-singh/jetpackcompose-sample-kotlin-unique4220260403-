package com.example.jetpackcompose_sample_kotlin.`8_inputchips`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//input chip is basically used for the suggestion or basically used to take the input from the user

@Composable
fun InputChipExample() {
    var enable by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        InputChip(
            onClick = { enable = !enable },
            label = { Text("Enable") },
            selected = enable,
            avatar = {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Person",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            },
            trailingIcon = {
                Icon(
                    Icons.Filled.Close,
                    contentDescription = "Close",
                    Modifier.size(InputChipDefaults.IconSize)
                )
            }
        )
    }
}





@Preview(showSystemUi = true)
@Composable
fun InputChipPreview(){
    InputChipExample()
}