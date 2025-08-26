package com.example.careiroapp.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun CardAssinatura(
    image: Painter,
    nomeAssinatura: String,
    precoAssinatura: Float,
    haveButton: Boolean
) {

    //val modifiedPrecoProduto = String.format("%.2f", precoProduto).replace('.', ',');
    //val modifiedPrecoPromocao = String.format("%.2f", precoPromocao).replace('.', ',');

    Card(
        modifier = Modifier
            .width(263.dp)
            .wrapContentHeight()
            .background(color = Color.Transparent),
    ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(R.color.light_background))
        ) {
            Image(
                modifier = Modifier
                    .width(283.dp)
                    .height(263.dp),
                painter = image,
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                nomeAssinatura,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                    ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                String.format("R$ %.2f", precoAssinatura).replace('.', ','),
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                    ),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.dark_green),
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            if (haveButton) {
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    Arrangement.Center
                ) {
                    OutlineAppButton(
                        text = stringResource(R.string.ver_mais),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 70.dp),
                        onClick = {},
                        icon = null
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun CardAssinaturaPreview() {
    Column {
        CardAssinatura(
            image = painterResource(R.drawable.macas),
            nomeAssinatura = "Assinatura das Macas",
            precoAssinatura = 10.00f,
            haveButton = false,
        )
        Spacer(modifier = Modifier.height(10.dp))
        CardAssinatura(
            image = painterResource(R.drawable.macas),
            nomeAssinatura = "Assinatura das Macas",
            precoAssinatura = 10.00f,
            haveButton = true,
        )
    }
}