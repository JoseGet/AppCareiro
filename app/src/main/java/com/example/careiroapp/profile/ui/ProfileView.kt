package com.example.careiroapp.profile.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.profile.ui.components.ProfileDataWidget

@Composable
fun ProfileView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 24.dp, horizontal = 16.dp),
    ) {
        ModulesHeader(
            titulo = "Meu Perfil",
            subtitulo = null
        )
        Spacer(Modifier.height(24.dp))
        ProfileDataWidget()
        Spacer(Modifier.height(24.dp))
    }
}

@Composable
@Preview(showBackground = true)
private fun ProfileViewPreview() {
    ProfileView()
}