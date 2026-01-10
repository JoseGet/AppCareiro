package com.example.careiroapp.feiras.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.components.cards.CardCadastroAssociacao
import com.example.careiroapp.feiras.ui.components.FeirasGrid
import com.example.careiroapp.feiras.ui.viewmodel.FeiraViewModel
import com.example.careiroapp.navigation.NavigationItem

@Composable
fun FeirasView(
    navController: NavController,
    feiraViewModel: FeiraViewModel
) {
    val uiState = feiraViewModel.feiraUiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        ModulesHeader(
            titulo = stringResource(R.string.feiras),
            subtitulo = null
        )
        Column (
            modifier = Modifier
                .wrapContentWidth()
                .height(500.dp)
        ) {
            FeirasGrid(
                list = uiState.value.feirasCardList,
                onClickCard = { id ->
                    feiraViewModel.getFeiraById(id)
                    navController.navigate(NavigationItem.FeiraUnica.route)
                }
            )
        }
        Spacer(Modifier.height(24.dp))
        CardCadastroAssociacao()
    }
}

@Composable
@Preview(showBackground = true)
private fun FeirasViewPreview() {
    //FeirasView()
}