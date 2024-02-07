package my.tutorials.listadetarefas.database

import android.content.Context
import androidx.room.Room
import my.tutorials.listadetarefas.repositories.WishRepository

object Graph {
    lateinit var database: WishDatabase
    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }
    fun provide(context: Context){
        database= Room.databaseBuilder(context,WishDatabase::class.java,"wishlist.db").build()
    }
}