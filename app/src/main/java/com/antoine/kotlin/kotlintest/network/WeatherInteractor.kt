package com.antoine.kotlin.kotlintest.network

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Antoine Promerova on 6/8/17.
 */
class WeatherInteractor @Inject constructor(private val weatherService: WeatherService) {

    fun getCurrentWeather(townName: String) {
        weatherService.getWeather(townName,1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { weather ->
                            //TODO implement mapper make some operations
                        },
                        {
                            e ->
                            //TODO implement mapper make some operations

                        }
                )
    }
}