package com.bozzi.movieyear.components

import com.bozzi.movieyear.MainActivity
import com.bozzi.movieyear.modules.MainModule
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}