package com.antoine.kotlin.kotlintest.contract

import com.antoine.business.model.Forecast


/**
 * Created by Antoine Promerova on 6/10/17.
 */
interface TodayContract {
    interface Presenter : BasePresenter<View> {
        fun getWeather(townName: String, numberOfDay: Int = 1)
    }

    interface View : BaseView {
        fun displayWeather(forecast: Forecast)
    }
}