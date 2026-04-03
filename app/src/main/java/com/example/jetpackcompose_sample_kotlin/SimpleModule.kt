package com.example.jetpackcompose_sample_kotlin

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class SimpleModule {


    @Provides
    fun provideUserRepository():BaseRepository{
        return FireBaseRepository()
    }
}