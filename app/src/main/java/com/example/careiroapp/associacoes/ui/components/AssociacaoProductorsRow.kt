package com.example.careiroapp.associacoes.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.associacoes.data.models.AssociacaoProductorModel
import com.example.careiroapp.common.components.ModulesHeader

@Composable
fun AssociacaoProductorsRow(
    productorsList: List<AssociacaoProductorModel>
) {

    val rowState = rememberScrollState()

    Column() {
        ModulesHeader(
            titulo = stringResource(R.string.produtores_associados),
            subtitulo = stringResource(R.string.conheca_quem_faz_parte)
        )
        Spacer(Modifier.height(24.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(productorsList) { item ->
                ProductorCell(
                    image = item.image,
                    productorName = item.nome
                )
            }
        }
    }

}