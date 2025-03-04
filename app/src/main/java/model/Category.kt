package model
import androidx.annotation.DrawableRes

data class Category(
    val name: String,
    @DrawableRes val imageResId: Int,
    val places: List<Place>
)


