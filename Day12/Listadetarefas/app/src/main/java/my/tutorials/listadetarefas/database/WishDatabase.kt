package my.tutorials.listadetarefas.database

import androidx.room.Database
import androidx.room.RoomDatabase
import my.tutorials.listadetarefas.data.Wish
import my.tutorials.listadetarefas.data.WishDao

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao(): WishDao
}