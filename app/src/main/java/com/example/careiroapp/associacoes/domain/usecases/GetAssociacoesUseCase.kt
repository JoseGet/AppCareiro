package com.example.careiroapp.associacoes.domain.usecases

import com.example.careiroapp.associacoes.data.models.AssociacaoModel
import com.example.careiroapp.associacoes.data.repositories.AssociacaoRepository
import javax.inject.Inject

class GetAssociacoesUseCase @Inject constructor(
    private val repository: AssociacaoRepository
) {

    suspend operator fun invoke(): MutableList<AssociacaoModel>? {
        return repository.getAssociacoes()
    }

}