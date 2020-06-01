package com.anthropoid.kotlincodelab.retrofit

/**
 * Created by Mahesh Keshvala on 01,June,2020
 */
class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}