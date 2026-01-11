package com.example.careiroapp.network.api

import com.example.careiroapp.associacoes.data.models.AssociacaoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.UUID

interface AssociacaoApiService {

    @GET("associacao/")
    suspend fun getAssociacoes(): Response<MutableList<AssociacaoModel>>

    @GET("associacao/{id}")
    suspend fun getAssociacaoById(
        @Path("id")id : UUID
    ): Response<AssociacaoModel>

}