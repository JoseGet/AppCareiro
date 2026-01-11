package com.example.careiroapp.products.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializer
import java.util.UUID

data class ProductVendedorModel(

    @SerializedName("id_vendedor")
    @Expose
    val id: UUID,

    @SerializedName("nome")
    @Expose
    val nome: String
)