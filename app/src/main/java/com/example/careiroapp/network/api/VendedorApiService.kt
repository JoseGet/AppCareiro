package com.example.careiroapp.network.api

import com.example.careiroapp.products.data.models.ProductVendedorModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.UUID

interface VendedorApiService {

    @GET("vendedor/{id}")
    suspend fun getVendedorById(
        @Path("id") id: UUID?
    ): Response<ProductVendedorModel>


}