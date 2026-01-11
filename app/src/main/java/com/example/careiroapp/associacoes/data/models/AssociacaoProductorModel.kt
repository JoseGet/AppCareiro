package com.example.careiroapp.associacoes.data.models

import java.util.UUID

data class AssociacaoProductorModel(
    val id: UUID,
    val image: String? = null,
    val nome: String
)