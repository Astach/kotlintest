package com.antoine.kotlin.kotlintest

import com.antoine.business.WeatherInteractor
import com.antoine.kotlin.kotlintest.contract.TodayContract
import javax.inject.Inject

/**
 * Created by Antoine Promerova on 6/10/17.
 */
class TodayPresenter @Inject constructor(val interactor: WeatherInteractor) : TodayContract.Presenter {

    private var view: TodayContract.View? = null

    override fun getWeather(townName: String, numberOfDay: Int) {
        interactor.getCurrentWeather(townName, numberOfDay)
                .subscribe(
                        { weather ->
                            if (view != null) {
                                view!!.displayWeather(weather)
                            }

                        },
                        {}
                )
    }

    override fun setView(view: TodayContract.View) {
        this.view = view
    }


}
