package com.example.careiroapp.associacoes.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.UUID

data class AssociacaoProductModel(

    @SerializedName("id_produto")
    @Expose
    val idProduct: UUID,

    @SerializedName("nome")
    @Expose
    val nome: String,

    @SerializedName("preco")
    @Expose
    val preco: Float,

    @SerializedName("image")
    @Expose
    val image: String
)