package com.example.careiroapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careiroapp.profile.util.ProfileRoutes

@Composable
fun ProfileBarNavHost(
    navController: NavHostController,
    startDestination: String = ProfileRoutes.Pedidos.name
) {

    NavHost(
        navController,
        startDestination
    ) {


    }

}