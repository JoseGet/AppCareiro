package com.example.careiroapp.products.data.models

data class ProductCardModel(
    val nome: String,
    val preco: Float,
    val isPromocao: Boolean,
    val precoPromocao: Float?
)
