package com.anthropoid.kotlincodelab.repository

import com.anthropoid.kotlincodelab.retrofit.ApiHelper

/**
 * Created by Mahesh Keshvala on 01,June,2020
 */
class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}