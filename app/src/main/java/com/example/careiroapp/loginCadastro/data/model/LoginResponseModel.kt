package com.example.careiroapp.loginCadastro.data.model

import com.example.careiroapp.loginCadastro.data.dto.ClienteDTO
import com.google.gson.annotations.SerializedName

data class LoginResponseModel(

    @SerializedName("token")
    val token: String,

    @SerializedName("refreshToken")
    val refreshToken: String,

    @SerializedName("cliente")
    val cliente: ClienteDTO

)