package com.example.careiroapp.common.components.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
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
fun DrawerItemProfile(
    name: String,
    image: String,
    onClick: () -> Unit
) {
    NavigationDrawerItem(
        modifier = Modifier
            .wrapContentHeight(),
        icon = {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(image)
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .size(48.dp)
                    .clip(shape = CircleShape),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        },
        label = {
            Text(
                text = "Olá, $name",
                style = TextStyle(
                    fontFamily = montserratBoldFontFamily,
                    fontSize = 16.sp,
                    color = Color.White,
                ),
                overflow = TextOverflow.Ellipsis
            )
        },
        selected = false,
        badge = {
            Icon(
                painter = painterResource(R.drawable.arrow_right),
                contentDescription = null,
                tint = colorResource(R.color.white)
            )
        },
        shape = RoundedCornerShape(bottomEnd = 25.dp),
        colors = NavigationDrawerItemDefaults.colors(
            unselectedContainerColor = colorResource(R.color.dark_green)
        ),
        onClick = onClick
    )
}

@Composable
@Preview(showBackground = true)
private fun DrawerItemProfilePreview() {
    DrawerItemProfile(
        name = "Doge",
        image = "",
        onClick = {}
    )
}