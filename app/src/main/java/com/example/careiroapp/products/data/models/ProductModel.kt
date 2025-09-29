package com.example.careiroapp.products.data.models

import java.util.UUID

data class ProductModel(
    val id: UUID,
    val image: Int,
    val descricao: String,
    val disponivel: Boolean,
    val nomeProduto: String,
    val precoProduto: Float,
    val isPromocao: Boolean,
    val precoPromocao: Double?
)