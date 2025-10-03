package com.example.careiroapp.products.data.datasource

import android.util.Log
import com.example.careiroapp.network.api.ApiService
import com.example.careiroapp.network.retrofit.RetrofitModule.apiSetupProvider
import com.example.careiroapp.products.data.models.ProductModel
import javax.inject.Inject

class ProductsDataSource @Inject constructor(
    val apiService: ApiService
) {
    suspend fun getProducts(): List<ProductModel>? {
        val response = apiService.getCardProducts().body()
        return response
    }
}