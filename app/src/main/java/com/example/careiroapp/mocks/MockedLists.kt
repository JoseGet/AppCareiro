package com.example.careiroapp.mocks

import com.example.careiroapp.R
import com.example.careiroapp.models.AssociacaoModel
import com.example.careiroapp.models.FeiraModel
import com.example.careiroapp.products.data.models.ProductModel

object MockedLists {

    val productsCardList: List<ProductModel> = listOf(
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Abóbora",
            precoProduto = 10.0f,
            isPromocao = true,
            precoPromocao = 8.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Tomate",
            precoProduto = 6.5f,
            isPromocao = false,
            precoPromocao = 0.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Maçã",
            precoProduto = 12.0f,
            isPromocao = true,
            precoPromocao = 9.5
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Laranja",
            precoProduto = 8.0f,
            isPromocao = false,
            precoPromocao = 0.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Melancia",
            precoProduto = 20.0f,
            isPromocao = true,
            precoPromocao = 15.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Abóbora",
            precoProduto = 10.0f,
            isPromocao = true,
            precoPromocao = 8.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Tomate",
            precoProduto = 6.5f,
            isPromocao = false,
            precoPromocao = 0.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Maçã",
            precoProduto = 12.0f,
            isPromocao = true,
            precoPromocao = 9.5
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Laranja",
            precoProduto = 8.0f,
            isPromocao = false,
            precoPromocao = 0.0
        ),
        ProductModel(
            image = R.drawable.abobora,
            nomeProduto = "Melancia",
            precoProduto = 20.0f,
            isPromocao = true,
            precoPromocao = 15.0
        )
    )

    val associacoesCardList = listOf<AssociacaoModel>(
        AssociacaoModel(
            image = R.drawable.agricultores,
            nomeAssociacao = "Associação dos Agricultores"
        ),
        AssociacaoModel(
            image = R.drawable.agricultores,
            nomeAssociacao = "Cooperativa de Pescadores"
        ),
        AssociacaoModel(
            image = R.drawable.agricultores,
            nomeAssociacao = "Associação dos Artesãos"
        ),
        AssociacaoModel(
            image = R.drawable.agricultores,
            nomeAssociacao = "Associação Comunitária"
        )
    )

    val feirasCardList = listOf<FeiraModel>(
        FeiraModel(
            image = R.drawable.feira,
            nomeFeira = "Associação dos Agricultores"
        ),
        FeiraModel(
            image = R.drawable.feira,
            nomeFeira = "Cooperativa de Pescadores"
        ),
        FeiraModel(
            image = R.drawable.feira,
            nomeFeira = "Associação dos Artesãos"
        ),
        FeiraModel(
            image = R.drawable.feira,
            nomeFeira = "Associação Comunitária"
        )
    )
}

