package com.bozzi.movieyear.components

import com.bozzi.movieyear.App
import com.bozzi.movieyear.modules.AppModule
import com.bozzi.movieyear.modules.FavoritesModule
import com.bozzi.movieyear.modules.MainModule
import com.bozzi.movieyear.modules.MoviesListModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: App)

    fun plus(mainModule: MainModule): MainComponent
    fun plus(moviesListModule: MoviesListModule): MoviesListComponent
    fun plus(favoritesModule: FavoritesModule): FavoritesComponent
}