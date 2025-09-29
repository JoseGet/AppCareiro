package com.example.careiroapp.network.api

import com.example.careiroapp.products.data.models.ProductCardModel
import com.example.careiroapp.products.data.models.ProductModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("produto/")
    suspend fun getCardProducts(
        @Query("offset") offset: Int = 10,
        @Query("limit") limit: Int = 20
    ): Response<List<ProductModel>>

    @GET("")
    suspend fun getProductById() {

    }

    @GET("")
    suspend fun getProductsByCategory() {

    }

}