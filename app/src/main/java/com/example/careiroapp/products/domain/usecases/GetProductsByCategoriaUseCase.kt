package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import javax.inject.Inject

class GetProductsByCategoriaUseCase @Inject constructor(
    val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(nomeCategoria: String, offset: Int, limit: Int): List<ProductModel>? {
        return productsRepository.getProductsByCategoria(nomeCategoria, offset, limit)
    }
}