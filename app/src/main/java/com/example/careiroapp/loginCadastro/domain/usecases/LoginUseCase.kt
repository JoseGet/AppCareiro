package com.example.careiroapp.loginCadastro.domain.usecases

import com.example.careiroapp.loginCadastro.data.model.LoginRequestModel
import com.example.careiroapp.loginCadastro.data.model.LoginResponseModel
import com.example.careiroapp.loginCadastro.data.repositories.LoginCadastroRepository
import retrofit2.Response
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: LoginCadastroRepository
) {
    suspend operator fun invoke(loginRequestModel: LoginRequestModel): Response<LoginResponseModel> {
        return repository.login(loginRequestModel)
    }
}