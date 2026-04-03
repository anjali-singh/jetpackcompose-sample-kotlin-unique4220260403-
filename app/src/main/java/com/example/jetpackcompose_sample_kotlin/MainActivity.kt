package com.example.jetpackcompose_sample_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose_sample_kotlin.`3_coreComponents`.ElevatedButton
import com.example.jetpackcompose_sample_kotlin.`3_coreComponents`.FilledButton
import com.example.jetpackcompose_sample_kotlin.`3_coreComponents`.FilledTonalButton
import com.example.jetpackcompose_sample_kotlin.`3_coreComponents`.OutlinedButton
import com.example.jetpackcompose_sample_kotlin.`3_coreComponents`.SampleOutlineTextField
import com.example.jetpackcompose_sample_kotlin.`4_layoutComposable`.LazyColumnExample
import com.example.jetpackcompose_sample_kotlin.`5_BottomSheet`.ParticalBottomSheet
import com.example.jetpackcompose_sample_kotlin.ui.theme.Jetpackcompose_sample_kotlinTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    lateinit var userRepository: BaseRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //FilledTonalButton()
            //OutlinedButton()
            //LazyColumnExample()
            ParticalBottomSheet()
            userRepository.saveUser()
        }
    }
}
