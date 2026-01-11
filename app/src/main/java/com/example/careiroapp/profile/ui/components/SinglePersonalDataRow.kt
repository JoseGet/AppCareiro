package com.example.careiroapp.profile.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun SinglePersonalDataRow(key: String, value: String) {
    Row {
        Text(
            key,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = montserratBoldFontFamily,
                color = Color.Black
            )
        )
        Text(
            ": ",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = montserratBoldFontFamily,
                color = Color.Black
            )
        )
        Text(
            value,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = montserratRegularFontFamily,
                color = Color.Black
            )
        )
    }
}

@Composable
@Preview
private fun SinglePersonalDataRowPreview() {
    SinglePersonalDataRow(
        key = "Nome",
        value = "Maria Joana"
    )
}