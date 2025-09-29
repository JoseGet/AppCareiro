package com.example.careiroapp.products.data.models

import java.util.UUID

data class ProductCardModel(
    val id: UUID,
    val image: Int,
    val nome: String,
    val preco: Float,
    val isPromocao: Boolean,
    val precoPromocao: Double?
)
