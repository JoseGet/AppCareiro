package com.example.careiroapp.feiras.data.repositories

import com.example.careiroapp.feiras.data.datasource.FeirasDataSource
import com.example.careiroapp.feiras.data.models.FeiraModel
import javax.inject.Inject

class FeiraRepository @Inject constructor(
    private val feirasDataSource: FeirasDataSource
) {
    suspend fun getFeiras(): MutableList<FeiraModel>? {
        return feirasDataSource.getFeiras()
    }

    suspend fun getFeiraById(id: Int): FeiraModel? {
        return feirasDataSource.getFeiraById(id)
    }

}