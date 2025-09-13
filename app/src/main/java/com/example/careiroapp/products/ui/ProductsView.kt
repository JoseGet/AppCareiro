package com.example.careiroapp.products.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.components.cards.CardProduto
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.mocks.MockedLists
import com.example.careiroapp.products.ui.components.FilterRow
import com.example.careiroapp.products.ui.components.ProductsGrid

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
        Spacer(Modifier.height(24.dp))
        Column (
            modifier = Modifier
                .wrapContentWidth()
                .height(500.dp)
        ) {
            Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .wrapContentHeight(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "Ver tudo",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = montserratBoldFontFamily,
                        color = colorResource(R.color.dark_gray)
                    )
                )
            }
            Spacer(Modifier.height(24.dp))
            ProductsGrid(
                list = MockedLists.productsCardList
            )
        }
    }
}

@Composable
@Preview
private fun ProductsViewPreview(){
    ProductsView()
}