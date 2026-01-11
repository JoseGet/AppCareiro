package com.example.careiroapp.associacoes.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader

@Composable
fun AssociacaoProductorsRow(
    productorsList: String
) {

    val rowState = rememberScrollState()

    Column() {
        ModulesHeader(
            titulo = stringResource(R.string.produtores_associados),
            subtitulo = stringResource(R.string.conheca_quem_faz_parte)
        )
        Spacer(Modifier.height(24.dp))
//        LazyRow(
//
//        ) {
//            items() { item ->
//                ProductorCell()
//            }
//        }
    }

}