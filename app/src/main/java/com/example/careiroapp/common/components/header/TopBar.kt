package com.example.careiroapp.common.components.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun TopBar(
    leftIconOnClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(color = colorResource(R.color.light_gray)),
        Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            modifier = Modifier
                .padding(start = 24.dp)
                .size(24.dp),
            onClick = leftIconOnClick
        ) {
            Icon(
                painter = painterResource(R.drawable.menu),
                contentDescription = "Menu",
                tint = colorResource(R.color.dark_green)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp),
                painter = painterResource(R.drawable.logo)
            )
            Text(
                stringResource(R.string.agriconnect).toString().toUpperCase(),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = colorResource(R.color.dark_green)
                )
            )
        }
        IconButton(
            modifier = Modifier
                .padding(end = 24.dp)
                .size(24.dp),
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.bag),
                contentDescription = "Sacola",
                tint = colorResource(R.color.dark_green)
            )
        }
    }
}

@Preview
@Composable
fun TopBarPreview(
) {
    TopBar(
        leftIconOnClick = {}
    );
}