package com.example.careiroapp.common.components.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDrawer(
) {
    ModalDrawerSheet(
        drawerShape = RectangleShape,
        drawerContainerColor = Color.White
    ) {
        Column {
            DrawerItemProfile(
                name = "Samuca",
                image = painterResource(R.drawable.doge)
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Spacer(Modifier.height(16.dp))
                DrawerItem(
                    text = stringResource(R.string.produtos),
                    onClick = {}
                )
                HorizontalDivider(Modifier.padding(horizontal = 15.dp))
                DrawerItem(
                    text = stringResource(R.string.feiras),
                    onClick = {}
                )
                HorizontalDivider(Modifier.padding(horizontal = 15.dp))
                DrawerItem(
                    text = stringResource(R.string.associacoes),
                    onClick = {}
                )
                HorizontalDivider(Modifier.padding(horizontal = 15.dp))
                DrawerItem(
                    text = stringResource(R.string.assinaturas),
                    onClick = {}
                )
                HorizontalDivider(Modifier.padding(horizontal = 15.dp))
                DrawerItem(
                    text = stringResource(R.string.sobre_nos),
                    onClick = {}
                )
                HorizontalDivider(Modifier.padding(horizontal = 15.dp))
                DrawerItem(
                    text = stringResource(R.string.sair),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
@Preview
private fun AppDrawerPreview() {
    AppDrawer()
}