package com.example.careiroapp.common.components.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun ProfilePicture(
    image: Painter
) {
    Image(
        modifier = Modifier
            .size(167.dp)
            .clip(CircleShape),
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
@Preview
fun ProfilePicturePreview() {
    ProfilePicture(
        image = painterResource(R.drawable.doge)
    )
}