package com.pourkazemi.mahdi.retrofit_exmaple

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pourkazemi.mahdi.retrofit_exmaple.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val Tag="MainActivity"
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repos: Call<List<Repo>> = NetworkManger.gitService.listRepos("menasri23")
        repos.enqueue(object : Callback<List<Repo>>{
            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
                Log.d(Tag,response.body().toString())
                response.body()
                Log.d(Tag,"onSuccess")
            }

            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                Log.d(Tag,"onFailure")
            }
        })
    }
}