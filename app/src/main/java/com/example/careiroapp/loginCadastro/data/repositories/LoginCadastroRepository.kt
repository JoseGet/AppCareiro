package com.example.careiroapp.loginCadastro.data.repositories

import com.example.careiroapp.loginCadastro.data.datasource.LoginCadastroDataSource
import com.example.careiroapp.loginCadastro.data.dto.ClienteDTO
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import javax.inject.Inject

class LoginCadastroRepository @Inject constructor(
    private val dataSource: LoginCadastroDataSource
) {
    suspend fun createCliente(
        cliente: ClienteDTO, imagePart: MultipartBody.Part?
    ): Response<ClienteDTO> {
        return dataSource.createCliente(cliente, imagePart)
    }
}