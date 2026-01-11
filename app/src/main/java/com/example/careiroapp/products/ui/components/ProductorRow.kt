package com.example.careiroapp.products.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun ProductorRow(
    productorName: String
) {
    Row(
        modifier = Modifier
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
            painter = painterResource(R.drawable.no_profile),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.width(8.dp))
        Text(
            "$productorName - Associacao Negreiros",
            fontFamily = montserratRegularFontFamily,
            fontSize = 14.sp,
            color = colorResource(R.color.dark_gray)
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun ProductRowPreview() {
    ProductorRow(
        productorName = "Samuca"
    )
}