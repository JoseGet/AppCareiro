package com.example.careiroapp.home.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.common.montserratFontFamily

@Composable
fun Header(
    titulo: String,
    subtitulo: String
) {
    Text(
        titulo,
        style = TextStyle(
            fontSize = 18.sp,
            color = colorResource(R.color.dark_green),
            fontFamily = montserratBoldFontFamily
        ),
    )
    Spacer(Modifier.height(8.dp))
    Text(
        subtitulo,
        style = TextStyle(
            fontSize = 14.sp,
            color = colorResource(R.color.black),
            fontFamily = montserratFontFamily
        ),
    )
}