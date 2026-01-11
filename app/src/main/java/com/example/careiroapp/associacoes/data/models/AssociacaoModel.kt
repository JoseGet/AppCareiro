package com.example.careiroapp.associacoes.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.UUID

data class AssociacaoModel(

    @SerializedName("id_associacao")
    @Expose
    val idAssociacao: UUID,

    @SerializedName("nome")
    @Expose
    val nome: String,

    @SerializedName("descricao")
    @Expose
    val descricao: String,

    @SerializedName("image")
    @Expose
    val image: String?,

    @SerializedName("data_hora")
    @Expose
    val dataHora: String?,

    @SerializedName("endereco")
    @Expose
    val endereco: String?
)