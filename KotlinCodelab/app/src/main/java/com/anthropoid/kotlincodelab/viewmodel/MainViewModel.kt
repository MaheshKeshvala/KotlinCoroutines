package com.anthropoid.kotlincodelab.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.anthropoid.kotlincodelab.repository.MainRepository
import com.anthropoid.kotlincodelab.utils.Resource
import kotlinx.coroutines.Dispatchers

/**
 * Created by Mahesh Keshvala on 01,June,2020
 */
class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}