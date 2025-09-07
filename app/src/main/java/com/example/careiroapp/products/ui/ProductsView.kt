package com.example.careiroapp.products.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.components.cards.CardProduto
import com.example.careiroapp.products.ui.components.FilterRow

@Composable
fun ProductsView(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
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
                haveButton = false
            )
            CardProduto(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(R.drawable.limao),
                nomeProduto = "Limao",
                precoProduto = 10.0f,
                isPromocao = true,
                precoPromocao = 8.00,
                haveButton = false
            )
        }
        Spacer(Modifier.height(24.dp))
        ModulesHeader(
            titulo = stringResource(R.string.confira_nossos_produtos),
            subtitulo = null
        )
        FilterRow(
            productsCounter = 8
        )

    }
}

@Composable
@Preview
private fun ProductsViewPreview(){
    ProductsView()
}