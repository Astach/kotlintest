package com.antoine.kotlin.kotlintest

import android.app.Application
import com.antoine.kotlin.kotlintest.injection.DaggerUIComponent
import com.antoine.kotlin.kotlintest.injection.NetworkModule
import com.antoine.kotlin.kotlintest.injection.UIComponent

/**
 * Created by Antoine Promerova on 6/8/17.
 */
class WeatherApplication : Application() {
    private val repositoryComponent: UIComponent = DaggerUIComponent.builder()
            .networkModule(NetworkModule())
            .build()

    override fun onCreate() {
        super.onCreate()
    }

    fun getRepositoryComponent() : UIComponent {
        return  repositoryComponent
    }


}