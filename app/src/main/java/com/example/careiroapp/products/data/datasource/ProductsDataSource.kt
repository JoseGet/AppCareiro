package com.example.careiroapp.products.data.datasource

import com.example.careiroapp.network.api.ProdutoApiService
import com.example.careiroapp.products.data.models.ProductModel
import java.util.UUID
import javax.inject.Inject

class ProductsDataSource @Inject constructor(
    val produtoApiService: ProdutoApiService
) {
    suspend fun getProducts(): List<ProductModel>? {
        val response = produtoApiService.getCardProducts().body()
        return response
    }

    suspend fun getProdutoById(id: UUID): ProductModel? {
        val response = produtoApiService.getProductById(id).body()
        return response
    }
}