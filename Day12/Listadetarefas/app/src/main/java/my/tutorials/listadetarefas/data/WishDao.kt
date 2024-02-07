package my.tutorials.listadetarefas.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


// Configuração das query para a tabela  wish table (CRUD)
@Dao
//abstract  uma classe que não precisa de implementação
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addWish(wishEntity: Wish)
  //Busca todos os wish na tabela
    @Query("Select * From `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>
    // atualizar um wish na tabela
    @Update
    abstract suspend fun updateAWish(wishEntity:Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * From `wish-table` Where id=:id")
    abstract fun getAWishById(id:Long): Flow<Wish>
}