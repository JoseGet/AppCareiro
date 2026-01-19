package com.example.careiroapp.loginCadastro.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ClienteDTO(

    @SerializedName("nome")
    @Expose
    val nome: String,

    @SerializedName("cpf")
    @Expose
    val cpf: String,

    @SerializedName("telefone")
    @Expose
    val telefone: String,

    @SerializedName("email")
    @Expose
    val email: String,

    @SerializedName("senha")
    @Expose
    val senha: String,

    @SerializedName("foto_perfil")
    @Expose
    val fotoPerfil: String
)