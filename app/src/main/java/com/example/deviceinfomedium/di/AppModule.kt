package com.example.deviceinfomedium.di

import android.content.Context
import com.example.deviceinfomedium.data.DeviceInfoModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesDeviceInfoModule(@ApplicationContext context: Context) = DeviceInfoModule(context)
}