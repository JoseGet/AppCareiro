package com.example.careiroapp.bag.ui.components

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import com.example.careiroapp.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.careiroapp.bag.ui.Produto

@Composable
fun ProductCard(
    produto: Produto,
    index: Int,
    increaseProduct: (index: Int) -> Unit,
    decreaseProduct: (index: Int) -> Unit
) {


    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Row {
            Image(
                painter = painterResource(R.drawable.abobora),
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentDescription = "product image",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(produto.name)
                Text("R$${produto.unitPrice}/un", fontWeight = FontWeight.Bold)
            }
        }

        CounterButton(amount = produto.amount,
            index = index, { decreaseProduct(index) }, { increaseProduct(index) })
    }
}