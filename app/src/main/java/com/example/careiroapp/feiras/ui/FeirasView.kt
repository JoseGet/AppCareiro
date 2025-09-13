package com.example.careiroapp.feiras.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader

@Composable
fun FeirasView() {
    ModulesHeader(
        titulo = stringResource(R.string.associacoes),
        subtitulo = null
    )

}

@Composable
@Preview(showBackground = true)
private fun FeirasViewPreview() {
    FeirasView()
}