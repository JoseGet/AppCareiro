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
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.careiroapp.R
import com.example.careiroapp.common.components.ModulesHeader
import com.example.careiroapp.common.montserratBoldFontFamily
import com.example.careiroapp.navigation.NavigationItem
import com.example.careiroapp.products.ui.components.FeaturedProducts
import com.example.careiroapp.products.ui.components.FilterRow
import com.example.careiroapp.products.ui.components.ProductsGrid
import com.example.careiroapp.products.ui.viewmodel.ProductsViewModel
import kotlinx.coroutines.launch

@Composable
fun ProductsView(
    navController: NavController,
    productViewModel: ProductsViewModel,
    resetScrollFunction: () -> Unit
) {

    val productViewUiState by productViewModel.productUiState.collectAsState()
    val gridListState = rememberLazyGridState()
    val scope = rememberCoroutineScope()

    val resetGridListState: () -> Unit = {
        scope.launch {
            gridListState.animateScrollToItem(0)
        }
    }

    LaunchedEffect(productViewUiState.hasFilterActivate) {
        if (!productViewUiState.hasFilterActivate) {
            productViewModel.getProducts()
        }
    }

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
            productsCounter = productViewUiState.productsCardList.size,
            onFilterCLick = { nomeCategoria ->
                productViewModel.getProductsByCategoria(nomeCategoria)
                productViewModel.updateFilterActivate(nomeCategoria)
                resetGridListState()
                productViewModel.resetOffset()
                productViewModel.cleanProductsList()
            },
            onFilterActivate = productViewModel::verifyActivatedFilter
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
                gridListState = gridListState,
                list = productViewUiState.productsCardList,
                onItemClicker = { id ->
                    productViewModel.getProductById(id)
                    navController.navigate(NavigationItem.ProdutoUnico.route)
                    resetScrollFunction()
                },
                loadMore = {
                    productViewModel.loadMoreProducts {
                        if (productViewUiState.hasFilterActivate) productViewModel.getProductsByCategoria(
                            productViewUiState.filterNameActivate ?: ""
                        ) else productViewModel.getProducts()
                    }
                }
            )
        }
    }
}

@Composable
@Preview
private fun ProductsViewPreview() {
}