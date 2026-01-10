package com.example.careiroapp.feiras.ui.components

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
fun FeiraTitle(
    feiraName: String,
    feiraDataHora: String
) {
    Column() {
        Text(
            feiraName,
            fontFamily = montserratBoldFontFamily,
            fontSize = 18.sp,
            color = colorResource(R.color.dark_gray)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            feiraDataHora,
            style = TextStyle(
                fontFamily = montserratRegularFontFamily,
                fontSize = 14.sp,
                color = colorResource(R.color.dark_gray)
            ),
        )
    }
}

@Composable
@Preview
private fun FeiraTitlePreview() {
    FeiraTitle(
        feiraName = "",
        feiraDataHora = ""
    )
}