package com.example.jetpackcompose_sample_kotlin

import android.util.Log
import javax.inject.Inject


interface BaseRepository{
    fun saveUser(){
        Log.d("username", "password")
    }

}


class SqlBaseRepository @Inject constructor() : BaseRepository  {
    val TAG = "issue"

    override fun saveUser(){
        Log.d(TAG, "insert to db")
    }
}


class FireBaseRepository : BaseRepository{
    val TAG = "issue"

    override fun saveUser(){
        Log.d(TAG, "insert to firebase")
    }
}