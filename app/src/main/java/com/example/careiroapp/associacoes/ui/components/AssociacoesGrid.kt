package com.example.careiroapp.associacoes.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.common.components.cards.CardDefault
import com.example.careiroapp.mocks.Mocks
import com.example.careiroapp.models.AssociacaoModel

@Composable
fun AssociacoesGrid(
    list: List<AssociacaoModel>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(list) { item ->
            CardDefault(
                modifier = Modifier
                    .padding(bottom = 16.dp),
                image = painterResource(item.image),
                titleText = item.nomeAssociacao
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun AssociacoesGridModel() {
    AssociacoesGrid(
        modifier = Modifier,
        list = Mocks.associacoesCardList
    )
}