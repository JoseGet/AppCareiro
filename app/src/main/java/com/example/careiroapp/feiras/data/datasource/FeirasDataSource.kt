package com.example.careiroapp.feiras.data.datasource

import com.example.careiroapp.feiras.data.models.FeiraModel
import com.example.careiroapp.network.api.FeiraApiService
import javax.inject.Inject

class FeirasDataSource @Inject constructor(
    private val feiraApiService: FeiraApiService
) {

    suspend fun getFeiras(): MutableList<FeiraModel>? {
        return feiraApiService.getFeiras().body()
    }

    suspend fun getFeiraById(id: Int): FeiraModel? {
        return feiraApiService.getFeiraById(id).body()
    }


}