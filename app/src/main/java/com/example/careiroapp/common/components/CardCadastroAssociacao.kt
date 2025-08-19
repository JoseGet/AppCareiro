package com.example.careiroapp.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CardCadastroAssociacao() {

    Card (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Column (

        ) {
            Text("")
            Text("")
        }
    }
}

@Composable
@Preview
fun CardCadastroAssociacaoPreview() {
    CardCadastroAssociacao()
}