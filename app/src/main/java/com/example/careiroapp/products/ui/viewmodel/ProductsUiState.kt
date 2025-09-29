package com.example.careiroapp.products.ui.viewmodel

import com.example.careiroapp.products.data.models.ProductCardModel

data class ProductsUiState(
    val isLoading: Boolean = false,
    val productsCardList: List<ProductCardModel> = emptyList()
)