package com.example.careiroapp.products.data.models

import androidx.annotation.RequiresApi
import java.util.UUID

data class ProductCardModel(
    val id: UUID,
    val image: String,
    val nome: String,
    val preco: Float,
    val isPromocao: Boolean,
    val precoPromocao: Double?
)
