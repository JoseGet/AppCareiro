package com.example.careiroapp.loginCadastro.ui.components

import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.careiroapp.R

@Composable
fun CadastroImageProfile(
    image: Uri? = null,
    onClick: () -> Unit
) {

    val noProfileImage = R.drawable.no_profile
    val context = LocalContext.current
    val uriImage = "android.resource://${context.packageName}/$noProfileImage"

    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(image ?: uriImage)
                .crossfade(true)
                .build(),
            modifier = Modifier
                .size(173.dp)
                .clip(shape = CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        IconButton(
            modifier = Modifier
                .clip(CircleShape)
                .background(color = colorResource(R.color.background_plus_button))
                .border(
                    BorderStroke(
                        width = 2.dp,
                        color = colorResource(R.color.light_background)
                    ),
                    shape = CircleShape
                ),
            onClick = onClick,
        ) {
            Icon(
                painter = painterResource(R.drawable.plus_icon),
                tint = colorResource(R.color.dark_green),
                contentDescription = null
            )
        }

    }

}

@Composable
@Preview
private fun CadastroImageProfilePreview() {
    CadastroImageProfile(
        Uri.EMPTY,
        {}
    )
}