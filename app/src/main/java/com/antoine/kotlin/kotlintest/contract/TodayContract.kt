package com.antoine.kotlin.kotlintest.contract

/**
 * Created by Antoine Promerova on 6/10/17.
 */
interface TodayContract {
    interface Presenter : BasePresenter<View>{
        fun getWeather(townName: String)
    }
    interface View : BaseView
}