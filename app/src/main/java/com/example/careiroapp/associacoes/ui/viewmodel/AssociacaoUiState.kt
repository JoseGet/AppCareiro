package com.example.careiroapp.associacoes.ui.viewmodel

import com.example.careiroapp.associacoes.data.models.AssociacaoModel
import com.example.careiroapp.associacoes.data.models.AssociacaoProductModel

data class AssociacaoUiState(
    val isLoading: Boolean = false,
    val associacoesList: List<AssociacaoModel> = listOf(),
    val selectedAssociacao: AssociacaoModel? = null,
    val productsList: List<AssociacaoProductModel> = mutableListOf()
)