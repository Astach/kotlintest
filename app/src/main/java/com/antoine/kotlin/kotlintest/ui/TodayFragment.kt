package com.antoine.kotlin.kotlintest.ui

import android.support.v4.app.Fragment
import com.antoine.kotlin.kotlintest.R
import com.antoine.kotlin.kotlintest.TodayPresenter
import com.antoine.kotlin.kotlintest.contract.TodayContract
import com.antoine.kotlin.kotlintest.model.Forecast
import javax.inject.Inject

/**
* Created by Antoine Promerova on 6/5/17.
*/

class TodayFragment : Fragment(), TodayContract.View {

    @Inject
    lateinit var todayPresenter : TodayPresenter

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        (context.applicationContext as com.antoine.kotlin.kotlintest.WeatherApplication).getRepositoryComponent().inject(this)
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?, savedInstanceState: android.os.Bundle?): android.view.View? {
        val view = inflater?.inflate(R.layout.today_forecast_fragment_layout, container, false)
        return view
    }

    override fun onResume() {
        super.onResume()
        todayPresenter.setView(this)
        todayPresenter.getWeather("paris")
    }

    companion object Factory{
        val name : String = "TodayFragment"
        fun newInstance() : com.antoine.kotlin.kotlintest.ui.TodayFragment {
            return TodayFragment()
        }

    }

    override fun displayWeather(forecast: Forecast) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}