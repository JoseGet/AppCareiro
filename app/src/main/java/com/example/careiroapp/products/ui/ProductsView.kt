package com.example.careiroapp.products.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.mocks.MockedLists
import com.example.careiroapp.products.ui.components.FeaturedProducts
import com.example.careiroapp.products.ui.components.FilterRow
import com.example.careiroapp.products.ui.components.ProductsGrid

@Composable
fun ProductsView(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        FeaturedProducts(
            navController
        )
        Spacer(Modifier.height(24.dp))
        ModulesHeader(
            titulo = stringResource(R.string.confira_nossos_produtos),
            subtitulo = null
        )
        FilterRow(
            productsCounter = 8
        )
        Spacer(Modifier.height(24.dp))
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .height(500.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "Ver tudo",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = montserratBoldFontFamily,
                        color = colorResource(R.color.dark_gray)
                    )
                )
            }
            Spacer(Modifier.height(24.dp))
            ProductsGrid(
                list = MockedLists.productsCardList,
                navController = navController
            )
        }
    }
}

@Composable
@Preview
private fun ProductsViewPreview() {
    ProductsView(
        navController = rememberNavController()
    )
}