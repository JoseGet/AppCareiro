package com.example.careiroapp.common.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.careiroapp.R

@Composable
fun AppButton(
    text: String,
    modifier: Modifier,
    onClick: () -> Unit,
    icon: Painter?,
    containerColor: Color
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(
            16.dp
        ),
        contentPadding = PaddingValues(horizontal = 24.dp),
        colors = ButtonColors(
            contentColor = Color.White,
            containerColor = containerColor,
            disabledContentColor = Color.Red,
            disabledContainerColor = Color.Red
        ),
        modifier = modifier
    ) {
        Row (
           verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text, fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(if (icon == null) 0.dp else 8.dp))
            if (icon != null) {
                Icon(
                    painter = icon,
                    contentDescription = ""
                )
            }
        }
    }
}

@Composable
@Preview
private fun AppButtonPreview() {
    AppButton(
        "Text",
        modifier = Modifier,
        onClick = {},
        icon = painterResource(R.drawable.bag),
        containerColor = colorResource(R.color.gray)
    )
}