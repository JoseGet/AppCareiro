package com.example.careiroapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.common.components.cards.CardCadastroAssociacao
import com.example.careiroapp.common.components.drawer.AppDrawer
import com.example.careiroapp.common.components.footer.AppFooter
import com.example.careiroapp.common.components.header.AppHeader
import com.example.careiroapp.navigation.TapBarNavHost
import kotlinx.coroutines.launch

@Composable
fun MainView(
    navController: NavController
) {
    val scrollState = rememberScrollState();
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val tabBarNavController = rememberNavController()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            AppDrawer()
        },
        gesturesEnabled = true
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            AppHeader(
                leftIconAction = {
                    scope.launch {
                        drawerState.open()
                    }
                },
                navController,
                tabBarNavController = tabBarNavController
            )
            TapBarNavHost(
                navController = tabBarNavController
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                CardCadastroAssociacao()
            }
            Spacer(Modifier.height(20.dp))
            AppFooter()
        }
    }
}

@Composable
@Preview
private fun MainViewPreview(

) {
    MainView(
        navController = rememberNavController()
    )
}