package com.example.careiroapp.feiras.domain.usecases

import com.example.careiroapp.feiras.data.models.FeiraModel
import com.example.careiroapp.feiras.data.repositories.FeiraRepository
import javax.inject.Inject

class GetFeirasUseCase @Inject constructor(
    private val feiraRepository: FeiraRepository
) {
    suspend operator fun invoke(): MutableList<FeiraModel>? {
        return feiraRepository.getFeiras()
    }
}