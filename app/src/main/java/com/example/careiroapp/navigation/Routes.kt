package com.example.careiroapp.navigation

enum class Screen {
                  MAIN,
    HOME,
    PRODUTOS,
    FEIRAS,
    ASSOCIACOES
}

sealed class NavigationItem(val route: String) {
    object Main: NavigationItem(Screen.MAIN.name)
    object Home: NavigationItem(Screen.HOME.name)
    object Produtos: NavigationItem(Screen.PRODUTOS.name)
    object Feiras: NavigationItem(Screen.FEIRAS.name)
    object Associacoes: NavigationItem(Screen.ASSOCIACOES.name)
}