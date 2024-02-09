package my.tutorials.musicappui.data

import androidx.annotation.DrawableRes
import my.tutorials.musicappui.R

data class Lib(@DrawableRes val icon:Int, val name:String)
val libraries=listOf<Lib>(
    Lib(R.drawable.ic_account,"Playlist"),
    Lib(R.drawable.ic_account,"Artist"),
    Lib(R.drawable.ic_account,"Album"),
    Lib(R.drawable.ic_account,"Songs"),
    Lib(R.drawable.ic_account,"Genre")
)
