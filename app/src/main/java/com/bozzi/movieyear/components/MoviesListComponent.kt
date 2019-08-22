package com.bozzi.movieyear.components

import com.bozzi.movieyear.TabMoviesListFragment
import com.bozzi.movieyear.modules.MoviesListModule
import dagger.Subcomponent

@Subcomponent(modules = [MoviesListModule::class])
interface MoviesListComponent {
    fun inject(fragment: TabMoviesListFragment)
}