package model

import androidx.annotation.DrawableRes

data class Place(
    val name: String,
    val address: String,
    val description: String,
    @DrawableRes val imageResId: Int
)
