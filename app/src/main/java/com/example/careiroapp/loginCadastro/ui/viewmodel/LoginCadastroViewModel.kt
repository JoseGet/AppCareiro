package com.example.careiroapp.loginCadastro.ui.viewmodel

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginCadastroViewModel (

): ViewModel() {
    private val _uiState = MutableStateFlow(LoginCadastroUiState())
    var uiState: StateFlow<LoginCadastroUiState> = _uiState.asStateFlow()

    fun changeCardState(newCardState: CardState) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true
                )
            }
        }

        val newCardState = newCardState

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = false,
                    cardState = newCardState
                )
            }
        }
    }


}