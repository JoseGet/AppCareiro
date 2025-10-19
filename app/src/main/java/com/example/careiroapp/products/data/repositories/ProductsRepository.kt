package com.example.careiroapp.products.data.repositories

import com.example.careiroapp.products.data.datasource.ProductsDataSource
import com.example.careiroapp.products.data.models.ProductModel
import java.util.UUID
import javax.inject.Inject

class ProductsRepository @Inject constructor(
    private val dataSource: ProductsDataSource
) {
    suspend fun getProducts(offset: Int, limit: Int): MutableList<ProductModel>? {
        return dataSource.getProducts(offset, limit)
    }

    suspend fun getProductsCount(): Int? {
        return dataSource.getProductsCount()
    }

    suspend fun getProductById(id: UUID): ProductModel? {
        return dataSource.getProdutoById(id)
    }

    suspend fun getProducts(nomeCategoria: String): List<ProductModel>? {
        return dataSource.getProductsByCategoria(nomeCategoria)
    }

}