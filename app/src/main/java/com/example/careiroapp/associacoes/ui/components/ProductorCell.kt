package com.example.careiroapp.associacoes.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun ProductorCell(
    image: String?,
    productorName: String
) {
    val noProfileImage = R.drawable.no_profile
    val context = LocalContext.current
    val uriImage = "android.resource://${context.packageName}/$noProfileImage"

    Column(
        modifier = Modifier
            .width(173.dp)
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
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
        Spacer(Modifier.height(16.dp))
        Text(
            productorName,
            style = TextStyle(
                fontFamily = montserratBoldFontFamily,
                fontSize = 24.sp,
                color = colorResource(R.color.dark_gray)
            ),
            maxLines = 2,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun ProductorCellPreview() {

    val image = R.drawable.garota
    val context = LocalContext.current
    val uriImage = "android.resource://${context.packageName}/$image"

    ProductorCell(
        image = null,
        productorName = "Caroline"
    )
}