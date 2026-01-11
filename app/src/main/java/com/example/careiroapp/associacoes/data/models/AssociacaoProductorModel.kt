package com.example.careiroapp.associacoes.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.UUID

data class AssociacaoProductorModel(

    @SerializedName("id_vendedor")
    @Expose
    val id: UUID,

    @SerializedName("image")
    @Expose
    val image: String? = null,

    @SerializedName("nome")
    @Expose
    val nome: String
)