package com.example.careiroapp.profile.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.common.components.widgets.ProfilePicture

@Composable
fun ProfileDataWidget(
    nomePerfil: String,
    emailPerfil: String,
    telefonePerfil: String,
    fotoPerfil: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfilePicture(
            fotoPerfil
        )
        Spacer(Modifier.height(24.dp))
        PersonalDataWidget(
            nomePerfil = nomePerfil,
            emailPerfil = emailPerfil,
            telefonePerfil = telefonePerfil
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun ProfileDataWidgetPreview() {
    ProfileDataWidget(
        nomePerfil = "",
        emailPerfil = "",
        telefonePerfil = "",
        fotoPerfil = ""
    )
}