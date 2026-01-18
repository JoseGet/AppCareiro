package com.example.careiroapp.loginCadastro.ui

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.loginCadastro.ui.components.CadastroCard
import com.example.careiroapp.loginCadastro.ui.components.LoginCard
import com.example.careiroapp.loginCadastro.ui.viewmodel.CardState
import com.example.careiroapp.loginCadastro.ui.viewmodel.LoginCadastroViewModel

@Composable
fun LoginView(
    navController: NavController
) {

    val viewModel: LoginCadastroViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    BackHandler() {
        if (uiState.cardState == CardState.CADASTRO)
        {
            viewModel.changeCardState(CardState.LOGIN)
        } else {
            (context as? Activity)?.finish()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.login_background),
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.tint(
                    color = colorResource(R.color.black).copy(alpha = 0.7f),
                    blendMode = BlendMode.SrcOver
                )
            )
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .width(240.dp)
                .height(100.dp),
            painter = painterResource(R.drawable.agriconnect_login_logo),
            contentDescription = null
        )
        Spacer(Modifier.height(24.dp))
        when(uiState.cardState) {
            CardState.LOGIN -> LoginCard {
                viewModel.changeCardState(CardState.CADASTRO)
            }
            CardState.CADASTRO -> CadastroCard {
                viewModel.changeCardState(CardState.LOGIN)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginViewPreview() {
    LoginView(
        navController = rememberNavController()
    )
}