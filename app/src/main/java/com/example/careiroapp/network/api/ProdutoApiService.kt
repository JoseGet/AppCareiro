package com.example.careiroapp.network.api

import com.example.careiroapp.products.data.models.ProductCountModel
import com.example.careiroapp.products.data.models.ProductModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.UUID

interface ProdutoApiService {
    @GET("produto/")
    suspend fun getCardProducts(
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int = 20
    ): Response<MutableList<ProductModel>>

    @GET("produto/count")
    suspend fun getProductsCount(): Response<ProductCountModel>

    @GET("produto/{id}")
    suspend fun getProductById(
        @Path("id") id: UUID
    ): Response<ProductModel>

    @GET("produto/categoria/{nome_categoria}")
    suspend fun getProductsByCategory(
        @Path("nome_categoria") nomeCategoria: String
    ): Response<List<ProductModel>>

}