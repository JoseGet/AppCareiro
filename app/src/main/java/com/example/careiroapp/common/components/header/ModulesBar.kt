package com.example.careiroapp.common.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.navigation.NavigationItem

@Composable
fun ModulesBar(
    navController: NavController,
    resetScrollFunction: () -> Unit
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Row (
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .background(color = colorResource(R.color.dark_green)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.home),
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.clickable(
                enabled = currentRoute != NavigationItem.Home.route,
                onClick = {
                    navController.navigate(NavigationItem.Home.route) {
                        popUpTo(0)
                        resetScrollFunction()
                    }
                }
            )
        )
        Text(
            text = stringResource(R.string.produtos),
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.clickable(
                enabled = currentRoute != NavigationItem.Produtos.route,
                onClick = {
                    navController.navigate(NavigationItem.Produtos.route) {
                        popUpTo(0)
                        resetScrollFunction()
                    }
                }
            )
        )
        Text(
            text = stringResource(R.string.feiras),
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.clickable(
                enabled = currentRoute != NavigationItem.Feiras.route,
                onClick = {
                    navController.navigate(NavigationItem.Feiras.route) {
                        popUpTo(0)
                        resetScrollFunction()
                    }
                }
            )
        )
        Text(
            text = stringResource(R.string.associacoes),
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.clickable(
                enabled = currentRoute != NavigationItem.Associacoes.route,
                onClick = {
                    navController.navigate(NavigationItem.Associacoes.route) {
                        popUpTo(0)
                        resetScrollFunction()
                    }
                }
            )
        )
    }
}

@Preview
@Composable
fun ModulesBarPreview() {
    ModulesBar(
        navController = rememberNavController(),
        resetScrollFunction = {}
    )
}