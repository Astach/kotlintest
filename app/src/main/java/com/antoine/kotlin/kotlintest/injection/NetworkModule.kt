package com.antoine.kotlin.kotlintest.injection

import com.antoine.kotlin.kotlintest.model.Forecast
import com.antoine.kotlin.kotlintest.network.ApiInterceptor
import com.antoine.kotlin.kotlintest.network.WeatherService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Antoine Promerova on 6/5/17.
 */
@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: okhttp3.OkHttpClient, gson: Gson): Retrofit {
        return retrofit2.Retrofit.Builder()
                .baseUrl(NetworkModule.URL.endpoint)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()

    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder()
                .registerTypeAdapter(object : TypeToken<Forecast>() {}.type, ForecastDayDeserializer())
                .create()
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

