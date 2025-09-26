package com.example.careiroapp.network.api

import com.example.careiroapp.products.data.models.ProductCardModel
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("produto")
    suspend fun getAllCardProducts(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<ProductCardModel>

    @GET("")
    suspend fun getProductById() {

    }

    @GET("")
    suspend fun getAllProductsByCategory() {

    }

}