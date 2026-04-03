package com.example.jetpackcompose_sample_kotlin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication : Application(){

    @Inject
    lateinit var baseRepository: BaseRepository

    override fun onCreate() {
        super.onCreate()

        baseRepository.saveUser()

    }

}