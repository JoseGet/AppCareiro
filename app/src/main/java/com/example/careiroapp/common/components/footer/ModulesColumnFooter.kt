package com.example.careiroapp.common.components.footer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun ModulesColumnFooter(
    titulo: String,
    subtitulo_1: String,
    subtitulo_2: String,
    subtitulo_3: String,
) {
    Column(

    ) {
        Text(
            titulo,
            style = TextStyle(
                fontFamily = montserratBoldFontFamily,
                fontSize = 18.sp,
                color = colorResource(R.color.dark_green)
            ),
        )
        Spacer(Modifier.height(8.dp))
        Text(
            subtitulo_1,
            style = TextStyle(
                fontFamily = montserratRegularFontFamily,
                fontSize = 14.sp
            ),
        )
        Spacer(Modifier.height(4.dp))
        Text(
            subtitulo_2,
            style = TextStyle(
                fontFamily = montserratRegularFontFamily,
                fontSize = 14.sp
            ),
        )
        Spacer(Modifier.height(4.dp))
        Text(
            subtitulo_3,
            style = TextStyle(
                fontFamily = montserratRegularFontFamily,
                fontSize = 14.sp
            ),
        )
    }
}

@Composable
@Preview
private fun ModulesColumnFooterPreview() {
    ModulesColumnFooter(
        "Titulo",
        subtitulo_1 = "subtitulo1",
        subtitulo_2 = "subtitulo2",
        subtitulo_3 = "subtitulo3"
    )
}