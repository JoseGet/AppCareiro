package com.example.careiroapp.feiras.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.associacoes.ui.components.AssociacoesGrid
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.feiras.ui.components.FeirasGrid
import com.example.careiroapp.mocks.MockedLists

@Composable
fun FeirasView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        ModulesHeader(
            titulo = stringResource(R.string.feiras),
            subtitulo = null
        )
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .height(500.dp)
        ) {
            FeirasGrid(
                list = MockedLists.feirasCardList
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun FeirasViewPreview() {
    FeirasView()
}