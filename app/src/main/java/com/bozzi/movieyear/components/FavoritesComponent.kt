package com.bozzi.movieyear.components

import com.bozzi.movieyear.TabFavoritesFragment
import com.bozzi.movieyear.modules.FavoritesModule
import dagger.Subcomponent

@Subcomponent(modules = [FavoritesModule::class])
interface FavoritesComponent {
    fun inject(fragment: TabFavoritesFragment)
}