package com.example.careiroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.components.cards.CardAboutUs
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun AboutUsView(

) {
    Column() {
        Image(
            modifier = Modifier
                .height(176.dp)
                .fillMaxWidth(),
            painter = painterResource(R.drawable.banner),
            contentDescription = ""
        )
        Spacer(Modifier.height(24.dp))
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 28.dp)
        ) {
            ModulesHeader(
                titulo = stringResource(R.string.o_que_e_o_projeto),
                subtitulo = null
            )
            Text(
                stringResource(R.string.o_que_e_content),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = montserratRegularFontFamily,
                    color = Color.Black
                )
            )
            Spacer(Modifier.height(24.dp))
            ModulesHeader(
                titulo = stringResource(R.string.quem_faz_parte) + "?",
                subtitulo = null
            )
            Text(
                stringResource(R.string.quem_faz_parte_content),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = montserratRegularFontFamily,
                    color = Color.Black
                )
            )
            Spacer(Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                CardAboutUs(
                    modifier = Modifier
                        .weight(1f),
                    title = stringResource(R.string.produtores),
                    image = painterResource(R.drawable.produtores_about_us),
                    description = stringResource(R.string.about_us_products_content)
                )
                Spacer(Modifier.width(16.dp))
                CardAboutUs(
                    modifier = Modifier
                        .weight(1f),
                    title = stringResource(R.string.associacoes),
                    image = painterResource(R.drawable.associacoes_about_us),
                    description = stringResource(R.string.about_us_associacoes_content)
                )
            }
            Spacer(Modifier.height(24.dp))
            ModulesHeader(
                titulo = stringResource(R.string.como_participar) + "?",
                subtitulo = null
            )
            Text(
                stringResource(R.string.como_participar_content),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = montserratRegularFontFamily,
                    color = Color.Black
                )
            )
        }

    }
}

@Composable
@Preview(showBackground = true)
private fun AboutUsViewPreview() {
    AboutUsView()
}