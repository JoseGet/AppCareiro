package com.example.careiroapp.common.components.footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.careiroapp.R

@Composable
fun BottomFooter(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.acesse_nossas_redes),
            color = Color.Black
        )
        SocialMediaRow()
        Text(
            text = stringResource(R.string.copyright),
            color = Color.Black
        )
    }
}

@Composable
@Preview
private fun BottomFooterPreview() {
    BottomFooter()
}