package com.example.careiroapp.common.components.drawer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun DrawerItem(
    text: String,
    onClick: () -> Unit
) {
    NavigationDrawerItem(
        label = {
            Text(
                text = text,
                style = TextStyle(
                    fontFamily = montserratBoldFontFamily,
                    fontSize = 16.sp,
                    color = colorResource(R.color.dark_gray)
                )
            )
        },
        selected = false,
        badge = {
            Icon(
                painter = painterResource(R.drawable.arrow_right),
                contentDescription = null,
                tint = colorResource(R.color.dark_green)
            )
        },
        onClick = onClick,
    )
}

@Composable
@Preview(showBackground = true)
private fun DrawerItemPreview() {
    DrawerItem(
        text = "Item",
        onClick = {}
    )
}