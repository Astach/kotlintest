package com.antoine.business

import com.antoine.business.model.Forecast
import io.reactivex.Observable


/**
 * Created by antoine on 7/22/17.
 */
interface WeatherRepository {
   fun getWeather(townName: String, numberOfDay: Int): Observable<Forecast>
}