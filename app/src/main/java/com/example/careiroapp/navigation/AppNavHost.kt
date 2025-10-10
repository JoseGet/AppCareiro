package com.example.careiroapp.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.BaseView

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = NavigationItem.Main.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            NavigationItem.Main.route
        ) {
            BaseView(navController)
        }

        composable(
            "teste"
        ) {
            Column {
                Text("banana")
            }
        }
    }
}