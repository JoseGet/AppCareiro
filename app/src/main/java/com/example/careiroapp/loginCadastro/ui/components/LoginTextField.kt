package com.example.careiroapp.loginCadastro.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.careiroapp.R
import com.example.careiroapp.common.montserratRegularFontFamily

@Composable
fun LoginTextField(
    title: String,
    placeholder: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    maxChar: Int? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    value: String,
    onChange: (String) -> Unit
) {
    val focusRequester = remember { FocusRequester() }

    Column() {
        Text(
            title,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = montserratRegularFontFamily,
                color = Color.Black
            )
        )
        Spacer(Modifier.height(8.dp))
        Surface(
            modifier = Modifier
                .background(Color.White)
                .height(48.dp)
                .fillMaxWidth()
                .border(
                    1.dp,
                    colorResource(R.color.search_bar_border_color),
                    RoundedCornerShape(16.dp)
                ),
            color = colorResource(R.color.light_background)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BasicTextField(
                    modifier = Modifier
                        .padding(start = 16.dp),
                    value = value,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = keyboardType
                    ),
                    onValueChange = {newText ->
                        if (maxChar != null) {
                            if (newText.length <= maxChar) onChange(newText)
                        } else {
                            onChange(newText)
                        }
                    },
                    visualTransformation = visualTransformation,
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(color = Color.Black),
                    decorationBox = { innerTextField ->
                        if (value.isEmpty()) {
                            Text(
                                placeholder,
                                modifier = Modifier
                                    .focusRequester(focusRequester),
                                style = TextStyle(
                                    fontFamily = montserratRegularFontFamily,
                                    fontSize = 14.sp,
                                    color = colorResource(R.color.search_bar_border_color)
                                )
                            )
                        }
                        innerTextField()
                    },

                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)

private fun LoginTextFieldPreview() {
    LoginTextField(
        title = "Email",
        placeholder = "Digite seu email",
        value = "",
        onChange = {}
    )
}
