package com.example.layoutwithretrofitmovies

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("character")
    fun getPopularMovies() : Call<Movies>

    object RetrofitInstance {
        val api : MovieApi by lazy {
            Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MovieApi::class.java)
        }
    }

}
