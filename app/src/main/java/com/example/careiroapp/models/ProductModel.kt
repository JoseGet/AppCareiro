package com.example.careiroapp.models

data class ProductModel(
    val image: Int,
    val nomeProduto: String,
    val precoProduto: Float,
    val isPromocao: Boolean,
    val precoPromocao: Double?
)