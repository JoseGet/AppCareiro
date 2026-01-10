package com.example.careiroapp.network.api

import com.example.careiroapp.feiras.data.models.FeiraModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FeiraApiService {

    @GET("feira/")
    suspend fun getFeiras(): Response<MutableList<FeiraModel>>

    @GET("feira/{id}")
    suspend fun getFeiraById(
        @Path("id")id: Int
    ): Response<FeiraModel>


}