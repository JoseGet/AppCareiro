package com.example.careiroapp.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.BaseView
import com.example.careiroapp.bag.ui.BagView
import com.example.careiroapp.navigation.NavigationItem.*

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Main.route
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
            "teste"
        ) {
            Column {
                BagView(navController)
            }
        }
    }
}