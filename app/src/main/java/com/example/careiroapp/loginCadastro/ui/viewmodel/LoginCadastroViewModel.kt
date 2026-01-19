package com.example.careiroapp.loginCadastro.ui.viewmodel

import android.app.Activity
import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.Application
import com.example.careiroapp.loginCadastro.data.dto.ClienteDTO
import com.example.careiroapp.loginCadastro.domain.usecases.RegisterUseCase
import dagger.hilt.android.internal.Contexts.getApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.toRequestBody
import javax.inject.Inject

@HiltViewModel
class LoginCadastroViewModel @Inject constructor(
    private val registerUseCase: RegisterUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(LoginCadastroUiState())
    var uiState: StateFlow<LoginCadastroUiState> = _uiState.asStateFlow()

    fun changeCardState(newCardState: CardState) {

        val newCardState = newCardState

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    cardState = newCardState
                )
            }
        }
    }

    fun makeCadastro(
        context: Context,
        nome: String,
        cpf: String,
        telefone: String,
        email: String,
        senha: String,
        uriImage: String?
    ) {
        viewModelScope.launch {
            _uiState.update {it.copy(isLoading = true)}

            val clienteDTO = ClienteDTO(
                nome,
                cpf,
                telefone,
                email,
                senha,
                ""
            )

            val imagePart = if (uriImage != null) prepararImagemPart(context, uriImage) else null
            registerUseCase.invoke(clienteDTO, imagePart)


            _uiState.update { it.copy(isLoading = false) }
        }

    }

    private fun prepararImagemPart(context: Context, uriString: String?): MultipartBody.Part? {

        if (uriString.isNullOrEmpty() || uriString == "null") {
            return null
        }

        val uri = Uri.parse(uriString)
        val contentResolver = context.contentResolver

        val inputStream = contentResolver.openInputStream(uri)
        val bytes = inputStream?.readBytes() ?: return null

        val requestFile = bytes.toRequestBody("image/*".toMediaTypeOrNull())

        return MultipartBody.Part.createFormData("foto_perfil", "perfil.jpg", requestFile)
    }


}