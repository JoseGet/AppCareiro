package com.example.careiroapp.loginCadastro.ui.viewmodel

data class LoginCadastroUiState(
    val isLoading: Boolean = false,
    val cardState: CardState = CardState.LOGIN
)

enum class CardState{
    LOGIN,
    CADASTRO
}
