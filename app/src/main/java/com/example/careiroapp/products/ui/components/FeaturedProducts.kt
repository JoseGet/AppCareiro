package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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

    val context = LocalContext.current

    val produto1 = R.drawable.tomates
    val uriProduto1 = "android.resource://${context.packageName}/$produto1"

    val produto2 = R.drawable.peras
    val uriProduto2 = "android.resource://${context.packageName}/$produto2"

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
                image = uriProduto1,
                nomeProduto = "Tomates",
                precoProduto = 10.0f,
                isPromocao = true,
                precoPromocao = 8.00,
                haveButton = false,
                onClick = {

                }
            )
            CardProduto(
                modifier = Modifier
                    .weight(1f),
                image = uriProduto2,
                nomeProduto = "Peras",
                precoProduto = 10.0f,
                isPromocao = true,
                precoPromocao = 8.00,
                haveButton = false,
                onClick = {

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