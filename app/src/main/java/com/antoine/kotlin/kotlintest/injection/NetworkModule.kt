package com.antoine.kotlin.kotlintest.injection

import com.antoine.kotlin.kotlintest.network.ApiInterceptor
import com.antoine.kotlin.kotlintest.network.WeatherService
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Antoine Promerova on 6/5/17.
 */
@dagger.Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: okhttp3.OkHttpClient): retrofit2.Retrofit {
        return retrofit2.Retrofit.Builder()
                .baseUrl(com.antoine.kotlin.kotlintest.injection.NetworkModule.URL.endpoint)
                .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): okhttp3.OkHttpClient {
        return okhttp3.OkHttpClient.Builder()
                .addInterceptor(ApiInterceptor())
                .build()
    }

    @Provides
    @Singleton
    fun provideWeatherService(retrofit: retrofit2.Retrofit): WeatherService {
        return retrofit.create(WeatherService::class.java)
    }

    companion object URL {
        val endpoint: String = "http://api.apixu.com/"
    }

}

