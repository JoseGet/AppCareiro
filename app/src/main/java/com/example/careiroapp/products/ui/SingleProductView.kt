package com.example.careiroapp.products.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.careiroapp.common.components.buttons.BackButton
import com.example.careiroapp.common.components.cards.CardCadastroAssociacao
import com.example.careiroapp.products.ui.components.BuyProductRow
import com.example.careiroapp.products.ui.components.FeaturedProducts
import com.example.careiroapp.products.ui.components.ProductDescription
import com.example.careiroapp.products.ui.components.ProductTitle
import com.example.careiroapp.products.ui.components.ProductorRow
import com.example.careiroapp.products.ui.viewmodel.ProductsViewModel

@Composable
fun SingleProductView(
    navController: NavController,
    productViewModel: ProductsViewModel
) {

    val productViewUiState by productViewModel.productUiState.collectAsState()

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
        AsyncImage(
            modifier = Modifier
                .height(360.dp)
                .clip(RoundedCornerShape(16.dp)),
            model = ImageRequest.Builder(LocalContext.current)
                .data(productViewUiState.selectedProduct?.image)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(24.dp))
        ProductTitle(
            productName = productViewUiState.selectedProduct?.nomeProduto ?: "",
            productPrice = productViewUiState.selectedProduct?.precoProduto ?: 0.0f
        )
        Spacer(Modifier.height(16.dp))
        BuyProductRow()
        Spacer(Modifier.height(16.dp))
        ProductorRow()
        Spacer(Modifier.height(16.dp))
        ProductDescription(
            productDescription = productViewUiState.selectedProduct?.descricao ?: ""
        )
        Spacer(Modifier.height(24.dp))
        FeaturedProducts(
            navController
        )
        Spacer(Modifier.height(24.dp))
        CardCadastroAssociacao()
    }
}

@Composable
@Preview(showBackground = true)
private fun SingleProductViewPreview() {
}