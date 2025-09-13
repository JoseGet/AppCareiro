package com.example.careiroapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.associacoes.ui.AssociacoesView
import com.example.careiroapp.feiras.ui.FeirasView
import com.example.careiroapp.home.ui.HomeView
import com.example.careiroapp.products.ui.ProductsView

@Composable
fun TapBarNavHost(
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route
) {

    NavHost (
        navController,
        startDestination
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

        composable(
            NavigationItem.Feiras.route
        ) {
            FeirasView()
        }

        composable(
            NavigationItem.Associacoes.route
        ) {
            AssociacoesView()
        }
    }

}