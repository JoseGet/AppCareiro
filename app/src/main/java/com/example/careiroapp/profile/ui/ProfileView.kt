package com.example.careiroapp.profile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.profile.ui.components.ProfileDataWidget
import com.example.careiroapp.profile.ui.components.ProfileModulesBar
import com.example.careiroapp.profile.ui.viewmodel.ProfileViewModel

@Composable
fun ProfileView(
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val userState by viewModel.uiState.collectAsStateWithLifecycle()

    val noProfileImage = R.drawable.no_profile
    val context = LocalContext.current
    val uriImage = "android.resource://${context.packageName}/$noProfileImage"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(vertical = 24.dp, horizontal = 16.dp),
    ) {
        ModulesHeader(
            titulo = "Meu Perfil",
            subtitulo = null
        )
        Spacer(Modifier.height(24.dp))
        ProfileDataWidget(
            nomePerfil = userState.name,
            emailPerfil = userState.email,
            telefonePerfil = userState.telefone,
            fotoPerfil = if (userState.fotoPerfil == "") uriImage else userState.fotoPerfil
        )
        Spacer(Modifier.height(24.dp))
        ProfileModulesBar()
    }
}

@Composable
@Preview(showBackground = true)
private fun ProfileViewPreview() {
    ProfileView()
}