package com.example.careiroapp.products.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.products.data.models.ProductCardModel
import com.example.careiroapp.products.domain.usecases.GetAllProductsUseCase
import com.example.careiroapp.products.domain.usecases.GetProductByIdUseCase
import com.example.careiroapp.products.domain.usecases.GetProductsByCategoriaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject
import kotlin.collections.map

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getAllProductsUseCase: GetAllProductsUseCase,
    private val getProductByIdUseCase: GetProductByIdUseCase,
    private val getProductsByCategoriaUseCase: GetProductsByCategoriaUseCase
) : ViewModel() {

    private val _productUiState = MutableStateFlow(ProductsUiState())
    var productUiState: StateFlow<ProductsUiState> = _productUiState.asStateFlow()

    private var offset: Int = 0
    private val limit: Int = 20


    fun getProducts() {
        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val currentList = productUiState.value.productsCardList
                val productsList = getAllProductsUseCase.invoke(offset, limit)
                val cardProductsList = productsList?.map { produto ->
                    ProductCardModel(
                        id = produto.id,
                        image = produto.image,
                        nome = produto.nomeProduto,
                        preco = produto.precoProduto,
                        isPromocao = produto.isPromocao,
                        precoPromocao = produto.precoPromocao
                    )
                }?.toMutableList()

                val newList = currentList + (cardProductsList ?: emptyList())

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        productsCardList = newList
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

    fun getProductsByCategoria(nomeCategoria: String) {
        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val productsList = getProductsByCategoriaUseCase.invoke(nomeCategoria)
                val cardProductsList = productsList?.map { produto ->
                    ProductCardModel(
                        id = produto.id,
                        image = produto.image,
                        nome = produto.nomeProduto,
                        preco = produto.precoProduto,
                        isPromocao = produto.isPromocao,
                        precoPromocao = produto.precoPromocao
                    )
                }?.toMutableList()

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        productsCardList = cardProductsList ?: mutableListOf()
                    )
                }

            } catch (e: Exception) {
                Log.e("ProductsViewModel", e.toString())
            }
        }
    }

    fun verifyActivatedFilter(isFilterActivate: Boolean) {
        if (isFilterActivate) {
            viewModelScope.launch {
                _productUiState.update {
                    it.copy(
                        hasFilterActivate = true
                    )
                }
            }
        } else {
            viewModelScope.launch {
                _productUiState.update {
                    it.copy(
                        hasFilterActivate = false
                    )
                }
            }
        }
    }

    fun clearSingleProductSelected() {
        viewModelScope.launch {
            _productUiState.update {
                it.copy(
                    selectedProduct = null
                )
            }
        }
    }

    fun updateFilterActivate(filterName: String) {
        viewModelScope.launch {
            _productUiState.update {
                it.copy(
                    filterNameActivate = filterName
                )
            }
        }
    }

    fun loadMoreProducts(function: () -> Unit) {
        offset = offset + limit
        function()
    }

    fun resetOffset() {
        offset = 0
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

}

