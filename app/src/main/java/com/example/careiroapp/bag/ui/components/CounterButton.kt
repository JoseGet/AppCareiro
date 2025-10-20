package com.example.careiroapp.bag.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun CounterButton(
    amount: Int,
    index: Int,
    decrease: (index: Int) -> Unit,
    increase: (index: Int) -> Unit
) {
    Row(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = colorResource(R.color.light_green),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(8.dp)
            .width(86.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_remove),
            contentDescription = "remove item",
            tint = colorResource(R.color.light_green),
            modifier = Modifier
                .clickable { decrease(index) }
                .size(24.dp)
        )

        Text("${amount}", color = colorResource(R.color.light_green))

        Icon(
            painter = painterResource(R.drawable.ic_add),
            contentDescription = "add item",
            tint = colorResource(R.color.light_green),
            modifier = Modifier
                .clickable { increase(index) }
                .size(24.dp)
        )
    }
}