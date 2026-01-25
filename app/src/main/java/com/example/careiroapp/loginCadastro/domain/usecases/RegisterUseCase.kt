package com.example.careiroapp.loginCadastro.domain.usecases

import com.example.careiroapp.loginCadastro.data.dto.ClienteDTO
import com.example.careiroapp.loginCadastro.data.repositories.LoginCadastroRepository
import okhttp3.MultipartBody
import retrofit2.Response
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val repository: LoginCadastroRepository
) {
    suspend operator fun invoke(
        cliente: ClienteDTO, imagePart: MultipartBody.Part?
    ): Response<ClienteDTO> {
        return repository.createCliente(cliente, imagePart)
    }
}