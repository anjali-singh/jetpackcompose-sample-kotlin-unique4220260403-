package com.example.jetpackcompose_sample_kotlin.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.animation.ToolingState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxDesign() {
    val childCheckedState = remember {
        mutableListOf(false, false, false)
    }

    val parentState = when {
        childCheckedState.all { it } -> ToggleableState.On
        childCheckedState.none() -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Select All")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childCheckedState.forEachIndexed { index, _ ->
                        childCheckedState[index] = newState
                    }
                }
            )

        }

        childCheckedState.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Option ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        childCheckedState[index] = it

                    }
                )
            }
        }
    }

    if (childCheckedState.all { it }) {
        Text("all options Selected")
    }
}


@Preview(showSystemUi = true)
@Composable
fun CheckBoxPreview() {
    CheckBoxDesign()
}