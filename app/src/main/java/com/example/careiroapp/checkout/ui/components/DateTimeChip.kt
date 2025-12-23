package com.example.careiroapp.checkout.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DateTimeChip(
    date: String,
    time: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val green = Color(0xFF7DAA00)

    Column(
        modifier = Modifier
            .width(96.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(if (selected) green else Color.White)
            .border(1.dp, green, RoundedCornerShape(20.dp))
            .clickable { onClick() }
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = date,
            color = if (selected) Color.White else green,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
        Text(
            text = time,
            color = if (selected) Color.White else green,
            fontSize = 12.sp
        )
    }
}
