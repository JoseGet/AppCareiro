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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.navigation.NavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDrawer(
    tabBarNavController: NavController,
    closeDrawerFunction: () -> Unit
) {
    ModalDrawerSheet(
        drawerShape = RectangleShape,
        drawerContainerColor = Color.White
    ) {
        Column {
            DrawerItemProfile(
                name = "Maria Clara",
                image = painterResource(R.drawable.garota),
                onClick = {
                    closeDrawerFunction()
                    tabBarNavController.navigate(NavigationItem.Profile.route)
                }
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
                    onClick = {
                        tabBarNavController.navigate(NavigationItem.SobreNos.route)
                    }
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
    AppDrawer(
        tabBarNavController = rememberNavController(),
        closeDrawerFunction = {},
    )
}