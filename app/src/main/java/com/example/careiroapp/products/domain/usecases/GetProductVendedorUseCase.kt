package com.example.careiroapp.products.domain.usecases

import com.example.careiroapp.products.data.models.ProductVendedorModel
import com.example.careiroapp.products.data.repositories.ProductsRepository
import java.util.UUID
import javax.inject.Inject

class GetProductVendedorUseCase @Inject constructor(
    private val repository: ProductsRepository
) {
    suspend operator fun invoke(idVendedor: UUID?): ProductVendedorModel? {
        return repository.getProductVendedorById(idVendedor)
    }
}