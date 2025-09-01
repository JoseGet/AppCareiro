package com.example.careiroapp.home.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun Header(
    titulo: String,
    subtitulo: String
) {
    Text(
        titulo,
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.dark_green),
        ),
    )
    Spacer(Modifier.height(8.dp))
    Text(
        subtitulo,
        style = TextStyle(
            fontSize = 14.sp,
            color = colorResource(R.color.black),
        ),
    )
}