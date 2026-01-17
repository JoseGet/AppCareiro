package com.example.careiroapp.home.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun TutorialRow() {
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TutorialCard(
            modifier = Modifier
                .weight(1f),
            number = 1,
            image = painterResource(R.drawable.agricultor_desenho),
            description = stringResource(R.string.como_funciona_o_agriconnect_1)
        )
        TutorialCard(
            modifier = Modifier
                .weight(1f),
            number = 2,
            image = painterResource(R.drawable.celular_desenho),
            description = stringResource(R.string.como_funciona_o_agriconnect_2)
        )
        TutorialCard(
            modifier = Modifier
                .weight(1f),
            number = 3,
            image = painterResource(R.drawable.frutas_desenho),
            description = stringResource(R.string.como_funciona_o_agriconnect_3)
        )
    }
}

@Composable
@Preview
private fun PreviewTutorialRow() {
    TutorialRow()
}