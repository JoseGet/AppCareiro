package com.example.careiroapp.products.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.products.data.models.ProductCardModel
import com.example.careiroapp.products.domain.usecases.GetProductsUseCase
import com.example.careiroapp.products.domain.usecases.GetProductByIdUseCase
import com.example.careiroapp.products.domain.usecases.GetProductsByCategoriaCountUseCase
import com.example.careiroapp.products.domain.usecases.GetProductsByCategoriaUseCase
import com.example.careiroapp.products.domain.usecases.GetProductsCountUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val getProductByIdUseCase: GetProductByIdUseCase,
    private val getProductsByCategoriaUseCase: GetProductsByCategoriaUseCase,
    private val getProductsCountUseCase: GetProductsCountUseCase,
    private val getProductsByCategoriaCountUseCase: GetProductsByCategoriaCountUseCase
) : ViewModel() {

    private val _productUiState = MutableStateFlow(ProductsUiState())
    var productUiState: StateFlow<ProductsUiState> = _productUiState.asStateFlow()

    private var offset: Int = 0
    private val limit: Int = 20

    private var isInitializedByNavArg = false


    fun getProducts(isNecessaryLoadMore: Boolean) {

        if (_productUiState.value.productsCardList.isNotEmpty() && !isNecessaryLoadMore) {
            return
        }

        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val currentList = productUiState.value.productsCardList
                val productsList = getProductsUseCase.invoke(offset, limit)

                val productsCount = getProductsCount()

                if (productsList?.isEmpty() == true) {
                    _productUiState.update {
                        it.copy(
                            endOfListReached = true
                        )
                    }
                    return@launch
                }

                val cardProductsList = productsList?.map { produto ->
                    ProductCardModel(
                        id = produto.id,
                        image = produto.image,
                        nome = produto.nomeProduto,
                        preco = produto.precoProduto,
                        isPromocao = produto.isPromocao,
                        precoPromocao = produto.precoPromocao
                    )
                }

                val newList = currentList + (cardProductsList ?: emptyList())

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        productsCardList = newList,
                        productsCount = productsCount
                    )
                }
            } catch (e: Exception) {
                Log.e("ProductsViewModel", e.toString())
            }
        }
    }

    fun getProductById(id: UUID) {
        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val selectedItem = getProductByIdUseCase.invoke(id)

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        selectedProduct = selectedItem
                    )
                }

            } catch (e: Exception) {
                Log.e("ProductsViewModel", e.toString())
            }
        }
    }

    fun getProductsByCategoria(nomeCategoria: String?, isNecessaryLoadMore: Boolean) {

        if (nomeCategoria == null) {
            return
        }

        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val currentList = productUiState.value.productsCardList
                val productsList = getProductsByCategoriaUseCase.invoke(nomeCategoria, offset, limit)

                val productsCount = getProductsByCategoriaCount(nomeCategoria)

                if (productsList?.isEmpty() == true) {
                    _productUiState.update {
                        it.copy(
                            endOfListReached = true
                        )
                    }
                    return@launch
                }

                val cardProductsList = productsList?.map { produto ->
                    ProductCardModel(
                        id = produto.id,
                        image = produto.image,
                        nome = produto.nomeProduto,
                        preco = produto.precoProduto,
                        isPromocao = produto.isPromocao,
                        precoPromocao = produto.precoPromocao
                    )
                }

                val newList = currentList + (cardProductsList ?: emptyList())

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        productsCardList = newList,
                        productsCount = productsCount
                    )
                }

            } catch (e: Exception) {
                Log.e("ProductsViewModel", e.toString())
            }
        }
    }

    private suspend fun getProductsCount(): Int? = getProductsCountUseCase.invoke()

    private suspend fun getProductsByCategoriaCount(nomeCategoria: String): Int? = getProductsByCategoriaCountUseCase.invoke(nomeCategoria)

    fun updateFilterActivate(filterName: String?) {
        _productUiState.update {
            it.copy(
                filterNameActivate = filterName
            )
        }
    }

    fun loadMoreProducts(function: () -> Unit) {
        offset = offset + limit
        function()
    }

    fun resetListState() {
        offset = 0
        _productUiState.update {
            it.copy(
                endOfListReached = false
            )
        }
    }

    fun cleanProductsList() {
        viewModelScope.launch {
            _productUiState.update {
                it.copy(
                    productsCardList = listOf()
                )
            }
        }
    }

    fun initializeFilter(categoryFromNav: String?) {
        if (isInitializedByNavArg) return

        updateFilterActivate(categoryFromNav)
        isInitializedByNavArg = true
    }

}

