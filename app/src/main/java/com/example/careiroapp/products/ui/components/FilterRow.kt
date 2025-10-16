package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.buttons.OutlineAppButton

@Composable
fun FilterRow(
    productsCounter: Int?,
    onFilterCLick: (String?) -> Unit,
    filterActivated: String?
) {
    val scrollState: ScrollState = rememberScrollState()

    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlineAppButton(
                text = stringResource(R.string.legumes),
                modifier = Modifier,
                onClick = {
                    if (filterActivated == "legumes") {
                        onFilterCLick(null)
                    } else {
                        onFilterCLick("legumes")
                    }
                },
                icon = null,
                isActivate = filterActivated == "legumes"
            )
            OutlineAppButton(
                text = stringResource(R.string.frutas),
                modifier = Modifier,
                onClick = {
                    if (filterActivated == "frutas") {
                        onFilterCLick(null)
                    } else {
                        onFilterCLick("frutas")
                    }
                },
                icon = null,
                isActivate = filterActivated == "frutas"
            )
            OutlineAppButton(
                text = stringResource(R.string.verduras),
                modifier = Modifier,
                onClick = {
                    if (filterActivated == "verduras") {
                        onFilterCLick(null)
                    } else {
                        onFilterCLick("verduras")
                    }
                },
                icon = null,
                isActivate = filterActivated == "verduras"
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
        productsCounter = 0,
        onFilterCLick = {},
        filterActivated = null
    )
}
