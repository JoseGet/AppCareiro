package com.example.careiroapp.products.data.repositories

import com.example.careiroapp.products.data.datasource.ProductsDataSource
import com.example.careiroapp.products.data.models.ProductModel

class ProductsRepository (
    private val dataSource: ProductsDataSource
) {
    suspend fun getProducts(): List<ProductModel> {
        return dataSource.getProducts()
    }
}