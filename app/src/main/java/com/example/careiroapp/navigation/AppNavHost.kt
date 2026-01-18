package com.example.careiroapp.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.BaseView
import com.example.careiroapp.bag.ui.BagView
import com.example.careiroapp.checkout.ui.CheckoutView
import com.example.careiroapp.checkout.ui.PickupView
import com.example.careiroapp.loginCadastro.ui.LoginView
import com.example.careiroapp.navigation.NavigationItem.*

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Login.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            Main.route
        ) {
            BaseView(navController)
        }

        composable(
            Sacola.route
        ) {
            Column {
                BagView(navController)
            }
        }
        composable(
            Checkout.route
        ) {
            Column {
                CheckoutView(navController)
            }
        }

        composable (
            Pickup.route
        ){
            PickupView(navController)
        }

        composable(
            Login.route
        ) {
            LoginView(navController)
        }
    }
}