package com.example.careiroapp.common.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun AppHeader() {
    Column (
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(color = colorResource(R.color.light_gray))
    ) {
        TopBar()
        AppSearchBar()
        Spacer(Modifier.height(16.dp))
        ModulesBar()
    }
}

@Composable
@Preview
fun AppHeaderPreview() {
    AppHeader();
}