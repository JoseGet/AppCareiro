package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import java.util.UUID
import javax.inject.Inject

class GetProductByIdUseCase @Inject constructor(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(id: UUID): ProductModel? {
        return productsRepository.getProductById(id)
    }
}