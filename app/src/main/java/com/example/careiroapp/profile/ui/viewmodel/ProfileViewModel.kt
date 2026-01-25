package com.example.careiroapp.profile.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.careiroapp.data.dataStore.UserDataStore
import com.example.careiroapp.data.dataStore.model.UserDataStoreModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    userDataStore: UserDataStore
): ViewModel() {

    val uiState: StateFlow<UserDataStoreModel> = userDataStore.getUserData()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = UserDataStoreModel()
        )


}