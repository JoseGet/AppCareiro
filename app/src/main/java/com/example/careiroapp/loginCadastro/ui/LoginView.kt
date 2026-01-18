package com.example.careiroapp.loginCadastro.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R
import com.example.careiroapp.loginCadastro.ui.components.LoginCard

@Composable
fun LoginView(

) {
    Column(
        modifier = Modifier
            .padding(horizontal = 32.dp)
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.login_background),
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.tint(
                    color = colorResource(R.color.black).copy(alpha = 0.7f),
                    blendMode = BlendMode.SrcOver
                )
            ),
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
        LoginCard()
    }

}

@Preview(showBackground = true)
@Composable
private fun LoginViewPreview() {
    LoginView()
}