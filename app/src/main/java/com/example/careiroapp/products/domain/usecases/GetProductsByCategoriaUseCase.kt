package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import javax.inject.Inject

class GetProductsByCategoriaUseCase @Inject constructor(
    val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(nomeCategoria: String): List<ProductModel>? {
        return productsRepository.getProducts(nomeCategoria)
    }
}