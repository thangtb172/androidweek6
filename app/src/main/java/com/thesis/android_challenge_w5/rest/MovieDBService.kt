package com.thesis.android_challenge_w5.rest

import com.thesis.android_challenge_w6.movie.MovieResp
import com.thesis.android_challenge_w6.movie.MovieTop
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieDBService {

    @GET("movie/now_playing")
    suspend fun listNowPlayMovies(
        @Query("language") language: String?= null, @Query("page") page: Int, @Query("api_key") apiKey: String
    ) : MovieResp

    @GET("movie/top_rated")
    suspend fun listTopRateMovies(
        @Query("language") language: String?= null, @Query("page") page: Int, @Query("api_key") apiKey: String
    ) : MovieTop

}