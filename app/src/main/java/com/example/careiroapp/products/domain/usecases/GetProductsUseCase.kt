package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(offset: Int, limit: Int) : MutableList<ProductModel>? {
        return productsRepository.getProducts(offset, limit);
    }
}