package com.antoine.kotlin.kotlintest

import com.antoine.kotlin.kotlintest.contract.TodayContract
import com.antoine.kotlin.kotlintest.network.WeatherInteractor
import javax.inject.Inject

/**
 * Created by Antoine Promerova on 6/10/17.
 */
class TodayPresenter @Inject constructor(val interactor: WeatherInteractor) : TodayContract.Presenter{

    override fun getWeather(townName : String) {
        interactor.getCurrentWeather(townName)
    }

    override fun setView(view: TodayContract.View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
