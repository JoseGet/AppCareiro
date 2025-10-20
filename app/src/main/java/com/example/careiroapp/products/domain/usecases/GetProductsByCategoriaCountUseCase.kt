package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.repositories.ProductsRepository
import javax.inject.Inject

class GetProductsByCategoriaCountUseCase @Inject constructor(
    val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(nomeCategoria: String): Int? {
        return productsRepository.getProductsByCategoriaCount(nomeCategoria)
    }
}