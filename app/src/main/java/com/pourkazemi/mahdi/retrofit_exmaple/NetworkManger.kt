package com.pourkazemi.mahdi.retrofit_exmaple

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManger {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val gitService = retrofit.create(GitHubService::class.java)
}