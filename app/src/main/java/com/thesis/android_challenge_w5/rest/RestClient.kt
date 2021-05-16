package com.thesis.android_challenge_w5.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestClient {
    private var api : MovieDBService

    val API : MovieDBService
        get() = api

    init{
        api = createMovieDBService()
    }

    companion object{
        private var nInstance: RestClient? = null

        fun getinstance() = nInstance ?: synchronized(this){
            nInstance ?: RestClient().also { nInstance = it }
        }
    }

    private fun createMovieDBService() :MovieDBService{

        //Create retrofit
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(MovieDBService::class.java)
    }
}