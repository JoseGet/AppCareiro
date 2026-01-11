package com.example.careiroapp.products.data.datasource

import com.example.careiroapp.network.api.ProdutoApiService
import com.example.careiroapp.network.api.VendedorApiService
import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.models.ProductVendedorModel
import java.util.UUID
import javax.inject.Inject

class ProductsDataSource @Inject constructor(
    val produtoApiService: ProdutoApiService,
    val vendedorApiService: VendedorApiService
) {
    suspend fun getProducts(offset: Int, limit: Int): MutableList<ProductModel>? {
        val response = produtoApiService.getCardProducts(offset, limit).body()
        return response
    }

    suspend fun getProductsCount(): Int? {
        val response = produtoApiService.getProductsCount().body()
        return response?.total
    }

    suspend fun getProdutoById(id: UUID): ProductModel? {
        val response = produtoApiService.getProductById(id).body()
        return response
    }

    suspend fun getProductsByCategoria(nomeCategoria: String, offset: Int, limit: Int): List<ProductModel>? {
        val response = produtoApiService.getProductsByCategory(nomeCategoria, offset, limit).body()
        return response
    }

    suspend fun getProductsByCategoriaCount(nomeCategoria: String): Int? {
        val response = produtoApiService.getProductsByCategoriaCount(nomeCategoria).body()
        return response?.total
    }

    suspend fun getProductVendedorById(idVendedor: UUID?): ProductVendedorModel? {
        val response = vendedorApiService.getVendedorById(idVendedor).body()
        return response
    }
}