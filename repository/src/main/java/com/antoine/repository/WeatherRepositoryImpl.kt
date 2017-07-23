package com.antoine.repository

import com.antoine.business.WeatherRepository
import com.antoine.business.model.Forecast
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by antoine on 7/22/17.
 */

class WeatherRepositoryImpl @Inject constructor(private val weatherService: WeatherService, private val weatherMapper: WeatherMapper) : WeatherRepository {
    override fun getWeather(townName: String, numberOfDay: Int): Observable<Forecast> {
        return weatherService.getWeather(townName, numberOfDay).map(weatherMapper::mapFromResponse)
    }
}