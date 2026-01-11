package com.example.careiroapp.associacoes.data.datasources

import com.example.careiroapp.associacoes.data.models.AssociacaoModel
import com.example.careiroapp.network.api.AssociacaoApiService
import java.util.UUID
import javax.inject.Inject

class AssociacaoDataSource @Inject constructor(
    private val associacaoApiService: AssociacaoApiService
) {
    suspend fun getAssociacoes(): MutableList<AssociacaoModel>? {
        return associacaoApiService.getAssociacoes().body()
    }

    suspend fun getAssociacaoById(id: UUID): AssociacaoModel? {
        return associacaoApiService.getAssociacaoById(id).body()
    }

}