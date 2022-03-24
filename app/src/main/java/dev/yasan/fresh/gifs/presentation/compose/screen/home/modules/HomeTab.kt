package dev.yasan.fresh.gifs.presentation.compose.screen.home.modules

import androidx.annotation.StringRes
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import dev.yasan.fresh.gifs.R
import dev.yasan.fresh.gifs.presentation.compose.theme.MyAppIcons

/**
 * Contains all the data for the Home Tab.
 */
enum class HomeTab(@StringRes val titleResourceId: Int, val icon: ImageVector) {
    SEARCH(titleResourceId = R.string.search, icon = MyAppIcons.Search),
    FAVORITES(titleResourceId = R.string.favorites, icon = MyAppIcons.Favorite);

    companion object {

        fun fromInt(ordinal: Int) = values().getOrNull(ordinal) ?: SEARCH

    }

}