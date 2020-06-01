package com.anthropoid.kotlincodelab.retrofit

import com.anthropoid.kotlincodelab.model.User
import retrofit2.http.GET

/**
 * Created by Mahesh Keshvala on 01,June,2020
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}