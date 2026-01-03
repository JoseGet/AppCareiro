package com.example.careiroapp.products.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductCountModel(
    @SerializedName("total")
    @Expose
    val total: Int
)