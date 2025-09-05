package com.example.careiroapp.home.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratFontFamily

@Composable
fun TutorialCard(
    modifier: Modifier,
    number: Int,
    image: Painter,
    description: String
) {
    Card(
        modifier = modifier
            .wrapContentSize(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        border = BorderStroke(
            width = 1.dp,
            color = colorResource(R.color.gray)
        ),
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .width(110.dp)
                .padding(horizontal = 11.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 16.dp),
                text = number.toString(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.dark_green)
                )
            )
            Spacer(Modifier.height(16.dp))
            Image(
                modifier = Modifier
                    .size(60.dp),
                painter = image,
                contentDescription = null
            )
            Spacer(Modifier.height(16.dp))
            Text(
                modifier = Modifier
                    .padding(bottom = 16.dp),
                text = description,
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 8.sp,
                    fontFamily = montserratFontFamily,
                    color = Color.Black
                )
            )
        }
    }
}

@Composable
@Preview
private fun TutorialCardPreview() {
    TutorialCard(
        modifier = Modifier,
        number = 1,
        image = painterResource(R.drawable.agricultor_desenho),
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed pretium neque magna. "
    )
}