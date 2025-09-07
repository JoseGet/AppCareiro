package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.OutlineAppButton

@Composable
fun FilterRow(
    productsCounter: Int?
) {

    val scrollState: ScrollState = rememberScrollState()

    Column(

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlineAppButton(
                text = "",
                modifier = Modifier
                    .wrapContentSize(),
                onClick = {},
                icon = painterResource(R.drawable.filter)
            )
            OutlineAppButton(
                text = "Legumes",
                modifier = Modifier,
                onClick = {},
                icon = null
            )
            OutlineAppButton(
                text = "Frutas",
                modifier = Modifier,
                onClick = {},
                icon = null
            )
            OutlineAppButton(
                text = "Verduras",
                modifier = Modifier,
                onClick = {},
                null
            )
        }
        Spacer(Modifier.height(if (productsCounter != null) 8.dp else 0.dp))
        if (productsCounter != null) {
            Text("$productsCounter produtos")
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun FilterRowPreview() {
    FilterRow(
        productsCounter = 0
    )
}
