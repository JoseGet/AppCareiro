package com.example.careiroapp.associacoes.ui.viewmodel

import com.example.careiroapp.associacoes.data.models.AssociacaoModel

data class AssociacaoUiState(
    val isLoading: Boolean = false,
    val associacoesList: List<AssociacaoModel> = listOf(),
    val selectedAssociacao: AssociacaoModel? = null
)