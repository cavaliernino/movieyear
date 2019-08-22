package com.bozzi.movieyear.modules

import com.bozzi.movieyear.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (val app: App){
    @Provides
    @Singleton
    fun provideApp() = app
}