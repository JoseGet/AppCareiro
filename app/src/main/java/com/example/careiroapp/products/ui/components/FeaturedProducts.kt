package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.components.cards.CardProduto
import com.example.careiroapp.navigation.NavigationItem

@Composable
fun FeaturedProducts(
    navController: NavController
) {
    Column {
        ModulesHeader(
            titulo = stringResource(R.string.produtos_em_destaque),
            subtitulo = null
        )
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CardProduto(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(R.drawable.abobora),
                nomeProduto = "Abobora",
                precoProduto = 10.0f,
                isPromocao = true,
                precoPromocao = 8.00,
                haveButton = false,
                onClick = {
                    navController.navigate(NavigationItem.ProdutoUnico.route)
                }
            )
            CardProduto(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(R.drawable.limao),
                nomeProduto = "Limao",
                precoProduto = 10.0f,
                isPromocao = true,
                precoPromocao = 8.00,
                haveButton = false,
                onClick = {
                    navController.navigate(NavigationItem.ProdutoUnico.route)
                }
            )
        }
    }
}

@Composable
@Preview
private fun FeaturedProductsPreview() {
    FeaturedProducts(
        navController = rememberNavController()
    )
}