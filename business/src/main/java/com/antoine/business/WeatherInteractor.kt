package com.antoine.business

import com.antoine.business.model.Forecast
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Antoine Promerova on 6/8/17.
 */
class WeatherInteractor @Inject constructor(private val weatherRepository: WeatherRepository) {

    fun getCurrentWeather(townName: String, numberOfDay: Int): Observable<Forecast> {
        return weatherRepository.getWeather(townName, numberOfDay)
    }
}