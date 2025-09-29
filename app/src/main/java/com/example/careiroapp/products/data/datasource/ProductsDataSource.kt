package com.example.careiroapp.products.data.datasource

import com.example.careiroapp.network.api.ApiService
import com.example.careiroapp.products.data.models.ProductModel

class ProductsDataSource(
    val apiService: ApiService
) {
    suspend fun getProducts(

    ): List<ProductModel>? {
        val response = apiService.getCardProducts().body()
        return response
    }
}