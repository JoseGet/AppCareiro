package com.example.careiroapp.checkout.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.careiroapp.R
import com.example.careiroapp.bag.ui.components.TopBar
import com.example.careiroapp.checkout.ui.components.BottomBarCheckout
import com.example.careiroapp.navigation.NavigationItem

@Composable
fun PickupView(navController: NavController) {


    var isValid = true

    Scaffold(
        topBar = {
            TopBar(Modifier.height(92.dp), { navController.popBackStack() })
        },
        bottomBar = {
            BottomBarCheckout(
                enabled = isValid,
                onClick = {
                    navController.navigate(NavigationItem.Pickup.route)
                }
            )
        },
        containerColor = colorResource(R.color.light_background)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 15.dp, vertical = 15.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = stringResource(R.string.pickup),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = colorResource(R.color.dark_green)
            )
            Text(
                text = stringResource(R.string.pickup_explanation),
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(
                text = stringResource(R.string.pickup_places),
                fontSize = 18.sp,
                color = Color.Black
            )
        }

    }
}