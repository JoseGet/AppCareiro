package com.example.careiroapp.products.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.buttons.BackButton
import com.example.careiroapp.products.ui.components.BuyProductRow
import com.example.careiroapp.products.ui.components.FeaturedProducts
import com.example.careiroapp.products.ui.components.ProductDescription
import com.example.careiroapp.products.ui.components.ProductTitle
import com.example.careiroapp.products.ui.components.ProductorRow

@Composable
fun SingleProductView(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        BackButton(
            onClick = {
                navController.popBackStack()
            }
        )
        Spacer(Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .height(360.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = painterResource(R.drawable.abobora),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(24.dp))
        ProductTitle(
            productName = "Abobora",
            productPrice = 10.0
        )
        Spacer(Modifier.height(16.dp))
        BuyProductRow()
        Spacer(Modifier.height(16.dp))
        ProductorRow()
        Spacer(Modifier.height(16.dp))
        ProductDescription()
        Spacer(Modifier.height(24.dp))
        FeaturedProducts(
            navController
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun SingleProductViewPreview() {
    SingleProductView(
        navController = rememberNavController()
    )
}