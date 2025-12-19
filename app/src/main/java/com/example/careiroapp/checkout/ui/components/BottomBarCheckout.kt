package com.example.careiroapp.checkout.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R

@Composable
fun BottomBarCheckout(
    enabled: Boolean,
    onClick: () -> Unit
) {
    val activeColor = colorResource(R.color.checkout_button_enable)
    val disabledColor = colorResource(R.color.checkout_button_disable)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onClick,
            enabled = enabled,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (enabled) activeColor else disabledColor,
                contentColor = Color.White,
                disabledContainerColor = disabledColor,
                disabledContentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(R.string.continue_button),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}