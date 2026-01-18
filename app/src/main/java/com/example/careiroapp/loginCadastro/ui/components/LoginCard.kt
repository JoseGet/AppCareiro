package com.example.careiroapp.loginCadastro.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.components.buttons.OutlineAppButton
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun LoginCard() {
    Card(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.light_background)
        ),
        border = BorderStroke(1.dp, color = colorResource(R.color.black))
    ) {
        Column(
            modifier = Modifier
                .padding(top = 32.dp, bottom = 32.dp)
                .wrapContentSize()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Login",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = montserratBoldFontFamily,
                    color = colorResource(R.color.dark_green)
                )
            )
            Spacer(Modifier.height(4.dp))
            Text(
                "Acesse a sua conta",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = montserratRegularFontFamily,
                    color = colorResource(R.color.dark_gray)
                )
            )
            Spacer(Modifier.height(24.dp))
            LoginTextField(
                title = "Email",
                placeholder = "Digite seu email"
            )
            Spacer(Modifier.height(24.dp))
            LoginTextField(
                title = "Senha",
                placeholder = "Digite sua senha"
            )
            Spacer(Modifier.height(24.dp))
            OutlineAppButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                icon = null,
                onClick = {},
                text = "Entrar",
                isActivate = false
            )
            Spacer(Modifier.height(24.dp))
            Text(
                ""
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun LoginCardPreview() {
    LoginCard()
}