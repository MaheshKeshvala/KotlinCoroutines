package com.anthropoid.kotlincodelab.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anthropoid.kotlincodelab.repository.MainRepository
import com.anthropoid.kotlincodelab.retrofit.ApiHelper
import com.anthropoid.kotlincodelab.viewmodel.MainViewModel

/**
 * Created by Mahesh Keshvala on 01,June,2020
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
