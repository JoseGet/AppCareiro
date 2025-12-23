package com.example.careiroapp.bag.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.careiroapp.R
import com.example.careiroapp.bag.ui.components.BottomBar
import com.example.careiroapp.bag.ui.components.ProductCard
import com.example.careiroapp.bag.ui.components.TopBar
import com.example.careiroapp.navigation.NavigationItem
import java.util.Locale

data class Produto(
    val name: String,
    val unitPrice: Double,
    var amount: Int
)

@Composable
fun BagView(
    navController: NavController
) {

    val produtos = remember {
        mutableStateListOf(
            Produto("Banana", 2.0, 8),
            Produto("Melancia", 4.0, 3),
            Produto("Abacaxi", 23.0, 4)
        )
    }

    fun decreaseProduct(index: Int) {
        val produto = produtos[index]
        if (produto.amount > 0) {
            produtos[index] = produto.copy(amount = produto.amount - 1)
        }
    }

    fun increaseProduct(index: Int) {
        val produto = produtos[index]
        produtos[index] = produto.copy(amount = produto.amount + 1)
    }

    val total by remember {
        derivedStateOf {
            produtos.sumOf { it.unitPrice * it.amount }
        }
    }

    Scaffold(
        topBar = {
            TopBar(Modifier.height(92.dp), { navController.popBackStack() })
        },
        bottomBar = {
            BottomBar(total = total, onCheckout = {navController.navigate(NavigationItem.Checkout.route)}) // passa total para o BottomBar
        },
        containerColor = colorResource(R.color.light_background)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 15.dp, vertical = 30.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Text(
                stringResource(R.string.order_summary),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                itemsIndexed(produtos) { index, produto ->
                    ProductCard(
                        produto = produto,
                        index = index,
                        increaseProduct = { increaseProduct(index) },
                        decreaseProduct = { decreaseProduct(index) }
                    )
                }
            }
        }
    }
}
