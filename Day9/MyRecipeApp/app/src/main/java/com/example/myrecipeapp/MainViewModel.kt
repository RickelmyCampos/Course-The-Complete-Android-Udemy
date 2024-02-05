package com.example.myrecipeapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myrecipeapp.data.Category
import com.example.myrecipeapp.service.recipeService
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _categorieState = mutableStateOf(RecipeState())
    var categorieState: State<RecipeState> = _categorieState
init {
    fechCategories()
}
    private fun fechCategories() {
        viewModelScope.launch {
            try {
                val response = recipeService.getCategories()
                _categorieState.value = _categorieState.value.copy(
                    loading = false,
                    list = response.categories,
                    error = null
                )
            } catch (e: Exception) {
                _categorieState.value = _categorieState.value.copy(
                    loading = false,
                    error = "Erro ao buscar as categorias ${e.message}"
                )
            } finally {

            }
        }
    }

    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}