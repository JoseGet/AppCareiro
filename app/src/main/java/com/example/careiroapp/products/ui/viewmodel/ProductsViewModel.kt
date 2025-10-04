package com.example.careiroapp.products.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.products.data.models.ProductCardModel
import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.domain.usecases.GetAllProductsUseCase
import com.example.careiroapp.products.domain.usecases.GetProductByIdUseCase
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
    private val getAllProductsUseCase: GetAllProductsUseCase,
    private val getProductByIdUseCase: GetProductByIdUseCase
) : ViewModel() {

    private val _productUiState = MutableStateFlow(ProductsUiState())
    var productUiState: StateFlow<ProductsUiState> = _productUiState.asStateFlow()

    init {
        getAllCardProducts()
    }

    private fun getAllCardProducts() {
        viewModelScope.launch {
            try {
                _productUiState.update {
                    it.copy(
                        isLoading = true
                    )
                }

                val productsList = getAllProductsUseCase.invoke()
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

                _productUiState.update {
                    it.copy(
                        isLoading = false,
                        productsCardList = cardProductsList ?: emptyList()
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
}

