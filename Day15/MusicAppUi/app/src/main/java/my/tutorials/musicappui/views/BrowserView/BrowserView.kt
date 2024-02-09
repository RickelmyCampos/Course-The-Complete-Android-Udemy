package my.tutorials.musicappui.views.BrowserView

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import my.tutorials.musicappui.R
import my.tutorials.musicappui.views.BrowserItem

@Composable
fun BrowserView (){
    val categories = listOf("Hits", "Happy", "Rock", "Workout", "Running", "TGIF", "Yoga", "Hits")
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(categories){
            BrowserItem(cat = it, drawable = R.drawable.baseline_music_video_24)
        }
    }
}