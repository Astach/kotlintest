package com.antoine.kotlin.kotlintest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
* Created by Antoine Promerova on 6/5/17.
*/

class TodayFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.today_forecast_fragment_layout, container, false)

        return view
    }


    companion object Factory{
        val name : String = "TodayFragment"
        fun newInstance() : TodayFragment{
            return TodayFragment()
        }

    }

}