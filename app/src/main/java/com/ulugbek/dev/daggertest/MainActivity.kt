package com.ulugbek.dev.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ulugbek.dev.daggertest.databinding.ActivityMainBinding
import com.ulugbek.dev.daggertest.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherResp.observe(this) { weather ->
            binding.apply {
                textView.text = weather.temperature
            }

        }
    }
}