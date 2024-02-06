package my.tutorials.listadetarefas.data

data class Wish(val id: Long = 0L, val title: String = "", val description: String = "")
object DummyWish{
    val wishList: List<Wish> = listOf(
        Wish(title = "Google", description = "hello Google"),
        Wish(title = "Google", description = "hello Google"),
        Wish(title = "Google", description = "hello Google")
    )
}


