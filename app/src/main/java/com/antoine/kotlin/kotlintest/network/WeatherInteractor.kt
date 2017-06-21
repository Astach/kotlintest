package com.antoine.kotlin.kotlintest.network

import com.antoine.kotlin.kotlintest.model.Forecast
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Antoine Promerova on 6/8/17.
 */
class WeatherInteractor @Inject constructor(private val weatherService: WeatherService) {

    fun getCurrentWeather(townName: String, numberOfDay: Int): Observable<Forecast> {
        return weatherService.getWeather(townName, numberOfDay)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}