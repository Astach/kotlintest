package com.antoine.kotlin.kotlintest.network

import com.antoine.kotlin.kotlintest.model.Forecast
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Antoine Promerova on 6/7/17.
 */
interface WeatherService {
    @GET("v1/forecast.json")
    fun getWeather(@Query("q") town: String, @Query("days") numberOfDays: Int): Observable<Forecast>

}