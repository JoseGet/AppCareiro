package com.example.careiroapp.products.data.repositories

import com.example.careiroapp.associacoes.data.models.AssociacaoProductModel
import com.example.careiroapp.products.data.datasource.ProductsDataSource
import com.example.careiroapp.products.data.models.ProductModel
import com.example.careiroapp.products.data.models.ProductVendedorModel
import java.util.UUID
import javax.inject.Inject

class ProductsRepository @Inject constructor(
    private val productDataSource: ProductsDataSource,
) {
    suspend fun getProducts(offset: Int, limit: Int): MutableList<ProductModel>? {
        return productDataSource.getProducts(offset, limit)
    }

    suspend fun getProductsCount(): Int? {
        return productDataSource.getProductsCount()
    }

    suspend fun getProductById(id: UUID): ProductModel? {
        return productDataSource.getProdutoById(id)
    }

    suspend fun getProductsByCategoria(
        nomeCategoria: String,
        offset: Int,
        limit: Int
    ): List<ProductModel>? {
        return productDataSource.getProductsByCategoria(nomeCategoria, offset, limit)
    }

    suspend fun getProductsByCategoriaCount(nomeCategoria: String): Int? {
        return productDataSource.getProductsByCategoriaCount(nomeCategoria)
    }

    suspend fun getProductVendedorById(idVendedor: UUID?): ProductVendedorModel? {
        return productDataSource.getProductVendedorById(idVendedor)
    }

    suspend fun getProductsByAssociacao(idAssociacao: UUID): List<AssociacaoProductModel>? {
        return productDataSource.getProductsByAssociacao(idAssociacao)
    }

}