package com.example.careiroapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.home.ui.HomeView
import com.example.careiroapp.products.ui.ProductsView

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            NavigationItem.Home.route
        ) {
            HomeView(
                navController
            )
        }

        composable(
            NavigationItem.Produtos.route
        ) {
            ProductsView()
        }
    }
}

enum class Screen {
    HOME,
    PRODUTOS,
}

sealed class NavigationItem(val route: String) {
    object Home: NavigationItem(Screen.HOME.name)
    object Produtos: NavigationItem(Screen.PRODUTOS.name)
}