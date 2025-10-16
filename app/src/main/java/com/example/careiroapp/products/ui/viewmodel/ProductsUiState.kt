package com.example.careiroapp.products.ui.viewmodel

import com.example.careiroapp.products.data.models.ProductCardModel
import com.example.careiroapp.products.data.models.ProductModel

data class ProductsUiState(
    val isLoading: Boolean = false,
    val productsCardList: List<ProductCardModel> = listOf(),
    val selectedProduct: ProductModel? = null,
    val filterNameActivate: String? = null,
    val endOfListReached: Boolean = false
)