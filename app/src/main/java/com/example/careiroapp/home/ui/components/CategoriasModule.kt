package com.example.careiroapp.home.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.cards.CardCategorias
import com.example.careiroapp.common.enums.EnumCategorias
import com.example.careiroapp.navigation.NavigationItem

@Composable
fun CategoriasModule(
    navController: NavController,
    resetScrollFunction: () -> Unit
) {

    val rowState = rememberScrollState()

    Row(
        modifier = Modifier
            .horizontalScroll(state = rowState),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CardCategorias(
            title = stringResource(R.string.ver_tudo),
            onClick = {
                navController.navigate(NavigationItem.Produtos.route)
                resetScrollFunction()
            }
        )
        CardCategorias(
            title = stringResource(R.string.legumes),
            onClick = {
                navController.navigate("${NavigationItem.Produtos.route}/{nomeCategoria}".replace(
                    oldValue = "{nomeCategoria}",
                    newValue = EnumCategorias.LEGUMES.name
                ))
                resetScrollFunction()
            }
        )
        CardCategorias(
            title = stringResource(R.string.frutas),
            onClick = {
                navController.navigate("${NavigationItem.Produtos.route}/{nomeCategoria}".replace(
                    oldValue = "{nomeCategoria}",
                    newValue = EnumCategorias.FRUTAS.name
                ))
                resetScrollFunction()
            }
        )
        CardCategorias(
            title = stringResource(R.string.verduras),
            onClick = {
                navController.navigate("${NavigationItem.Produtos.route}/{nomeCategoria}".replace(
                    oldValue = "{nomeCategoria}",
                    newValue = EnumCategorias.VERDURAS.name
                ))
                resetScrollFunction()
            }
        )
    }
}

@Composable
@Preview
private fun CategoriasModulePreview() {
    CategoriasModule(
        navController = rememberNavController(),
        resetScrollFunction = {}
    )
}