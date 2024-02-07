package my.tutorials.listadetarefas

import android.app.Application
import my.tutorials.listadetarefas.database.Graph

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}