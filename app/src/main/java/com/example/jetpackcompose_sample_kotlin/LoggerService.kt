package com.example.jetpackcompose_sample_kotlin

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

//Example of the constructor Injection which is bascially used for the 3rd part api or timber

class LoggerService @Inject constructor() {

    fun lag(message: String){
        Log.d(TAG, "lag: message")
    }
}