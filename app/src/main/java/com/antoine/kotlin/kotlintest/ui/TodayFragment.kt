package com.antoine.kotlin.kotlintest.ui

import com.antoine.kotlin.kotlintest.contract.TodayContract

/**
* Created by Antoine Promerova on 6/5/17.
*/

class TodayFragment : android.support.v4.app.Fragment(), TodayContract.View {

    @javax.inject.Inject
    lateinit var todayPresenter : com.antoine.kotlin.kotlintest.TodayPresenter

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        (context.applicationContext as com.antoine.kotlin.kotlintest.WeatherApplication).getRepositoryComponent().inject(this)
    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?, savedInstanceState: android.os.Bundle?): android.view.View? {
        val view = inflater?.inflate(com.antoine.kotlin.kotlintest.R.layout.today_forecast_fragment_layout, container, false)

        return view
    }


    companion object Factory{
        val name : String = "TodayFragment"
        fun newInstance() : com.antoine.kotlin.kotlintest.ui.TodayFragment {
            return com.antoine.kotlin.kotlintest.ui.TodayFragment()
        }

    }

}