package com.example.careiroapp.common.components.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun AppFooter() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = colorResource(R.color.light_gray))
            .padding(vertical = 34.dp, horizontal = 44.dp),
    ) {
        ModulesColumnFooter(
            titulo = stringResource(R.string.o_agriconnect),
            subtitulo_1 = stringResource(R.string.o_que_e),
            subtitulo_2 = stringResource(R.string.quem_faz_parte),
            subtitulo_3 = stringResource(R.string.como_participar)
        )
        Spacer(Modifier.height(24.dp))
        ModulesColumnFooter(
            titulo = stringResource(R.string.produtos),
            subtitulo_1 = stringResource(R.string.verduras),
            subtitulo_2 = stringResource(R.string.legumes),
            subtitulo_3 = stringResource(R.string.frutas)
        )
        Spacer(Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            BottomFooter()
        }
    }
}

@Composable
@Preview
private fun AppFooterPreview() {
    AppFooter()
}