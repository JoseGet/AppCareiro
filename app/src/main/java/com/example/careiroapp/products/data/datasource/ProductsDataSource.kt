package com.example.careiroapp.products.data.datasource

import com.example.careiroapp.associacoes.data.models.AssociacaoProductModel
import com.example.careiroapp.data.network.api.ProdutoApiService
import com.example.careiroapp.data.network.api.VendedorApiService
import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.models.ProductVendedorModel
import java.util.UUID
import javax.inject.Inject

class ProductsDataSource @Inject constructor(
    val productApiService: ProdutoApiService,
    val vendedorApiService: VendedorApiService
) {
    suspend fun getProducts(offset: Int, limit: Int): MutableList<ProductModel>? {
        val response = productApiService.getCardProducts(offset, limit).body()
        return response
    }

    suspend fun getProductsCount(): Int? {
        val response = productApiService.getProductsCount().body()
        return response?.total
    }

    suspend fun getProdutoById(id: UUID): ProductModel? {
        val response = productApiService.getProductById(id).body()
        return response
    }

    suspend fun getProductsByCategoria(nomeCategoria: String, offset: Int, limit: Int): List<ProductModel>? {
        val response = productApiService.getProductsByCategory(nomeCategoria, offset, limit).body()
        return response
    }

    suspend fun getProductsByCategoriaCount(nomeCategoria: String): Int? {
        val response = productApiService.getProductsByCategoriaCount(nomeCategoria).body()
        return response?.total
    }

    suspend fun getProductVendedorById(idVendedor: UUID?): ProductVendedorModel? {
        val response = vendedorApiService.getVendedorById(idVendedor).body()
        return response
    }

    suspend fun getProductsByAssociacao(idAssociacao: UUID): List<AssociacaoProductModel>? {
        val response = productApiService.getProductsByAssociacao(idAssociacao).body()
        return response
    }
}