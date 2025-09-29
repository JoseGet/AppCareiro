package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository

class GetAllProductsUseCase(
    private val repository: ProductsRepository
) {
    suspend operator fun invoke() : List<ProductModel>{
        return repository.getProducts();
    }
}