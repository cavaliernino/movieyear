package com.bozzi.movieyear

import android.app.Application
import com.bozzi.movieyear.components.*
import com.bozzi.movieyear.modules.AppModule

class App : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}