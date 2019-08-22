package com.bozzi.movieyear.components

import com.bozzi.movieyear.App
import com.bozzi.movieyear.modules.AppModule
import com.bozzi.movieyear.modules.MainModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: App)

    fun plus(mainModule: MainModule): MainComponent
}