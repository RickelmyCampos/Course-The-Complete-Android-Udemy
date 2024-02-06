package my.tutorials.listadetarefas

import androidx.compose.runtime.Composable


sealed class  Screen(val route:String) {
    object HomeScreen:Screen("homescreen")
    object AddScreen:Screen("addscreen")

}