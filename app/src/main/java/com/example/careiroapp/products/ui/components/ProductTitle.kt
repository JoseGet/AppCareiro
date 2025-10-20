package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun ProductTitle(
    productName: String,
    productPrice: Float
) {
    Column() {
        Text(
            "$productName - 1kg",
            fontFamily = montserratBoldFontFamily,
            fontSize = 18.sp,
            color = colorResource(R.color.dark_gray)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            "R$$productPrice",
            fontFamily = montserratBoldFontFamily,
            fontSize = 18.sp
        )
    }
}

@Composable
@Preview
private fun ProductTitlePreview() {
    ProductTitle(
        "Abobora",
        8.50f
    )
}