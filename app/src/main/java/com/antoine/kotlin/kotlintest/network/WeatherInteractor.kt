package com.antoine.kotlin.kotlintest.network

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Antoine Promerova on 6/8/17.
 */
class WeatherInteractor @Inject constructor(private val weatherService: WeatherService) {

    fun getCurrentWeather(townName: String) {
        weatherService.getWeather(townName, 2)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { weather ->
                            Log.d("test", weather.toString())     //TODO implement mapper make some operations
                        },
                        {
                            e ->
                            Log.d("test", e.toString())     //TODO implement mapper make some operations
                            //TODO implement mapper make some operations

                        }
                )
    }
}