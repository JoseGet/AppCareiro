package com.example.careiroapp.products.domain.usecases

import android.util.Log
import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import javax.inject.Inject

class GetAllProductsUseCase @Inject constructor(
    private val repository: ProductsRepository
) {
    suspend operator fun invoke() : List<ProductModel>? {
        return repository.getProducts();
    }
}