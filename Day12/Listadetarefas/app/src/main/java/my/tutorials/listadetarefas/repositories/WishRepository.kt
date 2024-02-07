package my.tutorials.listadetarefas.repositories

import kotlinx.coroutines.flow.Flow
import my.tutorials.listadetarefas.data.Wish
import my.tutorials.listadetarefas.data.WishDao

class WishRepository(
    private val wishDao: WishDao
):IWishRepository {

    override suspend fun addAWish(wish: Wish) {
        wishDao.addWish(wish)
    }

    override fun getAllWishes(): Flow<List<Wish>> = wishDao.getAllWishes()
    override fun getWishById(id: Long): Flow<Wish> {

        return wishDao.getAWishById(id)
    }
    override suspend fun updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
    override suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }

}
interface IWishRepository{
    suspend fun addAWish(wish: Wish)
    fun getAllWishes(): Flow<List<Wish>>
    fun getWishById(id: Long): Flow<Wish>
    suspend fun updateAWish(wish: Wish)
    suspend fun deleteAWish(wish: Wish)
}