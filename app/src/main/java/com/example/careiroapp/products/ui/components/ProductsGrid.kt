package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.cards.CardProduto
import com.example.careiroapp.mocks.MockedLists
import com.example.careiroapp.models.ProductModel

@Composable
fun ProductsGrid(
    list: List<ProductModel>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(list) { item ->
            CardProduto(
                modifier = Modifier
                    .padding(bottom = 16.dp),
                image = painterResource(R.drawable.abobora),
                nomeProduto = item.nomeProduto,
                precoProduto = item.precoProduto,
                isPromocao = item.isPromocao,
                precoPromocao = item.precoPromocao,
                haveButton = true
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun AppGridPreview() {
    ProductsGrid(
        modifier = Modifier,
        list = MockedLists.productsCardList
    )
}