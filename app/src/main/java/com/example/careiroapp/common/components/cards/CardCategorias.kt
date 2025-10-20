package com.example.careiroapp.common.components.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun CardCategorias(
    title: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .height(103.dp)
            .width(135.dp),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.dark_green)
        ),
        elevation = CardDefaults.cardElevation(8.dp),
        onClick = onClick,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.legumes),
                modifier = Modifier
                    .wrapContentSize(),
                colorFilter = ColorFilter.tint(
                    color = colorResource(R.color.background_categorias_card).copy(alpha = 0.33f),
                    blendMode = BlendMode.DstAtop
                ),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
            Text(
                title,
                style = TextStyle(
                    fontFamily = montserratBoldFontFamily,
                    fontSize = 18.sp,
                    color = Color.White,
                ),
            )
        }
    }
}

@Composable
@Preview
private fun CardCategoriasPreview() {
    CardCategorias(
        title = "Legumes",
        onClick = {}
    )
}