package my.tutorials.musicappui.views.LibraryView

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import my.tutorials.musicappui.data.Lib
import my.tutorials.musicappui.data.libraries

@Composable
fun LibraryView() {
    LazyColumn() {
        items(libraries) { lib ->
            LibItem(lib)
        }
    }
}

@Composable
fun LibItem(lib: Lib) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {

            Row {
                Icon(painter = painterResource(id = lib.icon), contentDescription = lib.name)
                Text(text = lib.name)
            }
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription ="arrow" )
        }
        Divider()
    }
}
