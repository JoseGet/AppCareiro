package com.example.careiroapp.common.components.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.careiroapp.R

@Composable
fun SocialMediaRow(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_insta),
                contentDescription = null,
                tint = colorResource(R.color.dark_green)
            )
        }
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_facebook),
                contentDescription = null,
                tint = colorResource(R.color.dark_green)
            )
        }
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_linkedin),
                contentDescription = null,
                tint = colorResource(R.color.dark_green)
            )
        }
    }
}

@Composable
@Preview
private fun SocialMediaRowPreview() {
    SocialMediaRow(
        modifier = Modifier
            .background(Color.White)
    )
}