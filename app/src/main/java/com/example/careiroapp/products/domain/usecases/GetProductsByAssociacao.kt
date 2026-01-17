package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.associacoes.data.models.AssociacaoProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import java.util.UUID
import javax.inject.Inject

class GetProductsByAssociacao @Inject constructor(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(idAssociacao: UUID): List<AssociacaoProductModel>? {
        return productsRepository.getProductsByAssociacao(idAssociacao)
    }
}