package com.example.careiroapp.common.components.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.careiroapp.R

@Composable
fun ProfilePicture(
    image: String
) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(image)
            .crossfade(true)
            .build(),
        modifier = Modifier
            .size(167.dp)
            .clip(shape = CircleShape),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}

@Composable
@Preview
fun ProfilePicturePreview() {

    val context = LocalContext.current
    val foto = R.drawable.doge
    val uriFoto = "android.resource://${context.packageName}/$foto"

    ProfilePicture(
        image = uriFoto
    )
}