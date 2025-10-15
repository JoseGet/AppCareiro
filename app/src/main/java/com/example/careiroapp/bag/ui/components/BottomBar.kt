package com.example.careiroapp.bag.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    BottomAppBar(
        modifier = modifier.height(96.dp),
        containerColor = colorResource(R.color.light_gray),
        contentColor = colorResource(R.color.top_bar_title_color)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(5f),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Total:")
                Text("R$213,32",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }

            Button(
                onClick = {},
                modifier = Modifier.weight(5f),
                colors = ButtonColors(
                    containerColor = colorResource(R.color.dark_green),
                    contentColor = colorResource(R.color.light_background),
                    disabledContainerColor = colorResource(R.color.light_background),
                    disabledContentColor = colorResource(R.color.dark_green),
                )
            ) {
                Text(stringResource(R.string.complete_order))
            }
        }
    }
}