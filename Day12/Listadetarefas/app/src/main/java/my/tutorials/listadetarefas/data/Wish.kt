package my.tutorials.listadetarefas.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// configurando o nome da tabela e as colunas da tabela
@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList: List<Wish> = listOf(
        Wish(title = "Google", description = "hello Google"),
        Wish(title = "Google", description = "hello Google"),
        Wish(title = "Google", description = "hello Google")
    )
}


