package com.example.careiroapp.navigation

enum class Screen {
    MAIN,
    HOME,
    PRODUTOS,
    FEIRAS,
    ASSOCIACOES,
    PRODUTO_UNICO,
    SACOLA,
    PROFILE,
}

sealed class NavigationItem(val route: String) {
    object Main : NavigationItem(Screen.MAIN.name)
    object Home : NavigationItem(Screen.HOME.name)
    object Produtos : NavigationItem(Screen.PRODUTOS.name)
    object Feiras : NavigationItem(Screen.FEIRAS.name)
    object Associacoes : NavigationItem(Screen.ASSOCIACOES.name)
    object ProdutoUnico : NavigationItem(Screen.PRODUTO_UNICO.name)

    object Sacola: NavigationItem(route = Screen.SACOLA.name)

    object Profile: NavigationItem(route = Screen.PROFILE.name)
}