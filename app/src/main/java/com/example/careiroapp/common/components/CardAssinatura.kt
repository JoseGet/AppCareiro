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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    modifier: Modifier,
    image: Painter,
    nomeAssinatura: String,
    precoAssinatura: Float,
    haveButton: Boolean
) {

    //val modifiedPrecoProduto = String.format("%.2f", precoProduto).replace('.', ',');
    //val modifiedPrecoPromocao = String.format("%.2f", precoPromocao).replace('.', ',');

    Card(
        modifier = modifier
            .wrapContentSize(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        shape = RoundedCornerShape(25.dp),
        onClick = {}
    ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(R.color.light_background))
        ) {
            Image(
                modifier = Modifier
                    .height(180.dp),
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
                fontWeight = FontWeight.Bold,
                color = Color.Black
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
                        .padding(bottom = 16.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    Arrangement.Center
                ) {
                    OutlineAppButton(
                        text = stringResource(R.string.ver_mais),
                        modifier = Modifier
                            .padding(horizontal = 16.dp),
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
            modifier = Modifier,
            image = painterResource(R.drawable.macas),
            nomeAssinatura = "Assinatura das Macas",
            precoAssinatura = 10.00f,
            haveButton = false,
        )
        Spacer(modifier = Modifier.height(10.dp))
        CardAssinatura(
            modifier = Modifier,
            image = painterResource(R.drawable.macas),
            nomeAssinatura = "Assinatura das Macas",
            precoAssinatura = 10.00f,
            haveButton = true,
        )
    }
}