package com.example.careiroapp.products.data.models

data class ProductModel(
    val image: Int,
    val nomeProduto: String,
    val precoProduto: Float,
    val isPromocao: Boolean,
    val precoPromocao: Double?
)