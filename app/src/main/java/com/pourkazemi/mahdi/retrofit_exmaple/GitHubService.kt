package com.pourkazemi.mahdi.retrofit_exmaple

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>

    @GET("users")
    fun groupList(@Query("per_page") pageSize: Int): Call<List<UsersItem>>

    //fun getUsers():Call<List<UsersItem>>
    //https://api.github.com/users?per_page=200

}