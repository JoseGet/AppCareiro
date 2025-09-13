package com.example.careiroapp.common.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun CardDefault(
    modifier: Modifier = Modifier,
    image: Painter,
    titleText: String,
) {
    Card(
        modifier = modifier
            .wrapContentSize()
            .background(color = Color.Transparent),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        shape = RoundedCornerShape(25.dp),
    ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(R.color.light_gray)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(173.dp),
                painter = image,
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                titleText,
                modifier = Modifier
                    .padding(bottom = 24.dp),
                fontSize = 16.sp,
                fontFamily = montserratBoldFontFamily,
                color = colorResource(R.color.dark_gray)
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
@Preview
private fun CardDefaultPreview() {
    CardDefault(
        modifier = Modifier,
        image = painterResource(R.drawable.doge),
        titleText = "Associacao"
    )
}