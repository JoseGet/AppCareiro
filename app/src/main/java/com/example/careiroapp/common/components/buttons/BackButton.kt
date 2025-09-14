package com.example.careiroapp.common.components.buttons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun BackButton(
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .clickable(
                onClick = onClick
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.arrow_left),
            contentDescription = null
        )
        Text(
            stringResource(R.string.voltar),
            fontFamily = montserratRegularFontFamily,
            fontSize = 14.sp,
            color = colorResource(R.color.dark_gray)
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BackButtonPreview() {
    BackButton(
        {}
    )
}