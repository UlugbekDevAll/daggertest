package com.ulugbek.dev.daggertest.api

import com.ulugbek.dev.daggertest.models.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/London")
    suspend fun getWeather():Response<Weather>
}