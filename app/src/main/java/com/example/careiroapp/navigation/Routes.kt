package com.example.careiroapp.navigation

enum class Screen {
    MAIN,
    HOME,
    PRODUTOS,
    FEIRAS,
    ASSOCIACOES,
    PRODUTO_UNICO,
    SACOLA,
    CHECKOUT,
    PICKUP,
    PROFILE,

    SOBRE_NOS
}

sealed class NavigationItem(val route: String) {
    object Main : NavigationItem(Screen.MAIN.name)
    object Home : NavigationItem(Screen.HOME.name)
    object Produtos : NavigationItem(Screen.PRODUTOS.name)
    object Feiras : NavigationItem(Screen.FEIRAS.name)
    object Associacoes : NavigationItem(Screen.ASSOCIACOES.name)
    object ProdutoUnico : NavigationItem(Screen.PRODUTO_UNICO.name)

    object Sacola: NavigationItem(route = Screen.SACOLA.name)

    object Checkout: NavigationItem(route = Screen.CHECKOUT.name)
    object Pickup: NavigationItem(route = Screen.PICKUP.name)

    object Profile: NavigationItem(route = Screen.PROFILE.name)
    object SobreNos: NavigationItem(route = Screen.SOBRE_NOS.name)
}