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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun CardProduto(
    image: Painter,
    nomeProduto: String,
    precoProduto: Float,
    isPromocao: Boolean,
    precoPromocao: Double,
    haveButton: Boolean
) {

    val modifiedPrecoProduto = String.format("%.2f", precoProduto).replace('.', ',');
    val modifiedPrecoPromocao = String.format("%.2f", precoPromocao).replace('.', ',');

    Card(
        modifier = Modifier
            .width(263.dp)
            .wrapContentHeight()
            .background(color = Color.Transparent),
    ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(R.color.light_gray))
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
                nomeProduto,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        bottom = if (haveButton) 0.dp else 16.dp
                    ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "R$ $modifiedPrecoProduto",
                    style = TextStyle(
                        fontWeight = if (!isPromocao) FontWeight.Bold else FontWeight.Normal,
                        color = colorResource(R.color.dark_green),
                        textDecoration = if (isPromocao) TextDecoration.LineThrough else TextDecoration.None,
                        fontStyle = if (isPromocao) FontStyle.Italic else FontStyle.Normal
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                if (isPromocao) {
                    Text(
                        "R$ $modifiedPrecoPromocao",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.dark_green),
                        ),
                    )
                }
            }
            Spacer(modifier = Modifier.height(if (haveButton) 16.dp else 0.dp))
            if (haveButton) {
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    Arrangement.Center
                ) {
                    OutlineAppButton(
                        text = stringResource(R.string.adicionar),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        onClick = {},
                        icon = painterResource(R.drawable.bag)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun CardProdutoPreview() {
    Column {
        CardProduto(
            image = painterResource(R.drawable.banana2),
            nomeProduto = "Banana",
            precoProduto = 10.00f,
            isPromocao = true,
            precoPromocao = 7.00,
            haveButton = true,
        )
        Spacer(modifier = Modifier.height(10.dp))
        CardProduto(
            image = painterResource(R.drawable.banana2),
            nomeProduto = "Banana",
            precoProduto = 10.00f,
            isPromocao = false,
            precoPromocao = 7.00,
            haveButton = true,
        )
    }
}