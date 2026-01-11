package com.example.careiroapp.associacoes.ui

import android.os.Build.VERSION.SDK_INT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.ImageLoader
import coil3.compose.rememberAsyncImagePainter
import coil3.gif.AnimatedImageDecoder
import coil3.gif.GifDecoder
import com.example.careiroapp.R
import com.example.careiroapp.associacoes.ui.components.AssociacaoDescription
import com.example.careiroapp.associacoes.ui.components.AssociacaoProductorsRow
import com.example.careiroapp.associacoes.ui.viewmodel.AssociacaoViewModel
import com.example.careiroapp.common.components.SingleImage
import com.example.careiroapp.common.components.buttons.BackButton
import com.example.careiroapp.common.montserratBoldFontFamily

@Composable
fun SingleAssociacaoView(
    navController: NavController,
    associacaoViewModel: AssociacaoViewModel
) {

    val uiState by associacaoViewModel.associacaoUiState.collectAsState()
    val context = LocalContext.current

    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (SDK_INT >= 28) {
                add(AnimatedImageDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        BackButton(
            onClick = {
                navController.popBackStack()
            }
        )
        Spacer(Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            if (uiState.isLoading) {
                Image(
                    painter = rememberAsyncImagePainter(
                        model = R.drawable.load,
                        imageLoader = imageLoader
                    ),
                    contentDescription = null
                )
            }
            SingleImage(uiState.selectedAssociacao?.image)
        }
        Spacer(Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                uiState.selectedAssociacao?.nome ?: "",
                style = TextStyle(
                    fontFamily = montserratBoldFontFamily,
                    fontSize = 18.sp,
                    color = colorResource(R.color.dark_gray)
                )
            )
        }
        Spacer(Modifier.height(16.dp))
        AssociacaoDescription(
            description = uiState.selectedAssociacao?.descricao ?: ""
        )
        Spacer(Modifier.height(24.dp))
        AssociacaoProductorsRow(
            productorsList = uiState.selectedAssociacao?.productorsList ?: emptyList()
        )
    }
}