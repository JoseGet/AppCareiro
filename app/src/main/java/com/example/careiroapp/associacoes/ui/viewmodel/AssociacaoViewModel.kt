package com.example.careiroapp.associacoes.ui.viewmodel

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.associacoes.data.models.AssociacaoModel
import com.example.careiroapp.associacoes.domain.usecases.GetAssociacaoByIdUseCase
import com.example.careiroapp.associacoes.domain.usecases.GetAssociacoesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class AssociacaoViewModel @Inject constructor(
    private val getAssociacoesUseCase: GetAssociacoesUseCase,
    private val getAssociacaoByIdUseCase: GetAssociacaoByIdUseCase
): ViewModel() {

    private val _associacaoUiState = MutableStateFlow(AssociacaoUiState())
    var associacaoUiState: StateFlow<AssociacaoUiState> = _associacaoUiState.asStateFlow()

    init {
        getAssociacoes()
    }

    fun getAssociacoes() {
        viewModelScope.launch {
            _associacaoUiState.update {
                it.copy(
                    isLoading = true
                )
            }

            val associacoesList = getAssociacoesUseCase.invoke()?.map { associacao ->
                AssociacaoModel(
                    idAssociacao = associacao.idAssociacao,
                    nome = associacao.nome,
                    image = associacao.image,
                    dataHora = associacao.dataHora,
                    descricao = associacao.descricao,
                    endereco = associacao.endereco
                )
            }

            _associacaoUiState.update {
                it.copy(
                    isLoading = false,
                    associacoesList = associacoesList ?: emptyList()
                )
            }

        }
    }

    fun getAssociacaoById(id: UUID) {
        viewModelScope.launch {
            _associacaoUiState.update {
                it.copy(
                    isLoading = true
                )
            }

            val selectedAssociacao = getAssociacaoByIdUseCase.invoke(id)

            _associacaoUiState.update {
                it.copy(
                    isLoading = false,
                    selectedAssociacao = selectedAssociacao
                )
            }

        }
    }


}