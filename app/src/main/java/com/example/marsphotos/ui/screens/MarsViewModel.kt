/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.marsphotos.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.model.Results
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface MarsUiState {
    data class Success(val photos: String) : MarsUiState
    object Error : MarsUiState
    object Loading : MarsUiState
}


class MarsViewModel : ViewModel() {

    //private val _moviesRemoteResults = MutableLiveData<RemoteResult>()
    //val moviesRemoteResults: LiveData<RemoteResult> = _moviesRemoteResults

    // Variable para almacenar las películas
    var movies: Results = Results(0, emptyList(), 0, 0)

    /** The mutable State that stores the status of the most recent request */
    var marsUiState: MarsUiState by mutableStateOf(MarsUiState.Loading)
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately.
     */
    init {
        //getMarsPhotos()
        //getMovieTitles()
    }
/*
    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [MarsPhoto] [List] [MutableList].
     */
    private fun getMarsPhotos() {
        viewModelScope.launch {
            marsUiState = try {
                // Crear una instancia de MarsApi utilizando la función create() de MarsApiServiceFactory
                val marsApi = MarsApiServiceFactory.create()
                // Utilizar la instancia creada para acceder a retrofitService y obtener las fotos
                val photos = marsApi.getPhotos()
                MarsUiState.Success(
                    "Success: ${photos.size} Mars photos retrieved"
                )
            } catch (e: IOException) {
                MarsUiState.Error
            }
        }
    }
*/


}

