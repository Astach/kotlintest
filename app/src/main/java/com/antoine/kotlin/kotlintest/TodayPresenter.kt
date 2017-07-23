package com.antoine.kotlin.kotlintest

import com.antoine.business.WeatherInteractor
import com.antoine.kotlin.kotlintest.contract.TodayContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class TodayPresenter @Inject constructor(val interactor: WeatherInteractor) : TodayContract.Presenter {

    private var view: TodayContract.View? = null

    override fun getWeather(townName: String, numberOfDay: Int) {
        interactor.getCurrentWeather(townName, numberOfDay)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
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
