package com.ulugbek.dev.daggertest.repository

import com.ulugbek.dev.daggertest.api.ApiService
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getWeather()=apiService.getWeather()
}