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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.Image
import com.example.careiroapp.R

@Composable
fun CardFeira(
    image: Painter,
    localText: String,
    dataText: String,
    titleText: String,
    buttonText: String
) {
    Card(
        modifier = Modifier
            .width(283.dp)
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
                titleText,
                modifier = Modifier.padding(start = 16.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold

            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.map_marker),
                    contentDescription = "",
                    tint = colorResource(R.color.dark_green)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    localText,
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier
                    .padding(start = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(24.dp),
                    painter = painterResource(R.drawable.calendar),
                    contentDescription = "",
                    tint = colorResource(R.color.dark_green)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    dataText,
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                Arrangement.Center
            ) {
                OutlineAppButton(
                    text = buttonText,
                    modifier = Modifier,
                    onClick = {},
                    icon = null
                )
            }
        }
    }
}

@Preview
@Composable
fun CardFeiraPreview() {
    CardFeira(
        image = painterResource(R.drawable.doge),
        localText = "Parque das Laranjeiras",
        dataText = "20/09/25",
        titleText = "Doge",
        buttonText = "AuAu"
    )
}