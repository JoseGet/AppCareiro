package com.example.careiroapp.profile.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.widgets.ProfilePicture

@Composable
fun ProfileDataWidget() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfilePicture(
            painterResource(R.drawable.garota)
        )
        Spacer(Modifier.height(24.dp))
        PersonalDataWidget(
            nomePerfil = "Maria Clara",
            emailPerfil = "mariaClara123.@gmail.com",
            telefonePerfil = "(92) 99999-9999"
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun ProfileDataWidgetPreview() {
    ProfileDataWidget()
}