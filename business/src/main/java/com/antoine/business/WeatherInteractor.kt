package com.antoine.business

import com.antoine.business.model.Forecast
import io.reactivex.Observable
import javax.inject.Inject

class WeatherInteractor @Inject constructor(private val weatherRepository: WeatherRepository) {

    fun getCurrentWeather(townName: String, numberOfDay: Int): Observable<Forecast> {
        return weatherRepository.getWeather(townName, numberOfDay)
    }
}